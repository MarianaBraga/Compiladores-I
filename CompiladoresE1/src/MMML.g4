grammar MMML;

@header {
import java.util.*;
import java.util.ArrayList;
}

/*options {
   language=CSharp_v4_5;
}*/

/*
Programa: Declaracoes de funcoes e uma funcao main SEMPRE

def fun x = x + 1

def main =
  let x = read_int
  in
     print concat "Resultado" (string (fun x))
*/

@parser::members{

int erros=0;
//inicializando a tabela com os simbolos pre-definidos na E4
NestedSymbolTable<String> symbolTable = new NestedSymbolTable<String>();
NestedSymbolTable<Object> symbolValueTable = new NestedSymbolTable<Object>();
ArrayList<Object> values = new ArrayList<Object>();
}

WS : [ \r\t\u000C\n]+ -> channel(HIDDEN)
    ;

COMMENT : '//' ~('\n'|'\r')* '\r'? '\n' -> channel(HIDDEN);

program
    : fdecls maindecl {System.out.println("Parseou um programa!");}
    ;

fdecls
    : fdecl fdecls                                   #fdecls_one_decl_rule
    |                                                #fdecls_end_rule
    ;

maindecl: 'def' 'main' '=' funcbody                  #programmain_rule
    ;

fdecl: 'def' functionname fdeclparams '=' funcbody   #funcdef_rule
        /*{
            System.Console.WriteLine("Achou declaracao: {0} com {1}", $functionname.text, $fdeclparams.plist.ToString());
        }*/
    ;

fdeclparams
returns [List<String> plist]
@init {
    $plist = new ArrayList<String>();
}
@after {
    for (String s : $plist) {
        System.out.println("Parametro: " + s);
    }
}
    :   fdeclparam
        {
            $plist.add($fdeclparam.pname);
        }
        fdeclparams_cont[$plist]

                                                     #fdeclparams_one_param_rule
    |                                                #fdeclparams_no_params
    ;

fdeclparams_cont[List<String> plist]
    : ',' fdeclparam
        {
            $plist.add($fdeclparam.pname);
        }
        fdeclparams_cont[$plist]
                                                     #fdeclparams_cont_rule
    |                                                #fdeclparams_end_rule
    ;

fdeclparam
    returns [String pname, String ptype]
    : symbol ':' type
        {
            $pname = $symbol.text;
            $ptype = $type.text;
        }
        #fdecl_param_rule
    ;

functionname: TOK_ID                                 #fdecl_funcname_rule
    ;

type
returns [String tType]:
        b=basic_type                                   {$tType = $b.cType;}#basictype_rule
    |   sequence_type
        {
            System.out.println("Variavel do tipo " + $sequence_type.base + " dimensao "+ $sequence_type.dimension);
        }
                                                    #sequencetype_rule
    ;

basic_type
returns [String cType]
    : 'int'     {$cType = "integer";}
    | 'bool'    {$cType = "boolean";}
    | 'str'     {$cType = "string";}
    | 'float'   {$cType = "float";}
    ;

sequence_type
returns [int dimension=0, String base]
    :   basic_type '[]'
        {
            $dimension = 1;
            $base = $basic_type.text;
        }

                                                     #sequencetype_basetype_rule
    |   s=sequence_type '[]'
        {
            $dimension = $s.dimension + 1;
            $base = $s.base;
        }
                                                     #sequencetype_sequence_rule
    ;

funcbody
returns [String oType]:
        ifexpr                                       #fbody_if_rule
    |   let = letexpr                                      {$oType = $let.letexprType;} #fbody_let_rule
    |   m=metaexpr                                   {$oType = $m.eType;}#fbody_expr_rule
    ;

ifexpr
    : 'if' funcbody 'then' funcbody 'else' funcbody  #ifexpression_rule
    ;

letexpr
    returns [String letexprType]: 
    {symbolTable = new NestedSymbolTable<String>(symbolTable);
       symbolValueTable = new NestedSymbolTable<Object>(symbolValueTable);
    }
    	'let' d = letlist 'in' a = funcbody               {	$letexprType = $a.oType;
    														System.out.println("voltando para a tabela pai");
    														symbolTable = symbolTable.getParent();
    														symbolValueTable = symbolValueTable.getParent();}#letexpression_rule
    ;

letlist:
     c=letvarexpr  e=letlist_cont 					                     #letlist_rule
    ;

letlist_cont:
     ',' b=letvarexpr  letlist_cont                                   #letlist_cont_rule
    |                                                                 #letlist_cont_end
    ;

letvarexpr
	returns [String letType, String name1]:
         s=symbol  '=' f=funcbody                         {  $name1 = $s.text; System.out.println("values-->" + values); $letType = $f.oType;
	         												if ($s.text != ""){
	         													symbolTable.store($s.text,$f.oType); System.out.println("Adicionou na tabela de tipos");
	         													if (values.size() != 0){ Object obj1 = values.remove(values.size()-1); 
	         													System.out.println("removeu da pilha, adicionou na tabela de valores"); 
	         													symbolValueTable.store($s.text, obj1); 
	         													values.add(obj1); System.out.println("values-->" + values); }
	         													System.out.print("simbolo "+$s.text+" armazenado na tabela atual");
	         													if($f.oType==null){
	         														System.out.println(" - porem o tipo do simbolo nao foi reconhecido(expressao let como valor para o simbolo?), o que ira causar uma exception em caso de pesquisa por este simbolo");
	         													}else{System.out.println("");}}}#letvarattr_rule
    |    '_'    '=' f=funcbody                           {  $name1 = "_";	System.out.println("values-->" + values); $letType = $f.oType;
    															symbolTable.store("_",$f.oType);
    															if (values.size() != 0){ Object obj2 = values.remove(values.size()-1); 
    															symbolValueTable.store("_", obj2);
    															values.add(obj2); System.out.println("values-->" + values);  }
    															System.out.print("simbolo _ armazenado na tabela atual");
    															if($f.oType==null){
    																System.out.println(" - porem o tipo do simbolo nao foi reconhecido(expressao let como valor para o simbolo?), o que ira causar uma exception em caso de pesquisa por este simbolo");
    															}else{System.out.println("");}}#letvarresult_ignore_rule
    |    l=symbol '::' r=symbol '=' s=funcbody           {  $name1 = $l.text + $r.text;  System.out.println("values-->" + values);	$letType = $s.oType;
    														if ($l.text != "" && $r.text != ""){
    															symbolTable.store($l.text+$r.text,$s.oType);
    															if (values.size() != 0){ Object obj3 = values.remove(0); 
    															symbolValueTable.store($l.text+$r.text, obj3);
    															values.add(obj3);  System.out.println("values-->" + values);  }
    															System.out.print("simbolo "+$l.text+$r.text+" armazenado na tabela atual");
    															if($s.oType==null){	
    																System.out.println(" - porem o tipo do simbolo nao foi reconhecido(expressao let como valor para o simbolo?), o que ira causar uma exception em caso de pesquisa por este simbolo");
    															}else{System.out.println("");}}}  #letunpack_rule
    ;

metaexpr
returns [String eType, Object valueOfSymbol]
@init {
    String v1c;
    String v2c;
    String v1dm;
    String v2dm;
    String v1mm;
    String v2mm;
}
    : '(' o=funcbody ')'                             {$eType = $o.oType;}#me_exprparens_rule     // Anything in parenthesis -- if, let, funcion call, etc
    | sequence_expr                                  #me_list_create_rule    // creates a list [x]
    | TOK_NEG symbol                                 {$eType = "boolean";}     #me_boolneg_rule        // Negate a variable
    | TOK_NEG '(' funcbody ')'                       {$eType = "boolean";}     #me_boolnegparens_rule  //       or anything in between ( )
    | l=metaexpr TOK_POWER r=metaexpr                {if((!$l.eType.equals("string") && !$r.eType.equals("string")) && (!$l.eType.equals("boolean") && !$r.eType.equals("boolean"))){
															$eType = "float";
													  }else{
													  		erros++;
	    													$eType = null;
													   }
													  }   #me_exprpower_rule      // Exponentiation

    | l=metaexpr TOK_CONCAT r=metaexpr                {if($l.eType.equals("string") && $r.eType.equals("string")){
														$eType = "string";
													  }else{
														erros++;
														$eType = null;
													  }
													  //if (values.size() >= 2) { 
													  	System.out.println("Entrei em concatenacao");
														 v1c = (String) (values.remove(values.size()-1));
													     v2c = (String) (values.remove(values.size()-1));
													     System.out.println("V1: " + v1c + " - V2: " + v2c);
													     values.add(new String(v2c + v1c));
													     System.out.println("values-->" + values);
												     //}
													 }#me_listconcat_rule     // Sequence concatenation

    | l=metaexpr TOK_DIV_OR_MUL r=metaexpr           {if((!$l.eType.equals("string") && !$r.eType.equals("string")) && (!$l.eType.equals("boolean") && !$r.eType.equals("boolean"))){
														if($l.eType.equals("float") || $r.eType.equals("float")){
															$eType = "float";
														}else{
															$eType = "integer";
														}
													  }else{
													    erros++;
													    $eType = null;
													  }
													  //if (values.size() >= 2) { 
													     if (TOK_DIV_OR_MUL == '/') {
													     	 System.out.println("Entrei em divisao");
														     v1dm = (String) (values.remove(values.size()-1));
														     v2dm = (String) (values.remove(values.size()-1));
														     System.out.println("V1: " + v1dm + "V2: " + v2dm);
														     $valueOfSymbol = new Integer(Integer.parseInt(v1dm)) / new Integer(Integer.parseInt(v2dm));
														     values.add($valueOfSymbol);
														     System.out.println("values-->" + values);
													     } else {
													     	 System.out.println("Entrei em multiplicacao");
													     	 v1dm = (String) (values.remove(values.size()-1));
														     v2dm = (String) (values.remove(values.size()-1));
														     System.out.println("V1: " + v1dm + "V2: " + v2dm);
														     $valueOfSymbol = new Integer(Integer.parseInt(v1dm)) * new Integer(Integer.parseInt(v2dm));
													     	 values.add($valueOfSymbol);
													     	 System.out.println("values-->" + values);
													     }
												    // }
													 }#me_exprmuldiv_rule     // Div and Mult are equal

    | l=metaexpr TOK_PLUS_OR_MINUS r=metaexpr        {if((!$l.eType.equals("string") && !$r.eType.equals("string")) && (!$l.eType.equals("boolean") && !$r.eType.equals("boolean"))){
														if($l.eType.equals("float") || $r.eType.equals("float")){
															$eType = "float";
														}else{
															$eType = "integer";
														}
													  }else{
													    erros++;
													    $eType = null;
													  }
													  //if (values.size() >=2) { 
													     if (TOK_PLUS_OR_MINUS == '+') {
													     	System.out.println("Entrei em soma");
														     v1mm = (String) values.remove(values.size()-1);
														     v2mm = (String) values.remove(values.size()-1);
														     System.out.println("V1: " + v1mm + "V2: " + v2mm);
														     $valueOfSymbol = new Integer(Integer.parseInt(v1mm)) + new Integer(Integer.parseInt(v2mm));
														     values.add($valueOfSymbol);
														     System.out.println("values-->" + values);
													     } else {
													     	 System.out.println("Entrei em subtracao");
														     v1mm = (String) (values.remove(values.size()-1));
														     v2mm = (String) (values.remove(values.size()-1));
														     System.out.println("V1: " + v1mm + "V2: " + v2mm);
														     $valueOfSymbol = new Integer(Integer.parseInt(v1mm)) - new Integer(Integer.parseInt(v2mm));
													     	 values.add($valueOfSymbol);
													     	System.out.println("values-->" + values);
													     }
												     //}
													 }#me_exprplusminus_rule  // Sum and Sub are equal

    | l=metaexpr TOK_CMP_GT_LT r=metaexpr            {$eType = "boolean";}#me_boolgtlt_rule       // < <= >= > are equal

    | l=metaexpr TOK_CMP_EQ_DIFF r=metaexpr          {$eType = "boolean"; }#me_booleqdiff_rule     // == and != are egual

    | l=metaexpr TOK_BOOL_AND_OR r=metaexpr         {$eType = "boolean";}#me_boolandor_rule      // &&   and  ||  are equal

    | u=symbol                                      {
    													$eType = $u.sType;
    													System.out.println("1-entrei em symbol");
    													SymbolEntry<Object> symbolE = symbolValueTable.lookup($symbol.text);
														if (symbolE == null) {
															System.out.println("Variavel desconhecida: " + $symbol.text);	
														}
														System.out.println("Lookup-> "+ $symbol.text);
    												}  #me_exprsymbol_rule     // a single symbol
    | y=literal                                      { $valueOfSymbol = $y.valueOfSymbol;
    													values.add($valueOfSymbol);
    												   $eType = $y.lType;}#me_exprliteral_rule    // literal value
    | funcall                                        #me_exprfuncall_rule    // a funcion call
    | t=cast                                         {$eType = $t.cType;}#me_exprcast_rule       // cast a type to other
    ;

sequence_expr
    : '[' funcbody ']'                               #se_create_seq
    ;

funcall: symbol funcall_params                       #funcall_rule
        /*{
            System.Console.WriteLine("Uma chamada de funcao! {0}", $symbol.text);
        }*/
    ;

cast
returns [String cType]
    : t=type funcbody                                  {$cType = $t.tType;}#cast_rule
    ;

funcall_params
    :   metaexpr funcall_params_cont                    #funcallparams_rule
    |   '_'                                             #funcallnoparam_rule
    ;

funcall_params_cont
    : metaexpr funcall_params_cont                      #funcall_params_cont_rule
    |                                                   #funcall_params_end_rule
    ;

literal
returns [String lType,  Object valueOfSymbol]:
        'nil'                                           {$lType = "boolean";} #literalnil_rule
    |   'true'                                          {$lType = "boolean";} #literaltrue_rule
    |   n = number                                        { $valueOfSymbol = $n.valueOfSymbol;   $lType = $n.cType;} #literalnumber_rule
    |   s = strlit                                          { $valueOfSymbol = $s.valueOfSymbol;   $lType = "string";} #literalstring_rule
    |   charlit                                         {$lType = "char";} #literal_char_rule
    ;

strlit 
returns [String sType, Object valueOfSymbol]:
	  t = TOK_STR_LIT                                      {  $valueOfSymbol = $t.text;    }
    ;

charlit
    : TOK_CHAR_LIT
    ;

number
returns [String cType, Object valueOfSymbol]:
        f = FLOAT                                           { $valueOfSymbol = $f.text;  $cType = "float";}#numberfloat_rule
    |   d = DECIMAL                                         { $valueOfSymbol = $d.text;  $cType = "integer";}#numberdecimal_rule
    |   HEXADECIMAL                                     {$cType = "integer";}#numberhexadecimal_rule
    |   BINARY                                          {$cType = "integer";}#numberbinary_rule
                ;

symbol
returns [String sType]
: y=TOK_ID                                        {$sType = null;
													System.out.println("simbolo detectado, procurando por: "+$y.text);
													SymbolEntry s = symbolTable.lookup($y.text);
													if(s==null){
														System.out.println("#nao encontrado#");
													}else{
														System.out.println("#encontrado - "+s+"#");
														$sType = s.symbol.toString();
													}
													System.out.println("Tabela atual:");
													int i=1;
													for (SymbolEntry<String> entry : symbolTable.getEntries()) {
            											System.out.println("	"+i+"- main Entry: " + entry);
            											i++;
	            									 }if(symbolTable.getCount()==0){System.out.println("*****nenhum simbolo azmazenado******");}else{/*System.out.println("**************************************");*/}}#symbol_rule
    ;


// id: begins with a letter, follows letters, numbers or underscore
TOK_ID: [a-zA-Z]([a-zA-Z0-9_]*);

TOK_CONCAT: '::' ;
TOK_NEG: '!';
TOK_POWER: '^' ;
TOK_DIV_OR_MUL: ('/'|'*');
TOK_PLUS_OR_MINUS: ('+'|'-');
TOK_CMP_GT_LT: ('<='|'>='|'<'|'>');
TOK_CMP_EQ_DIFF: ('=='|'!=');
TOK_BOOL_AND_OR: ('&&'|'||');

TOK_REL_OP : ('>'|'<'|'=='|'>='|'<=') ;

TOK_STR_LIT
  : '"' (~[\"\\\r\n] | '\\' (. | EOF))* '"'
  ;


TOK_CHAR_LIT
    : '\'' (~[\'\n\r\\] | '\\' (. | EOF)) '\''
    ;

FLOAT : '-'? DEC_DIGIT+ '.' DEC_DIGIT+([eE][\+-]? DEC_DIGIT+)? ;

DECIMAL : '-'? DEC_DIGIT+ ;

HEXADECIMAL : '0' 'x' HEX_DIGIT+ ;

BINARY : BIN_DIGIT+ 'b' ; // Sequencia de digitos seguida de b  10100b

fragment
BIN_DIGIT : [01];

fragment
HEX_DIGIT : [0-9A-Fa-f];

fragment
DEC_DIGIT : [0-9] ;

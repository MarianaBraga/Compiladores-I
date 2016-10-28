grammar MMML;

@header {
import java.util.*;
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

@parser::members{int erros=0;}

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
returns [Type tType]:
        b=basic_type                                   {tType = b.cType;}#basictype_rule
    |   sequence_type
        {
            System.out.println("Variavel do tipo " + $sequence_type.base + " dimensao "+ $sequence_type.dimension);
        }
                                                    #sequencetype_rule
    ;

basic_type
returns [Type cType]
    : 'int'     {cType = Type.Integer;}
    | 'bool'    {cType = Type.Boolean;}
    | 'str'     {cType = Type.String;}
    | 'float'   {cType = Type.Float;}
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

funcbody:
        ifexpr                                       #fbody_if_rule
    |   letexpr                                      #fbody_let_rule
    |   m=metaexpr                                     {if(m.eType==Type.Boolean){
														System.out.prinln("Expressao booleana");
													 }else if(m.eType==Type.Float){
														System.out.println("Expressao float");
												     }else if(m.eType == Type.Integer){
														System.out.println("Expressao inteira");
													 }else{
														System.out.println("Foram encontrados "+erros+"erros na expressao");
													 }}#fbody_expr_rule
    ;

ifexpr
    : 'if' funcbody 'then' funcbody 'else' funcbody  #ifexpression_rule
    ;

letexpr
    : 'let' letlist 'in' funcbody                    #letexpression_rule
    ;

letlist
    : letvarexpr  letlist_cont                       #letlist_rule
    ;

letlist_cont
    : ',' letvarexpr letlist_cont                    #letlist_cont_rule
    |                                                #letlist_cont_end
    ;

letvarexpr
    :    symbol '=' funcbody                         #letvarattr_rule
    |    '_'    '=' funcbody                         #letvarresult_ignore_rule
    |    symbol '::' symbol '=' funcbody             #letunpack_rule
    ;

metaexpr
returns [Type eType]
    : '(' e=funcbody ')'                             #me_exprparens_rule     // Anything in parenthesis -- if, let, funcion call, etc
    | sequence_expr                                  #me_list_create_rule    // creates a list [x]
    | TOK_NEG symbol                                 {eType = Type.Bool;}     #me_boolneg_rule        // Negate a variable
    | TOK_NEG '(' funcbody ')'                       {eType = Type.Bool;}     #me_boolnegparens_rule  //       or anything in between ( )
    | l=metaexpr TOK_POWER r=metaexpr                {if(l.eType != Type.String && r.eType!=Type.String){
														eType = Type.Float;
													  }else{
													  		erros++;
	    													eType = null;
													   }
													  }   #me_exprpower_rule      // Exponentiation
													  
    | l=metaexpr TOK_CONCAT r=metaexpr                {if(l.eType == Type.String || r.eType==Type.String){
														eType = Type.String;
													  }else{
														erros++;
														eType = null;
													  }
													 }#me_listconcat_rule     // Sequence concatenation
													 
    | l=metaexpr TOK_DIV_OR_MUL r=metaexpr           {if(l.eType != Type.String && r.eType!=Type.String){
														eType = Type.Float;
													  }else{
													    erros++;
													    eType = null;
													  }
													 }#me_exprmuldiv_rule     // Div and Mult are equal
													 
    | l=metaexpr TOK_PLUS_OR_MINUS r=metaexpr        {if(l.eType == Type.Float || r.eType==Type.Float){
														eType = Type.Float;
													  }else{
														if(l.eType==Type.Integer && r.eType=Type.Integer){
															eType = Type.Integer;
														}else{
															erros++;
															eType = null;
														}
													  }
													 }#me_exprplusminus_rule  // Sum and Sub are equal
													 
    | l=metaexpr TOK_CMP_GT_LT r=metaexpr            {if((l.eType != r.eType) && (l.eType==Type.String || r.eType==Type.String)){
    													erros++;
														eType = null;
													  }else{
														eType = Type.Boolean;
													  }
													 }#me_boolgtlt_rule       // < <= >= > are equal
													 
    | l=metaexpr TOK_CMP_EQ_DIFF r=metaexpr          {if((l.eType != r.eType) && (l.eType==Type.String || r.eType==Type.String)){
    													erros++;
														eType = null;
													  }else{
														eType = Type.Boolean;
													  }
													 }#me_booleqdiff_rule     // == and != are egual
													 
    | l=metaexpr TOK_BOOL_AND_OR r=metaexpr         {if((l.eType != r.eType) && (l.eType==Type.String || r.eType==Type.String)){
    													erros++;
														eType = null;
													  }else{
														eType = Type.Boolean;
													  }
													 }#me_boolandor_rule      // &&   and  ||  are equal
													 
    | symbol                                         #me_exprsymbol_rule     // a single symbol
    | literal                                        #me_exprliteral_rule    // literal value
    | funcall                                        #me_exprfuncall_rule    // a funcion call
    | cast                                           {eType = cType;}#me_exprcast_rule       // cast a type to other  
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
returns [Type cType]
    : t=type funcbody                                  {cType = t.tType;}#cast_rule
    ;

funcall_params
    :   metaexpr funcall_params_cont                    #funcallparams_rule
    |   '_'                                             #funcallnoparam_rule
    ;

funcall_params_cont
    : metaexpr funcall_params_cont                      #funcall_params_cont_rule
    |                                                   #funcall_params_end_rule
    ;

literal:
        'nil'                                           #literalnil_rule
    |   'true'                                          #literaltrue_rule
    |   number                                          #literalnumber_rule
    |   strlit                                          #literalstring_rule
    |   charlit                                         #literal_char_rule
    ;

strlit: TOK_STR_LIT
    ;

charlit
    : TOK_CHAR_LIT
    ;

number
returns [Type cType]:
        FLOAT                                           {cType = Type.Float;}#numberfloat_rule
    |   DECIMAL                                         {cType = Type.Float;}#numberdecimal_rule
    |   HEXADECIMAL                                     {cType = Type.Integer;}#numberhexadecimal_rule
    |   BINARY                                          {cType = Type.Integer;}#numberbinary_rule
                ;

symbol: TOK_ID                                          #symbol_rule
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

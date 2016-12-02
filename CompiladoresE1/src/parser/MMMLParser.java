// Generated from src/MMML.g4 by ANTLR 4.5.3

import java.util.*;
import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MMMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, WS=23, COMMENT=24, TOK_ID=25, 
		TOK_CONCAT=26, TOK_NEG=27, TOK_POWER=28, TOK_DIV_OR_MUL=29, TOK_PLUS_OR_MINUS=30, 
		TOK_CMP_GT_LT=31, TOK_CMP_EQ_DIFF=32, TOK_BOOL_AND_OR=33, TOK_REL_OP=34, 
		TOK_STR_LIT=35, TOK_CHAR_LIT=36, FLOAT=37, DECIMAL=38, HEXADECIMAL=39, 
		BINARY=40;
	public static final int
		RULE_program = 0, RULE_fdecls = 1, RULE_maindecl = 2, RULE_fdecl = 3, 
		RULE_fdeclparams = 4, RULE_fdeclparams_cont = 5, RULE_fdeclparam = 6, 
		RULE_functionname = 7, RULE_type = 8, RULE_basic_type = 9, RULE_sequence_type = 10, 
		RULE_funcbody = 11, RULE_ifexpr = 12, RULE_letexpr = 13, RULE_letlist = 14, 
		RULE_letlist_cont = 15, RULE_letvarexpr = 16, RULE_metaexpr = 17, RULE_sequence_expr = 18, 
		RULE_funcall = 19, RULE_cast = 20, RULE_funcall_params = 21, RULE_funcall_params_cont = 22, 
		RULE_literal = 23, RULE_strlit = 24, RULE_charlit = 25, RULE_number = 26, 
		RULE_symbol = 27;
	public static final String[] ruleNames = {
		"program", "fdecls", "maindecl", "fdecl", "fdeclparams", "fdeclparams_cont", 
		"fdeclparam", "functionname", "type", "basic_type", "sequence_type", "funcbody", 
		"ifexpr", "letexpr", "letlist", "letlist_cont", "letvarexpr", "metaexpr", 
		"sequence_expr", "funcall", "cast", "funcall_params", "funcall_params_cont", 
		"literal", "strlit", "charlit", "number", "symbol"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'def'", "'main'", "'='", "','", "':'", "'int'", "'bool'", "'str'", 
		"'float'", "'[]'", "'if'", "'then'", "'else'", "'let'", "'in'", "'_'", 
		"'('", "')'", "'['", "']'", "'nil'", "'true'", null, null, null, "'::'", 
		"'!'", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "WS", 
		"COMMENT", "TOK_ID", "TOK_CONCAT", "TOK_NEG", "TOK_POWER", "TOK_DIV_OR_MUL", 
		"TOK_PLUS_OR_MINUS", "TOK_CMP_GT_LT", "TOK_CMP_EQ_DIFF", "TOK_BOOL_AND_OR", 
		"TOK_REL_OP", "TOK_STR_LIT", "TOK_CHAR_LIT", "FLOAT", "DECIMAL", "HEXADECIMAL", 
		"BINARY"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MMML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	int erros=0;
	//inicializando a tabela com os simbolos pre-definidos na E4
	NestedSymbolTable<String> symbolTable = new NestedSymbolTable<String>();
	NestedSymbolTable<Object> symbolValueTable = new NestedSymbolTable<Object>();
	ArrayList<Object> values = new ArrayList<Object>();
	ArrayList<String> names = new ArrayList<String>();

	public MMMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public FdeclsContext fdecls() {
			return getRuleContext(FdeclsContext.class,0);
		}
		public MaindeclContext maindecl() {
			return getRuleContext(MaindeclContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			fdecls();
			setState(57);
			maindecl();
			System.out.println("Parseou um programa!");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FdeclsContext extends ParserRuleContext {
		public FdeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fdecls; }
	 
		public FdeclsContext() { }
		public void copyFrom(FdeclsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Fdecls_end_ruleContext extends FdeclsContext {
		public Fdecls_end_ruleContext(FdeclsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterFdecls_end_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitFdecls_end_rule(this);
		}
	}
	public static class Fdecls_one_decl_ruleContext extends FdeclsContext {
		public FdeclContext fdecl() {
			return getRuleContext(FdeclContext.class,0);
		}
		public FdeclsContext fdecls() {
			return getRuleContext(FdeclsContext.class,0);
		}
		public Fdecls_one_decl_ruleContext(FdeclsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterFdecls_one_decl_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitFdecls_one_decl_rule(this);
		}
	}

	public final FdeclsContext fdecls() throws RecognitionException {
		FdeclsContext _localctx = new FdeclsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fdecls);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new Fdecls_one_decl_ruleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				fdecl();
				setState(61);
				fdecls();
				}
				break;
			case 2:
				_localctx = new Fdecls_end_ruleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MaindeclContext extends ParserRuleContext {
		public MaindeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maindecl; }
	 
		public MaindeclContext() { }
		public void copyFrom(MaindeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Programmain_ruleContext extends MaindeclContext {
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public Programmain_ruleContext(MaindeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterProgrammain_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitProgrammain_rule(this);
		}
	}

	public final MaindeclContext maindecl() throws RecognitionException {
		MaindeclContext _localctx = new MaindeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_maindecl);
		try {
			_localctx = new Programmain_ruleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__0);
			setState(67);
			match(T__1);
			setState(68);
			match(T__2);
			setState(69);
			funcbody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FdeclContext extends ParserRuleContext {
		public FdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fdecl; }
	 
		public FdeclContext() { }
		public void copyFrom(FdeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Funcdef_ruleContext extends FdeclContext {
		public FunctionnameContext functionname() {
			return getRuleContext(FunctionnameContext.class,0);
		}
		public FdeclparamsContext fdeclparams() {
			return getRuleContext(FdeclparamsContext.class,0);
		}
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public Funcdef_ruleContext(FdeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterFuncdef_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitFuncdef_rule(this);
		}
	}

	public final FdeclContext fdecl() throws RecognitionException {
		FdeclContext _localctx = new FdeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fdecl);
		try {
			_localctx = new Funcdef_ruleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__0);
			setState(72);
			functionname();
			setState(73);
			fdeclparams();
			setState(74);
			match(T__2);
			setState(75);
			funcbody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FdeclparamsContext extends ParserRuleContext {
		public List<String> plist;
		public FdeclparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fdeclparams; }
	 
		public FdeclparamsContext() { }
		public void copyFrom(FdeclparamsContext ctx) {
			super.copyFrom(ctx);
			this.plist = ctx.plist;
		}
	}
	public static class Fdeclparams_no_paramsContext extends FdeclparamsContext {
		public Fdeclparams_no_paramsContext(FdeclparamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterFdeclparams_no_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitFdeclparams_no_params(this);
		}
	}
	public static class Fdeclparams_one_param_ruleContext extends FdeclparamsContext {
		public FdeclparamContext fdeclparam;
		public FdeclparamContext fdeclparam() {
			return getRuleContext(FdeclparamContext.class,0);
		}
		public Fdeclparams_contContext fdeclparams_cont() {
			return getRuleContext(Fdeclparams_contContext.class,0);
		}
		public Fdeclparams_one_param_ruleContext(FdeclparamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterFdeclparams_one_param_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitFdeclparams_one_param_rule(this);
		}
	}

	public final FdeclparamsContext fdeclparams() throws RecognitionException {
		FdeclparamsContext _localctx = new FdeclparamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fdeclparams);

		    ((FdeclparamsContext)_localctx).plist =  new ArrayList<String>();

		try {
			setState(82);
			switch (_input.LA(1)) {
			case TOK_ID:
				_localctx = new Fdeclparams_one_param_ruleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				((Fdeclparams_one_param_ruleContext)_localctx).fdeclparam = fdeclparam();

				            _localctx.plist.add(((Fdeclparams_one_param_ruleContext)_localctx).fdeclparam.pname);
				        
				setState(79);
				fdeclparams_cont(_localctx.plist);
				}
				break;
			case T__2:
				_localctx = new Fdeclparams_no_paramsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);

			    for (String s : _localctx.plist) {
			        System.out.println("Parametro: " + s);
			    }

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fdeclparams_contContext extends ParserRuleContext {
		public List<String> plist;
		public Fdeclparams_contContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Fdeclparams_contContext(ParserRuleContext parent, int invokingState, List<String> plist) {
			super(parent, invokingState);
			this.plist = plist;
		}
		@Override public int getRuleIndex() { return RULE_fdeclparams_cont; }
	 
		public Fdeclparams_contContext() { }
		public void copyFrom(Fdeclparams_contContext ctx) {
			super.copyFrom(ctx);
			this.plist = ctx.plist;
		}
	}
	public static class Fdeclparams_end_ruleContext extends Fdeclparams_contContext {
		public Fdeclparams_end_ruleContext(Fdeclparams_contContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterFdeclparams_end_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitFdeclparams_end_rule(this);
		}
	}
	public static class Fdeclparams_cont_ruleContext extends Fdeclparams_contContext {
		public FdeclparamContext fdeclparam;
		public FdeclparamContext fdeclparam() {
			return getRuleContext(FdeclparamContext.class,0);
		}
		public Fdeclparams_contContext fdeclparams_cont() {
			return getRuleContext(Fdeclparams_contContext.class,0);
		}
		public Fdeclparams_cont_ruleContext(Fdeclparams_contContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterFdeclparams_cont_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitFdeclparams_cont_rule(this);
		}
	}

	public final Fdeclparams_contContext fdeclparams_cont(List<String> plist) throws RecognitionException {
		Fdeclparams_contContext _localctx = new Fdeclparams_contContext(_ctx, getState(), plist);
		enterRule(_localctx, 10, RULE_fdeclparams_cont);
		try {
			setState(90);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new Fdeclparams_cont_ruleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(T__3);
				setState(85);
				((Fdeclparams_cont_ruleContext)_localctx).fdeclparam = fdeclparam();

				            _localctx.plist.add(((Fdeclparams_cont_ruleContext)_localctx).fdeclparam.pname);
				        
				setState(87);
				fdeclparams_cont(_localctx.plist);
				}
				break;
			case T__2:
				_localctx = new Fdeclparams_end_ruleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FdeclparamContext extends ParserRuleContext {
		public String pname;
		public String ptype;
		public FdeclparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fdeclparam; }
	 
		public FdeclparamContext() { }
		public void copyFrom(FdeclparamContext ctx) {
			super.copyFrom(ctx);
			this.pname = ctx.pname;
			this.ptype = ctx.ptype;
		}
	}
	public static class Fdecl_param_ruleContext extends FdeclparamContext {
		public SymbolContext symbol;
		public TypeContext type;
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Fdecl_param_ruleContext(FdeclparamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterFdecl_param_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitFdecl_param_rule(this);
		}
	}

	public final FdeclparamContext fdeclparam() throws RecognitionException {
		FdeclparamContext _localctx = new FdeclparamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fdeclparam);
		try {
			_localctx = new Fdecl_param_ruleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((Fdecl_param_ruleContext)_localctx).symbol = symbol();
			setState(93);
			match(T__4);
			setState(94);
			((Fdecl_param_ruleContext)_localctx).type = type();

			            ((Fdecl_param_ruleContext)_localctx).pname =  (((Fdecl_param_ruleContext)_localctx).symbol!=null?_input.getText(((Fdecl_param_ruleContext)_localctx).symbol.start,((Fdecl_param_ruleContext)_localctx).symbol.stop):null);
			            ((Fdecl_param_ruleContext)_localctx).ptype =  (((Fdecl_param_ruleContext)_localctx).type!=null?_input.getText(((Fdecl_param_ruleContext)_localctx).type.start,((Fdecl_param_ruleContext)_localctx).type.stop):null);
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionnameContext extends ParserRuleContext {
		public FunctionnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionname; }
	 
		public FunctionnameContext() { }
		public void copyFrom(FunctionnameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Fdecl_funcname_ruleContext extends FunctionnameContext {
		public TerminalNode TOK_ID() { return getToken(MMMLParser.TOK_ID, 0); }
		public Fdecl_funcname_ruleContext(FunctionnameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterFdecl_funcname_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitFdecl_funcname_rule(this);
		}
	}

	public final FunctionnameContext functionname() throws RecognitionException {
		FunctionnameContext _localctx = new FunctionnameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionname);
		try {
			_localctx = new Fdecl_funcname_ruleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(TOK_ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public String tType;
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
			this.tType = ctx.tType;
		}
	}
	public static class Basictype_ruleContext extends TypeContext {
		public Basic_typeContext b;
		public Basic_typeContext basic_type() {
			return getRuleContext(Basic_typeContext.class,0);
		}
		public Basictype_ruleContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterBasictype_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitBasictype_rule(this);
		}
	}
	public static class Sequencetype_ruleContext extends TypeContext {
		public Sequence_typeContext sequence_type;
		public Sequence_typeContext sequence_type() {
			return getRuleContext(Sequence_typeContext.class,0);
		}
		public Sequencetype_ruleContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterSequencetype_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitSequencetype_rule(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new Basictype_ruleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				((Basictype_ruleContext)_localctx).b = basic_type();
				((Basictype_ruleContext)_localctx).tType =  ((Basictype_ruleContext)_localctx).b.cType;
				}
				break;
			case 2:
				_localctx = new Sequencetype_ruleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				((Sequencetype_ruleContext)_localctx).sequence_type = sequence_type(0);

				            System.out.println("Variavel do tipo " + ((Sequencetype_ruleContext)_localctx).sequence_type.base + " dimensao "+ ((Sequencetype_ruleContext)_localctx).sequence_type.dimension);
				        
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Basic_typeContext extends ParserRuleContext {
		public String cType;
		public Basic_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterBasic_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitBasic_type(this);
		}
	}

	public final Basic_typeContext basic_type() throws RecognitionException {
		Basic_typeContext _localctx = new Basic_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_basic_type);
		try {
			setState(115);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(T__5);
				((Basic_typeContext)_localctx).cType =  "integer";
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(T__6);
				((Basic_typeContext)_localctx).cType =  "boolean";
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(T__7);
				((Basic_typeContext)_localctx).cType =  "string";
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				match(T__8);
				((Basic_typeContext)_localctx).cType =  "float";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sequence_typeContext extends ParserRuleContext {
		public int dimension = 0;
		public String base;
		public Sequence_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_type; }
	 
		public Sequence_typeContext() { }
		public void copyFrom(Sequence_typeContext ctx) {
			super.copyFrom(ctx);
			this.dimension = ctx.dimension;
			this.base = ctx.base;
		}
	}
	public static class Sequencetype_sequence_ruleContext extends Sequence_typeContext {
		public Sequence_typeContext s;
		public Sequence_typeContext sequence_type() {
			return getRuleContext(Sequence_typeContext.class,0);
		}
		public Sequencetype_sequence_ruleContext(Sequence_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterSequencetype_sequence_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitSequencetype_sequence_rule(this);
		}
	}
	public static class Sequencetype_basetype_ruleContext extends Sequence_typeContext {
		public Basic_typeContext basic_type;
		public Basic_typeContext basic_type() {
			return getRuleContext(Basic_typeContext.class,0);
		}
		public Sequencetype_basetype_ruleContext(Sequence_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterSequencetype_basetype_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitSequencetype_basetype_rule(this);
		}
	}

	public final Sequence_typeContext sequence_type() throws RecognitionException {
		return sequence_type(0);
	}

	private Sequence_typeContext sequence_type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Sequence_typeContext _localctx = new Sequence_typeContext(_ctx, _parentState);
		Sequence_typeContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_sequence_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Sequencetype_basetype_ruleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(118);
			((Sequencetype_basetype_ruleContext)_localctx).basic_type = basic_type();
			setState(119);
			match(T__9);

			            ((Sequencetype_basetype_ruleContext)_localctx).dimension =  1;
			            ((Sequencetype_basetype_ruleContext)_localctx).base =  (((Sequencetype_basetype_ruleContext)_localctx).basic_type!=null?_input.getText(((Sequencetype_basetype_ruleContext)_localctx).basic_type.start,((Sequencetype_basetype_ruleContext)_localctx).basic_type.stop):null);
			        
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Sequencetype_sequence_ruleContext(new Sequence_typeContext(_parentctx, _parentState));
					((Sequencetype_sequence_ruleContext)_localctx).s = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_sequence_type);
					setState(122);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(123);
					match(T__9);

					                      ((Sequencetype_sequence_ruleContext)_localctx).dimension =  ((Sequencetype_sequence_ruleContext)_localctx).s.dimension + 1;
					                      ((Sequencetype_sequence_ruleContext)_localctx).base =  ((Sequencetype_sequence_ruleContext)_localctx).s.base;
					                  
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FuncbodyContext extends ParserRuleContext {
		public String oType;
		public FuncbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcbody; }
	 
		public FuncbodyContext() { }
		public void copyFrom(FuncbodyContext ctx) {
			super.copyFrom(ctx);
			this.oType = ctx.oType;
		}
	}
	public static class Fbody_let_ruleContext extends FuncbodyContext {
		public LetexprContext let;
		public LetexprContext letexpr() {
			return getRuleContext(LetexprContext.class,0);
		}
		public Fbody_let_ruleContext(FuncbodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterFbody_let_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitFbody_let_rule(this);
		}
	}
	public static class Fbody_if_ruleContext extends FuncbodyContext {
		public IfexprContext ifexpr() {
			return getRuleContext(IfexprContext.class,0);
		}
		public Fbody_if_ruleContext(FuncbodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterFbody_if_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitFbody_if_rule(this);
		}
	}
	public static class Fbody_expr_ruleContext extends FuncbodyContext {
		public MetaexprContext m;
		public MetaexprContext metaexpr() {
			return getRuleContext(MetaexprContext.class,0);
		}
		public Fbody_expr_ruleContext(FuncbodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterFbody_expr_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitFbody_expr_rule(this);
		}
	}

	public final FuncbodyContext funcbody() throws RecognitionException {
		FuncbodyContext _localctx = new FuncbodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcbody);
		try {
			setState(137);
			switch (_input.LA(1)) {
			case T__10:
				_localctx = new Fbody_if_ruleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				ifexpr();
				}
				break;
			case T__13:
				_localctx = new Fbody_let_ruleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				((Fbody_let_ruleContext)_localctx).let = letexpr();
				((Fbody_let_ruleContext)_localctx).oType =  ((Fbody_let_ruleContext)_localctx).let.letexprType;
				}
				break;
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__16:
			case T__18:
			case T__20:
			case T__21:
			case TOK_ID:
			case TOK_NEG:
			case TOK_STR_LIT:
			case TOK_CHAR_LIT:
			case FLOAT:
			case DECIMAL:
			case HEXADECIMAL:
			case BINARY:
				_localctx = new Fbody_expr_ruleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				((Fbody_expr_ruleContext)_localctx).m = metaexpr(0);
				((Fbody_expr_ruleContext)_localctx).oType =  ((Fbody_expr_ruleContext)_localctx).m.eType;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfexprContext extends ParserRuleContext {
		public IfexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifexpr; }
	 
		public IfexprContext() { }
		public void copyFrom(IfexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Ifexpression_ruleContext extends IfexprContext {
		public List<FuncbodyContext> funcbody() {
			return getRuleContexts(FuncbodyContext.class);
		}
		public FuncbodyContext funcbody(int i) {
			return getRuleContext(FuncbodyContext.class,i);
		}
		public Ifexpression_ruleContext(IfexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterIfexpression_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitIfexpression_rule(this);
		}
	}

	public final IfexprContext ifexpr() throws RecognitionException {
		IfexprContext _localctx = new IfexprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifexpr);
		try {
			_localctx = new Ifexpression_ruleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__10);
			setState(140);
			funcbody();
			setState(141);
			match(T__11);
			setState(142);
			funcbody();
			setState(143);
			match(T__12);
			setState(144);
			funcbody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetexprContext extends ParserRuleContext {
		public String letexprType;
		public LetexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letexpr; }
	 
		public LetexprContext() { }
		public void copyFrom(LetexprContext ctx) {
			super.copyFrom(ctx);
			this.letexprType = ctx.letexprType;
		}
	}
	public static class Letexpression_ruleContext extends LetexprContext {
		public LetlistContext d;
		public FuncbodyContext a;
		public LetlistContext letlist() {
			return getRuleContext(LetlistContext.class,0);
		}
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public Letexpression_ruleContext(LetexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterLetexpression_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitLetexpression_rule(this);
		}
	}

	public final LetexprContext letexpr() throws RecognitionException {
		LetexprContext _localctx = new LetexprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_letexpr);
		try {
			_localctx = new Letexpression_ruleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			symbolTable = new NestedSymbolTable<String>(symbolTable);
			       symbolValueTable = new NestedSymbolTable<Object>(symbolValueTable);
			    
			setState(147);
			match(T__13);
			setState(148);
			((Letexpression_ruleContext)_localctx).d = letlist();
			setState(149);
			match(T__14);
			setState(150);
			((Letexpression_ruleContext)_localctx).a = funcbody();
				((Letexpression_ruleContext)_localctx).letexprType =  ((Letexpression_ruleContext)_localctx).a.oType;
			    														System.out.println("voltando para a tabela pai");
			    														symbolTable = symbolTable.getParent();
			    														symbolValueTable = symbolValueTable.getParent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetlistContext extends ParserRuleContext {
		public LetlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letlist; }
	 
		public LetlistContext() { }
		public void copyFrom(LetlistContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Letlist_ruleContext extends LetlistContext {
		public LetvarexprContext c;
		public Letlist_contContext e;
		public LetvarexprContext letvarexpr() {
			return getRuleContext(LetvarexprContext.class,0);
		}
		public Letlist_contContext letlist_cont() {
			return getRuleContext(Letlist_contContext.class,0);
		}
		public Letlist_ruleContext(LetlistContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterLetlist_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitLetlist_rule(this);
		}
	}

	public final LetlistContext letlist() throws RecognitionException {
		LetlistContext _localctx = new LetlistContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_letlist);
		try {
			_localctx = new Letlist_ruleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			((Letlist_ruleContext)_localctx).c = letvarexpr();
			setState(154);
			((Letlist_ruleContext)_localctx).e = letlist_cont();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Letlist_contContext extends ParserRuleContext {
		public Letlist_contContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letlist_cont; }
	 
		public Letlist_contContext() { }
		public void copyFrom(Letlist_contContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Letlist_cont_endContext extends Letlist_contContext {
		public Letlist_cont_endContext(Letlist_contContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterLetlist_cont_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitLetlist_cont_end(this);
		}
	}
	public static class Letlist_cont_ruleContext extends Letlist_contContext {
		public LetvarexprContext b;
		public Letlist_contContext letlist_cont() {
			return getRuleContext(Letlist_contContext.class,0);
		}
		public LetvarexprContext letvarexpr() {
			return getRuleContext(LetvarexprContext.class,0);
		}
		public Letlist_cont_ruleContext(Letlist_contContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterLetlist_cont_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitLetlist_cont_rule(this);
		}
	}

	public final Letlist_contContext letlist_cont() throws RecognitionException {
		Letlist_contContext _localctx = new Letlist_contContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_letlist_cont);
		try {
			setState(161);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new Letlist_cont_ruleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(T__3);
				setState(157);
				((Letlist_cont_ruleContext)_localctx).b = letvarexpr();
				setState(158);
				letlist_cont();
				}
				break;
			case T__14:
				_localctx = new Letlist_cont_endContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetvarexprContext extends ParserRuleContext {
		public String letType;
		public String name1;
		public LetvarexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letvarexpr; }
	 
		public LetvarexprContext() { }
		public void copyFrom(LetvarexprContext ctx) {
			super.copyFrom(ctx);
			this.letType = ctx.letType;
			this.name1 = ctx.name1;
		}
	}
	public static class Letunpack_ruleContext extends LetvarexprContext {
		public SymbolContext l;
		public SymbolContext r;
		public FuncbodyContext s;
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public Letunpack_ruleContext(LetvarexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterLetunpack_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitLetunpack_rule(this);
		}
	}
	public static class Letvarresult_ignore_ruleContext extends LetvarexprContext {
		public FuncbodyContext f;
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public Letvarresult_ignore_ruleContext(LetvarexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterLetvarresult_ignore_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitLetvarresult_ignore_rule(this);
		}
	}
	public static class Letvarattr_ruleContext extends LetvarexprContext {
		public SymbolContext s;
		public FuncbodyContext f;
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public Letvarattr_ruleContext(LetvarexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterLetvarattr_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitLetvarattr_rule(this);
		}
	}

	public final LetvarexprContext letvarexpr() throws RecognitionException {
		LetvarexprContext _localctx = new LetvarexprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_letvarexpr);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new Letvarattr_ruleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				((Letvarattr_ruleContext)_localctx).s = symbol();
				setState(164);
				match(T__2);
				setState(165);
				((Letvarattr_ruleContext)_localctx).f = funcbody();
				  ((Letvarattr_ruleContext)_localctx).name1 =  (((Letvarattr_ruleContext)_localctx).s!=null?_input.getText(((Letvarattr_ruleContext)_localctx).s.start,((Letvarattr_ruleContext)_localctx).s.stop):null); System.out.println("values-->" + values); ((Letvarattr_ruleContext)_localctx).letType =  ((Letvarattr_ruleContext)_localctx).f.oType;
					         												if ((((Letvarattr_ruleContext)_localctx).s!=null?_input.getText(((Letvarattr_ruleContext)_localctx).s.start,((Letvarattr_ruleContext)_localctx).s.stop):null) != ""){
					         													symbolTable.store((((Letvarattr_ruleContext)_localctx).s!=null?_input.getText(((Letvarattr_ruleContext)_localctx).s.start,((Letvarattr_ruleContext)_localctx).s.stop):null),((Letvarattr_ruleContext)_localctx).f.oType); System.out.println("Adicionou na tabela de tipos");
					         													if (values.size() != 0){ Object obj1 = values.remove(values.size()-1); 
					         													System.out.println("removeu da pilha, adicionou na tabela de valores"); 
					         													symbolValueTable.store((((Letvarattr_ruleContext)_localctx).s!=null?_input.getText(((Letvarattr_ruleContext)_localctx).s.start,((Letvarattr_ruleContext)_localctx).s.stop):null), obj1); 
					         													values.add(obj1); System.out.println("values-->" + values); }
					         													System.out.print("simbolo "+(((Letvarattr_ruleContext)_localctx).s!=null?_input.getText(((Letvarattr_ruleContext)_localctx).s.start,((Letvarattr_ruleContext)_localctx).s.stop):null)+" armazenado na tabela atual");
					         													if(((Letvarattr_ruleContext)_localctx).f.oType==null){
					         														System.out.println(" - porem o tipo do simbolo nao foi reconhecido(expressao let como valor para o simbolo?), o que ira causar uma exception em caso de pesquisa por este simbolo");
					         													}else{System.out.println("");}}
				}
				break;
			case 2:
				_localctx = new Letvarresult_ignore_ruleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(T__15);
				setState(169);
				match(T__2);
				setState(170);
				((Letvarresult_ignore_ruleContext)_localctx).f = funcbody();
				  ((Letvarresult_ignore_ruleContext)_localctx).name1 =  "_";	System.out.println("values-->" + values); ((Letvarresult_ignore_ruleContext)_localctx).letType =  ((Letvarresult_ignore_ruleContext)_localctx).f.oType;
				    															symbolTable.store("_",((Letvarresult_ignore_ruleContext)_localctx).f.oType);
				    															if (values.size() != 0){ Object obj2 = values.remove(values.size()-1); 
				    															symbolValueTable.store("_", obj2);
				    															values.add(obj2); System.out.println("values-->" + values);  }
				    															System.out.print("simbolo _ armazenado na tabela atual");
				    															if(((Letvarresult_ignore_ruleContext)_localctx).f.oType==null){
				    																System.out.println(" - porem o tipo do simbolo nao foi reconhecido(expressao let como valor para o simbolo?), o que ira causar uma exception em caso de pesquisa por este simbolo");
				    															}else{System.out.println("");}
				}
				break;
			case 3:
				_localctx = new Letunpack_ruleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				((Letunpack_ruleContext)_localctx).l = symbol();
				setState(174);
				match(TOK_CONCAT);
				setState(175);
				((Letunpack_ruleContext)_localctx).r = symbol();
				setState(176);
				match(T__2);
				setState(177);
				((Letunpack_ruleContext)_localctx).s = funcbody();
				  ((Letunpack_ruleContext)_localctx).name1 =  (((Letunpack_ruleContext)_localctx).l!=null?_input.getText(((Letunpack_ruleContext)_localctx).l.start,((Letunpack_ruleContext)_localctx).l.stop):null) + (((Letunpack_ruleContext)_localctx).r!=null?_input.getText(((Letunpack_ruleContext)_localctx).r.start,((Letunpack_ruleContext)_localctx).r.stop):null);  System.out.println("values-->" + values);	((Letunpack_ruleContext)_localctx).letType =  ((Letunpack_ruleContext)_localctx).s.oType;
				    														if ((((Letunpack_ruleContext)_localctx).l!=null?_input.getText(((Letunpack_ruleContext)_localctx).l.start,((Letunpack_ruleContext)_localctx).l.stop):null) != "" && (((Letunpack_ruleContext)_localctx).r!=null?_input.getText(((Letunpack_ruleContext)_localctx).r.start,((Letunpack_ruleContext)_localctx).r.stop):null) != ""){
				    															symbolTable.store((((Letunpack_ruleContext)_localctx).l!=null?_input.getText(((Letunpack_ruleContext)_localctx).l.start,((Letunpack_ruleContext)_localctx).l.stop):null)+(((Letunpack_ruleContext)_localctx).r!=null?_input.getText(((Letunpack_ruleContext)_localctx).r.start,((Letunpack_ruleContext)_localctx).r.stop):null),((Letunpack_ruleContext)_localctx).s.oType);
				    															if (values.size() != 0){ Object obj3 = values.remove(0); 
				    															symbolValueTable.store((((Letunpack_ruleContext)_localctx).l!=null?_input.getText(((Letunpack_ruleContext)_localctx).l.start,((Letunpack_ruleContext)_localctx).l.stop):null)+(((Letunpack_ruleContext)_localctx).r!=null?_input.getText(((Letunpack_ruleContext)_localctx).r.start,((Letunpack_ruleContext)_localctx).r.stop):null), obj3);
				    															values.add(obj3);  System.out.println("values-->" + values);  }
				    															System.out.print("simbolo "+(((Letunpack_ruleContext)_localctx).l!=null?_input.getText(((Letunpack_ruleContext)_localctx).l.start,((Letunpack_ruleContext)_localctx).l.stop):null)+(((Letunpack_ruleContext)_localctx).r!=null?_input.getText(((Letunpack_ruleContext)_localctx).r.start,((Letunpack_ruleContext)_localctx).r.stop):null)+" armazenado na tabela atual");
				    															if(((Letunpack_ruleContext)_localctx).s.oType==null){	
				    																System.out.println(" - porem o tipo do simbolo nao foi reconhecido(expressao let como valor para o simbolo?), o que ira causar uma exception em caso de pesquisa por este simbolo");
				    															}else{System.out.println("");}}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetaexprContext extends ParserRuleContext {
		public String eType;
		public Object valueOfSymbol;
		public MetaexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metaexpr; }
	 
		public MetaexprContext() { }
		public void copyFrom(MetaexprContext ctx) {
			super.copyFrom(ctx);
			this.eType = ctx.eType;
			this.valueOfSymbol = ctx.valueOfSymbol;
		}
	}
	public static class Me_exprplusminus_ruleContext extends MetaexprContext {
		public MetaexprContext l;
		public MetaexprContext r;
		public TerminalNode TOK_PLUS_OR_MINUS() { return getToken(MMMLParser.TOK_PLUS_OR_MINUS, 0); }
		public List<MetaexprContext> metaexpr() {
			return getRuleContexts(MetaexprContext.class);
		}
		public MetaexprContext metaexpr(int i) {
			return getRuleContext(MetaexprContext.class,i);
		}
		public Me_exprplusminus_ruleContext(MetaexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterMe_exprplusminus_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitMe_exprplusminus_rule(this);
		}
	}
	public static class Me_boolneg_ruleContext extends MetaexprContext {
		public SymbolContext symbol;
		public TerminalNode TOK_NEG() { return getToken(MMMLParser.TOK_NEG, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public Me_boolneg_ruleContext(MetaexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterMe_boolneg_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitMe_boolneg_rule(this);
		}
	}
	public static class Me_exprliteral_ruleContext extends MetaexprContext {
		public LiteralContext y;
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Me_exprliteral_ruleContext(MetaexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterMe_exprliteral_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitMe_exprliteral_rule(this);
		}
	}
	public static class Me_listconcat_ruleContext extends MetaexprContext {
		public MetaexprContext l;
		public MetaexprContext r;
		public TerminalNode TOK_CONCAT() { return getToken(MMMLParser.TOK_CONCAT, 0); }
		public List<MetaexprContext> metaexpr() {
			return getRuleContexts(MetaexprContext.class);
		}
		public MetaexprContext metaexpr(int i) {
			return getRuleContext(MetaexprContext.class,i);
		}
		public Me_listconcat_ruleContext(MetaexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterMe_listconcat_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitMe_listconcat_rule(this);
		}
	}
	public static class Me_list_create_ruleContext extends MetaexprContext {
		public Sequence_exprContext sequence_expr() {
			return getRuleContext(Sequence_exprContext.class,0);
		}
		public Me_list_create_ruleContext(MetaexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterMe_list_create_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitMe_list_create_rule(this);
		}
	}
	public static class Me_exprmuldiv_ruleContext extends MetaexprContext {
		public MetaexprContext l;
		public MetaexprContext r;
		public TerminalNode TOK_DIV_OR_MUL() { return getToken(MMMLParser.TOK_DIV_OR_MUL, 0); }
		public List<MetaexprContext> metaexpr() {
			return getRuleContexts(MetaexprContext.class);
		}
		public MetaexprContext metaexpr(int i) {
			return getRuleContext(MetaexprContext.class,i);
		}
		public Me_exprmuldiv_ruleContext(MetaexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterMe_exprmuldiv_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitMe_exprmuldiv_rule(this);
		}
	}
	public static class Me_exprcast_ruleContext extends MetaexprContext {
		public CastContext t;
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
		}
		public Me_exprcast_ruleContext(MetaexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterMe_exprcast_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitMe_exprcast_rule(this);
		}
	}
	public static class Me_exprparens_ruleContext extends MetaexprContext {
		public FuncbodyContext o;
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public Me_exprparens_ruleContext(MetaexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterMe_exprparens_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitMe_exprparens_rule(this);
		}
	}
	public static class Me_boolandor_ruleContext extends MetaexprContext {
		public MetaexprContext l;
		public MetaexprContext r;
		public TerminalNode TOK_BOOL_AND_OR() { return getToken(MMMLParser.TOK_BOOL_AND_OR, 0); }
		public List<MetaexprContext> metaexpr() {
			return getRuleContexts(MetaexprContext.class);
		}
		public MetaexprContext metaexpr(int i) {
			return getRuleContext(MetaexprContext.class,i);
		}
		public Me_boolandor_ruleContext(MetaexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterMe_boolandor_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitMe_boolandor_rule(this);
		}
	}
	public static class Me_exprsymbol_ruleContext extends MetaexprContext {
		public SymbolContext u;
		public SymbolContext symbol;
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public Me_exprsymbol_ruleContext(MetaexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterMe_exprsymbol_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitMe_exprsymbol_rule(this);
		}
	}
	public static class Me_exprfuncall_ruleContext extends MetaexprContext {
		public FuncallContext funcall() {
			return getRuleContext(FuncallContext.class,0);
		}
		public Me_exprfuncall_ruleContext(MetaexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterMe_exprfuncall_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitMe_exprfuncall_rule(this);
		}
	}
	public static class Me_boolgtlt_ruleContext extends MetaexprContext {
		public MetaexprContext l;
		public MetaexprContext r;
		public TerminalNode TOK_CMP_GT_LT() { return getToken(MMMLParser.TOK_CMP_GT_LT, 0); }
		public List<MetaexprContext> metaexpr() {
			return getRuleContexts(MetaexprContext.class);
		}
		public MetaexprContext metaexpr(int i) {
			return getRuleContext(MetaexprContext.class,i);
		}
		public Me_boolgtlt_ruleContext(MetaexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterMe_boolgtlt_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitMe_boolgtlt_rule(this);
		}
	}
	public static class Me_boolnegparens_ruleContext extends MetaexprContext {
		public TerminalNode TOK_NEG() { return getToken(MMMLParser.TOK_NEG, 0); }
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public Me_boolnegparens_ruleContext(MetaexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterMe_boolnegparens_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitMe_boolnegparens_rule(this);
		}
	}
	public static class Me_exprpower_ruleContext extends MetaexprContext {
		public MetaexprContext l;
		public MetaexprContext r;
		public TerminalNode TOK_POWER() { return getToken(MMMLParser.TOK_POWER, 0); }
		public List<MetaexprContext> metaexpr() {
			return getRuleContexts(MetaexprContext.class);
		}
		public MetaexprContext metaexpr(int i) {
			return getRuleContext(MetaexprContext.class,i);
		}
		public Me_exprpower_ruleContext(MetaexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterMe_exprpower_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitMe_exprpower_rule(this);
		}
	}
	public static class Me_booleqdiff_ruleContext extends MetaexprContext {
		public MetaexprContext l;
		public MetaexprContext r;
		public TerminalNode TOK_CMP_EQ_DIFF() { return getToken(MMMLParser.TOK_CMP_EQ_DIFF, 0); }
		public List<MetaexprContext> metaexpr() {
			return getRuleContexts(MetaexprContext.class);
		}
		public MetaexprContext metaexpr(int i) {
			return getRuleContext(MetaexprContext.class,i);
		}
		public Me_booleqdiff_ruleContext(MetaexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterMe_booleqdiff_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitMe_booleqdiff_rule(this);
		}
	}

	public final MetaexprContext metaexpr() throws RecognitionException {
		return metaexpr(0);
	}

	private MetaexprContext metaexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MetaexprContext _localctx = new MetaexprContext(_ctx, _parentState);
		MetaexprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_metaexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new Me_exprparens_ruleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(183);
				match(T__16);
				setState(184);
				((Me_exprparens_ruleContext)_localctx).o = funcbody();
				setState(185);
				match(T__17);
				((Me_exprparens_ruleContext)_localctx).eType =  ((Me_exprparens_ruleContext)_localctx).o.oType;
				}
				break;
			case 2:
				{
				_localctx = new Me_list_create_ruleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				sequence_expr();
				}
				break;
			case 3:
				{
				_localctx = new Me_boolneg_ruleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				match(TOK_NEG);
				setState(190);
				((Me_boolneg_ruleContext)_localctx).symbol = symbol();
				((Me_boolneg_ruleContext)_localctx).eType =  "boolean";
				}
				break;
			case 4:
				{
				_localctx = new Me_boolnegparens_ruleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				match(TOK_NEG);
				setState(194);
				match(T__16);
				setState(195);
				funcbody();
				setState(196);
				match(T__17);
				((Me_boolnegparens_ruleContext)_localctx).eType =  "boolean";
				}
				break;
			case 5:
				{
				_localctx = new Me_exprsymbol_ruleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				((Me_exprsymbol_ruleContext)_localctx).u = ((Me_exprsymbol_ruleContext)_localctx).symbol = symbol();

				    													((Me_exprsymbol_ruleContext)_localctx).eType =  ((Me_exprsymbol_ruleContext)_localctx).u.sType;
				    													System.out.println("1-entrei em symbol");
				    													SymbolEntry<Object> symbolE = symbolValueTable.lookup((((Me_exprsymbol_ruleContext)_localctx).symbol!=null?_input.getText(((Me_exprsymbol_ruleContext)_localctx).symbol.start,((Me_exprsymbol_ruleContext)_localctx).symbol.stop):null));
																		if (symbolE == null) {
																			System.out.println("Variavel desconhecida: " + (((Me_exprsymbol_ruleContext)_localctx).symbol!=null?_input.getText(((Me_exprsymbol_ruleContext)_localctx).symbol.start,((Me_exprsymbol_ruleContext)_localctx).symbol.stop):null));	
																		}
				    												
				}
				break;
			case 6:
				{
				_localctx = new Me_exprliteral_ruleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
				((Me_exprliteral_ruleContext)_localctx).y = literal();
				 ((Me_exprliteral_ruleContext)_localctx).valueOfSymbol =  ((Me_exprliteral_ruleContext)_localctx).y.valueOfSymbol;
				    													values.add(_localctx.valueOfSymbol);
				    												   ((Me_exprliteral_ruleContext)_localctx).eType =  ((Me_exprliteral_ruleContext)_localctx).y.lType;
				}
				break;
			case 7:
				{
				_localctx = new Me_exprfuncall_ruleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				funcall();
				}
				break;
			case 8:
				{
				_localctx = new Me_exprcast_ruleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206);
				((Me_exprcast_ruleContext)_localctx).t = cast();
				((Me_exprcast_ruleContext)_localctx).eType =  ((Me_exprcast_ruleContext)_localctx).t.cType;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(246);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new Me_exprpower_ruleContext(new MetaexprContext(_parentctx, _parentState));
						((Me_exprpower_ruleContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_metaexpr);
						setState(211);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(212);
						match(TOK_POWER);
						setState(213);
						((Me_exprpower_ruleContext)_localctx).r = metaexpr(12);
						if((!((Me_exprpower_ruleContext)_localctx).l.eType.equals("string") && !((Me_exprpower_ruleContext)_localctx).r.eType.equals("string")) && (!((Me_exprpower_ruleContext)_localctx).l.eType.equals("boolean") && !((Me_exprpower_ruleContext)_localctx).r.eType.equals("boolean"))){
						          															((Me_exprpower_ruleContext)_localctx).eType =  "float";
						          													  }else{
						          													  		erros++;
						          	    													((Me_exprpower_ruleContext)_localctx).eType =  null;
						          													   }
						          													  
						}
						break;
					case 2:
						{
						_localctx = new Me_listconcat_ruleContext(new MetaexprContext(_parentctx, _parentState));
						((Me_listconcat_ruleContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_metaexpr);
						setState(216);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(217);
						match(TOK_CONCAT);
						setState(218);
						((Me_listconcat_ruleContext)_localctx).r = metaexpr(11);
						if(((Me_listconcat_ruleContext)_localctx).l.eType.equals("string") && ((Me_listconcat_ruleContext)_localctx).r.eType.equals("string")){
						          														((Me_listconcat_ruleContext)_localctx).eType =  "string";
						          													  }else{
						          														erros++;
						          														((Me_listconcat_ruleContext)_localctx).eType =  null;
						          													  }
						          													  if (values.size() >= 2) { 
						          														 String v1c = (String) (values.remove(values.size()-1));
						          													     String v2c = (String) (values.remove(values.size()-1));
						          													     System.out.println("V1: " + v1c + "V2: " + v2c);
						          													     values.add(String.valueOf(v1c) + String.valueOf(v2c));
						          													     System.out.println("values-->" + values);
						          												     }
						          													 
						}
						break;
					case 3:
						{
						_localctx = new Me_exprmuldiv_ruleContext(new MetaexprContext(_parentctx, _parentState));
						((Me_exprmuldiv_ruleContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_metaexpr);
						setState(221);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(222);
						match(TOK_DIV_OR_MUL);
						setState(223);
						((Me_exprmuldiv_ruleContext)_localctx).r = metaexpr(10);
						if((!((Me_exprmuldiv_ruleContext)_localctx).l.eType.equals("string") && !((Me_exprmuldiv_ruleContext)_localctx).r.eType.equals("string")) && (!((Me_exprmuldiv_ruleContext)_localctx).l.eType.equals("boolean") && !((Me_exprmuldiv_ruleContext)_localctx).r.eType.equals("boolean"))){
						          														if(((Me_exprmuldiv_ruleContext)_localctx).l.eType.equals("float") || ((Me_exprmuldiv_ruleContext)_localctx).r.eType.equals("float")){
						          															((Me_exprmuldiv_ruleContext)_localctx).eType =  "float";
						          														}else{
						          															((Me_exprmuldiv_ruleContext)_localctx).eType =  "integer";
						          														}
						          													  }else{
						          													    erros++;
						          													    ((Me_exprmuldiv_ruleContext)_localctx).eType =  null;
						          													  }
						          													  if (values.size() >= 2) { 
						          													     if (TOK_DIV_OR_MUL == '/') {
						          														     Integer v1dm = (Integer) (values.remove(values.size()-1));
						          														     Integer v2dm = (Integer) (values.remove(values.size()-1));
						          														     System.out.println("V1: " + v1dm + "V2: " + v2dm);
						          														     values.add(new Integer (v1dm / v2dm));
						          														     System.out.println("values-->" + values);
						          													     } else {
						          													     	 Integer v1dm = (Integer) (values.remove(values.size()-1));
						          														     Integer v2dm = (Integer) (values.remove(values.size()-1));
						          														     System.out.println("V1: " + v1dm + "V2: " + v2dm);
						          													     	 values.add(new Integer (v1dm * v2dm));
						          													     	 System.out.println("values-->" + values);
						          													     }
						          												     }
						          													 
						}
						break;
					case 4:
						{
						_localctx = new Me_exprplusminus_ruleContext(new MetaexprContext(_parentctx, _parentState));
						((Me_exprplusminus_ruleContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_metaexpr);
						setState(226);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(227);
						match(TOK_PLUS_OR_MINUS);
						setState(228);
						((Me_exprplusminus_ruleContext)_localctx).r = metaexpr(9);
						if((!((Me_exprplusminus_ruleContext)_localctx).l.eType.equals("string") && !((Me_exprplusminus_ruleContext)_localctx).r.eType.equals("string")) && (!((Me_exprplusminus_ruleContext)_localctx).l.eType.equals("boolean") && !((Me_exprplusminus_ruleContext)_localctx).r.eType.equals("boolean"))){
						          														if(((Me_exprplusminus_ruleContext)_localctx).l.eType.equals("float") || ((Me_exprplusminus_ruleContext)_localctx).r.eType.equals("float")){
						          															((Me_exprplusminus_ruleContext)_localctx).eType =  "float";
						          														}else{
						          															((Me_exprplusminus_ruleContext)_localctx).eType =  "integer";
						          														}
						          													  }else{
						          													    erros++;
						          													    ((Me_exprplusminus_ruleContext)_localctx).eType =  null;
						          													  }
						          													  if (values.size() >=2) { 
						          													     if (TOK_PLUS_OR_MINUS == '+') {
						          														     Integer v1mm = (Integer) (values.remove(values.size()-1));
						          														     Integer v2mm = (Integer) (values.remove(values.size()-1));
						          														     System.out.println("V1: " + v1mm + "V2: " + v2mm);
						          														     values.add(new Integer (v1mm + v2mm));
						          														     System.out.println("values-->" + values);
						          													     } else {
						          														     Integer v1mm = (Integer) (values.remove(values.size()-1));
						          														     Integer v2mm = (Integer) (values.remove(values.size()-1));
						          														     System.out.println("V1: " + v1mm + "V2: " + v2mm);
						          													     	values.add(new Integer (v1mm - v2mm));
						          													     	System.out.println("values-->" + values);
						          													     }
						          												     }
						          													 
						}
						break;
					case 5:
						{
						_localctx = new Me_boolgtlt_ruleContext(new MetaexprContext(_parentctx, _parentState));
						((Me_boolgtlt_ruleContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_metaexpr);
						setState(231);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(232);
						match(TOK_CMP_GT_LT);
						setState(233);
						((Me_boolgtlt_ruleContext)_localctx).r = metaexpr(8);
						((Me_boolgtlt_ruleContext)_localctx).eType =  "boolean";
						}
						break;
					case 6:
						{
						_localctx = new Me_booleqdiff_ruleContext(new MetaexprContext(_parentctx, _parentState));
						((Me_booleqdiff_ruleContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_metaexpr);
						setState(236);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(237);
						match(TOK_CMP_EQ_DIFF);
						setState(238);
						((Me_booleqdiff_ruleContext)_localctx).r = metaexpr(7);
						((Me_booleqdiff_ruleContext)_localctx).eType =  "boolean"; 
						}
						break;
					case 7:
						{
						_localctx = new Me_boolandor_ruleContext(new MetaexprContext(_parentctx, _parentState));
						((Me_boolandor_ruleContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_metaexpr);
						setState(241);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(242);
						match(TOK_BOOL_AND_OR);
						setState(243);
						((Me_boolandor_ruleContext)_localctx).r = metaexpr(6);
						((Me_boolandor_ruleContext)_localctx).eType =  "boolean";
						}
						break;
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Sequence_exprContext extends ParserRuleContext {
		public Sequence_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_expr; }
	 
		public Sequence_exprContext() { }
		public void copyFrom(Sequence_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Se_create_seqContext extends Sequence_exprContext {
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public Se_create_seqContext(Sequence_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterSe_create_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitSe_create_seq(this);
		}
	}

	public final Sequence_exprContext sequence_expr() throws RecognitionException {
		Sequence_exprContext _localctx = new Sequence_exprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sequence_expr);
		try {
			_localctx = new Se_create_seqContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T__18);
			setState(252);
			funcbody();
			setState(253);
			match(T__19);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncallContext extends ParserRuleContext {
		public FuncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcall; }
	 
		public FuncallContext() { }
		public void copyFrom(FuncallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Funcall_ruleContext extends FuncallContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public Funcall_paramsContext funcall_params() {
			return getRuleContext(Funcall_paramsContext.class,0);
		}
		public Funcall_ruleContext(FuncallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterFuncall_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitFuncall_rule(this);
		}
	}

	public final FuncallContext funcall() throws RecognitionException {
		FuncallContext _localctx = new FuncallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_funcall);
		try {
			_localctx = new Funcall_ruleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			symbol();
			setState(256);
			funcall_params();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastContext extends ParserRuleContext {
		public String cType;
		public CastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast; }
	 
		public CastContext() { }
		public void copyFrom(CastContext ctx) {
			super.copyFrom(ctx);
			this.cType = ctx.cType;
		}
	}
	public static class Cast_ruleContext extends CastContext {
		public TypeContext t;
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Cast_ruleContext(CastContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterCast_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitCast_rule(this);
		}
	}

	public final CastContext cast() throws RecognitionException {
		CastContext _localctx = new CastContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cast);
		try {
			_localctx = new Cast_ruleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			((Cast_ruleContext)_localctx).t = type();
			setState(259);
			funcbody();
			((Cast_ruleContext)_localctx).cType =  ((Cast_ruleContext)_localctx).t.tType;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Funcall_paramsContext extends ParserRuleContext {
		public Funcall_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcall_params; }
	 
		public Funcall_paramsContext() { }
		public void copyFrom(Funcall_paramsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Funcallparams_ruleContext extends Funcall_paramsContext {
		public MetaexprContext metaexpr() {
			return getRuleContext(MetaexprContext.class,0);
		}
		public Funcall_params_contContext funcall_params_cont() {
			return getRuleContext(Funcall_params_contContext.class,0);
		}
		public Funcallparams_ruleContext(Funcall_paramsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterFuncallparams_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitFuncallparams_rule(this);
		}
	}
	public static class Funcallnoparam_ruleContext extends Funcall_paramsContext {
		public Funcallnoparam_ruleContext(Funcall_paramsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterFuncallnoparam_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitFuncallnoparam_rule(this);
		}
	}

	public final Funcall_paramsContext funcall_params() throws RecognitionException {
		Funcall_paramsContext _localctx = new Funcall_paramsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_funcall_params);
		try {
			setState(266);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__16:
			case T__18:
			case T__20:
			case T__21:
			case TOK_ID:
			case TOK_NEG:
			case TOK_STR_LIT:
			case TOK_CHAR_LIT:
			case FLOAT:
			case DECIMAL:
			case HEXADECIMAL:
			case BINARY:
				_localctx = new Funcallparams_ruleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				metaexpr(0);
				setState(263);
				funcall_params_cont();
				}
				break;
			case T__15:
				_localctx = new Funcallnoparam_ruleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(T__15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Funcall_params_contContext extends ParserRuleContext {
		public Funcall_params_contContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcall_params_cont; }
	 
		public Funcall_params_contContext() { }
		public void copyFrom(Funcall_params_contContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Funcall_params_cont_ruleContext extends Funcall_params_contContext {
		public MetaexprContext metaexpr() {
			return getRuleContext(MetaexprContext.class,0);
		}
		public Funcall_params_contContext funcall_params_cont() {
			return getRuleContext(Funcall_params_contContext.class,0);
		}
		public Funcall_params_cont_ruleContext(Funcall_params_contContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterFuncall_params_cont_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitFuncall_params_cont_rule(this);
		}
	}
	public static class Funcall_params_end_ruleContext extends Funcall_params_contContext {
		public Funcall_params_end_ruleContext(Funcall_params_contContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterFuncall_params_end_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitFuncall_params_end_rule(this);
		}
	}

	public final Funcall_params_contContext funcall_params_cont() throws RecognitionException {
		Funcall_params_contContext _localctx = new Funcall_params_contContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_funcall_params_cont);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new Funcall_params_cont_ruleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				metaexpr(0);
				setState(269);
				funcall_params_cont();
				}
				break;
			case 2:
				_localctx = new Funcall_params_end_ruleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public String lType;
		public Object valueOfSymbol;
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
			this.lType = ctx.lType;
			this.valueOfSymbol = ctx.valueOfSymbol;
		}
	}
	public static class Literal_char_ruleContext extends LiteralContext {
		public CharlitContext charlit() {
			return getRuleContext(CharlitContext.class,0);
		}
		public Literal_char_ruleContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterLiteral_char_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitLiteral_char_rule(this);
		}
	}
	public static class Literalnumber_ruleContext extends LiteralContext {
		public NumberContext n;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Literalnumber_ruleContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterLiteralnumber_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitLiteralnumber_rule(this);
		}
	}
	public static class Literalnil_ruleContext extends LiteralContext {
		public Literalnil_ruleContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterLiteralnil_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitLiteralnil_rule(this);
		}
	}
	public static class Literaltrue_ruleContext extends LiteralContext {
		public Literaltrue_ruleContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterLiteraltrue_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitLiteraltrue_rule(this);
		}
	}
	public static class Literalstring_ruleContext extends LiteralContext {
		public StrlitContext s;
		public StrlitContext strlit() {
			return getRuleContext(StrlitContext.class,0);
		}
		public Literalstring_ruleContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterLiteralstring_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitLiteralstring_rule(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_literal);
		try {
			setState(287);
			switch (_input.LA(1)) {
			case T__20:
				_localctx = new Literalnil_ruleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(T__20);
				((Literalnil_ruleContext)_localctx).lType =  "boolean";
				}
				break;
			case T__21:
				_localctx = new Literaltrue_ruleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(T__21);
				((Literaltrue_ruleContext)_localctx).lType =  "boolean";
				}
				break;
			case FLOAT:
			case DECIMAL:
			case HEXADECIMAL:
			case BINARY:
				_localctx = new Literalnumber_ruleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				((Literalnumber_ruleContext)_localctx).n = number();
				 ((Literalnumber_ruleContext)_localctx).valueOfSymbol =  ((Literalnumber_ruleContext)_localctx).n.valueOfSymbol;   ((Literalnumber_ruleContext)_localctx).lType =  ((Literalnumber_ruleContext)_localctx).n.cType;
				}
				break;
			case TOK_STR_LIT:
				_localctx = new Literalstring_ruleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				((Literalstring_ruleContext)_localctx).s = strlit();
				 ((Literalstring_ruleContext)_localctx).valueOfSymbol =  ((Literalstring_ruleContext)_localctx).s.valueOfSymbol;   ((Literalstring_ruleContext)_localctx).lType =  "string";
				}
				break;
			case TOK_CHAR_LIT:
				_localctx = new Literal_char_ruleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(284);
				charlit();
				((Literal_char_ruleContext)_localctx).lType =  "char";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrlitContext extends ParserRuleContext {
		public String sType;
		public Object valueOfSymbol;
		public Token t;
		public TerminalNode TOK_STR_LIT() { return getToken(MMMLParser.TOK_STR_LIT, 0); }
		public StrlitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strlit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterStrlit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitStrlit(this);
		}
	}

	public final StrlitContext strlit() throws RecognitionException {
		StrlitContext _localctx = new StrlitContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_strlit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			((StrlitContext)_localctx).t = match(TOK_STR_LIT);
			  ((StrlitContext)_localctx).valueOfSymbol =  (((StrlitContext)_localctx).t!=null?((StrlitContext)_localctx).t.getText():null);    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharlitContext extends ParserRuleContext {
		public TerminalNode TOK_CHAR_LIT() { return getToken(MMMLParser.TOK_CHAR_LIT, 0); }
		public CharlitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charlit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterCharlit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitCharlit(this);
		}
	}

	public final CharlitContext charlit() throws RecognitionException {
		CharlitContext _localctx = new CharlitContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_charlit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(TOK_CHAR_LIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public String cType;
		public Object valueOfSymbol;
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
			this.cType = ctx.cType;
			this.valueOfSymbol = ctx.valueOfSymbol;
		}
	}
	public static class Numberfloat_ruleContext extends NumberContext {
		public Token f;
		public TerminalNode FLOAT() { return getToken(MMMLParser.FLOAT, 0); }
		public Numberfloat_ruleContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterNumberfloat_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitNumberfloat_rule(this);
		}
	}
	public static class Numberdecimal_ruleContext extends NumberContext {
		public Token d;
		public TerminalNode DECIMAL() { return getToken(MMMLParser.DECIMAL, 0); }
		public Numberdecimal_ruleContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterNumberdecimal_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitNumberdecimal_rule(this);
		}
	}
	public static class Numberhexadecimal_ruleContext extends NumberContext {
		public TerminalNode HEXADECIMAL() { return getToken(MMMLParser.HEXADECIMAL, 0); }
		public Numberhexadecimal_ruleContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterNumberhexadecimal_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitNumberhexadecimal_rule(this);
		}
	}
	public static class Numberbinary_ruleContext extends NumberContext {
		public TerminalNode BINARY() { return getToken(MMMLParser.BINARY, 0); }
		public Numberbinary_ruleContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterNumberbinary_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitNumberbinary_rule(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_number);
		try {
			setState(302);
			switch (_input.LA(1)) {
			case FLOAT:
				_localctx = new Numberfloat_ruleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				((Numberfloat_ruleContext)_localctx).f = match(FLOAT);
				 ((Numberfloat_ruleContext)_localctx).valueOfSymbol =  (((Numberfloat_ruleContext)_localctx).f!=null?((Numberfloat_ruleContext)_localctx).f.getText():null);  ((Numberfloat_ruleContext)_localctx).cType =  "float";
				}
				break;
			case DECIMAL:
				_localctx = new Numberdecimal_ruleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				((Numberdecimal_ruleContext)_localctx).d = match(DECIMAL);
				 ((Numberdecimal_ruleContext)_localctx).valueOfSymbol =  (((Numberdecimal_ruleContext)_localctx).d!=null?((Numberdecimal_ruleContext)_localctx).d.getText():null);  ((Numberdecimal_ruleContext)_localctx).cType =  "integer";
				}
				break;
			case HEXADECIMAL:
				_localctx = new Numberhexadecimal_ruleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				match(HEXADECIMAL);
				((Numberhexadecimal_ruleContext)_localctx).cType =  "integer";
				}
				break;
			case BINARY:
				_localctx = new Numberbinary_ruleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				match(BINARY);
				((Numberbinary_ruleContext)_localctx).cType =  "integer";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolContext extends ParserRuleContext {
		public String sType;
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
	 
		public SymbolContext() { }
		public void copyFrom(SymbolContext ctx) {
			super.copyFrom(ctx);
			this.sType = ctx.sType;
		}
	}
	public static class Symbol_ruleContext extends SymbolContext {
		public Token y;
		public TerminalNode TOK_ID() { return getToken(MMMLParser.TOK_ID, 0); }
		public Symbol_ruleContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).enterSymbol_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MMMLListener ) ((MMMLListener)listener).exitSymbol_rule(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_symbol);
		try {
			_localctx = new Symbol_ruleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			((Symbol_ruleContext)_localctx).y = match(TOK_ID);
			((Symbol_ruleContext)_localctx).sType =  null;
																System.out.println("simbolo detectado, procurando por: "+(((Symbol_ruleContext)_localctx).y!=null?((Symbol_ruleContext)_localctx).y.getText():null));
																SymbolEntry s = symbolTable.lookup((((Symbol_ruleContext)_localctx).y!=null?((Symbol_ruleContext)_localctx).y.getText():null));
																if(s==null){
																	System.out.println("#nao encontrado#");
																}else{
																	System.out.println("#encontrado - "+s+"#");
																	((Symbol_ruleContext)_localctx).sType =  s.symbol.toString();
																}
																System.out.println("Tabela atual:");
																int i=1;
																for (SymbolEntry<String> entry : symbolTable.getEntries()) {
			            											System.out.println("	"+i+"- main Entry: " + entry);
			            											i++;
				            									 }if(symbolTable.getCount()==0){System.out.println("*****nenhum simbolo azmazenado******");}else{/*System.out.println("**************************************");*/}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return sequence_type_sempred((Sequence_typeContext)_localctx, predIndex);
		case 17:
			return metaexpr_sempred((MetaexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean sequence_type_sempred(Sequence_typeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean metaexpr_sempred(MetaexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u0136\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\5\3C\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\5\6U\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7]\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nl\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13v\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0080\n\f\f"+
		"\f\16\f\u0083\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008c\n\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u00a4\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00b7"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u00d4\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00f9\n\23\f\23"+
		"\16\23\u00fc\13\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\5\27\u010d\n\27\3\30\3\30\3\30\3\30\5\30\u0113"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u0122\n\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u0131\n\34\3\35\3\35\3\35\3\35\2\4\26$\36\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\2\u013d\2:\3\2\2\2"+
		"\4B\3\2\2\2\6D\3\2\2\2\bI\3\2\2\2\nT\3\2\2\2\f\\\3\2\2\2\16^\3\2\2\2\20"+
		"c\3\2\2\2\22k\3\2\2\2\24u\3\2\2\2\26w\3\2\2\2\30\u008b\3\2\2\2\32\u008d"+
		"\3\2\2\2\34\u0094\3\2\2\2\36\u009b\3\2\2\2 \u00a3\3\2\2\2\"\u00b6\3\2"+
		"\2\2$\u00d3\3\2\2\2&\u00fd\3\2\2\2(\u0101\3\2\2\2*\u0104\3\2\2\2,\u010c"+
		"\3\2\2\2.\u0112\3\2\2\2\60\u0121\3\2\2\2\62\u0123\3\2\2\2\64\u0126\3\2"+
		"\2\2\66\u0130\3\2\2\28\u0132\3\2\2\2:;\5\4\3\2;<\5\6\4\2<=\b\2\1\2=\3"+
		"\3\2\2\2>?\5\b\5\2?@\5\4\3\2@C\3\2\2\2AC\3\2\2\2B>\3\2\2\2BA\3\2\2\2C"+
		"\5\3\2\2\2DE\7\3\2\2EF\7\4\2\2FG\7\5\2\2GH\5\30\r\2H\7\3\2\2\2IJ\7\3\2"+
		"\2JK\5\20\t\2KL\5\n\6\2LM\7\5\2\2MN\5\30\r\2N\t\3\2\2\2OP\5\16\b\2PQ\b"+
		"\6\1\2QR\5\f\7\2RU\3\2\2\2SU\3\2\2\2TO\3\2\2\2TS\3\2\2\2U\13\3\2\2\2V"+
		"W\7\6\2\2WX\5\16\b\2XY\b\7\1\2YZ\5\f\7\2Z]\3\2\2\2[]\3\2\2\2\\V\3\2\2"+
		"\2\\[\3\2\2\2]\r\3\2\2\2^_\58\35\2_`\7\7\2\2`a\5\22\n\2ab\b\b\1\2b\17"+
		"\3\2\2\2cd\7\33\2\2d\21\3\2\2\2ef\5\24\13\2fg\b\n\1\2gl\3\2\2\2hi\5\26"+
		"\f\2ij\b\n\1\2jl\3\2\2\2ke\3\2\2\2kh\3\2\2\2l\23\3\2\2\2mn\7\b\2\2nv\b"+
		"\13\1\2op\7\t\2\2pv\b\13\1\2qr\7\n\2\2rv\b\13\1\2st\7\13\2\2tv\b\13\1"+
		"\2um\3\2\2\2uo\3\2\2\2uq\3\2\2\2us\3\2\2\2v\25\3\2\2\2wx\b\f\1\2xy\5\24"+
		"\13\2yz\7\f\2\2z{\b\f\1\2{\u0081\3\2\2\2|}\f\3\2\2}~\7\f\2\2~\u0080\b"+
		"\f\1\2\177|\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\27\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u008c\5\32\16\2\u0085"+
		"\u0086\5\34\17\2\u0086\u0087\b\r\1\2\u0087\u008c\3\2\2\2\u0088\u0089\5"+
		"$\23\2\u0089\u008a\b\r\1\2\u008a\u008c\3\2\2\2\u008b\u0084\3\2\2\2\u008b"+
		"\u0085\3\2\2\2\u008b\u0088\3\2\2\2\u008c\31\3\2\2\2\u008d\u008e\7\r\2"+
		"\2\u008e\u008f\5\30\r\2\u008f\u0090\7\16\2\2\u0090\u0091\5\30\r\2\u0091"+
		"\u0092\7\17\2\2\u0092\u0093\5\30\r\2\u0093\33\3\2\2\2\u0094\u0095\b\17"+
		"\1\2\u0095\u0096\7\20\2\2\u0096\u0097\5\36\20\2\u0097\u0098\7\21\2\2\u0098"+
		"\u0099\5\30\r\2\u0099\u009a\b\17\1\2\u009a\35\3\2\2\2\u009b\u009c\5\""+
		"\22\2\u009c\u009d\5 \21\2\u009d\37\3\2\2\2\u009e\u009f\7\6\2\2\u009f\u00a0"+
		"\5\"\22\2\u00a0\u00a1\5 \21\2\u00a1\u00a4\3\2\2\2\u00a2\u00a4\3\2\2\2"+
		"\u00a3\u009e\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4!\3\2\2\2\u00a5\u00a6\5"+
		"8\35\2\u00a6\u00a7\7\5\2\2\u00a7\u00a8\5\30\r\2\u00a8\u00a9\b\22\1\2\u00a9"+
		"\u00b7\3\2\2\2\u00aa\u00ab\7\22\2\2\u00ab\u00ac\7\5\2\2\u00ac\u00ad\5"+
		"\30\r\2\u00ad\u00ae\b\22\1\2\u00ae\u00b7\3\2\2\2\u00af\u00b0\58\35\2\u00b0"+
		"\u00b1\7\34\2\2\u00b1\u00b2\58\35\2\u00b2\u00b3\7\5\2\2\u00b3\u00b4\5"+
		"\30\r\2\u00b4\u00b5\b\22\1\2\u00b5\u00b7\3\2\2\2\u00b6\u00a5\3\2\2\2\u00b6"+
		"\u00aa\3\2\2\2\u00b6\u00af\3\2\2\2\u00b7#\3\2\2\2\u00b8\u00b9\b\23\1\2"+
		"\u00b9\u00ba\7\23\2\2\u00ba\u00bb\5\30\r\2\u00bb\u00bc\7\24\2\2\u00bc"+
		"\u00bd\b\23\1\2\u00bd\u00d4\3\2\2\2\u00be\u00d4\5&\24\2\u00bf\u00c0\7"+
		"\35\2\2\u00c0\u00c1\58\35\2\u00c1\u00c2\b\23\1\2\u00c2\u00d4\3\2\2\2\u00c3"+
		"\u00c4\7\35\2\2\u00c4\u00c5\7\23\2\2\u00c5\u00c6\5\30\r\2\u00c6\u00c7"+
		"\7\24\2\2\u00c7\u00c8\b\23\1\2\u00c8\u00d4\3\2\2\2\u00c9\u00ca\58\35\2"+
		"\u00ca\u00cb\b\23\1\2\u00cb\u00d4\3\2\2\2\u00cc\u00cd\5\60\31\2\u00cd"+
		"\u00ce\b\23\1\2\u00ce\u00d4\3\2\2\2\u00cf\u00d4\5(\25\2\u00d0\u00d1\5"+
		"*\26\2\u00d1\u00d2\b\23\1\2\u00d2\u00d4\3\2\2\2\u00d3\u00b8\3\2\2\2\u00d3"+
		"\u00be\3\2\2\2\u00d3\u00bf\3\2\2\2\u00d3\u00c3\3\2\2\2\u00d3\u00c9\3\2"+
		"\2\2\u00d3\u00cc\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d4"+
		"\u00fa\3\2\2\2\u00d5\u00d6\f\r\2\2\u00d6\u00d7\7\36\2\2\u00d7\u00d8\5"+
		"$\23\16\u00d8\u00d9\b\23\1\2\u00d9\u00f9\3\2\2\2\u00da\u00db\f\f\2\2\u00db"+
		"\u00dc\7\34\2\2\u00dc\u00dd\5$\23\r\u00dd\u00de\b\23\1\2\u00de\u00f9\3"+
		"\2\2\2\u00df\u00e0\f\13\2\2\u00e0\u00e1\7\37\2\2\u00e1\u00e2\5$\23\f\u00e2"+
		"\u00e3\b\23\1\2\u00e3\u00f9\3\2\2\2\u00e4\u00e5\f\n\2\2\u00e5\u00e6\7"+
		" \2\2\u00e6\u00e7\5$\23\13\u00e7\u00e8\b\23\1\2\u00e8\u00f9\3\2\2\2\u00e9"+
		"\u00ea\f\t\2\2\u00ea\u00eb\7!\2\2\u00eb\u00ec\5$\23\n\u00ec\u00ed\b\23"+
		"\1\2\u00ed\u00f9\3\2\2\2\u00ee\u00ef\f\b\2\2\u00ef\u00f0\7\"\2\2\u00f0"+
		"\u00f1\5$\23\t\u00f1\u00f2\b\23\1\2\u00f2\u00f9\3\2\2\2\u00f3\u00f4\f"+
		"\7\2\2\u00f4\u00f5\7#\2\2\u00f5\u00f6\5$\23\b\u00f6\u00f7\b\23\1\2\u00f7"+
		"\u00f9\3\2\2\2\u00f8\u00d5\3\2\2\2\u00f8\u00da\3\2\2\2\u00f8\u00df\3\2"+
		"\2\2\u00f8\u00e4\3\2\2\2\u00f8\u00e9\3\2\2\2\u00f8\u00ee\3\2\2\2\u00f8"+
		"\u00f3\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb%\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7\25\2\2\u00fe\u00ff"+
		"\5\30\r\2\u00ff\u0100\7\26\2\2\u0100\'\3\2\2\2\u0101\u0102\58\35\2\u0102"+
		"\u0103\5,\27\2\u0103)\3\2\2\2\u0104\u0105\5\22\n\2\u0105\u0106\5\30\r"+
		"\2\u0106\u0107\b\26\1\2\u0107+\3\2\2\2\u0108\u0109\5$\23\2\u0109\u010a"+
		"\5.\30\2\u010a\u010d\3\2\2\2\u010b\u010d\7\22\2\2\u010c\u0108\3\2\2\2"+
		"\u010c\u010b\3\2\2\2\u010d-\3\2\2\2\u010e\u010f\5$\23\2\u010f\u0110\5"+
		".\30\2\u0110\u0113\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u010e\3\2\2\2\u0112"+
		"\u0111\3\2\2\2\u0113/\3\2\2\2\u0114\u0115\7\27\2\2\u0115\u0122\b\31\1"+
		"\2\u0116\u0117\7\30\2\2\u0117\u0122\b\31\1\2\u0118\u0119\5\66\34\2\u0119"+
		"\u011a\b\31\1\2\u011a\u0122\3\2\2\2\u011b\u011c\5\62\32\2\u011c\u011d"+
		"\b\31\1\2\u011d\u0122\3\2\2\2\u011e\u011f\5\64\33\2\u011f\u0120\b\31\1"+
		"\2\u0120\u0122\3\2\2\2\u0121\u0114\3\2\2\2\u0121\u0116\3\2\2\2\u0121\u0118"+
		"\3\2\2\2\u0121\u011b\3\2\2\2\u0121\u011e\3\2\2\2\u0122\61\3\2\2\2\u0123"+
		"\u0124\7%\2\2\u0124\u0125\b\32\1\2\u0125\63\3\2\2\2\u0126\u0127\7&\2\2"+
		"\u0127\65\3\2\2\2\u0128\u0129\7\'\2\2\u0129\u0131\b\34\1\2\u012a\u012b"+
		"\7(\2\2\u012b\u0131\b\34\1\2\u012c\u012d\7)\2\2\u012d\u0131\b\34\1\2\u012e"+
		"\u012f\7*\2\2\u012f\u0131\b\34\1\2\u0130\u0128\3\2\2\2\u0130\u012a\3\2"+
		"\2\2\u0130\u012c\3\2\2\2\u0130\u012e\3\2\2\2\u0131\67\3\2\2\2\u0132\u0133"+
		"\7\33\2\2\u0133\u0134\b\35\1\2\u01349\3\2\2\2\22BT\\ku\u0081\u008b\u00a3"+
		"\u00b6\u00d3\u00f8\u00fa\u010c\u0112\u0121\u0130";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
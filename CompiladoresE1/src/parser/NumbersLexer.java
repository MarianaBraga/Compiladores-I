// Generated from src/Numbers.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NumbersLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, BIN_DIGIT=2, BINARY=3, NUM_DIGIT=4, INTEGER=5, REAL=6, ALF_DIGIT=7, 
		HEXADECIMAL=8, OPERADOR=9, WS=10, ID=11, EXPRESSAO=12, A=13, B=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NEWLINE", "BIN_DIGIT", "BINARY", "NUM_DIGIT", "INTEGER", "REAL", "ALF_DIGIT", 
		"HEXADECIMAL", "OPERADOR", "WS", "ID", "EXPRESSAO", "A", "B"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NEWLINE", "BIN_DIGIT", "BINARY", "NUM_DIGIT", "INTEGER", "REAL", 
		"ALF_DIGIT", "HEXADECIMAL", "OPERADOR", "WS", "ID", "EXPRESSAO", "A", 
		"B"
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


	public NumbersLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Numbers.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20\u00a7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2!\n\2\r\2\16\2\"\3"+
		"\3\3\3\3\4\6\4(\n\4\r\4\16\4)\3\4\3\4\3\5\3\5\3\6\6\6\61\n\6\r\6\16\6"+
		"\62\3\6\3\6\6\6\67\n\6\r\6\16\68\5\6;\n\6\3\7\3\7\3\7\6\7@\n\7\r\7\16"+
		"\7A\3\7\3\7\3\7\6\7G\n\7\r\7\16\7H\3\7\3\7\3\7\3\7\3\7\3\7\6\7Q\n\7\r"+
		"\7\16\7R\3\7\3\7\3\7\3\7\6\7Y\n\7\r\7\16\7Z\3\7\3\7\3\7\6\7`\n\7\r\7\16"+
		"\7a\3\7\3\7\3\7\3\7\3\7\3\7\6\7j\n\7\r\7\16\7k\3\7\3\7\3\7\3\7\6\7r\n"+
		"\7\r\7\16\7s\5\7v\n\7\3\b\3\b\3\t\3\t\3\t\3\t\6\t~\n\t\r\t\16\t\177\3"+
		"\n\3\n\3\13\6\13\u0085\n\13\r\13\16\13\u0086\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\5\f\u008f\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0099\n\r\3\16\3\16"+
		"\3\16\3\16\5\16\u009f\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u00a6\n\17\2"+
		"\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\3\2\b\5\2\f\f\17\17\"\"\3\2\62\63\3\2\62;\5\2\62;CHch\6\2,-//\61\61"+
		"``\5\2\13\f\16\17\"\"\u00be\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3 \3"+
		"\2\2\2\5$\3\2\2\2\7\'\3\2\2\2\t-\3\2\2\2\13:\3\2\2\2\ru\3\2\2\2\17w\3"+
		"\2\2\2\21y\3\2\2\2\23\u0081\3\2\2\2\25\u0084\3\2\2\2\27\u008e\3\2\2\2"+
		"\31\u0098\3\2\2\2\33\u009e\3\2\2\2\35\u00a5\3\2\2\2\37!\t\2\2\2 \37\3"+
		"\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\4\3\2\2\2$%\t\3\2\2%\6\3\2\2"+
		"\2&(\5\5\3\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7d"+
		"\2\2,\b\3\2\2\2-.\t\4\2\2.\n\3\2\2\2/\61\5\t\5\2\60/\3\2\2\2\61\62\3\2"+
		"\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63;\3\2\2\2\64\66\7/\2\2\65\67\5\t\5"+
		"\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:\60\3\2\2"+
		"\2:\64\3\2\2\2;\f\3\2\2\2<=\5\13\6\2=?\7\60\2\2>@\5\t\5\2?>\3\2\2\2@A"+
		"\3\2\2\2A?\3\2\2\2AB\3\2\2\2Bv\3\2\2\2CD\5\13\6\2DF\7\60\2\2EG\5\t\5\2"+
		"FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7g\2\2KL\5\13\6\2"+
		"Lv\3\2\2\2MN\5\13\6\2NP\7\60\2\2OQ\5\t\5\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2"+
		"\2RS\3\2\2\2ST\3\2\2\2TU\7g\2\2UV\7-\2\2VX\3\2\2\2WY\5\t\5\2XW\3\2\2\2"+
		"YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[v\3\2\2\2\\]\5\13\6\2]_\7\60\2\2^`\5\t"+
		"\5\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7G\2\2de\5\13"+
		"\6\2ev\3\2\2\2fg\5\13\6\2gi\7\60\2\2hj\5\t\5\2ih\3\2\2\2jk\3\2\2\2ki\3"+
		"\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7G\2\2no\7-\2\2oq\3\2\2\2pr\5\t\5\2qp\3\2"+
		"\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2u<\3\2\2\2uC\3\2\2\2uM\3\2"+
		"\2\2u\\\3\2\2\2uf\3\2\2\2v\16\3\2\2\2wx\t\5\2\2x\20\3\2\2\2yz\7\62\2\2"+
		"z{\7z\2\2{}\3\2\2\2|~\5\17\b\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\22\3\2\2\2\u0081\u0082\t\6\2\2\u0082\24\3\2\2\2\u0083"+
		"\u0085\t\7\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\b\13\2\2\u0089"+
		"\26\3\2\2\2\u008a\u008f\5\13\6\2\u008b\u008f\5\r\7\2\u008c\u008f\5\21"+
		"\t\2\u008d\u008f\5\7\4\2\u008e\u008a\3\2\2\2\u008e\u008b\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\30\3\2\2\2\u0090\u0091\7*\2\2"+
		"\u0091\u0092\5\31\r\2\u0092\u0093\7+\2\2\u0093\u0094\5\33\16\2\u0094\u0099"+
		"\3\2\2\2\u0095\u0096\5\27\f\2\u0096\u0097\5\33\16\2\u0097\u0099\3\2\2"+
		"\2\u0098\u0090\3\2\2\2\u0098\u0095\3\2\2\2\u0099\32\3\2\2\2\u009a\u009b"+
		"\5\23\n\2\u009b\u009c\5\35\17\2\u009c\u009f\3\2\2\2\u009d\u009f\3\2\2"+
		"\2\u009e\u009a\3\2\2\2\u009e\u009d\3\2\2\2\u009f\34\3\2\2\2\u00a0\u00a1"+
		"\7*\2\2\u00a1\u00a2\5\31\r\2\u00a2\u00a3\7+\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a6\5\27\f\2\u00a5\u00a0\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\36\3\2\2"+
		"\2\26\2\")\628:AHRZaksu\177\u0086\u008e\u0098\u009e\u00a5\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
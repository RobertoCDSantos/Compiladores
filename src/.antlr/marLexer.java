// Generated from c:\Users\Roberto\Desktop\UAlg\6º Semestre\COMPILADORES\trabalhoPart1 SAVE3\trabalhoPart1\src\mar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class marLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, TYPES=7, SL_COMMENT=8, 
		ML_COMMENT=9, NUMBER=10, BOOLEAN=11, PRINT=12, MAIOR_EQUAL=13, MINOR_EQUAL=14, 
		MAIOR=15, MINOR=16, WHILE=17, IF=18, ELSE=19, TRUE=20, FALSE=21, NIL=22, 
		NOT=23, AND=24, OR=25, DOTF=26, ONEQUAL=27, EQUAL=28, DIF=29, ADD=30, 
		SUB=31, MULT=32, DIV=33, DOT=34, INT=35, STRING=36, Chavetas1=37, Chavetas2=38, 
		ID=39, WS=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "TYPES", "SL_COMMENT", 
			"ML_COMMENT", "NUMBER", "BOOLEAN", "PRINT", "MAIOR_EQUAL", "MINOR_EQUAL", 
			"MAIOR", "MINOR", "WHILE", "IF", "ELSE", "TRUE", "FALSE", "NIL", "NOT", 
			"AND", "OR", "DOTF", "ONEQUAL", "EQUAL", "DIF", "ADD", "SUB", "MULT", 
			"DIV", "DOT", "INT", "STRING", "Chavetas1", "Chavetas2", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'return'", "','", "'then'", "'do'", null, null, 
			null, null, null, "'print'", "'>='", "'<='", "'>'", "'<'", "'while'", 
			"'if'", "'else'", "'true'", "'false'", "'nil'", "'not'", "'and'", "'or'", 
			"';'", "'='", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "'.'", null, 
			null, "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "TYPES", "SL_COMMENT", "ML_COMMENT", 
			"NUMBER", "BOOLEAN", "PRINT", "MAIOR_EQUAL", "MINOR_EQUAL", "MAIOR", 
			"MINOR", "WHILE", "IF", "ELSE", "TRUE", "FALSE", "NIL", "NOT", "AND", 
			"OR", "DOTF", "ONEQUAL", "EQUAL", "DIF", "ADD", "SUB", "MULT", "DIV", 
			"DOT", "INT", "STRING", "Chavetas1", "Chavetas2", "ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public marLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "mar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0114\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b|\n\b\3\t\3\t\3\t\3\t\7\t\u0082\n\t\f\t\16\t\u0085\13\t\3\t"+
		"\5\t\u0088\n\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0090\n\n\f\n\16\n\u0093\13"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u009f\n\13\3\f\3"+
		"\f\5\f\u00a3\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\6$\u00f2\n$\r$\16$\u00f3\3%\3%\7%\u00f8"+
		"\n%\f%\16%\u00fb\13%\3%\3%\3&\3&\3\'\3\'\3(\6(\u0104\n(\r(\16(\u0105\3"+
		"(\7(\u0109\n(\f(\16(\u010c\13(\3)\6)\u010f\n)\r)\16)\u0110\3)\3)\5\u0083"+
		"\u0091\u00f9\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*\3\2\7\3\3\f\f\3\2\62;\4\2C\\"+
		"c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u011f\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7W\3\2\2\2\t^\3\2"+
		"\2\2\13`\3\2\2\2\re\3\2\2\2\17{\3\2\2\2\21}\3\2\2\2\23\u008b\3\2\2\2\25"+
		"\u009e\3\2\2\2\27\u00a2\3\2\2\2\31\u00a4\3\2\2\2\33\u00aa\3\2\2\2\35\u00ad"+
		"\3\2\2\2\37\u00b0\3\2\2\2!\u00b2\3\2\2\2#\u00b4\3\2\2\2%\u00ba\3\2\2\2"+
		"\'\u00bd\3\2\2\2)\u00c2\3\2\2\2+\u00c7\3\2\2\2-\u00cd\3\2\2\2/\u00d1\3"+
		"\2\2\2\61\u00d5\3\2\2\2\63\u00d9\3\2\2\2\65\u00dc\3\2\2\2\67\u00de\3\2"+
		"\2\29\u00e0\3\2\2\2;\u00e3\3\2\2\2=\u00e6\3\2\2\2?\u00e8\3\2\2\2A\u00ea"+
		"\3\2\2\2C\u00ec\3\2\2\2E\u00ee\3\2\2\2G\u00f1\3\2\2\2I\u00f5\3\2\2\2K"+
		"\u00fe\3\2\2\2M\u0100\3\2\2\2O\u0103\3\2\2\2Q\u010e\3\2\2\2ST\7*\2\2T"+
		"\4\3\2\2\2UV\7+\2\2V\6\3\2\2\2WX\7t\2\2XY\7g\2\2YZ\7v\2\2Z[\7w\2\2[\\"+
		"\7t\2\2\\]\7p\2\2]\b\3\2\2\2^_\7.\2\2_\n\3\2\2\2`a\7v\2\2ab\7j\2\2bc\7"+
		"g\2\2cd\7p\2\2d\f\3\2\2\2ef\7f\2\2fg\7q\2\2g\16\3\2\2\2hi\7p\2\2ij\7w"+
		"\2\2jk\7o\2\2kl\7d\2\2lm\7g\2\2m|\7t\2\2no\7d\2\2op\7q\2\2pq\7q\2\2q|"+
		"\7n\2\2rs\7u\2\2st\7v\2\2tu\7t\2\2uv\7k\2\2vw\7p\2\2w|\7i\2\2xy\7p\2\2"+
		"yz\7k\2\2z|\7n\2\2{h\3\2\2\2{n\3\2\2\2{r\3\2\2\2{x\3\2\2\2|\20\3\2\2\2"+
		"}~\7\61\2\2~\177\7\61\2\2\177\u0083\3\2\2\2\u0080\u0082\13\2\2\2\u0081"+
		"\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0084\3\2\2\2\u0083\u0081\3\2"+
		"\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\t\2\2\2\u0087"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\t\2\2\u008a\22\3\2\2"+
		"\2\u008b\u008c\7\61\2\2\u008c\u008d\7,\2\2\u008d\u0091\3\2\2\2\u008e\u0090"+
		"\13\2\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u0092\3\2\2\2"+
		"\u0091\u008f\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095"+
		"\7,\2\2\u0095\u0096\7\61\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\n\2\2\u0098"+
		"\24\3\2\2\2\u0099\u009a\5G$\2\u009a\u009b\5E#\2\u009b\u009c\5G$\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009f\5G$\2\u009e\u0099\3\2\2\2\u009e\u009d\3\2\2"+
		"\2\u009f\26\3\2\2\2\u00a0\u00a3\5)\25\2\u00a1\u00a3\5+\26\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\30\3\2\2\2\u00a4\u00a5\7r\2\2\u00a5"+
		"\u00a6\7t\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7v\2\2"+
		"\u00a9\32\3\2\2\2\u00aa\u00ab\7@\2\2\u00ab\u00ac\7?\2\2\u00ac\34\3\2\2"+
		"\2\u00ad\u00ae\7>\2\2\u00ae\u00af\7?\2\2\u00af\36\3\2\2\2\u00b0\u00b1"+
		"\7@\2\2\u00b1 \3\2\2\2\u00b2\u00b3\7>\2\2\u00b3\"\3\2\2\2\u00b4\u00b5"+
		"\7y\2\2\u00b5\u00b6\7j\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7n\2\2\u00b8"+
		"\u00b9\7g\2\2\u00b9$\3\2\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7h\2\2\u00bc"+
		"&\3\2\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7u\2\2\u00c0"+
		"\u00c1\7g\2\2\u00c1(\3\2\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7t\2\2\u00c4"+
		"\u00c5\7w\2\2\u00c5\u00c6\7g\2\2\u00c6*\3\2\2\2\u00c7\u00c8\7h\2\2\u00c8"+
		"\u00c9\7c\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7g\2\2"+
		"\u00cc,\3\2\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7n\2"+
		"\2\u00d0.\3\2\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7"+
		"v\2\2\u00d4\60\3\2\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8"+
		"\7f\2\2\u00d8\62\3\2\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7t\2\2\u00db\64"+
		"\3\2\2\2\u00dc\u00dd\7=\2\2\u00dd\66\3\2\2\2\u00de\u00df\7?\2\2\u00df"+
		"8\3\2\2\2\u00e0\u00e1\7?\2\2\u00e1\u00e2\7?\2\2\u00e2:\3\2\2\2\u00e3\u00e4"+
		"\7#\2\2\u00e4\u00e5\7?\2\2\u00e5<\3\2\2\2\u00e6\u00e7\7-\2\2\u00e7>\3"+
		"\2\2\2\u00e8\u00e9\7/\2\2\u00e9@\3\2\2\2\u00ea\u00eb\7,\2\2\u00ebB\3\2"+
		"\2\2\u00ec\u00ed\7\61\2\2\u00edD\3\2\2\2\u00ee\u00ef\7\60\2\2\u00efF\3"+
		"\2\2\2\u00f0\u00f2\t\3\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4H\3\2\2\2\u00f5\u00f9\7$\2\2\u00f6"+
		"\u00f8\13\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00fa\3"+
		"\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u00fd\7$\2\2\u00fdJ\3\2\2\2\u00fe\u00ff\7}\2\2\u00ffL\3\2\2\2\u0100\u0101"+
		"\7\177\2\2\u0101N\3\2\2\2\u0102\u0104\t\4\2\2\u0103\u0102\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u010a\3\2"+
		"\2\2\u0107\u0109\t\5\2\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010bP\3\2\2\2\u010c\u010a\3\2\2\2"+
		"\u010d\u010f\t\6\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\b)\2\2\u0113"+
		"R\3\2\2\2\16\2{\u0083\u0087\u0091\u009e\u00a2\u00f3\u00f9\u0105\u010a"+
		"\u0110\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from C:/Users/Roberto/Desktop/UAlg/6� Semestre/COMPILADORES/trabalhoPart1 SAVE3/trabalhoPart1/src\mar.g4 by ANTLR 4.12.0
package mar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class marLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

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
		"\u0004\u0000(\u010f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006w\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007}\b\u0007\n\u0007\f\u0007\u0080"+
		"\t\u0007\u0001\u0007\u0003\u0007\u0083\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u008b\b\b\n\b\f\b\u008e\t\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u009a\b\t\u0001\n\u0001\n\u0003\n\u009e\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0004"+
		"\"\u00ed\b\"\u000b\"\f\"\u00ee\u0001#\u0001#\u0005#\u00f3\b#\n#\f#\u00f6"+
		"\t#\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0004&\u00ff\b&\u000b"+
		"&\f&\u0100\u0001&\u0005&\u0104\b&\n&\f&\u0107\t&\u0001\'\u0004\'\u010a"+
		"\b\'\u000b\'\f\'\u010b\u0001\'\u0001\'\u0003~\u008c\u00f4\u0000(\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K"+
		"&M\'O(\u0001\u0000\u0005\u0001\u0001\n\n\u0001\u000009\u0002\u0000AZa"+
		"z\u0003\u000009AZaz\u0003\u0000\t\n\r\r  \u0119\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001"+
		"\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000"+
		"\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000"+
		"?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001"+
		"\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000"+
		"\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000"+
		"M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0001Q\u0001"+
		"\u0000\u0000\u0000\u0003S\u0001\u0000\u0000\u0000\u0005U\u0001\u0000\u0000"+
		"\u0000\u0007\\\u0001\u0000\u0000\u0000\t^\u0001\u0000\u0000\u0000\u000b"+
		"c\u0001\u0000\u0000\u0000\rv\u0001\u0000\u0000\u0000\u000fx\u0001\u0000"+
		"\u0000\u0000\u0011\u0086\u0001\u0000\u0000\u0000\u0013\u0099\u0001\u0000"+
		"\u0000\u0000\u0015\u009d\u0001\u0000\u0000\u0000\u0017\u009f\u0001\u0000"+
		"\u0000\u0000\u0019\u00a5\u0001\u0000\u0000\u0000\u001b\u00a8\u0001\u0000"+
		"\u0000\u0000\u001d\u00ab\u0001\u0000\u0000\u0000\u001f\u00ad\u0001\u0000"+
		"\u0000\u0000!\u00af\u0001\u0000\u0000\u0000#\u00b5\u0001\u0000\u0000\u0000"+
		"%\u00b8\u0001\u0000\u0000\u0000\'\u00bd\u0001\u0000\u0000\u0000)\u00c2"+
		"\u0001\u0000\u0000\u0000+\u00c8\u0001\u0000\u0000\u0000-\u00cc\u0001\u0000"+
		"\u0000\u0000/\u00d0\u0001\u0000\u0000\u00001\u00d4\u0001\u0000\u0000\u0000"+
		"3\u00d7\u0001\u0000\u0000\u00005\u00d9\u0001\u0000\u0000\u00007\u00db"+
		"\u0001\u0000\u0000\u00009\u00de\u0001\u0000\u0000\u0000;\u00e1\u0001\u0000"+
		"\u0000\u0000=\u00e3\u0001\u0000\u0000\u0000?\u00e5\u0001\u0000\u0000\u0000"+
		"A\u00e7\u0001\u0000\u0000\u0000C\u00e9\u0001\u0000\u0000\u0000E\u00ec"+
		"\u0001\u0000\u0000\u0000G\u00f0\u0001\u0000\u0000\u0000I\u00f9\u0001\u0000"+
		"\u0000\u0000K\u00fb\u0001\u0000\u0000\u0000M\u00fe\u0001\u0000\u0000\u0000"+
		"O\u0109\u0001\u0000\u0000\u0000QR\u0005(\u0000\u0000R\u0002\u0001\u0000"+
		"\u0000\u0000ST\u0005)\u0000\u0000T\u0004\u0001\u0000\u0000\u0000UV\u0005"+
		"r\u0000\u0000VW\u0005e\u0000\u0000WX\u0005t\u0000\u0000XY\u0005u\u0000"+
		"\u0000YZ\u0005r\u0000\u0000Z[\u0005n\u0000\u0000[\u0006\u0001\u0000\u0000"+
		"\u0000\\]\u0005,\u0000\u0000]\b\u0001\u0000\u0000\u0000^_\u0005t\u0000"+
		"\u0000_`\u0005h\u0000\u0000`a\u0005e\u0000\u0000ab\u0005n\u0000\u0000"+
		"b\n\u0001\u0000\u0000\u0000cd\u0005d\u0000\u0000de\u0005o\u0000\u0000"+
		"e\f\u0001\u0000\u0000\u0000fg\u0005n\u0000\u0000gh\u0005u\u0000\u0000"+
		"hi\u0005m\u0000\u0000ij\u0005b\u0000\u0000jk\u0005e\u0000\u0000kw\u0005"+
		"r\u0000\u0000lm\u0005b\u0000\u0000mn\u0005o\u0000\u0000no\u0005o\u0000"+
		"\u0000ow\u0005l\u0000\u0000pq\u0005s\u0000\u0000qr\u0005t\u0000\u0000"+
		"rs\u0005r\u0000\u0000st\u0005i\u0000\u0000tu\u0005n\u0000\u0000uw\u0005"+
		"g\u0000\u0000vf\u0001\u0000\u0000\u0000vl\u0001\u0000\u0000\u0000vp\u0001"+
		"\u0000\u0000\u0000w\u000e\u0001\u0000\u0000\u0000xy\u0005/\u0000\u0000"+
		"yz\u0005/\u0000\u0000z~\u0001\u0000\u0000\u0000{}\t\u0000\u0000\u0000"+
		"|{\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~\u007f\u0001"+
		"\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000"+
		"\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0083\u0007\u0000\u0000\u0000"+
		"\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0006\u0007\u0000\u0000\u0085\u0010\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0005/\u0000\u0000\u0087\u0088\u0005*\u0000\u0000\u0088\u008c"+
		"\u0001\u0000\u0000\u0000\u0089\u008b\t\u0000\u0000\u0000\u008a\u0089\u0001"+
		"\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008d\u0001"+
		"\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u008f\u0001"+
		"\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0090\u0005"+
		"*\u0000\u0000\u0090\u0091\u0005/\u0000\u0000\u0091\u0092\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0006\b\u0000\u0000\u0093\u0012\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0003E\"\u0000\u0095\u0096\u0003C!\u0000\u0096\u0097\u0003"+
		"E\"\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u009a\u0003E\"\u0000"+
		"\u0099\u0094\u0001\u0000\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000"+
		"\u009a\u0014\u0001\u0000\u0000\u0000\u009b\u009e\u0003\'\u0013\u0000\u009c"+
		"\u009e\u0003)\u0014\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009c"+
		"\u0001\u0000\u0000\u0000\u009e\u0016\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0005p\u0000\u0000\u00a0\u00a1\u0005r\u0000\u0000\u00a1\u00a2\u0005i"+
		"\u0000\u0000\u00a2\u00a3\u0005n\u0000\u0000\u00a3\u00a4\u0005t\u0000\u0000"+
		"\u00a4\u0018\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005>\u0000\u0000\u00a6"+
		"\u00a7\u0005=\u0000\u0000\u00a7\u001a\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0005<\u0000\u0000\u00a9\u00aa\u0005=\u0000\u0000\u00aa\u001c\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0005>\u0000\u0000\u00ac\u001e\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0005<\u0000\u0000\u00ae \u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0005w\u0000\u0000\u00b0\u00b1\u0005h\u0000\u0000\u00b1\u00b2\u0005"+
		"i\u0000\u0000\u00b2\u00b3\u0005l\u0000\u0000\u00b3\u00b4\u0005e\u0000"+
		"\u0000\u00b4\"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005i\u0000\u0000"+
		"\u00b6\u00b7\u0005f\u0000\u0000\u00b7$\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0005e\u0000\u0000\u00b9\u00ba\u0005l\u0000\u0000\u00ba\u00bb\u0005s"+
		"\u0000\u0000\u00bb\u00bc\u0005e\u0000\u0000\u00bc&\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0005t\u0000\u0000\u00be\u00bf\u0005r\u0000\u0000\u00bf\u00c0"+
		"\u0005u\u0000\u0000\u00c0\u00c1\u0005e\u0000\u0000\u00c1(\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0005f\u0000\u0000\u00c3\u00c4\u0005a\u0000\u0000"+
		"\u00c4\u00c5\u0005l\u0000\u0000\u00c5\u00c6\u0005s\u0000\u0000\u00c6\u00c7"+
		"\u0005e\u0000\u0000\u00c7*\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005n"+
		"\u0000\u0000\u00c9\u00ca\u0005i\u0000\u0000\u00ca\u00cb\u0005l\u0000\u0000"+
		"\u00cb,\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005n\u0000\u0000\u00cd\u00ce"+
		"\u0005o\u0000\u0000\u00ce\u00cf\u0005t\u0000\u0000\u00cf.\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0005a\u0000\u0000\u00d1\u00d2\u0005n\u0000\u0000"+
		"\u00d2\u00d3\u0005d\u0000\u0000\u00d30\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0005o\u0000\u0000\u00d5\u00d6\u0005r\u0000\u0000\u00d62\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d8\u0005;\u0000\u0000\u00d84\u0001\u0000\u0000\u0000"+
		"\u00d9\u00da\u0005=\u0000\u0000\u00da6\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0005=\u0000\u0000\u00dc\u00dd\u0005=\u0000\u0000\u00dd8\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0005!\u0000\u0000\u00df\u00e0\u0005=\u0000\u0000"+
		"\u00e0:\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005+\u0000\u0000\u00e2<"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005-\u0000\u0000\u00e4>\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0005*\u0000\u0000\u00e6@\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0005/\u0000\u0000\u00e8B\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0005.\u0000\u0000\u00eaD\u0001\u0000\u0000\u0000\u00eb\u00ed\u0007\u0001"+
		"\u0000\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000"+
		"\u0000\u0000\u00efF\u0001\u0000\u0000\u0000\u00f0\u00f4\u0005\"\u0000"+
		"\u0000\u00f1\u00f3\t\u0000\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\"\u0000\u0000\u00f8"+
		"H\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005{\u0000\u0000\u00faJ\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0005}\u0000\u0000\u00fcL\u0001\u0000\u0000"+
		"\u0000\u00fd\u00ff\u0007\u0002\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0105\u0001\u0000\u0000"+
		"\u0000\u0102\u0104\u0007\u0003\u0000\u0000\u0103\u0102\u0001\u0000\u0000"+
		"\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106N\u0001\u0000\u0000\u0000"+
		"\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u010a\u0007\u0004\u0000\u0000"+
		"\u0109\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000"+
		"\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e\u0006\'\u0000\u0000\u010e"+
		"P\u0001\u0000\u0000\u0000\f\u0000v~\u0082\u008c\u0099\u009d\u00ee\u00f4"+
		"\u0100\u0105\u010b\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from C:/Users/Roberto/Desktop/UAlg/6º Semestre/COMPILADORES/trabalhoPart1 SAVE3/trabalhoPart1/src\mar.g4 by ANTLR 4.12.0
package mar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class marParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_func = 1, RULE_var = 2, RULE_inst = 3, RULE_funcCall = 4, 
		RULE_paramList = 5, RULE_blockStmt = 6, RULE_then = 7, RULE_do = 8, RULE_expr = 9, 
		RULE_argList = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "func", "var", "inst", "funcCall", "paramList", "blockStmt", 
			"then", "do", "expr", "argList"
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

	@Override
	public String getGrammarFileName() { return "mar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public marParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(marParser.EOF, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public List<BlockStmtContext> blockStmt() {
			return getRuleContexts(BlockStmtContext.class);
		}
		public BlockStmtContext blockStmt(int i) {
			return getRuleContext(BlockStmtContext.class,i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(25);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(22);
					var();
					}
					} 
				}
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
			{
			setState(31);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(28);
					func();
					}
					} 
				}
				setState(33);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
			setState(36); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					setState(36);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
					case T__2:
					case NUMBER:
					case BOOLEAN:
					case PRINT:
					case WHILE:
					case IF:
					case ELSE:
					case NIL:
					case NOT:
					case SUB:
					case STRING:
					case ID:
						{
						setState(34);
						inst();
						}
						break;
					case Chavetas1:
						{
						setState(35);
						blockStmt();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(38); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(40);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(marParser.ID, 0); }
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public TerminalNode TYPES() { return getToken(marParser.TYPES, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPES) {
				{
				setState(42);
				match(TYPES);
				}
			}

			setState(45);
			match(ID);
			setState(46);
			match(T__0);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPES) {
				{
				setState(47);
				paramList();
				}
			}

			setState(50);
			match(T__1);
			setState(51);
			blockStmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ParserRuleContext {
		public Token op;
		public TerminalNode ID() { return getToken(marParser.ID, 0); }
		public TerminalNode DOTF() { return getToken(marParser.DOTF, 0); }
		public TerminalNode TYPES() { return getToken(marParser.TYPES, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			((VarContext)_localctx).op = match(TYPES);
			setState(54);
			match(ID);
			setState(55);
			match(DOTF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstContext extends ParserRuleContext {
		public InstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst; }
	 
		public InstContext() { }
		public void copyFrom(InstContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElseThenContext extends InstContext {
		public TerminalNode ELSE() { return getToken(marParser.ELSE, 0); }
		public InstContext inst() {
			return getRuleContext(InstContext.class,0);
		}
		public ElseThenContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterElseThen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitElseThen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitElseThen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UselessContext extends InstContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOTF() { return getToken(marParser.DOTF, 0); }
		public UselessContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterUseless(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitUseless(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitUseless(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SoloCallContext extends InstContext {
		public TerminalNode ID() { return getToken(marParser.ID, 0); }
		public TerminalNode DOTF() { return getToken(marParser.DOTF, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public SoloCallContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterSoloCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitSoloCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitSoloCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends InstContext {
		public TerminalNode PRINT() { return getToken(marParser.PRINT, 0); }
		public TerminalNode DOTF() { return getToken(marParser.DOTF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public PrintContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends InstContext {
		public TerminalNode WHILE() { return getToken(marParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DoContext do_() {
			return getRuleContext(DoContext.class,0);
		}
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public WhileStmtContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StoreContext extends InstContext {
		public TerminalNode ID() { return getToken(marParser.ID, 0); }
		public TerminalNode ONEQUAL() { return getToken(marParser.ONEQUAL, 0); }
		public TerminalNode DOTF() { return getToken(marParser.DOTF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public StoreContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterStore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitStore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitStore(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfBlockContext extends InstContext {
		public TerminalNode IF() { return getToken(marParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ThenContext then() {
			return getRuleContext(ThenContext.class,0);
		}
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public IfBlockContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfThenContext extends InstContext {
		public TerminalNode IF() { return getToken(marParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ThenContext then() {
			return getRuleContext(ThenContext.class,0);
		}
		public InstContext inst() {
			return getRuleContext(InstContext.class,0);
		}
		public IfThenContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterIfThen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitIfThen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitIfThen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends InstContext {
		public TerminalNode DOTF() { return getToken(marParser.DOTF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElseBlockContext extends InstContext {
		public TerminalNode ELSE() { return getToken(marParser.ELSE, 0); }
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public ElseBlockContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_inst);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new StoreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(ID);
				setState(58);
				match(ONEQUAL);
				setState(61);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(59);
					expr(0);
					}
					break;
				case 2:
					{
					setState(60);
					funcCall();
					}
					break;
				}
				setState(63);
				match(DOTF);
				}
				break;
			case 2:
				_localctx = new SoloCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(ID);
				setState(66);
				match(T__0);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 620635360258L) != 0)) {
					{
					setState(67);
					argList();
					}
				}

				setState(70);
				match(T__1);
				setState(71);
				match(DOTF);
				}
				break;
			case 3:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				match(PRINT);
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(73);
					expr(0);
					}
					break;
				case 2:
					{
					setState(74);
					funcCall();
					}
					break;
				}
				setState(77);
				match(DOTF);
				}
				break;
			case 4:
				_localctx = new IfThenContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				match(IF);
				setState(80);
				expr(0);
				setState(81);
				then();
				{
				setState(82);
				inst();
				}
				}
				break;
			case 5:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				match(T__2);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 620635360258L) != 0)) {
					{
					setState(85);
					expr(0);
					}
				}

				setState(88);
				match(DOTF);
				}
				break;
			case 6:
				_localctx = new IfBlockContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(89);
				match(IF);
				setState(90);
				expr(0);
				setState(91);
				then();
				setState(92);
				blockStmt();
				}
				break;
			case 7:
				_localctx = new ElseThenContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(94);
				match(ELSE);
				{
				setState(95);
				inst();
				}
				}
				break;
			case 8:
				_localctx = new ElseBlockContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(96);
				match(ELSE);
				setState(97);
				blockStmt();
				}
				break;
			case 9:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(98);
				match(WHILE);
				setState(99);
				expr(0);
				setState(100);
				do_();
				setState(101);
				blockStmt();
				}
				break;
			case 10:
				_localctx = new UselessContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(103);
				expr(0);
				setState(104);
				match(DOTF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(marParser.ID, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(ID);
			setState(109);
			match(T__0);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 620635360258L) != 0)) {
				{
				setState(110);
				argList();
				}
			}

			setState(113);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamListContext extends ParserRuleContext {
		public List<TerminalNode> TYPES() { return getTokens(marParser.TYPES); }
		public TerminalNode TYPES(int i) {
			return getToken(marParser.TYPES, i);
		}
		public List<TerminalNode> ID() { return getTokens(marParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(marParser.ID, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(115);
			match(TYPES);
			setState(116);
			match(ID);
			}
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(118);
				match(T__3);
				setState(119);
				match(TYPES);
				setState(120);
				match(ID);
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStmtContext extends ParserRuleContext {
		public TerminalNode Chavetas1() { return getToken(marParser.Chavetas1, 0); }
		public TerminalNode Chavetas2() { return getToken(marParser.Chavetas2, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public List<BlockStmtContext> blockStmt() {
			return getRuleContexts(BlockStmtContext.class);
		}
		public BlockStmtContext blockStmt(int i) {
			return getRuleContext(BlockStmtContext.class,i);
		}
		public BlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStmtContext blockStmt() throws RecognitionException {
		BlockStmtContext _localctx = new BlockStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_blockStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(Chavetas1);
			{
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPES) {
				{
				{
				setState(127);
				var();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					setState(135);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
					case T__2:
					case NUMBER:
					case BOOLEAN:
					case PRINT:
					case WHILE:
					case IF:
					case ELSE:
					case NIL:
					case NOT:
					case SUB:
					case STRING:
					case ID:
						{
						setState(133);
						inst();
						}
						break;
					case Chavetas1:
						{
						setState(134);
						blockStmt();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(137); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
			setState(139);
			match(Chavetas2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ThenContext extends ParserRuleContext {
		public ThenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterThen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitThen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitThen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThenContext then() throws RecognitionException {
		ThenContext _localctx = new ThenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_then);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DoContext extends ParserRuleContext {
		public DoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterDo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitDo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitDo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoContext do_() throws RecognitionException {
		DoContext _localctx = new DoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_do);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ORContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(marParser.OR, 0); }
		public ORContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitOR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(marParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(marParser.DIV, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(marParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(marParser.SUB, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(marParser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NILContext extends ExprContext {
		public TerminalNode NIL() { return getToken(marParser.NIL, 0); }
		public NILContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterNIL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitNIL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitNIL(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(marParser.SUB, 0); }
		public TerminalNode NOT() { return getToken(marParser.NOT, 0); }
		public NegContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitNeg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(marParser.NUMBER, 0); }
		public NumberContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncCaContext extends ExprContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public FuncCaContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterFuncCa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitFuncCa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitFuncCa(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqDifContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(marParser.EQUAL, 0); }
		public TerminalNode DIF() { return getToken(marParser.DIF, 0); }
		public EqDifContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterEqDif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitEqDif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitEqDif(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ANDContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(marParser.AND, 0); }
		public ANDContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterAND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitAND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitAND(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IDContext extends ExprContext {
		public TerminalNode ID() { return getToken(marParser.ID, 0); }
		public IDContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanContext extends ExprContext {
		public TerminalNode BOOLEAN() { return getToken(marParser.BOOLEAN, 0); }
		public BooleanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinMaiContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINOR() { return getToken(marParser.MINOR, 0); }
		public TerminalNode MAIOR() { return getToken(marParser.MAIOR, 0); }
		public TerminalNode MINOR_EQUAL() { return getToken(marParser.MINOR_EQUAL, 0); }
		public TerminalNode MAIOR_EQUAL() { return getToken(marParser.MAIOR_EQUAL, 0); }
		public MinMaiContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterMinMai(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitMinMai(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitMinMai(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(146);
				match(T__0);
				setState(147);
				expr(0);
				setState(148);
				match(T__1);
				}
				break;
			case 2:
				{
				_localctx = new NegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				((NegContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==SUB) ) {
					((NegContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(151);
				expr(13);
				}
				break;
			case 3:
				{
				_localctx = new FuncCaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				funcCall();
				}
				break;
			case 4:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(NUMBER);
				}
				break;
			case 5:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				match(STRING);
				}
				break;
			case 6:
				{
				_localctx = new NILContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				match(NIL);
				}
				break;
			case 7:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(BOOLEAN);
				}
				break;
			case 8:
				{
				_localctx = new IDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(178);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(160);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(161);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(162);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(163);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(164);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(165);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new MinMaiContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(166);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(167);
						((MinMaiContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 122880L) != 0)) ) {
							((MinMaiContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(168);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new EqDifContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(169);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(170);
						((EqDifContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==DIF) ) {
							((EqDifContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(171);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new ANDContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(172);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(173);
						match(AND);
						setState(174);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new ORContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(175);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(176);
						match(OR);
						setState(177);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<FuncCallContext> funcCall() {
			return getRuleContexts(FuncCallContext.class);
		}
		public FuncCallContext funcCall(int i) {
			return getRuleContext(FuncCallContext.class,i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof marListener ) ((marListener)listener).exitArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof marVisitor ) return ((marVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(183);
				expr(0);
				}
				break;
			case 2:
				{
				setState(184);
				funcCall();
				}
				break;
			}
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(187);
				match(T__3);
				setState(190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(188);
					expr(0);
					}
					break;
				case 2:
					{
					setState(189);
					funcCall();
					}
					break;
				}
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
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
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001(\u00c6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000\u0018"+
		"\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0005\u0000\u001e\b"+
		"\u0000\n\u0000\f\u0000!\t\u0000\u0001\u0000\u0001\u0000\u0004\u0000%\b"+
		"\u0000\u000b\u0000\f\u0000&\u0001\u0000\u0001\u0000\u0001\u0001\u0003"+
		"\u0001,\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00011\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		">\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003E\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003L\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003W\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003k\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004p\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"z\b\u0005\n\u0005\f\u0005}\t\u0005\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u0081\b\u0006\n\u0006\f\u0006\u0084\t\u0006\u0001\u0006\u0001\u0006\u0004"+
		"\u0006\u0088\b\u0006\u000b\u0006\f\u0006\u0089\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u009f\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u00b3\b\t\n\t\f\t\u00b6\t\t\u0001\n\u0001\n"+
		"\u0003\n\u00ba\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u00bf\b\n\u0005\n\u00c1"+
		"\b\n\n\n\f\n\u00c4\t\n\u0001\n\u0002&\u0089\u0001\u0012\u000b\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0005\u0002\u0000\u0017"+
		"\u0017\u001f\u001f\u0001\u0000 !\u0001\u0000\u001e\u001f\u0001\u0000\r"+
		"\u0010\u0001\u0000\u001c\u001d\u00e2\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0002+\u0001\u0000\u0000\u0000\u00045\u0001\u0000\u0000\u0000\u0006j"+
		"\u0001\u0000\u0000\u0000\bl\u0001\u0000\u0000\u0000\ns\u0001\u0000\u0000"+
		"\u0000\f~\u0001\u0000\u0000\u0000\u000e\u008d\u0001\u0000\u0000\u0000"+
		"\u0010\u008f\u0001\u0000\u0000\u0000\u0012\u009e\u0001\u0000\u0000\u0000"+
		"\u0014\u00b9\u0001\u0000\u0000\u0000\u0016\u0018\u0003\u0004\u0002\u0000"+
		"\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000"+
		"\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000"+
		"\u001a\u001f\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000"+
		"\u001c\u001e\u0003\u0002\u0001\u0000\u001d\u001c\u0001\u0000\u0000\u0000"+
		"\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f"+
		" \u0001\u0000\u0000\u0000 $\u0001\u0000\u0000\u0000!\u001f\u0001\u0000"+
		"\u0000\u0000\"%\u0003\u0006\u0003\u0000#%\u0003\f\u0006\u0000$\"\u0001"+
		"\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000"+
		"&\'\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000"+
		"\u0000()\u0005\u0000\u0000\u0001)\u0001\u0001\u0000\u0000\u0000*,\u0005"+
		"\u0007\u0000\u0000+*\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000"+
		",-\u0001\u0000\u0000\u0000-.\u0005\'\u0000\u0000.0\u0005\u0001\u0000\u0000"+
		"/1\u0003\n\u0005\u00000/\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u0000"+
		"12\u0001\u0000\u0000\u000023\u0005\u0002\u0000\u000034\u0003\f\u0006\u0000"+
		"4\u0003\u0001\u0000\u0000\u000056\u0005\u0007\u0000\u000067\u0005\'\u0000"+
		"\u000078\u0005\u001a\u0000\u00008\u0005\u0001\u0000\u0000\u00009:\u0005"+
		"\'\u0000\u0000:=\u0005\u001b\u0000\u0000;>\u0003\u0012\t\u0000<>\u0003"+
		"\b\u0004\u0000=;\u0001\u0000\u0000\u0000=<\u0001\u0000\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?@\u0005\u001a\u0000\u0000@k\u0001\u0000\u0000\u0000"+
		"AB\u0005\'\u0000\u0000BD\u0005\u0001\u0000\u0000CE\u0003\u0014\n\u0000"+
		"DC\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000FG\u0005\u0002\u0000\u0000Gk\u0005\u001a\u0000\u0000HK\u0005\f\u0000"+
		"\u0000IL\u0003\u0012\t\u0000JL\u0003\b\u0004\u0000KI\u0001\u0000\u0000"+
		"\u0000KJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0005\u001a"+
		"\u0000\u0000Nk\u0001\u0000\u0000\u0000OP\u0005\u0012\u0000\u0000PQ\u0003"+
		"\u0012\t\u0000QR\u0003\u000e\u0007\u0000RS\u0003\u0006\u0003\u0000Sk\u0001"+
		"\u0000\u0000\u0000TV\u0005\u0003\u0000\u0000UW\u0003\u0012\t\u0000VU\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"Xk\u0005\u001a\u0000\u0000YZ\u0005\u0012\u0000\u0000Z[\u0003\u0012\t\u0000"+
		"[\\\u0003\u000e\u0007\u0000\\]\u0003\f\u0006\u0000]k\u0001\u0000\u0000"+
		"\u0000^_\u0005\u0013\u0000\u0000_k\u0003\u0006\u0003\u0000`a\u0005\u0013"+
		"\u0000\u0000ak\u0003\f\u0006\u0000bc\u0005\u0011\u0000\u0000cd\u0003\u0012"+
		"\t\u0000de\u0003\u0010\b\u0000ef\u0003\f\u0006\u0000fk\u0001\u0000\u0000"+
		"\u0000gh\u0003\u0012\t\u0000hi\u0005\u001a\u0000\u0000ik\u0001\u0000\u0000"+
		"\u0000j9\u0001\u0000\u0000\u0000jA\u0001\u0000\u0000\u0000jH\u0001\u0000"+
		"\u0000\u0000jO\u0001\u0000\u0000\u0000jT\u0001\u0000\u0000\u0000jY\u0001"+
		"\u0000\u0000\u0000j^\u0001\u0000\u0000\u0000j`\u0001\u0000\u0000\u0000"+
		"jb\u0001\u0000\u0000\u0000jg\u0001\u0000\u0000\u0000k\u0007\u0001\u0000"+
		"\u0000\u0000lm\u0005\'\u0000\u0000mo\u0005\u0001\u0000\u0000np\u0003\u0014"+
		"\n\u0000on\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qr\u0005\u0002\u0000\u0000r\t\u0001\u0000\u0000\u0000st\u0005"+
		"\u0007\u0000\u0000tu\u0005\'\u0000\u0000u{\u0001\u0000\u0000\u0000vw\u0005"+
		"\u0004\u0000\u0000wx\u0005\u0007\u0000\u0000xz\u0005\'\u0000\u0000yv\u0001"+
		"\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000|\u000b\u0001\u0000\u0000\u0000}{\u0001\u0000"+
		"\u0000\u0000~\u0082\u0005%\u0000\u0000\u007f\u0081\u0003\u0004\u0002\u0000"+
		"\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000"+
		"\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000"+
		"\u0083\u0087\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000"+
		"\u0085\u0088\u0003\u0006\u0003\u0000\u0086\u0088\u0003\f\u0006\u0000\u0087"+
		"\u0085\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u0089"+
		"\u0087\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0005&\u0000\u0000\u008c\r\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0005\u0005\u0000\u0000\u008e\u000f\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0005\u0006\u0000\u0000\u0090\u0011\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0006\t\uffff\uffff\u0000\u0092\u0093\u0005\u0001\u0000\u0000\u0093\u0094"+
		"\u0003\u0012\t\u0000\u0094\u0095\u0005\u0002\u0000\u0000\u0095\u009f\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0007\u0000\u0000\u0000\u0097\u009f\u0003"+
		"\u0012\t\r\u0098\u009f\u0003\b\u0004\u0000\u0099\u009f\u0005\n\u0000\u0000"+
		"\u009a\u009f\u0005$\u0000\u0000\u009b\u009f\u0005\u0016\u0000\u0000\u009c"+
		"\u009f\u0005\u000b\u0000\u0000\u009d\u009f\u0005\'\u0000\u0000\u009e\u0091"+
		"\u0001\u0000\u0000\u0000\u009e\u0096\u0001\u0000\u0000\u0000\u009e\u0098"+
		"\u0001\u0000\u0000\u0000\u009e\u0099\u0001\u0000\u0000\u0000\u009e\u009a"+
		"\u0001\u0000\u0000\u0000\u009e\u009b\u0001\u0000\u0000\u0000\u009e\u009c"+
		"\u0001\u0000\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00b4"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\n\f\u0000\u0000\u00a1\u00a2\u0007"+
		"\u0001\u0000\u0000\u00a2\u00b3\u0003\u0012\t\r\u00a3\u00a4\n\u000b\u0000"+
		"\u0000\u00a4\u00a5\u0007\u0002\u0000\u0000\u00a5\u00b3\u0003\u0012\t\f"+
		"\u00a6\u00a7\n\n\u0000\u0000\u00a7\u00a8\u0007\u0003\u0000\u0000\u00a8"+
		"\u00b3\u0003\u0012\t\u000b\u00a9\u00aa\n\t\u0000\u0000\u00aa\u00ab\u0007"+
		"\u0004\u0000\u0000\u00ab\u00b3\u0003\u0012\t\n\u00ac\u00ad\n\b\u0000\u0000"+
		"\u00ad\u00ae\u0005\u0018\u0000\u0000\u00ae\u00b3\u0003\u0012\t\t\u00af"+
		"\u00b0\n\u0007\u0000\u0000\u00b0\u00b1\u0005\u0019\u0000\u0000\u00b1\u00b3"+
		"\u0003\u0012\t\b\u00b2\u00a0\u0001\u0000\u0000\u0000\u00b2\u00a3\u0001"+
		"\u0000\u0000\u0000\u00b2\u00a6\u0001\u0000\u0000\u0000\u00b2\u00a9\u0001"+
		"\u0000\u0000\u0000\u00b2\u00ac\u0001\u0000\u0000\u0000\u00b2\u00af\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u0013\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00ba\u0003"+
		"\u0012\t\u0000\u00b8\u00ba\u0003\b\u0004\u0000\u00b9\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00c2\u0001\u0000"+
		"\u0000\u0000\u00bb\u00be\u0005\u0004\u0000\u0000\u00bc\u00bf\u0003\u0012"+
		"\t\u0000\u00bd\u00bf\u0003\b\u0004\u0000\u00be\u00bc\u0001\u0000\u0000"+
		"\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c0\u00bb\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c3\u0015\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000"+
		"\u0000\u0016\u0019\u001f$&+0=DKVjo{\u0082\u0087\u0089\u009e\u00b2\u00b4"+
		"\u00b9\u00be\u00c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
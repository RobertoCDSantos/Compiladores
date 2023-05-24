// Generated from c:\Users\Roberto\Desktop\UAlg\6º Semestre\COMPILADORES\trabalhoPart1 SAVE3\trabalhoPart1\src\mar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class marParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_func = 1, RULE_var = 2, RULE_inst = 3, RULE_funcCall = 4, 
		RULE_paramList = 5, RULE_blockStmt = 6, RULE_returnStmt = 7, RULE_then = 8, 
		RULE_do = 9, RULE_expr = 10, RULE_argList = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "func", "var", "inst", "funcCall", "paramList", "blockStmt", 
			"returnStmt", "then", "do", "expr", "argList"
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

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(marParser.EOF, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
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
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(27);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(24);
					var();
					}
					} 
				}
				setState(29);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
			{
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(30);
					func();
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				inst();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << PRINT) | (1L << WHILE) | (1L << IF) | (1L << ELSE) | (1L << Chavetas1) | (1L << ID))) != 0) );
			setState(41);
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
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPES) {
				{
				setState(43);
				match(TYPES);
				}
			}

			setState(46);
			match(ID);
			setState(47);
			match(T__0);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPES) {
				{
				setState(48);
				paramList();
				}
			}

			setState(51);
			match(T__1);
			setState(52);
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

	public static class VarContext extends ParserRuleContext {
		public Token op;
		public TerminalNode ID() { return getToken(marParser.ID, 0); }
		public TerminalNode DOTF() { return getToken(marParser.DOTF, 0); }
		public TerminalNode TYPES() { return getToken(marParser.TYPES, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			((VarContext)_localctx).op = match(TYPES);
			setState(55);
			match(ID);
			setState(56);
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
	public static class ElseThenContext extends InstContext {
		public TerminalNode ELSE() { return getToken(marParser.ELSE, 0); }
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public InstContext inst() {
			return getRuleContext(InstContext.class,0);
		}
		public ElseThenContext(InstContext ctx) { copyFrom(ctx); }
	}
	public static class SoloCallContext extends InstContext {
		public TerminalNode ID() { return getToken(marParser.ID, 0); }
		public TerminalNode DOTF() { return getToken(marParser.DOTF, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public SoloCallContext(InstContext ctx) { copyFrom(ctx); }
	}
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
	}
	public static class LoadContext extends InstContext {
		public TerminalNode ID() { return getToken(marParser.ID, 0); }
		public TerminalNode ONEQUAL() { return getToken(marParser.ONEQUAL, 0); }
		public TerminalNode DOTF() { return getToken(marParser.DOTF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public LoadContext(InstContext ctx) { copyFrom(ctx); }
	}
	public static class BlockSContext extends InstContext {
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public BlockSContext(InstContext ctx) { copyFrom(ctx); }
	}
	public static class WhileStmtContext extends InstContext {
		public TerminalNode WHILE() { return getToken(marParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DoContext do() {
			return getRuleContext(DoContext.class,0);
		}
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public WhileStmtContext(InstContext ctx) { copyFrom(ctx); }
	}
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
	}
	public static class ReturnFuncContext extends InstContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public TerminalNode DOTF() { return getToken(marParser.DOTF, 0); }
		public ReturnFuncContext(InstContext ctx) { copyFrom(ctx); }
	}
	public static class IfThenContext extends InstContext {
		public TerminalNode IF() { return getToken(marParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ThenContext then() {
			return getRuleContext(ThenContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public InstContext inst() {
			return getRuleContext(InstContext.class,0);
		}
		public IfThenContext(InstContext ctx) { copyFrom(ctx); }
	}
	public static class ElseBlockContext extends InstContext {
		public TerminalNode ELSE() { return getToken(marParser.ELSE, 0); }
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public ElseBlockContext(InstContext ctx) { copyFrom(ctx); }
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_inst);
		int _la;
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new BlockSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				blockStmt();
				}
				break;
			case 2:
				_localctx = new LoadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(ID);
				setState(60);
				match(ONEQUAL);
				setState(63);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(61);
					expr(0);
					}
					break;
				case 2:
					{
					setState(62);
					funcCall();
					}
					break;
				}
				setState(65);
				match(DOTF);
				}
				break;
			case 3:
				_localctx = new SoloCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				match(ID);
				setState(68);
				match(T__0);
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NUMBER) | (1L << BOOLEAN) | (1L << NIL) | (1L << NOT) | (1L << SUB) | (1L << STRING) | (1L << ID))) != 0)) {
					{
					setState(69);
					argList();
					}
				}

				setState(72);
				match(T__1);
				setState(73);
				match(DOTF);
				}
				break;
			case 4:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				match(PRINT);
				setState(77);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(75);
					expr(0);
					}
					break;
				case 2:
					{
					setState(76);
					funcCall();
					}
					break;
				}
				setState(79);
				match(DOTF);
				}
				break;
			case 5:
				_localctx = new IfThenContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				match(IF);
				setState(82);
				expr(0);
				setState(83);
				then();
				setState(86);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(84);
					returnStmt();
					}
					break;
				case 2:
					{
					setState(85);
					inst();
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new ReturnFuncContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				match(T__2);
				setState(89);
				funcCall();
				setState(90);
				match(DOTF);
				}
				break;
			case 7:
				_localctx = new IfBlockContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				match(IF);
				setState(93);
				expr(0);
				setState(94);
				then();
				setState(95);
				blockStmt();
				}
				break;
			case 8:
				_localctx = new ElseThenContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(97);
				match(ELSE);
				setState(100);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(98);
					returnStmt();
					}
					break;
				case 2:
					{
					setState(99);
					inst();
					}
					break;
				}
				}
				break;
			case 9:
				_localctx = new ElseBlockContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(102);
				match(ELSE);
				setState(103);
				blockStmt();
				}
				break;
			case 10:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(104);
				match(WHILE);
				setState(105);
				expr(0);
				setState(106);
				do();
				setState(107);
				blockStmt();
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

	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(marParser.ID, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(ID);
			setState(112);
			match(T__0);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NUMBER) | (1L << BOOLEAN) | (1L << NIL) | (1L << NOT) | (1L << SUB) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				setState(113);
				argList();
				}
			}

			setState(116);
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
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(118);
			match(TYPES);
			setState(119);
			match(ID);
			}
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(121);
				match(T__3);
				setState(122);
				match(TYPES);
				setState(123);
				match(ID);
				}
				}
				setState(128);
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

	public static class BlockStmtContext extends ParserRuleContext {
		public TerminalNode Chavetas1() { return getToken(marParser.Chavetas1, 0); }
		public TerminalNode Chavetas2() { return getToken(marParser.Chavetas2, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<ReturnStmtContext> returnStmt() {
			return getRuleContexts(ReturnStmtContext.class);
		}
		public ReturnStmtContext returnStmt(int i) {
			return getRuleContext(ReturnStmtContext.class,i);
		}
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public BlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStmt; }
	}

	public final BlockStmtContext blockStmt() throws RecognitionException {
		BlockStmtContext _localctx = new BlockStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_blockStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(Chavetas1);
			{
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPES) {
				{
				{
				setState(130);
				var();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(137); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(136);
						inst();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(139); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(143);
				returnStmt();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(149);
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

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode DOTF() { return getToken(marParser.DOTF, 0); }
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__2);
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(152);
				funcCall();
				}
				break;
			case 2:
				{
				setState(153);
				expr(0);
				}
				break;
			}
			setState(156);
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

	public static class ThenContext extends ParserRuleContext {
		public ThenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then; }
	}

	public final ThenContext then() throws RecognitionException {
		ThenContext _localctx = new ThenContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_then);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
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

	public static class DoContext extends ParserRuleContext {
		public DoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do; }
	}

	public final DoContext do() throws RecognitionException {
		DoContext _localctx = new DoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_do);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
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
	public static class ORContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(marParser.OR, 0); }
		public ORContext(ExprContext ctx) { copyFrom(ctx); }
	}
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
	}
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
	}
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(marParser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NILContext extends ExprContext {
		public TerminalNode NIL() { return getToken(marParser.NIL, 0); }
		public NILContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NegContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(marParser.SUB, 0); }
		public TerminalNode NOT() { return getToken(marParser.NOT, 0); }
		public NegContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NumberContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(marParser.NUMBER, 0); }
		public NumberContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class FuncCaContext extends ExprContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public FuncCaContext(ExprContext ctx) { copyFrom(ctx); }
	}
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
	}
	public static class ANDContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(marParser.AND, 0); }
		public ANDContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IDContext extends ExprContext {
		public TerminalNode ID() { return getToken(marParser.ID, 0); }
		public IDContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanContext extends ExprContext {
		public TerminalNode BOOLEAN() { return getToken(marParser.BOOLEAN, 0); }
		public BooleanContext(ExprContext ctx) { copyFrom(ctx); }
	}
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
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(163);
				match(T__0);
				setState(164);
				expr(0);
				setState(165);
				match(T__1);
				}
				break;
			case 2:
				{
				_localctx = new NegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
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
				setState(168);
				expr(13);
				}
				break;
			case 3:
				{
				_localctx = new FuncCaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				funcCall();
				}
				break;
			case 4:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(NUMBER);
				}
				break;
			case 5:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				match(STRING);
				}
				break;
			case 6:
				{
				_localctx = new NILContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(NIL);
				}
				break;
			case 7:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(BOOLEAN);
				}
				break;
			case 8:
				{
				_localctx = new IDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(195);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(178);
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
						setState(179);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(181);
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
						setState(182);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new MinMaiContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(184);
						((MinMaiContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIOR_EQUAL) | (1L << MINOR_EQUAL) | (1L << MAIOR) | (1L << MINOR))) != 0)) ) {
							((MinMaiContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(185);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new EqDifContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(187);
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
						setState(188);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new ANDContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(190);
						match(AND);
						setState(191);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new ORContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(193);
						match(OR);
						setState(194);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(200);
				expr(0);
				}
				break;
			case 2:
				{
				setState(201);
				funcCall();
				}
				break;
			}
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(204);
				match(T__3);
				setState(207);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(205);
					expr(0);
					}
					break;
				case 2:
					{
					setState(206);
					funcCall();
					}
					break;
				}
				}
				}
				setState(213);
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
		case 10:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00d9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\7\2\"\n\2\f\2"+
		"\16\2%\13\2\3\2\6\2(\n\2\r\2\16\2)\3\2\3\2\3\3\5\3/\n\3\3\3\3\3\3\3\5"+
		"\3\64\n\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5B\n\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5I\n\5\3\5\3\5\3\5\3\5\3\5\5\5P\n\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5Y\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5g\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5p\n\5\3\6\3\6\3\6\5\6u\n\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\177\n\7\f\7\16\7\u0082\13\7\3\b\3\b"+
		"\7\b\u0086\n\b\f\b\16\b\u0089\13\b\3\b\6\b\u008c\n\b\r\b\16\b\u008d\5"+
		"\b\u0090\n\b\3\b\7\b\u0093\n\b\f\b\16\b\u0096\13\b\3\b\3\b\3\t\3\t\3\t"+
		"\5\t\u009d\n\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b2\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c6\n\f\f\f\16\f\u00c9\13"+
		"\f\3\r\3\r\5\r\u00cd\n\r\3\r\3\r\3\r\5\r\u00d2\n\r\7\r\u00d4\n\r\f\r\16"+
		"\r\u00d7\13\r\3\r\2\3\26\16\2\4\6\b\n\f\16\20\22\24\26\30\2\7\4\2\31\31"+
		"!!\3\2\"#\3\2 !\3\2\17\22\3\2\36\37\2\u00f7\2\35\3\2\2\2\4.\3\2\2\2\6"+
		"8\3\2\2\2\bo\3\2\2\2\nq\3\2\2\2\fx\3\2\2\2\16\u0083\3\2\2\2\20\u0099\3"+
		"\2\2\2\22\u00a0\3\2\2\2\24\u00a2\3\2\2\2\26\u00b1\3\2\2\2\30\u00cc\3\2"+
		"\2\2\32\34\5\6\4\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2"+
		"\2\2\36#\3\2\2\2\37\35\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2"+
		"\2#$\3\2\2\2$\'\3\2\2\2%#\3\2\2\2&(\5\b\5\2\'&\3\2\2\2()\3\2\2\2)\'\3"+
		"\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7\2\2\3,\3\3\2\2\2-/\7\t\2\2.-\3\2\2\2./"+
		"\3\2\2\2/\60\3\2\2\2\60\61\7)\2\2\61\63\7\3\2\2\62\64\5\f\7\2\63\62\3"+
		"\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7\4\2\2\66\67\5\16\b\2\67\5\3"+
		"\2\2\289\7\t\2\29:\7)\2\2:;\7\34\2\2;\7\3\2\2\2<p\5\16\b\2=>\7)\2\2>A"+
		"\7\35\2\2?B\5\26\f\2@B\5\n\6\2A?\3\2\2\2A@\3\2\2\2BC\3\2\2\2CD\7\34\2"+
		"\2Dp\3\2\2\2EF\7)\2\2FH\7\3\2\2GI\5\30\r\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2"+
		"\2JK\7\4\2\2Kp\7\34\2\2LO\7\16\2\2MP\5\26\f\2NP\5\n\6\2OM\3\2\2\2ON\3"+
		"\2\2\2PQ\3\2\2\2QR\7\34\2\2Rp\3\2\2\2ST\7\24\2\2TU\5\26\f\2UX\5\22\n\2"+
		"VY\5\20\t\2WY\5\b\5\2XV\3\2\2\2XW\3\2\2\2Yp\3\2\2\2Z[\7\5\2\2[\\\5\n\6"+
		"\2\\]\7\34\2\2]p\3\2\2\2^_\7\24\2\2_`\5\26\f\2`a\5\22\n\2ab\5\16\b\2b"+
		"p\3\2\2\2cf\7\25\2\2dg\5\20\t\2eg\5\b\5\2fd\3\2\2\2fe\3\2\2\2gp\3\2\2"+
		"\2hi\7\25\2\2ip\5\16\b\2jk\7\23\2\2kl\5\26\f\2lm\5\24\13\2mn\5\16\b\2"+
		"np\3\2\2\2o<\3\2\2\2o=\3\2\2\2oE\3\2\2\2oL\3\2\2\2oS\3\2\2\2oZ\3\2\2\2"+
		"o^\3\2\2\2oc\3\2\2\2oh\3\2\2\2oj\3\2\2\2p\t\3\2\2\2qr\7)\2\2rt\7\3\2\2"+
		"su\5\30\r\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\4\2\2w\13\3\2\2\2xy\7\t"+
		"\2\2yz\7)\2\2z\u0080\3\2\2\2{|\7\6\2\2|}\7\t\2\2}\177\7)\2\2~{\3\2\2\2"+
		"\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\r\3\2\2\2"+
		"\u0082\u0080\3\2\2\2\u0083\u0087\7\'\2\2\u0084\u0086\5\6\4\2\u0085\u0084"+
		"\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u008f\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008c\5\b\5\2\u008b\u008a\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u0090\3\2\2\2\u008f\u008b\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0094\3\2"+
		"\2\2\u0091\u0093\5\20\t\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0097\u0098\7(\2\2\u0098\17\3\2\2\2\u0099\u009c\7\5\2\2\u009a\u009d"+
		"\5\n\6\2\u009b\u009d\5\26\f\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2"+
		"\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\34\2\2\u009f\21"+
		"\3\2\2\2\u00a0\u00a1\7\7\2\2\u00a1\23\3\2\2\2\u00a2\u00a3\7\b\2\2\u00a3"+
		"\25\3\2\2\2\u00a4\u00a5\b\f\1\2\u00a5\u00a6\7\3\2\2\u00a6\u00a7\5\26\f"+
		"\2\u00a7\u00a8\7\4\2\2\u00a8\u00b2\3\2\2\2\u00a9\u00aa\t\2\2\2\u00aa\u00b2"+
		"\5\26\f\17\u00ab\u00b2\5\n\6\2\u00ac\u00b2\7\f\2\2\u00ad\u00b2\7&\2\2"+
		"\u00ae\u00b2\7\30\2\2\u00af\u00b2\7\r\2\2\u00b0\u00b2\7)\2\2\u00b1\u00a4"+
		"\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b1"+
		"\u00ad\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2"+
		"\2\2\u00b2\u00c7\3\2\2\2\u00b3\u00b4\f\16\2\2\u00b4\u00b5\t\3\2\2\u00b5"+
		"\u00c6\5\26\f\17\u00b6\u00b7\f\r\2\2\u00b7\u00b8\t\4\2\2\u00b8\u00c6\5"+
		"\26\f\16\u00b9\u00ba\f\f\2\2\u00ba\u00bb\t\5\2\2\u00bb\u00c6\5\26\f\r"+
		"\u00bc\u00bd\f\13\2\2\u00bd\u00be\t\6\2\2\u00be\u00c6\5\26\f\f\u00bf\u00c0"+
		"\f\n\2\2\u00c0\u00c1\7\32\2\2\u00c1\u00c6\5\26\f\13\u00c2\u00c3\f\t\2"+
		"\2\u00c3\u00c4\7\33\2\2\u00c4\u00c6\5\26\f\n\u00c5\u00b3\3\2\2\2\u00c5"+
		"\u00b6\3\2\2\2\u00c5\u00b9\3\2\2\2\u00c5\u00bc\3\2\2\2\u00c5\u00bf\3\2"+
		"\2\2\u00c5\u00c2\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\27\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\5\26\f"+
		"\2\u00cb\u00cd\5\n\6\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d5"+
		"\3\2\2\2\u00ce\u00d1\7\6\2\2\u00cf\u00d2\5\26\f\2\u00d0\u00d2\5\n\6\2"+
		"\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00ce"+
		"\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\31\3\2\2\2\u00d7\u00d5\3\2\2\2\32\35#).\63AHOXfot\u0080\u0087\u008d\u008f"+
		"\u0094\u009c\u00b1\u00c5\u00c7\u00cc\u00d1\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
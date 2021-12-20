// Generated from C:/Users/ASUS/Desktop/大三上软件/编译原理/实验/正式实验/src\miniSysY.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miniSysYParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FuncType=1, Ident=2, Left_bracket=3, Right_bracket=4, Left_braces=5, Right_braces=6, 
		RETURN=7, Semicolon=8, Zero=9, Hexadecimal_prefix=10, Nonzero_digit=11, 
		Octal_digit=12, Hexadecimal_digit=13, Notes1=14, Notes2=15, Space=16, 
		White_space=17;
	public static final int
		RULE_compUnit = 0, RULE_funcDef = 1, RULE_block = 2, RULE_stmt = 3, RULE_number = 4, 
		RULE_decimal_const = 5, RULE_octal_const = 6, RULE_hexadecimal_const = 7, 
		RULE_digit = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"compUnit", "funcDef", "block", "stmt", "number", "decimal_const", "octal_const", 
			"hexadecimal_const", "digit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'main'", "'('", "')'", "'{'", "'}'", "'return'", "';'", 
			"'0'", null, null, null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FuncType", "Ident", "Left_bracket", "Right_bracket", "Left_braces", 
			"Right_braces", "RETURN", "Semicolon", "Zero", "Hexadecimal_prefix", 
			"Nonzero_digit", "Octal_digit", "Hexadecimal_digit", "Notes1", "Notes2", 
			"Space", "White_space"
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
	public String getGrammarFileName() { return "miniSysY.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public miniSysYParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompUnitContext extends ParserRuleContext {
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public CompUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterCompUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitCompUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitCompUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompUnitContext compUnit() throws RecognitionException {
		CompUnitContext _localctx = new CompUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			funcDef();
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

	public static class FuncDefContext extends ParserRuleContext {
		public TerminalNode FuncType() { return getToken(miniSysYParser.FuncType, 0); }
		public TerminalNode Ident() { return getToken(miniSysYParser.Ident, 0); }
		public TerminalNode Left_bracket() { return getToken(miniSysYParser.Left_bracket, 0); }
		public TerminalNode Right_bracket() { return getToken(miniSysYParser.Right_bracket, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(FuncType);
			setState(21);
			match(Ident);
			setState(22);
			match(Left_bracket);
			setState(23);
			match(Right_bracket);
			setState(24);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode Left_braces() { return getToken(miniSysYParser.Left_braces, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode Right_braces() { return getToken(miniSysYParser.Right_braces, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(Left_braces);
			setState(27);
			stmt();
			setState(28);
			match(Right_braces);
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

	public static class StmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(miniSysYParser.RETURN, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(miniSysYParser.Semicolon, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(RETURN);
			setState(31);
			number();
			setState(32);
			match(Semicolon);
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
		public Decimal_constContext decimal_const() {
			return getRuleContext(Decimal_constContext.class,0);
		}
		public Octal_constContext octal_const() {
			return getRuleContext(Octal_constContext.class,0);
		}
		public Hexadecimal_constContext hexadecimal_const() {
			return getRuleContext(Hexadecimal_constContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_number);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Nonzero_digit:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				decimal_const(0);
				}
				break;
			case Zero:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				octal_const(0);
				}
				break;
			case Hexadecimal_prefix:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				hexadecimal_const(0);
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

	public static class Decimal_constContext extends ParserRuleContext {
		public TerminalNode Nonzero_digit() { return getToken(miniSysYParser.Nonzero_digit, 0); }
		public Decimal_constContext decimal_const() {
			return getRuleContext(Decimal_constContext.class,0);
		}
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public Decimal_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterDecimal_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitDecimal_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitDecimal_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decimal_constContext decimal_const() throws RecognitionException {
		return decimal_const(0);
	}

	private Decimal_constContext decimal_const(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Decimal_constContext _localctx = new Decimal_constContext(_ctx, _parentState);
		Decimal_constContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_decimal_const, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(40);
			match(Nonzero_digit);
			}
			_ctx.stop = _input.LT(-1);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Decimal_constContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_decimal_const);
					setState(42);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(43);
					digit();
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class Octal_constContext extends ParserRuleContext {
		public TerminalNode Zero() { return getToken(miniSysYParser.Zero, 0); }
		public Octal_constContext octal_const() {
			return getRuleContext(Octal_constContext.class,0);
		}
		public TerminalNode Octal_digit() { return getToken(miniSysYParser.Octal_digit, 0); }
		public Octal_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octal_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterOctal_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitOctal_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitOctal_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Octal_constContext octal_const() throws RecognitionException {
		return octal_const(0);
	}

	private Octal_constContext octal_const(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Octal_constContext _localctx = new Octal_constContext(_ctx, _parentState);
		Octal_constContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_octal_const, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(50);
			match(Zero);
			}
			_ctx.stop = _input.LT(-1);
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Octal_constContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_octal_const);
					setState(52);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(53);
					match(Octal_digit);
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class Hexadecimal_constContext extends ParserRuleContext {
		public TerminalNode Hexadecimal_prefix() { return getToken(miniSysYParser.Hexadecimal_prefix, 0); }
		public TerminalNode Hexadecimal_digit() { return getToken(miniSysYParser.Hexadecimal_digit, 0); }
		public Hexadecimal_constContext hexadecimal_const() {
			return getRuleContext(Hexadecimal_constContext.class,0);
		}
		public Hexadecimal_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimal_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterHexadecimal_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitHexadecimal_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitHexadecimal_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hexadecimal_constContext hexadecimal_const() throws RecognitionException {
		return hexadecimal_const(0);
	}

	private Hexadecimal_constContext hexadecimal_const(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Hexadecimal_constContext _localctx = new Hexadecimal_constContext(_ctx, _parentState);
		Hexadecimal_constContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_hexadecimal_const, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(60);
			match(Hexadecimal_prefix);
			setState(61);
			match(Hexadecimal_digit);
			}
			_ctx.stop = _input.LT(-1);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Hexadecimal_constContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_hexadecimal_const);
					setState(63);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(64);
					match(Hexadecimal_digit);
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class DigitContext extends ParserRuleContext {
		public TerminalNode Zero() { return getToken(miniSysYParser.Zero, 0); }
		public TerminalNode Nonzero_digit() { return getToken(miniSysYParser.Nonzero_digit, 0); }
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitDigit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitDigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !(_la==Zero || _la==Nonzero_digit) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		case 5:
			return decimal_const_sempred((Decimal_constContext)_localctx, predIndex);
		case 6:
			return octal_const_sempred((Octal_constContext)_localctx, predIndex);
		case 7:
			return hexadecimal_const_sempred((Hexadecimal_constContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean decimal_const_sempred(Decimal_constContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean octal_const_sempred(Octal_constContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean hexadecimal_const_sempred(Hexadecimal_constContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23K\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6("+
		"\n\6\3\7\3\7\3\7\3\7\3\7\7\7/\n\7\f\7\16\7\62\13\7\3\b\3\b\3\b\3\b\3\b"+
		"\7\b9\n\b\f\b\16\b<\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\tD\n\t\f\t\16\tG\13"+
		"\t\3\n\3\n\3\n\2\5\f\16\20\13\2\4\6\b\n\f\16\20\22\2\3\4\2\13\13\r\r\2"+
		"F\2\24\3\2\2\2\4\26\3\2\2\2\6\34\3\2\2\2\b \3\2\2\2\n\'\3\2\2\2\f)\3\2"+
		"\2\2\16\63\3\2\2\2\20=\3\2\2\2\22H\3\2\2\2\24\25\5\4\3\2\25\3\3\2\2\2"+
		"\26\27\7\3\2\2\27\30\7\4\2\2\30\31\7\5\2\2\31\32\7\6\2\2\32\33\5\6\4\2"+
		"\33\5\3\2\2\2\34\35\7\7\2\2\35\36\5\b\5\2\36\37\7\b\2\2\37\7\3\2\2\2 "+
		"!\7\t\2\2!\"\5\n\6\2\"#\7\n\2\2#\t\3\2\2\2$(\5\f\7\2%(\5\16\b\2&(\5\20"+
		"\t\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2(\13\3\2\2\2)*\b\7\1\2*+\7\r\2\2"+
		"+\60\3\2\2\2,-\f\3\2\2-/\5\22\n\2.,\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60"+
		"\61\3\2\2\2\61\r\3\2\2\2\62\60\3\2\2\2\63\64\b\b\1\2\64\65\7\13\2\2\65"+
		":\3\2\2\2\66\67\f\3\2\2\679\7\16\2\28\66\3\2\2\29<\3\2\2\2:8\3\2\2\2:"+
		";\3\2\2\2;\17\3\2\2\2<:\3\2\2\2=>\b\t\1\2>?\7\f\2\2?@\7\17\2\2@E\3\2\2"+
		"\2AB\f\3\2\2BD\7\17\2\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\21\3"+
		"\2\2\2GE\3\2\2\2HI\t\2\2\2I\23\3\2\2\2\6\'\60:E";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
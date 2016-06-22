// Generated from /home/sahil/blogs/blog 2/ANTLRBlog2/src/main/antlr/ArithmaticGrammar.g4 by ANTLR 4.5.1
package com.knoldus;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArithmaticGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, DIGIT=11, WS=12;
	public static final int
		RULE_startRule = 0, RULE_operation = 1, RULE_operand = 2, RULE_space = 3, 
		RULE_semicolon = 4, RULE_add = 5, RULE_sub = 6, RULE_mul = 7, RULE_div = 8;
	public static final String[] ruleNames = {
		"startRule", "operation", "operand", "space", "semicolon", "add", "sub", 
		"mul", "div"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "';'", "'add'", "'ADD'", "'sub'", "'SUB'", "'mul'", "'MUL'", 
		"'div'", "'DIV'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "DIGIT", 
		"WS"
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
	public String getGrammarFileName() { return "ArithmaticGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArithmaticGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartRuleContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public StartRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmaticGrammarListener ) ((ArithmaticGrammarListener)listener).enterStartRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmaticGrammarListener ) ((ArithmaticGrammarListener)listener).exitStartRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmaticGrammarVisitor ) return ((ArithmaticGrammarVisitor<? extends T>)visitor).visitStartRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartRuleContext startRule() throws RecognitionException {
		StartRuleContext _localctx = new StartRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			operation();
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(19);
				space();
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(24);
			operand();
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(25);
				space();
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(30);
			operand();
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(31);
				space();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
			semicolon();
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

	public static class OperationContext extends ParserRuleContext {
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public MulContext mul() {
			return getRuleContext(MulContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmaticGrammarListener ) ((ArithmaticGrammarListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmaticGrammarListener ) ((ArithmaticGrammarListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmaticGrammarVisitor ) return ((ArithmaticGrammarVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_operation);
		try {
			setState(43);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				add();
				}
				break;
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				sub();
				}
				break;
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				div();
				}
				break;
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				mul();
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

	public static class OperandContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(ArithmaticGrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(ArithmaticGrammarParser.DIGIT, i);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmaticGrammarListener ) ((ArithmaticGrammarListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmaticGrammarListener ) ((ArithmaticGrammarListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmaticGrammarVisitor ) return ((ArithmaticGrammarVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45);
				match(DIGIT);
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class SpaceContext extends ParserRuleContext {
		public SpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmaticGrammarListener ) ((ArithmaticGrammarListener)listener).enterSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmaticGrammarListener ) ((ArithmaticGrammarListener)listener).exitSpace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmaticGrammarVisitor ) return ((ArithmaticGrammarVisitor<? extends T>)visitor).visitSpace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpaceContext space() throws RecognitionException {
		SpaceContext _localctx = new SpaceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__0);
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

	public static class SemicolonContext extends ParserRuleContext {
		public SemicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmaticGrammarListener ) ((ArithmaticGrammarListener)listener).enterSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmaticGrammarListener ) ((ArithmaticGrammarListener)listener).exitSemicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmaticGrammarVisitor ) return ((ArithmaticGrammarVisitor<? extends T>)visitor).visitSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemicolonContext semicolon() throws RecognitionException {
		SemicolonContext _localctx = new SemicolonContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
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

	public static class AddContext extends ParserRuleContext {
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmaticGrammarListener ) ((ArithmaticGrammarListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmaticGrammarListener ) ((ArithmaticGrammarListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmaticGrammarVisitor ) return ((ArithmaticGrammarVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class SubContext extends ParserRuleContext {
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmaticGrammarListener ) ((ArithmaticGrammarListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmaticGrammarListener ) ((ArithmaticGrammarListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmaticGrammarVisitor ) return ((ArithmaticGrammarVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class MulContext extends ParserRuleContext {
		public MulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmaticGrammarListener ) ((ArithmaticGrammarListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmaticGrammarListener ) ((ArithmaticGrammarListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmaticGrammarVisitor ) return ((ArithmaticGrammarVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulContext mul() throws RecognitionException {
		MulContext _localctx = new MulContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class DivContext extends ParserRuleContext {
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmaticGrammarListener ) ((ArithmaticGrammarListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmaticGrammarListener ) ((ArithmaticGrammarListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmaticGrammarVisitor ) return ((ArithmaticGrammarVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16A\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\6\2"+
		"\27\n\2\r\2\16\2\30\3\2\3\2\6\2\35\n\2\r\2\16\2\36\3\2\3\2\7\2#\n\2\f"+
		"\2\16\2&\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\6\4\61\n\4\r\4\16\4"+
		"\62\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\2\2\13\2\4\6\b"+
		"\n\f\16\20\22\2\6\3\2\5\6\3\2\7\b\3\2\t\n\3\2\13\f>\2\24\3\2\2\2\4-\3"+
		"\2\2\2\6\60\3\2\2\2\b\64\3\2\2\2\n\66\3\2\2\2\f8\3\2\2\2\16:\3\2\2\2\20"+
		"<\3\2\2\2\22>\3\2\2\2\24\26\5\4\3\2\25\27\5\b\5\2\26\25\3\2\2\2\27\30"+
		"\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\32\3\2\2\2\32\34\5\6\4\2\33\35"+
		"\5\b\5\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37 \3"+
		"\2\2\2 $\5\6\4\2!#\5\b\5\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%"+
		"\'\3\2\2\2&$\3\2\2\2\'(\5\n\6\2(\3\3\2\2\2).\5\f\7\2*.\5\16\b\2+.\5\22"+
		"\n\2,.\5\20\t\2-)\3\2\2\2-*\3\2\2\2-+\3\2\2\2-,\3\2\2\2.\5\3\2\2\2/\61"+
		"\7\r\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\7\3"+
		"\2\2\2\64\65\7\3\2\2\65\t\3\2\2\2\66\67\7\4\2\2\67\13\3\2\2\289\t\2\2"+
		"\29\r\3\2\2\2:;\t\3\2\2;\17\3\2\2\2<=\t\4\2\2=\21\3\2\2\2>?\t\5\2\2?\23"+
		"\3\2\2\2\7\30\36$-\62";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from Rule.g4 by ANTLR 4.4
package com.fmr.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RuleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, THEN=2, TEXT=3, OPERATOR=4, WHITESPACE=5, COLON=6, CURLY_OPEN=7, 
		CURLY_CLOSE=8;
	public static final String[] tokenNames = {
		"<INVALID>", "'IF'", "'THEN'", "TEXT", "'=='", "WHITESPACE", "COLON", 
		"CURLY_OPEN", "CURLY_CLOSE"
	};
	public static final int
		RULE_ruleSentence = 0, RULE_condition = 1, RULE_subcondition = 2, RULE_value = 3, 
		RULE_result = 4;
	public static final String[] ruleNames = {
		"ruleSentence", "condition", "subcondition", "value", "result"
	};

	@Override
	public String getGrammarFileName() { return "Rule.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RuleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RuleSentenceContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(RuleParser.IF, 0); }
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public TerminalNode THEN() { return getToken(RuleParser.THEN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public RuleSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterRuleSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitRuleSentence(this);
		}
	}

	public final RuleSentenceContext ruleSentence() throws RecognitionException {
		RuleSentenceContext _localctx = new RuleSentenceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ruleSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10); match(IF);
			setState(11); condition();
			setState(12); match(THEN);
			setState(13); result();
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

	public static class ConditionContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode OPERATOR() { return getToken(RuleParser.OPERATOR, 0); }
		public SubconditionContext subcondition() {
			return getRuleContext(SubconditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); subcondition();
			setState(16); match(OPERATOR);
			setState(17); value();
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

	public static class SubconditionContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(RuleParser.TEXT, 0); }
		public SubconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subcondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterSubcondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitSubcondition(this);
		}
	}

	public final SubconditionContext subcondition() throws RecognitionException {
		SubconditionContext _localctx = new SubconditionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_subcondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); match(TEXT);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(RuleParser.TEXT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); match(TEXT);
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

	public static class ResultContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(RuleParser.TEXT, 0); }
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); match(TEXT);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\n\34\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2\26\2\f\3\2\2\2\4\21\3\2\2\2"+
		"\6\25\3\2\2\2\b\27\3\2\2\2\n\31\3\2\2\2\f\r\7\3\2\2\r\16\5\4\3\2\16\17"+
		"\7\4\2\2\17\20\5\n\6\2\20\3\3\2\2\2\21\22\5\6\4\2\22\23\7\6\2\2\23\24"+
		"\5\b\5\2\24\5\3\2\2\2\25\26\7\5\2\2\26\7\3\2\2\2\27\30\7\5\2\2\30\t\3"+
		"\2\2\2\31\32\7\5\2\2\32\13\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
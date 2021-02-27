// Generated from HelloWord.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloWordParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, TEXT=3;
	public static final String[] tokenNames = {
		"<INVALID>", "' '", "'!'", "TEXT"
	};
	public static final int
		RULE_expression = 0, RULE_entry = 1, RULE_salutation = 2, RULE_ender = 3;
	public static final String[] ruleNames = {
		"expression", "entry", "salutation", "ender"
	};

	@Override
	public String getGrammarFileName() { return "HelloWord.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloWordParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpressionContext extends ParserRuleContext {
		public EntryContext entry(int i) {
			return getRuleContext(EntryContext.class,i);
		}
		public List<EntryContext> entry() {
			return getRuleContexts(EntryContext.class);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloWordListener ) ((HelloWordListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloWordListener ) ((HelloWordListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8); entry();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 || _la==TEXT );
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

	public static class EntryContext extends ParserRuleContext {
		public EnderContext ender() {
			return getRuleContext(EnderContext.class,0);
		}
		public SalutationContext salutation() {
			return getRuleContext(SalutationContext.class,0);
		}
		public EntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloWordListener ) ((HelloWordListener)listener).enterEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloWordListener ) ((HelloWordListener)listener).exitEntry(this);
		}
	}

	public final EntryContext entry() throws RecognitionException {
		EntryContext _localctx = new EntryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); salutation();
			setState(14); match(T__1);
			setState(15); ender();
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

	public static class SalutationContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(HelloWordParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(HelloWordParser.TEXT, i);
		}
		public SalutationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_salutation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloWordListener ) ((HelloWordListener)listener).enterSalutation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloWordListener ) ((HelloWordListener)listener).exitSalutation(this);
		}
	}

	public final SalutationContext salutation() throws RecognitionException {
		SalutationContext _localctx = new SalutationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_salutation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(18); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(17);
					_la = _input.LA(1);
					if ( !(_la==T__1 || _la==TEXT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(20); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class EnderContext extends ParserRuleContext {
		public EnderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ender; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloWordListener ) ((HelloWordListener)listener).enterEnder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloWordListener ) ((HelloWordListener)listener).exitEnder(this);
		}
	}

	public final EnderContext ender() throws RecognitionException {
		EnderContext _localctx = new EnderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ender);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); match(T__0);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\5\33\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\6\2\f\n\2\r\2\16\2\r\3\3\3\3\3\3\3\3\3\4\6\4"+
		"\25\n\4\r\4\16\4\26\3\5\3\5\3\5\2\2\6\2\4\6\b\2\3\4\2\3\3\5\5\30\2\13"+
		"\3\2\2\2\4\17\3\2\2\2\6\24\3\2\2\2\b\30\3\2\2\2\n\f\5\4\3\2\13\n\3\2\2"+
		"\2\f\r\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\3\3\2\2\2\17\20\5\6\4\2\20"+
		"\21\7\3\2\2\21\22\5\b\5\2\22\5\3\2\2\2\23\25\t\2\2\2\24\23\3\2\2\2\25"+
		"\26\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\7\3\2\2\2\30\31\7\4\2\2\31"+
		"\t\3\2\2\2\4\r\26";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from Rule.g4 by ANTLR 4.4
package com.fmr.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RuleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, THEN=2, TEXT=3, OPERATOR=4, WHITESPACE=5, COLON=6, CURLY_OPEN=7, 
		CURLY_CLOSE=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'"
	};
	public static final String[] ruleNames = {
		"IF", "THEN", "TEXT", "OPERATOR", "WHITESPACE", "COLON", "CURLY_OPEN", 
		"CURLY_CLOSE"
	};


	public RuleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Rule.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\n?\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\6\4\35\n\4\r\4\16\4\36\3\5\3\5\3\5\3\6\6\6%\n\6\r"+
		"\6\16\6&\3\6\3\6\3\7\6\7,\n\7\r\7\16\7-\3\7\3\7\3\b\6\b\63\n\b\r\b\16"+
		"\b\64\3\b\3\b\3\t\6\t:\n\t\r\t\16\t;\3\t\3\t\2\2\n\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\3\2\3\5\2\13\f\16\17\"\"C\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\3\23\3\2\2\2\5\26\3\2\2\2\7\34\3\2\2\2\t \3\2\2\2\13$\3\2\2\2\r+\3"+
		"\2\2\2\17\62\3\2\2\2\219\3\2\2\2\23\24\7K\2\2\24\25\7H\2\2\25\4\3\2\2"+
		"\2\26\27\7V\2\2\27\30\7J\2\2\30\31\7G\2\2\31\32\7P\2\2\32\6\3\2\2\2\33"+
		"\35\4C\\\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37"+
		"\b\3\2\2\2 !\7?\2\2!\"\7?\2\2\"\n\3\2\2\2#%\t\2\2\2$#\3\2\2\2%&\3\2\2"+
		"\2&$\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2()\b\6\2\2)\f\3\2\2\2*,\7<\2\2+*\3\2"+
		"\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60\b\7\2\2\60\16\3\2\2\2"+
		"\61\63\7}\2\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2"+
		"\65\66\3\2\2\2\66\67\b\b\2\2\67\20\3\2\2\28:\7\177\2\298\3\2\2\2:;\3\2"+
		"\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\b\t\2\2>\22\3\2\2\2\b\2\36&-\64;"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
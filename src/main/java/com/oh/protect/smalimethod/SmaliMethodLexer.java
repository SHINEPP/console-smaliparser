// Generated from /Users/zhouzhenliang/source/shine/console-smaliparser/src/main/antlr4/SmaliMethodLexer.g4 by ANTLR 4.13.1
package com.oh.protect.smalimethod;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SmaliMethodLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		METHOD_BLOCK_START=1, WS=2, METHOD_BLOCK_END=3, METHOD_BLOCK_LINE=4;
	public static final int
		METHOD_INSIDE=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "METHOD_INSIDE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"METHOD", "METHOD_END", "METHOD_BLOCK_START", "WS", "METHOD_BLOCK_END", 
			"METHOD_BLOCK_LINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "METHOD_BLOCK_START", "WS", "METHOD_BLOCK_END", "METHOD_BLOCK_LINE"
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


	public SmaliMethodLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SmaliMethodLexer.g4"; }

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

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return METHOD_BLOCK_LINE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean METHOD_BLOCK_LINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  !getText().startsWith(".end method") ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0004:\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000\u0007"+
		"\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007"+
		"\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0004"+
		"\u0003(\b\u0003\u000b\u0003\f\u0003)\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0005\u00053\b\u0005"+
		"\n\u0005\f\u00056\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0000\u0000"+
		"\u0006\u0002\u0000\u0004\u0000\u0006\u0001\b\u0002\n\u0003\f\u0004\u0002"+
		"\u0000\u0001\u0002\u0003\u0000\t\n\r\r  \u0001\u0000\n\n8\u0000\u0006"+
		"\u0001\u0000\u0000\u0000\u0000\b\u0001\u0000\u0000\u0000\u0001\n\u0001"+
		"\u0000\u0000\u0000\u0001\f\u0001\u0000\u0000\u0000\u0002\u000e\u0001\u0000"+
		"\u0000\u0000\u0004\u0016\u0001\u0000\u0000\u0000\u0006\"\u0001\u0000\u0000"+
		"\u0000\b\'\u0001\u0000\u0000\u0000\n-\u0001\u0000\u0000\u0000\f4\u0001"+
		"\u0000\u0000\u0000\u000e\u000f\u0005.\u0000\u0000\u000f\u0010\u0005m\u0000"+
		"\u0000\u0010\u0011\u0005e\u0000\u0000\u0011\u0012\u0005t\u0000\u0000\u0012"+
		"\u0013\u0005h\u0000\u0000\u0013\u0014\u0005o\u0000\u0000\u0014\u0015\u0005"+
		"d\u0000\u0000\u0015\u0003\u0001\u0000\u0000\u0000\u0016\u0017\u0005.\u0000"+
		"\u0000\u0017\u0018\u0005e\u0000\u0000\u0018\u0019\u0005n\u0000\u0000\u0019"+
		"\u001a\u0005d\u0000\u0000\u001a\u001b\u0005 \u0000\u0000\u001b\u001c\u0005"+
		"m\u0000\u0000\u001c\u001d\u0005e\u0000\u0000\u001d\u001e\u0005t\u0000"+
		"\u0000\u001e\u001f\u0005h\u0000\u0000\u001f \u0005o\u0000\u0000 !\u0005"+
		"d\u0000\u0000!\u0005\u0001\u0000\u0000\u0000\"#\u0003\u0002\u0000\u0000"+
		"#$\u0001\u0000\u0000\u0000$%\u0006\u0002\u0000\u0000%\u0007\u0001\u0000"+
		"\u0000\u0000&(\u0007\u0000\u0000\u0000\'&\u0001\u0000\u0000\u0000()\u0001"+
		"\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000"+
		"*+\u0001\u0000\u0000\u0000+,\u0006\u0003\u0001\u0000,\t\u0001\u0000\u0000"+
		"\u0000-.\u0003\u0004\u0001\u0000./\u0001\u0000\u0000\u0000/0\u0006\u0004"+
		"\u0002\u00000\u000b\u0001\u0000\u0000\u000013\b\u0001\u0000\u000021\u0001"+
		"\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u0000"+
		"45\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u000064\u0001\u0000\u0000"+
		"\u000078\u0004\u0005\u0000\u000089\u0007\u0001\u0000\u00009\r\u0001\u0000"+
		"\u0000\u0000\u0004\u0000\u0001)4\u0003\u0005\u0001\u0000\u0006\u0000\u0000"+
		"\u0004\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
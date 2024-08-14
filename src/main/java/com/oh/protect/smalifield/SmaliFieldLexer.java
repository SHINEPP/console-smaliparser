// Generated from /Users/zhouzhenliang/source/shine/console-apkprotector/src/main/antlr4/SmaliFieldLexer.g4 by ANTLR 4.13.1
package com.oh.protect.smalifield;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SmaliFieldLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FIELD_BLOCK_START=1, WS=2, FIELD_BLOCK_END=3, FIELD_BLOCK_LINE=4;
	public static final int
		FIELD_INSIDE=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "FIELD_INSIDE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FIELD", "FIELD_END", "FIELD_BLOCK_START", "WS", "FIELD_BLOCK_END", "FIELD_BLOCK_LINE"
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
			null, "FIELD_BLOCK_START", "WS", "FIELD_BLOCK_END", "FIELD_BLOCK_LINE"
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


	public SmaliFieldLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SmaliFieldLexer.g4"; }

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
			return FIELD_BLOCK_LINE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean FIELD_BLOCK_LINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  !getText().startsWith(".end field") ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0000\u00048\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000\u0007"+
		"\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007"+
		"\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003&\b\u0003\u000b"+
		"\u0003\f\u0003\'\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0005\u00051\b\u0005\n\u0005\f\u00054\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0000\u0000\u0006\u0002\u0000"+
		"\u0004\u0000\u0006\u0001\b\u0002\n\u0003\f\u0004\u0002\u0000\u0001\u0002"+
		"\u0003\u0000\t\n\r\r  \u0001\u0000\n\n6\u0000\u0006\u0001\u0000\u0000"+
		"\u0000\u0000\b\u0001\u0000\u0000\u0000\u0001\n\u0001\u0000\u0000\u0000"+
		"\u0001\f\u0001\u0000\u0000\u0000\u0002\u000e\u0001\u0000\u0000\u0000\u0004"+
		"\u0015\u0001\u0000\u0000\u0000\u0006 \u0001\u0000\u0000\u0000\b%\u0001"+
		"\u0000\u0000\u0000\n+\u0001\u0000\u0000\u0000\f2\u0001\u0000\u0000\u0000"+
		"\u000e\u000f\u0005.\u0000\u0000\u000f\u0010\u0005f\u0000\u0000\u0010\u0011"+
		"\u0005i\u0000\u0000\u0011\u0012\u0005e\u0000\u0000\u0012\u0013\u0005l"+
		"\u0000\u0000\u0013\u0014\u0005d\u0000\u0000\u0014\u0003\u0001\u0000\u0000"+
		"\u0000\u0015\u0016\u0005.\u0000\u0000\u0016\u0017\u0005e\u0000\u0000\u0017"+
		"\u0018\u0005n\u0000\u0000\u0018\u0019\u0005d\u0000\u0000\u0019\u001a\u0005"+
		" \u0000\u0000\u001a\u001b\u0005f\u0000\u0000\u001b\u001c\u0005i\u0000"+
		"\u0000\u001c\u001d\u0005e\u0000\u0000\u001d\u001e\u0005l\u0000\u0000\u001e"+
		"\u001f\u0005d\u0000\u0000\u001f\u0005\u0001\u0000\u0000\u0000 !\u0003"+
		"\u0002\u0000\u0000!\"\u0001\u0000\u0000\u0000\"#\u0006\u0002\u0000\u0000"+
		"#\u0007\u0001\u0000\u0000\u0000$&\u0007\u0000\u0000\u0000%$\u0001\u0000"+
		"\u0000\u0000&\'\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'("+
		"\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)*\u0006\u0003\u0001"+
		"\u0000*\t\u0001\u0000\u0000\u0000+,\u0003\u0004\u0001\u0000,-\u0001\u0000"+
		"\u0000\u0000-.\u0006\u0004\u0002\u0000.\u000b\u0001\u0000\u0000\u0000"+
		"/1\b\u0001\u0000\u00000/\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000035\u0001\u0000\u0000"+
		"\u000042\u0001\u0000\u0000\u000056\u0004\u0005\u0000\u000067\u0007\u0001"+
		"\u0000\u00007\r\u0001\u0000\u0000\u0000\u0004\u0000\u0001\'2\u0003\u0005"+
		"\u0001\u0000\u0006\u0000\u0000\u0004\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
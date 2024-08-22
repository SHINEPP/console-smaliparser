// Generated from /Users/zhouzhenliang/source/shine/console-smaliparser/src/main/antlr4/SmaliMethodParser.g4 by ANTLR 4.13.1
package com.oh.protect.smali.smalimethod;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SmaliMethodParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		METHOD=1, PUBLIC=2, PRIVATE=3, PROTECTED=4, STATIC=5, FINAL=6, SYNCHRONIZED=7, 
		NATIVE=8, ABSTRACT=9, STRICTFP=10, SYNTHETIC=11, BRIDGE=12, VARARGS=13, 
		CONSTRUCTOR=14, METHOD_CLINIT=15, METHOD_INIT=16, LEFT_BRACKET=17, RIGHT_BRACKET=18, 
		LEFT_SQUARE=19, WS=20, ANY=21;
	public static final int
		RULE_method = 0, RULE_methodIdentifier = 1, RULE_methodName = 2, RULE_methodInSignature = 3, 
		RULE_methodOutSignature = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"method", "methodIdentifier", "methodName", "methodInSignature", "methodOutSignature"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.method'", "'public'", "'private'", "'protected'", "'static'", 
			"'final'", "'synchronized'", "'native'", "'abstract'", "'strictfp'", 
			"'synthetic'", "'bridge'", "'varargs'", "'constructor'", "'<clinit>'", 
			"'<init>'", "'('", "')'", "'['"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "METHOD", "PUBLIC", "PRIVATE", "PROTECTED", "STATIC", "FINAL", 
			"SYNCHRONIZED", "NATIVE", "ABSTRACT", "STRICTFP", "SYNTHETIC", "BRIDGE", 
			"VARARGS", "CONSTRUCTOR", "METHOD_CLINIT", "METHOD_INIT", "LEFT_BRACKET", 
			"RIGHT_BRACKET", "LEFT_SQUARE", "WS", "ANY"
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
	public String getGrammarFileName() { return "SmaliMethodParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SmaliMethodParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodContext extends ParserRuleContext {
		public TerminalNode METHOD() { return getToken(SmaliMethodParser.METHOD, 0); }
		public MethodIdentifierContext methodIdentifier() {
			return getRuleContext(MethodIdentifierContext.class,0);
		}
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(SmaliMethodParser.LEFT_BRACKET, 0); }
		public MethodInSignatureContext methodInSignature() {
			return getRuleContext(MethodInSignatureContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(SmaliMethodParser.RIGHT_BRACKET, 0); }
		public MethodOutSignatureContext methodOutSignature() {
			return getRuleContext(MethodOutSignatureContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliMethodParserListener ) ((SmaliMethodParserListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliMethodParserListener ) ((SmaliMethodParserListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliMethodParserVisitor ) return ((SmaliMethodParserVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(METHOD);
			setState(11);
			methodIdentifier();
			setState(12);
			methodName();
			setState(13);
			match(LEFT_BRACKET);
			setState(14);
			methodInSignature();
			setState(15);
			match(RIGHT_BRACKET);
			setState(16);
			methodOutSignature();
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
	public static class MethodIdentifierContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(SmaliMethodParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(SmaliMethodParser.FINAL, 0); }
		public TerminalNode NATIVE() { return getToken(SmaliMethodParser.NATIVE, 0); }
		public TerminalNode CONSTRUCTOR() { return getToken(SmaliMethodParser.CONSTRUCTOR, 0); }
		public TerminalNode PUBLIC() { return getToken(SmaliMethodParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(SmaliMethodParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(SmaliMethodParser.PROTECTED, 0); }
		public MethodIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliMethodParserListener ) ((SmaliMethodParserListener)listener).enterMethodIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliMethodParserListener ) ((SmaliMethodParserListener)listener).exitMethodIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliMethodParserVisitor ) return ((SmaliMethodParserVisitor<? extends T>)visitor).visitMethodIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodIdentifierContext methodIdentifier() throws RecognitionException {
		MethodIdentifierContext _localctx = new MethodIdentifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_methodIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(18);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(22);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(21);
				match(STATIC);
				}
				break;
			}
			setState(25);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(24);
				match(FINAL);
				}
				break;
			}
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(27);
				match(NATIVE);
				}
				break;
			}
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(30);
				match(CONSTRUCTOR);
				}
				break;
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
	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(SmaliMethodParser.CONSTRUCTOR, 0); }
		public TerminalNode METHOD_CLINIT() { return getToken(SmaliMethodParser.METHOD_CLINIT, 0); }
		public TerminalNode METHOD_INIT() { return getToken(SmaliMethodParser.METHOD_INIT, 0); }
		public List<TerminalNode> LEFT_BRACKET() { return getTokens(SmaliMethodParser.LEFT_BRACKET); }
		public TerminalNode LEFT_BRACKET(int i) {
			return getToken(SmaliMethodParser.LEFT_BRACKET, i);
		}
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliMethodParserListener ) ((SmaliMethodParserListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliMethodParserListener ) ((SmaliMethodParserListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliMethodParserVisitor ) return ((SmaliMethodParserVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_methodName);
		int _la;
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(CONSTRUCTOR);
				setState(34);
				match(METHOD_CLINIT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(CONSTRUCTOR);
				setState(36);
				match(METHOD_INIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(37);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==LEFT_BRACKET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(40); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4063230L) != 0) );
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
	public static class MethodInSignatureContext extends ParserRuleContext {
		public List<TerminalNode> RIGHT_BRACKET() { return getTokens(SmaliMethodParser.RIGHT_BRACKET); }
		public TerminalNode RIGHT_BRACKET(int i) {
			return getToken(SmaliMethodParser.RIGHT_BRACKET, i);
		}
		public MethodInSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliMethodParserListener ) ((SmaliMethodParserListener)listener).enterMethodInSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliMethodParserListener ) ((SmaliMethodParserListener)listener).exitMethodInSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliMethodParserVisitor ) return ((SmaliMethodParserVisitor<? extends T>)visitor).visitMethodInSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInSignatureContext methodInSignature() throws RecognitionException {
		MethodInSignatureContext _localctx = new MethodInSignatureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodInSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932158L) != 0)) {
				{
				{
				setState(44);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==RIGHT_BRACKET) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(49);
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
	public static class MethodOutSignatureContext extends ParserRuleContext {
		public List<TerminalNode> ANY() { return getTokens(SmaliMethodParser.ANY); }
		public TerminalNode ANY(int i) {
			return getToken(SmaliMethodParser.ANY, i);
		}
		public List<TerminalNode> LEFT_SQUARE() { return getTokens(SmaliMethodParser.LEFT_SQUARE); }
		public TerminalNode LEFT_SQUARE(int i) {
			return getToken(SmaliMethodParser.LEFT_SQUARE, i);
		}
		public MethodOutSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodOutSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliMethodParserListener ) ((SmaliMethodParserListener)listener).enterMethodOutSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliMethodParserListener ) ((SmaliMethodParserListener)listener).exitMethodOutSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliMethodParserVisitor ) return ((SmaliMethodParserVisitor<? extends T>)visitor).visitMethodOutSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodOutSignatureContext methodOutSignature() throws RecognitionException {
		MethodOutSignatureContext _localctx = new MethodOutSignatureContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodOutSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				_la = _input.LA(1);
				if ( !(_la==LEFT_SQUARE || _la==ANY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LEFT_SQUARE || _la==ANY );
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
		"\u0004\u0001\u00158\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0003\u0001\u0014\b\u0001\u0001\u0001\u0003"+
		"\u0001\u0017\b\u0001\u0001\u0001\u0003\u0001\u001a\b\u0001\u0001\u0001"+
		"\u0003\u0001\u001d\b\u0001\u0001\u0001\u0003\u0001 \b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002\'\b\u0002"+
		"\u000b\u0002\f\u0002(\u0003\u0002+\b\u0002\u0001\u0003\u0005\u0003.\b"+
		"\u0003\n\u0003\f\u00031\t\u0003\u0001\u0004\u0004\u00044\b\u0004\u000b"+
		"\u0004\f\u00045\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006"+
		"\b\u0000\u0004\u0001\u0000\u0002\u0004\u0001\u0000\u0011\u0011\u0001\u0000"+
		"\u0012\u0012\u0002\u0000\u0013\u0013\u0015\u0015<\u0000\n\u0001\u0000"+
		"\u0000\u0000\u0002\u0013\u0001\u0000\u0000\u0000\u0004*\u0001\u0000\u0000"+
		"\u0000\u0006/\u0001\u0000\u0000\u0000\b3\u0001\u0000\u0000\u0000\n\u000b"+
		"\u0005\u0001\u0000\u0000\u000b\f\u0003\u0002\u0001\u0000\f\r\u0003\u0004"+
		"\u0002\u0000\r\u000e\u0005\u0011\u0000\u0000\u000e\u000f\u0003\u0006\u0003"+
		"\u0000\u000f\u0010\u0005\u0012\u0000\u0000\u0010\u0011\u0003\b\u0004\u0000"+
		"\u0011\u0001\u0001\u0000\u0000\u0000\u0012\u0014\u0007\u0000\u0000\u0000"+
		"\u0013\u0012\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000"+
		"\u0014\u0016\u0001\u0000\u0000\u0000\u0015\u0017\u0005\u0005\u0000\u0000"+
		"\u0016\u0015\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000"+
		"\u0017\u0019\u0001\u0000\u0000\u0000\u0018\u001a\u0005\u0006\u0000\u0000"+
		"\u0019\u0018\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000"+
		"\u001a\u001c\u0001\u0000\u0000\u0000\u001b\u001d\u0005\b\u0000\u0000\u001c"+
		"\u001b\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d"+
		"\u001f\u0001\u0000\u0000\u0000\u001e \u0005\u000e\u0000\u0000\u001f\u001e"+
		"\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u0003\u0001\u0000"+
		"\u0000\u0000!\"\u0005\u000e\u0000\u0000\"+\u0005\u000f\u0000\u0000#$\u0005"+
		"\u000e\u0000\u0000$+\u0005\u0010\u0000\u0000%\'\b\u0001\u0000\u0000&%"+
		"\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000"+
		"\u0000()\u0001\u0000\u0000\u0000)+\u0001\u0000\u0000\u0000*!\u0001\u0000"+
		"\u0000\u0000*#\u0001\u0000\u0000\u0000*&\u0001\u0000\u0000\u0000+\u0005"+
		"\u0001\u0000\u0000\u0000,.\b\u0002\u0000\u0000-,\u0001\u0000\u0000\u0000"+
		".1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000"+
		"\u00000\u0007\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000024\u0007"+
		"\u0003\u0000\u000032\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u0000"+
		"53\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u00006\t\u0001\u0000\u0000"+
		"\u0000\t\u0013\u0016\u0019\u001c\u001f(*/5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
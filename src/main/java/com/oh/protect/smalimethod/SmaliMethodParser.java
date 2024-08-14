// Generated from /Users/zhouzhenliang/source/shine/console-smaliparser/src/main/antlr4/SmaliMethodParser.g4 by ANTLR 4.13.1
package com.oh.protect.smalimethod;
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
		METHOD_BLOCK_START=1, WS=2, METHOD_BLOCK_END=3, METHOD_BLOCK_LINE=4;
	public static final int
		RULE_file = 0, RULE_method = 1, RULE_methodContent = 2, RULE_methodHead = 3, 
		RULE_methodCode = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "method", "methodContent", "methodHead", "methodCode"
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
	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SmaliMethodParser.EOF, 0); }
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliMethodParserListener ) ((SmaliMethodParserListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliMethodParserListener ) ((SmaliMethodParserListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliMethodParserVisitor ) return ((SmaliMethodParserVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==METHOD_BLOCK_START) {
				{
				{
				setState(10);
				method();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
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
	public static class MethodContext extends ParserRuleContext {
		public TerminalNode METHOD_BLOCK_START() { return getToken(SmaliMethodParser.METHOD_BLOCK_START, 0); }
		public MethodContentContext methodContent() {
			return getRuleContext(MethodContentContext.class,0);
		}
		public TerminalNode METHOD_BLOCK_END() { return getToken(SmaliMethodParser.METHOD_BLOCK_END, 0); }
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
		enterRule(_localctx, 2, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(METHOD_BLOCK_START);
			setState(19);
			methodContent();
			setState(20);
			match(METHOD_BLOCK_END);
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
	public static class MethodContentContext extends ParserRuleContext {
		public MethodHeadContext methodHead() {
			return getRuleContext(MethodHeadContext.class,0);
		}
		public MethodCodeContext methodCode() {
			return getRuleContext(MethodCodeContext.class,0);
		}
		public MethodContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliMethodParserListener ) ((SmaliMethodParserListener)listener).enterMethodContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliMethodParserListener ) ((SmaliMethodParserListener)listener).exitMethodContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliMethodParserVisitor ) return ((SmaliMethodParserVisitor<? extends T>)visitor).visitMethodContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContentContext methodContent() throws RecognitionException {
		MethodContentContext _localctx = new MethodContentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_methodContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			methodHead();
			setState(23);
			methodCode();
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
	public static class MethodHeadContext extends ParserRuleContext {
		public TerminalNode METHOD_BLOCK_LINE() { return getToken(SmaliMethodParser.METHOD_BLOCK_LINE, 0); }
		public MethodHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliMethodParserListener ) ((SmaliMethodParserListener)listener).enterMethodHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliMethodParserListener ) ((SmaliMethodParserListener)listener).exitMethodHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliMethodParserVisitor ) return ((SmaliMethodParserVisitor<? extends T>)visitor).visitMethodHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodHeadContext methodHead() throws RecognitionException {
		MethodHeadContext _localctx = new MethodHeadContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(METHOD_BLOCK_LINE);
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
	public static class MethodCodeContext extends ParserRuleContext {
		public List<TerminalNode> METHOD_BLOCK_LINE() { return getTokens(SmaliMethodParser.METHOD_BLOCK_LINE); }
		public TerminalNode METHOD_BLOCK_LINE(int i) {
			return getToken(SmaliMethodParser.METHOD_BLOCK_LINE, i);
		}
		public MethodCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliMethodParserListener ) ((SmaliMethodParserListener)listener).enterMethodCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliMethodParserListener ) ((SmaliMethodParserListener)listener).exitMethodCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliMethodParserVisitor ) return ((SmaliMethodParserVisitor<? extends T>)visitor).visitMethodCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCodeContext methodCode() throws RecognitionException {
		MethodCodeContext _localctx = new MethodCodeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==METHOD_BLOCK_LINE) {
				{
				{
				setState(27);
				match(METHOD_BLOCK_LINE);
				}
				}
				setState(32);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0004\"\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0005\u0004"+
		"\u001d\b\u0004\n\u0004\f\u0004 \t\u0004\u0001\u0004\u0000\u0000\u0005"+
		"\u0000\u0002\u0004\u0006\b\u0000\u0000\u001e\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0002\u0012\u0001\u0000\u0000\u0000\u0004\u0016\u0001\u0000\u0000"+
		"\u0000\u0006\u0019\u0001\u0000\u0000\u0000\b\u001e\u0001\u0000\u0000\u0000"+
		"\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000\f\u000f\u0001"+
		"\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000"+
		"\u0000\u0000\u000e\u0010\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000"+
		"\u0000\u0010\u0011\u0005\u0000\u0000\u0001\u0011\u0001\u0001\u0000\u0000"+
		"\u0000\u0012\u0013\u0005\u0001\u0000\u0000\u0013\u0014\u0003\u0004\u0002"+
		"\u0000\u0014\u0015\u0005\u0003\u0000\u0000\u0015\u0003\u0001\u0000\u0000"+
		"\u0000\u0016\u0017\u0003\u0006\u0003\u0000\u0017\u0018\u0003\b\u0004\u0000"+
		"\u0018\u0005\u0001\u0000\u0000\u0000\u0019\u001a\u0005\u0004\u0000\u0000"+
		"\u001a\u0007\u0001\u0000\u0000\u0000\u001b\u001d\u0005\u0004\u0000\u0000"+
		"\u001c\u001b\u0001\u0000\u0000\u0000\u001d \u0001\u0000\u0000\u0000\u001e"+
		"\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f"+
		"\t\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000\u0002\r\u001e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
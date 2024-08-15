// Generated from /Users/zhouzhenliang/source/shine/console-smaliparser/src/main/antlr4/SmaliParser.g4 by ANTLR 4.13.1
package com.oh.protect.smali;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SmaliParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, CLASS_DEF=2, SUPER_DEF=3, SOURCE_DEF=4, IMPLEMENTS_DEF=5, ANNOTATION_BLOCK_START=6, 
		FIELD_BLOCK_START=7, METHOD_BLOCK_START=8, WS=9, ANNOATION_BLOCK_END=10, 
		ANNOATION_BLOCK_LINE=11, FIELD_BLOCK_END=12, FIELD_BLOCK_LINE=13, METHOD_BLOCK_END=14, 
		METHOD_BLOCK_LINE=15;
	public static final int
		RULE_file = 0, RULE_class = 1, RULE_super = 2, RULE_source = 3, RULE_implements = 4, 
		RULE_annotation = 5, RULE_field = 6, RULE_method = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "class", "super", "source", "implements", "annotation", "field", 
			"method"
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
			null, "COMMENT", "CLASS_DEF", "SUPER_DEF", "SOURCE_DEF", "IMPLEMENTS_DEF", 
			"ANNOTATION_BLOCK_START", "FIELD_BLOCK_START", "METHOD_BLOCK_START", 
			"WS", "ANNOATION_BLOCK_END", "ANNOATION_BLOCK_LINE", "FIELD_BLOCK_END", 
			"FIELD_BLOCK_LINE", "METHOD_BLOCK_END", "METHOD_BLOCK_LINE"
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
	public String getGrammarFileName() { return "SmaliParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SmaliParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public SuperContext super_() {
			return getRuleContext(SuperContext.class,0);
		}
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SmaliParser.EOF, 0); }
		public List<ImplementsContext> implements_() {
			return getRuleContexts(ImplementsContext.class);
		}
		public ImplementsContext implements_(int i) {
			return getRuleContext(ImplementsContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
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
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliParserVisitor ) return ((SmaliParserVisitor<? extends T>)visitor).visitFile(this);
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
			setState(16);
			class_();
			setState(17);
			super_();
			setState(18);
			source();
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPLEMENTS_DEF) {
				{
				{
				setState(19);
				implements_();
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANNOTATION_BLOCK_START) {
				{
				{
				setState(25);
				annotation();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FIELD_BLOCK_START) {
				{
				{
				setState(31);
				field();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==METHOD_BLOCK_START) {
				{
				{
				setState(37);
				method();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
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
	public static class ClassContext extends ParserRuleContext {
		public TerminalNode CLASS_DEF() { return getToken(SmaliParser.CLASS_DEF, 0); }
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliParserVisitor ) return ((SmaliParserVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(CLASS_DEF);
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
	public static class SuperContext extends ParserRuleContext {
		public TerminalNode SUPER_DEF() { return getToken(SmaliParser.SUPER_DEF, 0); }
		public SuperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_super; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).enterSuper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).exitSuper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliParserVisitor ) return ((SmaliParserVisitor<? extends T>)visitor).visitSuper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperContext super_() throws RecognitionException {
		SuperContext _localctx = new SuperContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_super);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(SUPER_DEF);
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
	public static class SourceContext extends ParserRuleContext {
		public TerminalNode SOURCE_DEF() { return getToken(SmaliParser.SOURCE_DEF, 0); }
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).exitSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliParserVisitor ) return ((SmaliParserVisitor<? extends T>)visitor).visitSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(SOURCE_DEF);
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
	public static class ImplementsContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS_DEF() { return getToken(SmaliParser.IMPLEMENTS_DEF, 0); }
		public ImplementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).enterImplements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).exitImplements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliParserVisitor ) return ((SmaliParserVisitor<? extends T>)visitor).visitImplements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementsContext implements_() throws RecognitionException {
		ImplementsContext _localctx = new ImplementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_implements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(IMPLEMENTS_DEF);
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
	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode ANNOTATION_BLOCK_START() { return getToken(SmaliParser.ANNOTATION_BLOCK_START, 0); }
		public TerminalNode ANNOATION_BLOCK_END() { return getToken(SmaliParser.ANNOATION_BLOCK_END, 0); }
		public List<TerminalNode> ANNOATION_BLOCK_LINE() { return getTokens(SmaliParser.ANNOATION_BLOCK_LINE); }
		public TerminalNode ANNOATION_BLOCK_LINE(int i) {
			return getToken(SmaliParser.ANNOATION_BLOCK_LINE, i);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliParserVisitor ) return ((SmaliParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(ANNOTATION_BLOCK_START);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANNOATION_BLOCK_LINE) {
				{
				{
				setState(54);
				match(ANNOATION_BLOCK_LINE);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(ANNOATION_BLOCK_END);
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
	public static class FieldContext extends ParserRuleContext {
		public TerminalNode FIELD_BLOCK_START() { return getToken(SmaliParser.FIELD_BLOCK_START, 0); }
		public TerminalNode FIELD_BLOCK_END() { return getToken(SmaliParser.FIELD_BLOCK_END, 0); }
		public List<TerminalNode> FIELD_BLOCK_LINE() { return getTokens(SmaliParser.FIELD_BLOCK_LINE); }
		public TerminalNode FIELD_BLOCK_LINE(int i) {
			return getToken(SmaliParser.FIELD_BLOCK_LINE, i);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliParserVisitor ) return ((SmaliParserVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(FIELD_BLOCK_START);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FIELD_BLOCK_LINE) {
				{
				{
				setState(63);
				match(FIELD_BLOCK_LINE);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(FIELD_BLOCK_END);
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
		public TerminalNode METHOD_BLOCK_START() { return getToken(SmaliParser.METHOD_BLOCK_START, 0); }
		public TerminalNode METHOD_BLOCK_END() { return getToken(SmaliParser.METHOD_BLOCK_END, 0); }
		public List<TerminalNode> METHOD_BLOCK_LINE() { return getTokens(SmaliParser.METHOD_BLOCK_LINE); }
		public TerminalNode METHOD_BLOCK_LINE(int i) {
			return getToken(SmaliParser.METHOD_BLOCK_LINE, i);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliParserVisitor ) return ((SmaliParserVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(METHOD_BLOCK_START);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==METHOD_BLOCK_LINE) {
				{
				{
				setState(72);
				match(METHOD_BLOCK_LINE);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
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

	public static final String _serializedATN =
		"\u0004\u0001\u000fQ\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0015\b\u0000\n"+
		"\u0000\f\u0000\u0018\t\u0000\u0001\u0000\u0005\u0000\u001b\b\u0000\n\u0000"+
		"\f\u0000\u001e\t\u0000\u0001\u0000\u0005\u0000!\b\u0000\n\u0000\f\u0000"+
		"$\t\u0000\u0001\u0000\u0005\u0000\'\b\u0000\n\u0000\f\u0000*\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005"+
		"\u00058\b\u0005\n\u0005\f\u0005;\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0005\u0006A\b\u0006\n\u0006\f\u0006D\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0005\u0007J\b\u0007\n\u0007"+
		"\f\u0007M\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0000\b\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0000\u0000O\u0000\u0010\u0001\u0000\u0000"+
		"\u0000\u0002-\u0001\u0000\u0000\u0000\u0004/\u0001\u0000\u0000\u0000\u0006"+
		"1\u0001\u0000\u0000\u0000\b3\u0001\u0000\u0000\u0000\n5\u0001\u0000\u0000"+
		"\u0000\f>\u0001\u0000\u0000\u0000\u000eG\u0001\u0000\u0000\u0000\u0010"+
		"\u0011\u0003\u0002\u0001\u0000\u0011\u0012\u0003\u0004\u0002\u0000\u0012"+
		"\u0016\u0003\u0006\u0003\u0000\u0013\u0015\u0003\b\u0004\u0000\u0014\u0013"+
		"\u0001\u0000\u0000\u0000\u0015\u0018\u0001\u0000\u0000\u0000\u0016\u0014"+
		"\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u001c"+
		"\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0019\u001b"+
		"\u0003\n\u0005\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u001e\u0001"+
		"\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001"+
		"\u0000\u0000\u0000\u001d\"\u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000"+
		"\u0000\u0000\u001f!\u0003\f\u0006\u0000 \u001f\u0001\u0000\u0000\u0000"+
		"!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000"+
		"\u0000#(\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%\'\u0003\u000e"+
		"\u0007\u0000&%\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001"+
		"\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)+\u0001\u0000\u0000\u0000"+
		"*(\u0001\u0000\u0000\u0000+,\u0005\u0000\u0000\u0001,\u0001\u0001\u0000"+
		"\u0000\u0000-.\u0005\u0002\u0000\u0000.\u0003\u0001\u0000\u0000\u0000"+
		"/0\u0005\u0003\u0000\u00000\u0005\u0001\u0000\u0000\u000012\u0005\u0004"+
		"\u0000\u00002\u0007\u0001\u0000\u0000\u000034\u0005\u0005\u0000\u0000"+
		"4\t\u0001\u0000\u0000\u000059\u0005\u0006\u0000\u000068\u0005\u000b\u0000"+
		"\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000;9\u0001"+
		"\u0000\u0000\u0000<=\u0005\n\u0000\u0000=\u000b\u0001\u0000\u0000\u0000"+
		">B\u0005\u0007\u0000\u0000?A\u0005\r\u0000\u0000@?\u0001\u0000\u0000\u0000"+
		"AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CE\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EF\u0005\f\u0000"+
		"\u0000F\r\u0001\u0000\u0000\u0000GK\u0005\b\u0000\u0000HJ\u0005\u000f"+
		"\u0000\u0000IH\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000NO\u0005\u000e\u0000\u0000O\u000f\u0001\u0000"+
		"\u0000\u0000\u0007\u0016\u001c\"(9BK";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
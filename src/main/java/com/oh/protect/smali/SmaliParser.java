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
		COMMENT_LINE=1, CLASS_DEF=2, SUPER_DEF=3, SOURCE_DEF=4, IMPLEMENTS_DEF=5, 
		ANNOTATION_BLOCK=6, FIELD_DEF=7, FIELD_BLOCK_START=8, METHOD_BLOCK_START=9, 
		WS=10, FIELD_BLOCK_END=11, FIELD_BLOCK_LINE=12, METHOD_BLOCK_END=13, METHOD_BLOCK_LINE=14;
	public static final int
		RULE_file = 0, RULE_class = 1, RULE_super = 2, RULE_source = 3, RULE_implements = 4, 
		RULE_annotation = 5, RULE_field = 6, RULE_fieldBlockStart = 7, RULE_fieldDef = 8, 
		RULE_method = 9, RULE_methodContent = 10, RULE_methodHead = 11, RULE_methodCode = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "class", "super", "source", "implements", "annotation", "field", 
			"fieldBlockStart", "fieldDef", "method", "methodContent", "methodHead", 
			"methodCode"
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
			null, "COMMENT_LINE", "CLASS_DEF", "SUPER_DEF", "SOURCE_DEF", "IMPLEMENTS_DEF", 
			"ANNOTATION_BLOCK", "FIELD_DEF", "FIELD_BLOCK_START", "METHOD_BLOCK_START", 
			"WS", "FIELD_BLOCK_END", "FIELD_BLOCK_LINE", "METHOD_BLOCK_END", "METHOD_BLOCK_LINE"
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
			setState(26);
			class_();
			setState(27);
			super_();
			setState(28);
			source();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPLEMENTS_DEF) {
				{
				{
				setState(29);
				implements_();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANNOTATION_BLOCK) {
				{
				{
				setState(35);
				annotation();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FIELD_DEF || _la==FIELD_BLOCK_START) {
				{
				{
				setState(41);
				field();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==METHOD_BLOCK_START) {
				{
				{
				setState(47);
				method();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
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
			setState(55);
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
			setState(57);
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
			setState(59);
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
			setState(61);
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
		public TerminalNode ANNOTATION_BLOCK() { return getToken(SmaliParser.ANNOTATION_BLOCK, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(ANNOTATION_BLOCK);
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
		public FieldBlockStartContext fieldBlockStart() {
			return getRuleContext(FieldBlockStartContext.class,0);
		}
		public TerminalNode FIELD_BLOCK_END() { return getToken(SmaliParser.FIELD_BLOCK_END, 0); }
		public List<TerminalNode> FIELD_BLOCK_LINE() { return getTokens(SmaliParser.FIELD_BLOCK_LINE); }
		public TerminalNode FIELD_BLOCK_LINE(int i) {
			return getToken(SmaliParser.FIELD_BLOCK_LINE, i);
		}
		public FieldDefContext fieldDef() {
			return getRuleContext(FieldDefContext.class,0);
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
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIELD_BLOCK_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				fieldBlockStart();
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FIELD_BLOCK_LINE) {
					{
					{
					setState(66);
					match(FIELD_BLOCK_LINE);
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72);
				match(FIELD_BLOCK_END);
				}
				break;
			case FIELD_DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				fieldDef();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FieldBlockStartContext extends ParserRuleContext {
		public TerminalNode FIELD_BLOCK_START() { return getToken(SmaliParser.FIELD_BLOCK_START, 0); }
		public FieldBlockStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldBlockStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).enterFieldBlockStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).exitFieldBlockStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliParserVisitor ) return ((SmaliParserVisitor<? extends T>)visitor).visitFieldBlockStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldBlockStartContext fieldBlockStart() throws RecognitionException {
		FieldBlockStartContext _localctx = new FieldBlockStartContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fieldBlockStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(FIELD_BLOCK_START);
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
	public static class FieldDefContext extends ParserRuleContext {
		public TerminalNode FIELD_DEF() { return getToken(SmaliParser.FIELD_DEF, 0); }
		public FieldDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).enterFieldDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).exitFieldDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliParserVisitor ) return ((SmaliParserVisitor<? extends T>)visitor).visitFieldDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDefContext fieldDef() throws RecognitionException {
		FieldDefContext _localctx = new FieldDefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fieldDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(FIELD_DEF);
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
		public MethodContentContext methodContent() {
			return getRuleContext(MethodContentContext.class,0);
		}
		public TerminalNode METHOD_BLOCK_END() { return getToken(SmaliParser.METHOD_BLOCK_END, 0); }
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
		enterRule(_localctx, 18, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(METHOD_BLOCK_START);
			setState(82);
			methodContent();
			setState(83);
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
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).enterMethodContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).exitMethodContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliParserVisitor ) return ((SmaliParserVisitor<? extends T>)visitor).visitMethodContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContentContext methodContent() throws RecognitionException {
		MethodContentContext _localctx = new MethodContentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_methodContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			methodHead();
			setState(86);
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
		public TerminalNode METHOD_BLOCK_LINE() { return getToken(SmaliParser.METHOD_BLOCK_LINE, 0); }
		public MethodHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).enterMethodHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).exitMethodHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliParserVisitor ) return ((SmaliParserVisitor<? extends T>)visitor).visitMethodHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodHeadContext methodHead() throws RecognitionException {
		MethodHeadContext _localctx = new MethodHeadContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methodHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
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
		public List<TerminalNode> METHOD_BLOCK_LINE() { return getTokens(SmaliParser.METHOD_BLOCK_LINE); }
		public TerminalNode METHOD_BLOCK_LINE(int i) {
			return getToken(SmaliParser.METHOD_BLOCK_LINE, i);
		}
		public MethodCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).enterMethodCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).exitMethodCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliParserVisitor ) return ((SmaliParserVisitor<? extends T>)visitor).visitMethodCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCodeContext methodCode() throws RecognitionException {
		MethodCodeContext _localctx = new MethodCodeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_methodCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==METHOD_BLOCK_LINE) {
				{
				{
				setState(90);
				match(METHOD_BLOCK_LINE);
				}
				}
				setState(95);
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
		"\u0004\u0001\u000ea\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u001f\b\u0000\n\u0000\f\u0000\"\t\u0000\u0001\u0000\u0005\u0000%\b\u0000"+
		"\n\u0000\f\u0000(\t\u0000\u0001\u0000\u0005\u0000+\b\u0000\n\u0000\f\u0000"+
		".\t\u0000\u0001\u0000\u0005\u00001\b\u0000\n\u0000\f\u00004\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0005\u0006D\b\u0006\n\u0006\f\u0006G\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006L\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0005\f\\\b\f\n\f\f\f_\t\f\u0001"+
		"\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u0000\u0000Z\u0000\u001a\u0001\u0000\u0000\u0000\u00027\u0001"+
		"\u0000\u0000\u0000\u00049\u0001\u0000\u0000\u0000\u0006;\u0001\u0000\u0000"+
		"\u0000\b=\u0001\u0000\u0000\u0000\n?\u0001\u0000\u0000\u0000\fK\u0001"+
		"\u0000\u0000\u0000\u000eM\u0001\u0000\u0000\u0000\u0010O\u0001\u0000\u0000"+
		"\u0000\u0012Q\u0001\u0000\u0000\u0000\u0014U\u0001\u0000\u0000\u0000\u0016"+
		"X\u0001\u0000\u0000\u0000\u0018]\u0001\u0000\u0000\u0000\u001a\u001b\u0003"+
		"\u0002\u0001\u0000\u001b\u001c\u0003\u0004\u0002\u0000\u001c \u0003\u0006"+
		"\u0003\u0000\u001d\u001f\u0003\b\u0004\u0000\u001e\u001d\u0001\u0000\u0000"+
		"\u0000\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000"+
		" !\u0001\u0000\u0000\u0000!&\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000"+
		"\u0000#%\u0003\n\u0005\u0000$#\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000"+
		"\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\',\u0001\u0000"+
		"\u0000\u0000(&\u0001\u0000\u0000\u0000)+\u0003\f\u0006\u0000*)\u0001\u0000"+
		"\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001"+
		"\u0000\u0000\u0000-2\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000"+
		"/1\u0003\u0012\t\u00000/\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000035\u0001\u0000\u0000"+
		"\u000042\u0001\u0000\u0000\u000056\u0005\u0000\u0000\u00016\u0001\u0001"+
		"\u0000\u0000\u000078\u0005\u0002\u0000\u00008\u0003\u0001\u0000\u0000"+
		"\u00009:\u0005\u0003\u0000\u0000:\u0005\u0001\u0000\u0000\u0000;<\u0005"+
		"\u0004\u0000\u0000<\u0007\u0001\u0000\u0000\u0000=>\u0005\u0005\u0000"+
		"\u0000>\t\u0001\u0000\u0000\u0000?@\u0005\u0006\u0000\u0000@\u000b\u0001"+
		"\u0000\u0000\u0000AE\u0003\u000e\u0007\u0000BD\u0005\f\u0000\u0000CB\u0001"+
		"\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000HI\u0005\u000b\u0000\u0000IL\u0001\u0000\u0000\u0000JL\u0003\u0010"+
		"\b\u0000KA\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000L\r\u0001"+
		"\u0000\u0000\u0000MN\u0005\b\u0000\u0000N\u000f\u0001\u0000\u0000\u0000"+
		"OP\u0005\u0007\u0000\u0000P\u0011\u0001\u0000\u0000\u0000QR\u0005\t\u0000"+
		"\u0000RS\u0003\u0014\n\u0000ST\u0005\r\u0000\u0000T\u0013\u0001\u0000"+
		"\u0000\u0000UV\u0003\u0016\u000b\u0000VW\u0003\u0018\f\u0000W\u0015\u0001"+
		"\u0000\u0000\u0000XY\u0005\u000e\u0000\u0000Y\u0017\u0001\u0000\u0000"+
		"\u0000Z\\\u0005\u000e\u0000\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000"+
		"\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\u0019"+
		"\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000\u0007 &,2EK]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
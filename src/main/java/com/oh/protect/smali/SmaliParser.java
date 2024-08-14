// Generated from /Users/zhenliangzhou/source/shine/console-smaliparser/src/main/antlr4/SmaliParser.g4 by ANTLR 4.13.1
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
		COMMENT_LINE=1, CLASS=2, SUPER=3, SOURCE=4, IMPLEMENTS=5, ANNOTATION_BLOCK=6, 
		FIELD_BLOCK_START=7, FIELD_DEF=8, METHOD_BLOCK_START=9, PUBLIC=10, PRIVATE=11, 
		PROTECTED=12, STATIC=13, FINAL=14, SIGN_OBJECT=15, WS=16, FIELD_BLOCK_END=17, 
		FIELD_BLOCK_LINE=18, METHOD_BLOCK_END=19, METHOD_BLOCK_LINE=20;
	public static final int
		RULE_file = 0, RULE_class = 1, RULE_classAccessModify = 2, RULE_classSignature = 3, 
		RULE_super = 4, RULE_superSignature = 5, RULE_source = 6, RULE_implements = 7, 
		RULE_implementsSignature = 8, RULE_annotation = 9, RULE_field = 10, RULE_fieldBlockStart = 11, 
		RULE_fieldDef = 12, RULE_method = 13, RULE_methodContent = 14, RULE_methodHead = 15, 
		RULE_methodCode = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "class", "classAccessModify", "classSignature", "super", "superSignature", 
			"source", "implements", "implementsSignature", "annotation", "field", 
			"fieldBlockStart", "fieldDef", "method", "methodContent", "methodHead", 
			"methodCode"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'.class'", "'.super'", null, "'.implements'", null, null, 
			null, null, "'public'", "'private'", "'protected'", "'static'", "'final'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT_LINE", "CLASS", "SUPER", "SOURCE", "IMPLEMENTS", "ANNOTATION_BLOCK", 
			"FIELD_BLOCK_START", "FIELD_DEF", "METHOD_BLOCK_START", "PUBLIC", "PRIVATE", 
			"PROTECTED", "STATIC", "FINAL", "SIGN_OBJECT", "WS", "FIELD_BLOCK_END", 
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
			setState(34);
			class_();
			setState(35);
			super_();
			setState(36);
			source();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPLEMENTS) {
				{
				{
				setState(37);
				implements_();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANNOTATION_BLOCK) {
				{
				{
				setState(43);
				annotation();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FIELD_BLOCK_START || _la==FIELD_DEF) {
				{
				{
				setState(49);
				field();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==METHOD_BLOCK_START) {
				{
				{
				setState(55);
				method();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
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
		public TerminalNode CLASS() { return getToken(SmaliParser.CLASS, 0); }
		public ClassAccessModifyContext classAccessModify() {
			return getRuleContext(ClassAccessModifyContext.class,0);
		}
		public ClassSignatureContext classSignature() {
			return getRuleContext(ClassSignatureContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(SmaliParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(SmaliParser.FINAL, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(CLASS);
			setState(64);
			classAccessModify();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(65);
				match(STATIC);
				}
			}

			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(68);
				match(FINAL);
				}
			}

			setState(71);
			classSignature();
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
	public static class ClassAccessModifyContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(SmaliParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(SmaliParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(SmaliParser.PROTECTED, 0); }
		public ClassAccessModifyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classAccessModify; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).enterClassAccessModify(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).exitClassAccessModify(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliParserVisitor ) return ((SmaliParserVisitor<? extends T>)visitor).visitClassAccessModify(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassAccessModifyContext classAccessModify() throws RecognitionException {
		ClassAccessModifyContext _localctx = new ClassAccessModifyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classAccessModify);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassSignatureContext extends ParserRuleContext {
		public TerminalNode SIGN_OBJECT() { return getToken(SmaliParser.SIGN_OBJECT, 0); }
		public ClassSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).enterClassSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).exitClassSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliParserVisitor ) return ((SmaliParserVisitor<? extends T>)visitor).visitClassSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassSignatureContext classSignature() throws RecognitionException {
		ClassSignatureContext _localctx = new ClassSignatureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classSignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(SIGN_OBJECT);
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
		public TerminalNode SUPER() { return getToken(SmaliParser.SUPER, 0); }
		public SuperSignatureContext superSignature() {
			return getRuleContext(SuperSignatureContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_super);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(SUPER);
			setState(78);
			superSignature();
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
	public static class SuperSignatureContext extends ParserRuleContext {
		public TerminalNode SIGN_OBJECT() { return getToken(SmaliParser.SIGN_OBJECT, 0); }
		public SuperSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).enterSuperSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).exitSuperSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliParserVisitor ) return ((SmaliParserVisitor<? extends T>)visitor).visitSuperSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperSignatureContext superSignature() throws RecognitionException {
		SuperSignatureContext _localctx = new SuperSignatureContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_superSignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(SIGN_OBJECT);
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
		public TerminalNode SOURCE() { return getToken(SmaliParser.SOURCE, 0); }
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
		enterRule(_localctx, 12, RULE_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(SOURCE);
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
		public TerminalNode IMPLEMENTS() { return getToken(SmaliParser.IMPLEMENTS, 0); }
		public ImplementsSignatureContext implementsSignature() {
			return getRuleContext(ImplementsSignatureContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_implements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(IMPLEMENTS);
			setState(85);
			implementsSignature();
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
	public static class ImplementsSignatureContext extends ParserRuleContext {
		public TerminalNode SIGN_OBJECT() { return getToken(SmaliParser.SIGN_OBJECT, 0); }
		public ImplementsSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementsSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).enterImplementsSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmaliParserListener ) ((SmaliParserListener)listener).exitImplementsSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmaliParserVisitor ) return ((SmaliParserVisitor<? extends T>)visitor).visitImplementsSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementsSignatureContext implementsSignature() throws RecognitionException {
		ImplementsSignatureContext _localctx = new ImplementsSignatureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_implementsSignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(SIGN_OBJECT);
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
		enterRule(_localctx, 18, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
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
		enterRule(_localctx, 20, RULE_field);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIELD_BLOCK_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				fieldBlockStart();
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FIELD_BLOCK_LINE) {
					{
					{
					setState(92);
					match(FIELD_BLOCK_LINE);
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(98);
				match(FIELD_BLOCK_END);
				}
				break;
			case FIELD_DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
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
		enterRule(_localctx, 22, RULE_fieldBlockStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
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
		enterRule(_localctx, 24, RULE_fieldDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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
		enterRule(_localctx, 26, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(METHOD_BLOCK_START);
			setState(108);
			methodContent();
			setState(109);
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
		enterRule(_localctx, 28, RULE_methodContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			methodHead();
			setState(112);
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
		enterRule(_localctx, 30, RULE_methodHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
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
		enterRule(_localctx, 32, RULE_methodCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==METHOD_BLOCK_LINE) {
				{
				{
				setState(116);
				match(METHOD_BLOCK_LINE);
				}
				}
				setState(121);
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
		"\u0004\u0001\u0014{\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\'\b\u0000\n\u0000\f\u0000*\t\u0000\u0001\u0000\u0005\u0000"+
		"-\b\u0000\n\u0000\f\u00000\t\u0000\u0001\u0000\u0005\u00003\b\u0000\n"+
		"\u0000\f\u00006\t\u0000\u0001\u0000\u0005\u00009\b\u0000\n\u0000\f\u0000"+
		"<\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001C\b\u0001\u0001\u0001\u0003\u0001F\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0005\n^\b\n\n\n\f\na\t\n\u0001\n\u0001\n\u0001\n\u0003\nf\b"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0005\u0010v\b\u0010\n\u0010\f\u0010y\t\u0010\u0001\u0010\u0000\u0000"+
		"\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \u0000\u0001\u0001\u0000\n\fr\u0000\"\u0001\u0000\u0000"+
		"\u0000\u0002?\u0001\u0000\u0000\u0000\u0004I\u0001\u0000\u0000\u0000\u0006"+
		"K\u0001\u0000\u0000\u0000\bM\u0001\u0000\u0000\u0000\nP\u0001\u0000\u0000"+
		"\u0000\fR\u0001\u0000\u0000\u0000\u000eT\u0001\u0000\u0000\u0000\u0010"+
		"W\u0001\u0000\u0000\u0000\u0012Y\u0001\u0000\u0000\u0000\u0014e\u0001"+
		"\u0000\u0000\u0000\u0016g\u0001\u0000\u0000\u0000\u0018i\u0001\u0000\u0000"+
		"\u0000\u001ak\u0001\u0000\u0000\u0000\u001co\u0001\u0000\u0000\u0000\u001e"+
		"r\u0001\u0000\u0000\u0000 w\u0001\u0000\u0000\u0000\"#\u0003\u0002\u0001"+
		"\u0000#$\u0003\b\u0004\u0000$(\u0003\f\u0006\u0000%\'\u0003\u000e\u0007"+
		"\u0000&%\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000"+
		"\u0000\u0000()\u0001\u0000\u0000\u0000).\u0001\u0000\u0000\u0000*(\u0001"+
		"\u0000\u0000\u0000+-\u0003\u0012\t\u0000,+\u0001\u0000\u0000\u0000-0\u0001"+
		"\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000"+
		"/4\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000013\u0003\u0014\n\u0000"+
		"21\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001\u0000\u0000"+
		"\u000045\u0001\u0000\u0000\u00005:\u0001\u0000\u0000\u000064\u0001\u0000"+
		"\u0000\u000079\u0003\u001a\r\u000087\u0001\u0000\u0000\u00009<\u0001\u0000"+
		"\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;=\u0001"+
		"\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=>\u0005\u0000\u0000\u0001"+
		">\u0001\u0001\u0000\u0000\u0000?@\u0005\u0002\u0000\u0000@B\u0003\u0004"+
		"\u0002\u0000AC\u0005\r\u0000\u0000BA\u0001\u0000\u0000\u0000BC\u0001\u0000"+
		"\u0000\u0000CE\u0001\u0000\u0000\u0000DF\u0005\u000e\u0000\u0000ED\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000"+
		"GH\u0003\u0006\u0003\u0000H\u0003\u0001\u0000\u0000\u0000IJ\u0007\u0000"+
		"\u0000\u0000J\u0005\u0001\u0000\u0000\u0000KL\u0005\u000f\u0000\u0000"+
		"L\u0007\u0001\u0000\u0000\u0000MN\u0005\u0003\u0000\u0000NO\u0003\n\u0005"+
		"\u0000O\t\u0001\u0000\u0000\u0000PQ\u0005\u000f\u0000\u0000Q\u000b\u0001"+
		"\u0000\u0000\u0000RS\u0005\u0004\u0000\u0000S\r\u0001\u0000\u0000\u0000"+
		"TU\u0005\u0005\u0000\u0000UV\u0003\u0010\b\u0000V\u000f\u0001\u0000\u0000"+
		"\u0000WX\u0005\u000f\u0000\u0000X\u0011\u0001\u0000\u0000\u0000YZ\u0005"+
		"\u0006\u0000\u0000Z\u0013\u0001\u0000\u0000\u0000[_\u0003\u0016\u000b"+
		"\u0000\\^\u0005\u0012\u0000\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000"+
		"\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bc\u0005\u0011\u0000\u0000"+
		"cf\u0001\u0000\u0000\u0000df\u0003\u0018\f\u0000e[\u0001\u0000\u0000\u0000"+
		"ed\u0001\u0000\u0000\u0000f\u0015\u0001\u0000\u0000\u0000gh\u0005\u0007"+
		"\u0000\u0000h\u0017\u0001\u0000\u0000\u0000ij\u0005\b\u0000\u0000j\u0019"+
		"\u0001\u0000\u0000\u0000kl\u0005\t\u0000\u0000lm\u0003\u001c\u000e\u0000"+
		"mn\u0005\u0013\u0000\u0000n\u001b\u0001\u0000\u0000\u0000op\u0003\u001e"+
		"\u000f\u0000pq\u0003 \u0010\u0000q\u001d\u0001\u0000\u0000\u0000rs\u0005"+
		"\u0014\u0000\u0000s\u001f\u0001\u0000\u0000\u0000tv\u0005\u0014\u0000"+
		"\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000x!\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000\t(.4:BE_ew";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
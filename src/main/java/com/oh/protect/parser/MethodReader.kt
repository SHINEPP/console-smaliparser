package org.example.com.oh.protect.parser

import com.oh.protect.smalimethod.SmaliMethodLexer
import com.oh.protect.smalimethod.SmaliMethodParser
import org.antlr.v4.runtime.*

class MethodReader(private val content: String) {

    fun read(): Smali.Method {
        val charStreams = CharStreams.fromString(content)
        val lexer = SmaliMethodLexer(charStreams)
        lexer.removeErrorListeners()
        lexer.addErrorListener(LexerErrorHandler())

        val tokens = CommonTokenStream(lexer)
        val parser = SmaliMethodParser(tokens)
        parser.removeErrorListeners()
        parser.addErrorListener(PaserErrorHandler())

        val visitor = MethodVisitor(content)
        visitor.visit(parser.method())
        return visitor.crateSmaliMethod()
    }

    class LexerErrorHandler : BaseErrorListener() {
        override fun syntaxError(recognizer: Recognizer<*, *>?, offendingSymbol: Any?, line: Int, charPositionInLine: Int, msg: String?, e: RecognitionException?) {
            throw RuntimeException("Method: Lexer error, position:[$line,$charPositionInLine], $msg")
        }
    }

    class PaserErrorHandler : BaseErrorListener() {
        override fun syntaxError(recognizer: Recognizer<*, *>?, offendingSymbol: Any?, line: Int, charPositionInLine: Int, msg: String?, e: RecognitionException?) {
            throw RuntimeException("Method: Parser error, position:[$line,$charPositionInLine], $msg")
        }
    }
}
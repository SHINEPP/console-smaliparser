package org.example.com.oh.protect.parser

import com.oh.protect.smali.SmaliLexer
import com.oh.protect.smali.SmaliParser
import org.antlr.v4.runtime.*

class SmaliReader(private val path: String) {

    fun read(): Smali {
        val charStreams = CharStreams.fromFileName(path)
        val lexer = SmaliLexer(charStreams)
        lexer.removeErrorListeners()
        lexer.addErrorListener(LexerErrorHandler())

        val tokens = CommonTokenStream(lexer)
        val parser = SmaliParser(tokens)
        parser.removeErrorListeners()
        parser.addErrorListener(PaserErrorHandler())

        val visitor = SmaliVisitor()
        visitor.visit(parser.file())
        return visitor.crateSmaliClass()
    }

    class LexerErrorHandler : BaseErrorListener() {
        override fun syntaxError(recognizer: Recognizer<*, *>?, offendingSymbol: Any?, line: Int, charPositionInLine: Int, msg: String?, e: RecognitionException?) {
            throw RuntimeException("Lexer error, position:[$line,$charPositionInLine], $msg")
        }
    }

    class PaserErrorHandler : BaseErrorListener() {
        override fun syntaxError(recognizer: Recognizer<*, *>?, offendingSymbol: Any?, line: Int, charPositionInLine: Int, msg: String?, e: RecognitionException?) {
            throw RuntimeException("Parser error, position:[$line,$charPositionInLine], $msg")
        }
    }
}
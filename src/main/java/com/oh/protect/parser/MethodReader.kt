package org.example.com.oh.protect.parser

import com.oh.protect.smalimethod.SmaliMethodLexer
import com.oh.protect.smalimethod.SmaliMethodParser
import org.antlr.v4.runtime.*
import org.example.com.oh.protect.common.LexerErrorHandler
import org.example.com.oh.protect.common.PaserErrorHandler

class MethodReader(private val content: String) {

    fun read(): Smali.Method {
        val streams = CharStreams.fromString(content)
        val lexer = SmaliMethodLexer(streams)
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
}
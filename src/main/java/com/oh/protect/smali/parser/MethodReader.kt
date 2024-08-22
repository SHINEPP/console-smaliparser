package com.oh.protect.smali.parser

import com.oh.protect.smali.smalimethod.SmaliMethodLexer
import com.oh.protect.smali.smalimethod.SmaliMethodParser
import org.antlr.v4.runtime.*
import com.oh.protect.smali.LexerErrorHandler
import com.oh.protect.smali.PaserErrorHandler

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
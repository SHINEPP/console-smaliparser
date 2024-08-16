package com.oh.protect.parser

import com.oh.protect.smali.SmaliLexer
import com.oh.protect.smali.SmaliParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import com.oh.protect.common.LexerErrorHandler
import com.oh.protect.common.PaserErrorHandler

class SmaliReader(private val path: String) {

    fun read(): Smali {
        val streams = CharStreams.fromFileName(path)
        val lexer = SmaliLexer(streams)
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
}
package com.oh.protect.smaliparser

import com.oh.protect.common.LexerErrorHandler
import com.oh.protect.common.PaserErrorHandler
import com.oh.protect.smali.SmaliLexer
import com.oh.protect.smali.SmaliParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.File

class SmaliReader(private val file: File) {

    fun read(): Smali {
        val streams = CharStreams.fromFileName(file.path)
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
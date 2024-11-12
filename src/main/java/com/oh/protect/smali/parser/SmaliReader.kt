package com.oh.protect.smali.parser

import com.oh.protect.smali.LexerErrorHandler
import com.oh.protect.smali.PaserErrorHandler
import com.oh.protect.smali.smali.SmaliLexer
import com.oh.protect.smali.smali.SmaliParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.File

class SmaliReader(private val file: File) {

    fun read(): SmaliModel {
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
        return visitor.exportSmali()
    }
}
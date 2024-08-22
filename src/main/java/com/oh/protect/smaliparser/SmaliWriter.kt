package com.oh.protect.smaliparser

import java.io.File

class SmaliWriter(private val smali: Smali) {

    fun write(file: File) {
        file.parentFile?.mkdirs()
        file.writeText(getSmaliText())
    }

    private fun getSmaliText(): String {
        return getSmaliClassInfo() + getSmaliImplements() + getSmaliAnnotations() + getSmaliFields() + getSmaliMethods()
    }

    private fun getSmaliClassInfo(): String {
        return "${smali.classDef}\n" +
                "${smali.superDef}\n" +
                "${smali.sourceDef}\n"
    }

    private fun getSmaliImplements(): String {
        if (smali.implements.isEmpty()) {
            return ""
        }
        return "\n" + smali.implements.joinToString("\n")
    }

    private fun getSmaliAnnotations(): String {
        if (smali.annotations.isEmpty()) {
            return ""
        }
        return "\n\n" + smali.annotations.joinToString("\n\n")
    }

    private fun getSmaliFields(): String {
        if (smali.fields.isEmpty()) {
            return ""
        }
        return "\n\n" + smali.fields.joinToString("\n\n")
    }

    private fun getSmaliMethods(): String {
        if (smali.methods.isEmpty()) {
            return ""
        }
        return "\n\n" + smali.methods.joinToString("\n\n")
    }
}
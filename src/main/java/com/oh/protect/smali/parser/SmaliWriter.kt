package com.oh.protect.smali.parser

import java.io.File

class SmaliWriter(private val smaliModel: SmaliModel) {

    fun write(file: File) {
        file.parentFile?.mkdirs()
        file.writeText(getSmaliText())
    }

    private fun getSmaliText(): String {
        return getSmaliClassInfo() + getSmaliImplements() + getSmaliAnnotations() + getSmaliFields() + getSmaliMethods()
    }

    private fun getSmaliClassInfo(): String {
        return "${smaliModel.classDef}\n" +
                "${smaliModel.superDef}\n" +
                "${smaliModel.sourceDef}\n"
    }

    private fun getSmaliImplements(): String {
        if (smaliModel.implements.isEmpty()) {
            return ""
        }
        return "\n" + smaliModel.implements.joinToString("\n")
    }

    private fun getSmaliAnnotations(): String {
        if (smaliModel.annotations.isEmpty()) {
            return ""
        }
        return "\n\n" + smaliModel.annotations.joinToString("\n\n")
    }

    private fun getSmaliFields(): String {
        if (smaliModel.fields.isEmpty()) {
            return ""
        }
        return "\n\n" + smaliModel.fields.joinToString("\n\n")
    }

    private fun getSmaliMethods(): String {
        if (smaliModel.methods.isEmpty()) {
            return ""
        }
        return "\n\n" + smaliModel.methods.joinToString("\n\n")
    }
}
package org.example.com.oh.protect.transform

import org.example.com.oh.protect.parser.Smali

class SmaliDefaultTransform : ISmaliTransform {

    override fun transformSmali(smali: Smali): Smali {
        return smali
    }
}
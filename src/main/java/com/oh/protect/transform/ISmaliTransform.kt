package org.example.com.oh.protect.transform

import org.example.com.oh.protect.parser.Smali

interface ISmaliTransform {

    fun transformSmali(smali: Smali): Smali
}
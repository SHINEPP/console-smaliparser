package com.oh.protect.transform

import com.oh.protect.parser.Smali

interface ISmaliTransform {



    fun transformSmali(smali: Smali): Smali
}
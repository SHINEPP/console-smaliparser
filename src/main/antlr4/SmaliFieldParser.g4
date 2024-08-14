parser grammar SmaliFieldParser;

options {
    tokenVocab = SmaliFieldLexer;
}


file                : field* EOF ;
field               : FIELD_BLOCK_START fieldHead (fieldCode FIELD_BLOCK_END)?;
fieldHead           : FIELD_BLOCK_LINE ;
fieldCode           : FIELD_BLOCK_LINE* ;

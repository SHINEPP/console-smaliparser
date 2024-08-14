parser grammar SmaliParser;

options {
    tokenVocab = SmaliLexer;
}

// grammar
file                : class super source implements* annotation* field* method* EOF;

class               : CLASS_DEF ;
super               : SUPER_DEF ;
source              : SOURCE_DEF ;
implements          : IMPLEMENTS_DEF ;
annotation          : ANNOTATION_BLOCK ;

field               : fieldBlockStart FIELD_BLOCK_LINE* FIELD_BLOCK_END | fieldDef;
fieldBlockStart     : FIELD_BLOCK_START ;
fieldDef            : FIELD_DEF ;

method              : METHOD_BLOCK_START methodContent METHOD_BLOCK_END ;
methodContent       : methodHead methodCode ;
methodHead          : METHOD_BLOCK_LINE ;
methodCode          : METHOD_BLOCK_LINE* ;



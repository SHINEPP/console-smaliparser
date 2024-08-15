parser grammar SmaliParser;

options {
    tokenVocab = SmaliLexer;
}

// grammar
file                : class super source implements* annotation* field* method* EOF ;

class               : CLASS_DEF ;
super               : SUPER_DEF ;
source              : SOURCE_DEF ;
implements          : IMPLEMENTS_DEF ;

annotation          : ANNOTATION_BLOCK_START ANNOATION_BLOCK_LINE* ANNOATION_BLOCK_END;

field               : FIELD_BLOCK_START FIELD_BLOCK_LINE* FIELD_BLOCK_END;

method              : METHOD_BLOCK_START METHOD_BLOCK_LINE* METHOD_BLOCK_END ;




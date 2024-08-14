parser grammar SmaliParser;

options {
    tokenVocab = SmaliLexer;
}

// grammar
file                : class super source implements* annotation* field* method* EOF ;

class               : CLASS classAccessModify STATIC? FINAL? classSignature ;
classAccessModify   : PUBLIC | PRIVATE | PROTECTED ;
classSignature      : SIGN_OBJECT ;

super               : SUPER superSignature ;
superSignature      : SIGN_OBJECT ;

source              : SOURCE ;

implements          : IMPLEMENTS implementsSignature;
implementsSignature : SIGN_OBJECT ;

annotation          : ANNOTATION_BLOCK ;

field               : fieldBlockStart FIELD_BLOCK_LINE* FIELD_BLOCK_END | fieldDef;
fieldBlockStart     : FIELD_BLOCK_START ;
fieldDef            : FIELD_DEF ;

method              : METHOD_BLOCK_START methodContent METHOD_BLOCK_END ;
methodContent       : methodHead methodCode ;
methodHead          : METHOD_BLOCK_LINE ;
methodCode          : METHOD_BLOCK_LINE* ;



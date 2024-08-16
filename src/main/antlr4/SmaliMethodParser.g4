parser grammar SmaliMethodParser;

options {
    tokenVocab = SmaliMethodLexer;
}

// grammar
method              : METHOD methodIdentifier methodName LEFT_BRACKET methodInSignature RIGHT_BRACKET methodOutSignature ;
methodIdentifier    : (PUBLIC | PRIVATE | PROTECTED)? STATIC? FINAL? NATIVE? CONSTRUCTOR? ;
methodName          : CONSTRUCTOR METHOD_CLINIT | CONSTRUCTOR METHOD_INIT | (~LEFT_BRACKET)+ ;
methodInSignature   : (~RIGHT_BRACKET)* ;
methodOutSignature  : (ANY | LEFT_SQUARE)+ ;

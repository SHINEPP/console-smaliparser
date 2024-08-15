lexer grammar SmaliLexer;

fragment ANNOTATION         : '.annotation' ;
fragment ANNOTATION_END     : '.end annotation' ;
fragment FIELD              : '.field' ;
fragment FIELD_END          : '.end field' ;
fragment METHOD             : '.method' ;
fragment METHOD_END         : '.end method' ;
fragment CR                 : [\r\n] ;
fragment NCR                : ~[\r\n] ;


COMMENT                     : '#' NCR* -> skip;

CLASS_DEF                   : '.class' NCR* ;
SUPER_DEF                   : '.super' NCR*;
SOURCE_DEF                  : '.source' NCR* ;
IMPLEMENTS_DEF              : '.implements' NCR* ;


// annotation
ANNOTATION_BLOCK_START      : ANNOTATION -> pushMode(ANNOATION_MODE) ;

// field
FIELD_BLOCK_START           : FIELD -> pushMode(FIELD_MODE) ;

// method
METHOD_BLOCK_START          : METHOD -> pushMode(METHOD_MODE) ;

WS                          : [ \t\r\n] -> skip ;


// ----------------- annoation mode -----------------
mode ANNOATION_MODE;

ANNOATION_BLOCK_END     : ANNOTATION_END -> popMode ;
ANNOATION_BLOCK_LINE    : NCR* { !getText().startsWith(".end annotation") }? CR ;

// ----------------- field mode -----------------
mode FIELD_MODE;

FIELD_BLOCK_END         : FIELD_END -> popMode ;
FIELD_BLOCK_LINE        : NCR* { !getText().startsWith(".end field") }? CR ;

// ----------------- method mode -----------------
mode METHOD_MODE;

METHOD_BLOCK_END        : METHOD_END -> popMode ;
METHOD_BLOCK_LINE       : NCR* { !getText().startsWith(".end method") }? CR ;
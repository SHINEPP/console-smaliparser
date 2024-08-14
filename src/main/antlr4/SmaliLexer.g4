lexer grammar SmaliLexer;

COMMENT_LINE                : '#' ~[\r\n]* [\r\n]-> skip;

fragment CLASS              : '.class' ;
fragment SUPER              : '.super' ;
fragment SOURCE             : '.source' ;
fragment IMPLEMENTS         : '.implements' ;
fragment ANNOTATION         : '.annotation' ;
fragment ANNOTATION_END     : '.end annotation' ;
fragment FIELD              : '.field' ;
fragment FIELD_END          : '.end field' ;
fragment METHOD             : '.method' ;
fragment METHOD_END         : '.end method' ;
fragment CR                 : [\r\n] ;

CLASS_DEF           : CLASS ~[\r\n]* ;
SUPER_DEF           : SUPER ~[\r\n]* ;
SOURCE_DEF          : SOURCE ~[\r\n]* ;
IMPLEMENTS_DEF      : IMPLEMENTS ~[\r\n]* ;
ANNOTATION_BLOCK    : ANNOTATION .*? ANNOTATION_END ;

// field
FIELD_BLOCK_START   : FIELD -> pushMode(FIELD_MODE) ;

// method
METHOD_BLOCK_START  : METHOD -> pushMode(METHOD_MODE) ;

WS                  : [ \t\r\n] -> skip ;

// ----------------- field mode -----------------
mode FIELD_MODE;

FIELD_BLOCK_END     : FIELD_END -> popMode ;
FIELD_BLOCK_LINE    : ~[\r\n]* { !getText().startsWith(".end field") }? CR ;

// ----------------- method mode -----------------
mode METHOD_MODE;

METHOD_BLOCK_END    : METHOD_END -> popMode ;
METHOD_BLOCK_LINE   : ~[\r\n]* { !getText().startsWith(".end method") }? CR ;
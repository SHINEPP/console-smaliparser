grammar Smali;

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

CLASS_DEF           : CLASS ~[\r\n]* CR ;
SUPER_DEF           : SUPER ~[\r\n]* CR ;
SOURCE_DEF          : SOURCE ~[\r\n]* CR ;
IMPLEMENTS_DEF      : IMPLEMENTS ~[\r\n]* CR ;
ANNOTATION_BLOCK    : ANNOTATION .*? ANNOTATION_END ;

FIELD_BLOCK         : FIELD .*? { !getText().startsWith(".field") }? FIELD_END ;
FIELD_DEF           : FIELD ~[\r\n]* CR ;
METHOD_BLOCK        : METHOD .*? METHOD_END ;

WS                  : [ \t\r\n] -> skip ;

// grammar
file                : class super source implements* annotation* field* method* EOF;

class               : CLASS_DEF ;
super               : SUPER_DEF ;
source              : SOURCE_DEF ;
implements          : IMPLEMENTS_DEF ;
annotation          : ANNOTATION_BLOCK ;

field               : fieldDef | fieldBlock ;
fieldDef            : FIELD_DEF ;
fieldBlock          : FIELD_BLOCK ;
method              : METHOD_BLOCK ;



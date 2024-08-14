lexer grammar SmaliFieldLexer;

fragment FIELD          : '.field' ;
fragment FIELD_END      : '.end field' ;

FIELD_BLOCK_START       : FIELD -> pushMode(FIELD_INSIDE) ;
WS                      : [ \t\r\n]+ -> skip ;


// ----------------- field ---------------------
mode FIELD_INSIDE;

FIELD_BLOCK_END        : FIELD_END -> popMode ;
FIELD_BLOCK_LINE       : ~[\n]* { !getText().startsWith(".end field") }? [\n] ;




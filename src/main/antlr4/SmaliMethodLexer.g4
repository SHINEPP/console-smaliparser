lexer grammar SmaliMethodLexer;

fragment METHOD         : '.method' ;
fragment METHOD_END     : '.end method' ;

// Default "mode": Everything OUTSIDE of a tag
METHOD_BLOCK_START      : METHOD -> pushMode(METHOD_INSIDE) ;
WS                      : [ \t\r\n]+ -> skip ;


// ----------------- 方法体 ---------------------
mode METHOD_INSIDE;

METHOD_BLOCK_END        : METHOD_END -> popMode ;
METHOD_BLOCK_LINE       : ~[\n]* { !getText().startsWith(".end method") }? [\n] ;




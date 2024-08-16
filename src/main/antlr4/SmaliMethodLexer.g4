lexer grammar SmaliMethodLexer;


METHOD              : '.method' ;

// 访问权限修饰符
PUBLIC              : 'public' ;
PRIVATE             : 'private' ;
PROTECTED           : 'protected' ;

// 非权限修饰符
STATIC              : 'static' ;
FINAL               : 'final' ;
SYNCHRONIZED        : 'synchronized' ;
NATIVE              : 'native' ;
ABSTRACT            : 'abstract' ;
STRICTFP            : 'strictfp' ;
SYNTHETIC           : 'synthetic' ;
BRIDGE              : 'bridge' ;
VARARGS             : 'varargs' ;

// keywords
CONSTRUCTOR         : 'constructor' ;
METHOD_CLINIT       : '<clinit>' ;
METHOD_INIT         : '<init>' ;


LEFT_BRACKET        : '(' ;
RIGHT_BRACKET       : ')' ;
LEFT_SQUARE         : '[' ;

WS                  : [ \t\r\n]+ -> skip ;
ANY                 : . ;
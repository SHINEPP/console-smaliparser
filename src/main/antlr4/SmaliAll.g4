grammar SmaliAll;

// lexer
COMMENT         : '#' ~[\r\n]*;

CLASS           : '.class' ;
SUPER           : '.super' ;
SOURCE          : '.source' ;
IMPLEMENTS      : '.implements' ;
FIELD           : '.field' ;
FIELD_END       : '.end field' ;
METHOD          : '.method' ;
METHOD_END      : '.end method';

PRIVATE         : 'private' ;
PUBLIC          : 'public' ;
STATIC          : 'static' ;
FINAL           : 'final' ;
NATIVE          : 'native' ;
CONSTRUCTOR     : 'constructor' ;
CLINIT          : '<clinit>' ;
INIT            : '<init>' ;

//METHOD_BODY     : METHOD .*? METHOD_END;


// grammar
smaliFile           : classDef* ;

classDef            : CLASS classIdentifier classSignature SUPER superSignature SOURCE sourceValue? interfaces* classBody;
classIdentifier     : (PUBLIC | PRIVATE) FINAL? ;
classSignature      : SIGNATURE_OBJECT ;
superSignature      : SIGNATURE_OBJECT ;
sourceValue         : STRING ;

interfaces          : COMMENT* IMPLEMENTS interface ;
interface           : SIGNATURE_OBJECT ;

classBody           : (comment | fieldDef)* (comment | methodDef)*;
comment             : COMMENT ;

fieldDef            : FIELD fieldIdentifier fieldName ':' fieldSignature;
fieldIdentifier     : (PUBLIC | PRIVATE) STATIC? FINAL? ;
fieldName           : NAME ;
fieldSignature      : signature ;

//methodDef           : METHOD_BODY ;

methodDef           : METHOD methodIdentifier methodName '(' methodInSignature ')' methodOutSignature methodBody METHOD_END ;
methodIdentifier    : (PUBLIC | PRIVATE) STATIC? FINAL? NATIVE? CONSTRUCTOR? ;
methodName          : NAME | INIT | CLINIT ;
methodInSignature   : signature* ;
methodOutSignature  : signature | 'V' ;
methodBody          : .*? ;


signature           : '['? (SIGNATURE | SIGNATURE_OBJECT);

SIGNATURE           : [ZBCSIJFD];
SIGNATURE_OBJECT    : 'L'([a-zA-Z_$][a-zA-Z0-9_$]*'/')*[a-zA-Z_$][a-zA-Z0-9_$]*';' ;
NAME                : [a-zA-Z_][a-zA-Z_0-9]* ;

STRING              : '"' (~["\r\n] | '\\' .)* '"' ;
WS                  : [ \t\r\n]+ -> skip ;

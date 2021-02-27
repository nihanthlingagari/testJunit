grammar Rule;

// parser rules
//IF{S:DIVISION F:PAR}  ==  “ABC” THEN  DISALLOW

ruleSentence: IF condition THEN result;

condition:  subcondition OPERATOR value;

subcondition: TEXT;

value: TEXT;

result: TEXT;

//lexar rules

IF : 'IF';

THEN: 'THEN';

TEXT : ('A'..'Z')+ ;

OPERATOR: '==';

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;

COLON: (':')+ -> skip;

CURLY_OPEN: ('{')+ -> skip;

CURLY_CLOSE: ('}')+ -> skip;
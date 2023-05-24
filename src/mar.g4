grammar mar;

prog: (var*) (func*) (inst | blockStmt)+? EOF; // uma ou mais instrucoes, neste caso print

func: TYPES? ID '(' paramList? ')' blockStmt;

var: op = TYPES ID DOTF;

inst:	ID ONEQUAL (expr | funcCall ) DOTF                              # Store
	|   ID '(' argList? ')' DOTF                                        # SoloCall
    |   PRINT (expr | funcCall) DOTF                                    # Print
    |   IF expr then ( inst)                                            # IfThen
    |   'return' (expr)? DOTF                                           # ReturnStmt
    |   IF expr then blockStmt                                          # IfBlock
    |   ELSE (inst)                                                     # ElseThen
    |   ELSE blockStmt                                                  # ElseBlock
    |	WHILE expr do blockStmt                                         # WhileStmt
    |   expr DOTF                                                       # Useless
	;

funcCall: ID '(' argList? ')' ;
paramList: (TYPES ID) (',' TYPES ID)*;

TYPES: ('number' | 'bool' | 'string') ;

SL_COMMENT: '//' .*? (EOF | '\n') -> skip;
ML_COMMENT: '/*' .*? '*/' -> skip;

blockStmt: Chavetas1  (var* (inst | blockStmt)+? ) Chavetas2;

then: 'then' ;
do: 'do' ;

expr:	 '(' expr ')'			 										# Parens   // 1
	 	| op = (SUB | NOT) expr 										# Neg      // 2 este e o NOT tem de estar no mm
		| expr op = (MULT | DIV) expr									# MulDiv   // 3
		| expr op = (ADD | SUB) expr									# AddSub   // 4
		| expr op = ( MINOR | MAIOR | MINOR_EQUAL | MAIOR_EQUAL ) expr 	# MinMai // 5
		| expr op = (EQUAL | DIF)  expr     							# EqDif  // 6
		| expr AND expr                 								# AND    // 7
		| expr OR expr                           						# OR     // 8
		| funcCall                                                      # FuncCa
		| NUMBER														# Number
		| STRING                        								# String
		| NIL                           								# NIL
		| BOOLEAN			         									# Boolean
		| ID                                                            # ID
		;

argList: (expr | funcCall) (',' (expr | funcCall))*;

NUMBER: INT DOT INT // 1.35, 1.35E-9, 0.3, -4.5
		| INT ; // -3, 45

BOOLEAN: TRUE
        | FALSE ;

PRINT: 'print';

MAIOR_EQUAL: '>=';
MINOR_EQUAL: '<=';
MAIOR: '>';
MINOR: '<';

WHILE: 'while';
IF: 'if';
ELSE: 'else';

TRUE: 'true';
FALSE: 'false';
NIL: 'nil';

NOT: 'not';
AND: 'and';           // da sempre um valor boolean
OR: 'or';

DOTF: ';';
ONEQUAL: '=';
EQUAL: '==';      // para tipos boolean
DIF: '!=';       // para tipos boolean

ADD: '+';
SUB: '-';
MULT: '*';
DIV: '/';

DOT: '.';
INT: [0-9]+;
STRING: '"' .*? '"' ; // a quoted string
Chavetas1: '{';
Chavetas2: '}';

ID: [a-zA-Z]+ [a-zA-Z0-9]* ;

//NEWLINE: '\r'? '\n';
WS: [ \n\r\t]+ -> skip;


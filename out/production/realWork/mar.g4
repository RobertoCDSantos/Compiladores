grammar mar;

prog: (inst NEWLINE)+; // uma ou mais instrucoes, neste caso print

inst: PRINT expr ';'; // instrucao print

expr:
	SUB expr						# Neg
	| '(' expr ')'					# Parens
	| expr op = (MULT | DIV) expr	# MulDiv
	| expr op = (ADD | SUB) expr	# AddSub
	| NUMBER						# Number;

NUMBER:
	INT DOT INT // 1.35, 1.35E-9, 0.3, -4.5
	| INT ; // -3, 45

PRINT: 'print';
INT: [0-9]+;
MULT: '*';
DIV: '/';
ADD: '+';
SUB: '-';
DOT: '.';
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;


lexer grammar Lab03;

@header{
  package laboratorios.lab03;
}

ESPACIOS	: 	( '\t' | ' ' | '\r' | '\n')+ { skip(); } ;
fragment DIGIT		:   '0'..'9' ;
fragment LETTER		:   ('a'..'z'|'A'..'Z');
fragment SIGNO		:   '-'|'+';

ENTERO		: 	SIGNO? (DIGIT)+ { System.out.println("entero");} ;
FLOTANTE	: 	SIGNO? (DIGIT)*'.'(DIGIT)+ { System.out.println("real");} ;
SUMA		:	'+' { System.out.println("suma");} ;
RESTA		: 	'-' { System.out.println("resta");} ;
MULT		: 	'*' { System.out.println("multiplicacion");} ;
DIV			: 	'/' { System.out.println("division");} ;
AND			: 	'&' { System.out.println("and");} ;
OR    		: 	'|' { System.out.println("or");} ;
POT 		: 	'^' { System.out.println("potencia");} ;
EQUAL		: 	'=' { System.out.println("igual");} ;
PUNTOCOMA	: 	';' { System.out.println("puntoYcoma");} ;
COMA 		: 	',' { System.out.println("coma");} ;
PARC		: 	')' { System.out.println("parentecisCerrado");} ;
PARA		: 	'(' { System.out.println("parentecisAbierto");} ;
INT 		:   ('I' 'N' 'T')|('i' 'n' 't') { System.out.println("PalabraReservadaINT");} ;
VARBOOLEAN 	:   ('B''O''O''L''E''A''N')|('b''o''o''l''e''a''n') { System.out.println("PalabraReservadaBOOLEAN");} ;

HEX 		:   '0'('X'	|'x')((DIGIT)|('A'|'a')|('B'|'b')|('C'|'c')|('D'|'d')|('E'|'e')|('F'|'f'				))+ { System.out.println("NumeroHEX");} ;

CHAR		:	'\'' ~('\''|'\n'|'\r'|'\t') '\'' { System.out.println ("caracter");};
STRING 		:	'"' (~('"'|'\n'|'\r'|'\t'))* '"' { System.out.println ("string");};
BOOLEAN 	: 	('t''r''u''e'|'f''a''l''s''e') { System.out.println ("booleano");};
VAR 		:   LETTER (LETTER|DIGIT|'_')* { System.out.println ("variable");};




lexer grammar Lab02;

@header{
  package laboratorios.lab02;
}

//ignoramos espacios en blanco
WHITESPACE 	: 	( '\t' | ' ' | '\r' | '\n')+ { skip(); } ;

//palabras reservadas para los tipos de datos

INT         :   ('int' | 'boolean')+ { System.out.println("palabra reservada: int o bo");} ;

FLOAT       :   'float' { System.out.println("palabra reservada: float");} ;


PLUS : '+' { System.out.println ("suma");};
MINUS : '-' { System.out.println ("resta");};


NUMBER : DIGIT+ { System.out.println ("numero");};
	fragment DIGIT : '0'..'9';
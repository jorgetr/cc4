lexer grammar Lab02;

@header{
  package laboratorios.lab02;
}



//1
DIGIT	: '0'..'9' ;
ENTERO		: 	(DIGIT)+ { System.out.println("entero");} ;
FLOTANTE		: 	(DIGIT)+'.'(DIGIT)+ { System.out.println("real");} ;

//2
SUMA		:	'+' { System.out.println("suma");} ;
RESTA		: 	'-' { System.out.println("resta");} ;
MULT		: 	'*' { System.out.println("multiplicacion");} ;
DIV			: 	'/' { System.out.println("division");} ;


//3
ESPACIOS	: 	( '\t' | ' ' | '\r' | '\n')+ { skip(); } ;

//4
VAR         :   (ALPHA)(ALPHA|DIGT)* { System.out.println("ERROR LETRAS");} ;
fragment DIGT	: '0'..'9' ;
fragment ALPHA  : ('a'..'z' | 'A'..'Z' | '_' ) ;
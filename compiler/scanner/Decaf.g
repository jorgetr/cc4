lexer grammar Decaf;

@lexer::header{
  package compiler.scanner;
}


@lexer::members {
	public LinkedList error = new LinkedList();
	public String cadena = "";
	
	public void format(int linea, String nombre, String valor){
		if(nombre.equals("")){
			cadena = linea+" "+valor;
		}else{
			cadena = linea+" "+nombre+" "+valor;
		}
	}
	
	@Override
	public void emitErrorMessage(String msg)
	{
		error.add(msg);
	}
}

fragment DIGIT		:   '0'..'9' ;
fragment LETTER		:   ('a'..'z'|'A'..'Z');
fragment SIGNO		:   '-'|'+';

//signos 
ADD			:	'+'  {format(getLine(), "", getText());};
SUB			: 	'-'  {format(getLine(), "", getText());};
MULT		: 	'*'  {format(getLine(), "", getText());};
DIV			: 	'/'  {format(getLine(), "", getText());};
PORC		: 	'%'  {format(getLine(), "", getText());};
LESSTHAT	: 	'<'  {format(getLine(), "", getText());};
GREATTHAT	: 	'>'  {format(getLine(), "", getText());};
LESSEQ		: 	'<=' {format(getLine(), "", getText());};
GREATEQ		: 	'>=' {format(getLine(), "", getText());};
AND 		:   '&&' {format(getLine(), "", getText());};
OR			:   '||' {format(getLine(), "", getText());};
NOT 		:	'!'  {format(getLine(), "", getText());};
XOR 		:   '^'  {format(getLine(), "", getText());};
EQUAL		:	'==' {format(getLine(), "", getText());};
NOTEQUAL	:   '!=' {format(getLine(), "", getText());};
ASSIGN 		: 	'='  {format(getLine(), "", getText());};
PLUSASSIGN 	: 	'+=' {format(getLine(), "", getText());};
MINUSASSIGN :	'-=' {format(getLine(), "", getText());};




ESPACIOS	: 	( '\t' | ' ' | '\r' | '\n')+ { skip(); } ;
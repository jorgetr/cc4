
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;
import laboratorios.lab02.Lab02; 

public class Main {
public static void main(String[] args) throws Exception{
  org.antlr.v4.runtime.CharStream filename =new ANTLRFileStream(args[0]);
  try{
      Lab02 lexer = new Lab02(filename);
      while (lexer.nextToken().getType() != Token.EOF);
  }catch(ArrayIndexOutOfBoundsException aiobe){
      System.err.println("Must provide a valid path to the filename with the tokens");
      System.exit(1);
  }catch(Exception e){
      System.err.println("Must provide a valid path to the filename with the tokens");
      System.exit(1);
  }
}
}

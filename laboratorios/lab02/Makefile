make:  alias  Lab02.java Lab02.class Main.class 

Main.class: Main.java
	javac Main.java

Lab02.class: Lab02.java
	javac Lab02.java

Lab02.java: Lab02.g
	antlr4 Lab02.g

MainE: Main.class
	java Main test.txt
	
clean:
	rm -rf *.tokens
	rm -rf *.class
	rm -rf Lab02.java
	rm -rf *~

alias:
alias antlr4='java -jar /home/jorgetr/cc4/laboratorios/lib/antlr-4.2-complete.jar'
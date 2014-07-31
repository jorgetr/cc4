// Generated from Decaf.g by ANTLR 4.3

  package compiler.scanner;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Decaf extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, SUB=2, MULT=3, DIV=4, PORC=5, LESSTHAT=6, GREATTHAT=7, LESSEQ=8, 
		GREATEQ=9, AND=10, OR=11, NOT=12, XOR=13, EQUAL=14, NOTEQUAL=15, ASSIGN=16, 
		PLUSASSIGN=17, MINUSASSIGN=18, ESPACIOS=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'"
	};
	public static final String[] ruleNames = {
		"DIGIT", "LETTER", "SIGNO", "ADD", "SUB", "MULT", "DIV", "PORC", "LESSTHAT", 
		"GREATTHAT", "LESSEQ", "GREATEQ", "AND", "OR", "NOT", "XOR", "EQUAL", 
		"NOTEQUAL", "ASSIGN", "PLUSASSIGN", "MINUSASSIGN", "ESPACIOS"
	};


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


	public Decaf(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Decaf.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 3: ADD_action((RuleContext)_localctx, actionIndex); break;

		case 4: SUB_action((RuleContext)_localctx, actionIndex); break;

		case 5: MULT_action((RuleContext)_localctx, actionIndex); break;

		case 6: DIV_action((RuleContext)_localctx, actionIndex); break;

		case 7: PORC_action((RuleContext)_localctx, actionIndex); break;

		case 8: LESSTHAT_action((RuleContext)_localctx, actionIndex); break;

		case 9: GREATTHAT_action((RuleContext)_localctx, actionIndex); break;

		case 10: LESSEQ_action((RuleContext)_localctx, actionIndex); break;

		case 11: GREATEQ_action((RuleContext)_localctx, actionIndex); break;

		case 12: AND_action((RuleContext)_localctx, actionIndex); break;

		case 13: OR_action((RuleContext)_localctx, actionIndex); break;

		case 14: NOT_action((RuleContext)_localctx, actionIndex); break;

		case 15: XOR_action((RuleContext)_localctx, actionIndex); break;

		case 16: EQUAL_action((RuleContext)_localctx, actionIndex); break;

		case 17: NOTEQUAL_action((RuleContext)_localctx, actionIndex); break;

		case 18: ASSIGN_action((RuleContext)_localctx, actionIndex); break;

		case 19: PLUSASSIGN_action((RuleContext)_localctx, actionIndex); break;

		case 20: MINUSASSIGN_action((RuleContext)_localctx, actionIndex); break;

		case 21: ESPACIOS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void XOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12: format(getLine(), "", getText()); break;
		}
	}
	private void LESSEQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: format(getLine(), "", getText()); break;
		}
	}
	private void GREATEQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: format(getLine(), "", getText()); break;
		}
	}
	private void EQUAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13: format(getLine(), "", getText()); break;
		}
	}
	private void PORC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: format(getLine(), "", getText()); break;
		}
	}
	private void OR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10: format(getLine(), "", getText()); break;
		}
	}
	private void ASSIGN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15: format(getLine(), "", getText()); break;
		}
	}
	private void SUB_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: format(getLine(), "", getText()); break;
		}
	}
	private void GREATTHAT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: format(getLine(), "", getText()); break;
		}
	}
	private void NOT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11: format(getLine(), "", getText()); break;
		}
	}
	private void ESPACIOS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18:  skip();  break;
		}
	}
	private void MINUSASSIGN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17: format(getLine(), "", getText()); break;
		}
	}
	private void MULT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: format(getLine(), "", getText()); break;
		}
	}
	private void DIV_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: format(getLine(), "", getText()); break;
		}
	}
	private void PLUSASSIGN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16: format(getLine(), "", getText()); break;
		}
	}
	private void AND_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9: format(getLine(), "", getText()); break;
		}
	}
	private void NOTEQUAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14: format(getLine(), "", getText()); break;
		}
	}
	private void ADD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: format(getLine(), "", getText()); break;
		}
	}
	private void LESSTHAT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: format(getLine(), "", getText()); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u0082\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\6\27}\n\27"+
		"\r\27\16\27~\3\27\3\27\2\2\30\3\2\5\2\7\2\t\3\13\4\r\5\17\6\21\7\23\b"+
		"\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25\3\2\5\4"+
		"\2C\\c|\4\2--//\5\2\13\f\17\17\"\"\177\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3"+
		"\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
		"\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3"+
		"\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2"+
		"\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t\65\3\2\2\2\138\3\2\2\2\r;\3\2\2\2\17"+
		">\3\2\2\2\21A\3\2\2\2\23D\3\2\2\2\25G\3\2\2\2\27J\3\2\2\2\31O\3\2\2\2"+
		"\33T\3\2\2\2\35Y\3\2\2\2\37^\3\2\2\2!a\3\2\2\2#d\3\2\2\2%i\3\2\2\2\'n"+
		"\3\2\2\2)q\3\2\2\2+v\3\2\2\2-|\3\2\2\2/\60\4\62;\2\60\4\3\2\2\2\61\62"+
		"\t\2\2\2\62\6\3\2\2\2\63\64\t\3\2\2\64\b\3\2\2\2\65\66\7-\2\2\66\67\b"+
		"\5\2\2\67\n\3\2\2\289\7/\2\29:\b\6\3\2:\f\3\2\2\2;<\7,\2\2<=\b\7\4\2="+
		"\16\3\2\2\2>?\7\61\2\2?@\b\b\5\2@\20\3\2\2\2AB\7\'\2\2BC\b\t\6\2C\22\3"+
		"\2\2\2DE\7>\2\2EF\b\n\7\2F\24\3\2\2\2GH\7@\2\2HI\b\13\b\2I\26\3\2\2\2"+
		"JK\7>\2\2KL\7?\2\2LM\3\2\2\2MN\b\f\t\2N\30\3\2\2\2OP\7@\2\2PQ\7?\2\2Q"+
		"R\3\2\2\2RS\b\r\n\2S\32\3\2\2\2TU\7(\2\2UV\7(\2\2VW\3\2\2\2WX\b\16\13"+
		"\2X\34\3\2\2\2YZ\7~\2\2Z[\7~\2\2[\\\3\2\2\2\\]\b\17\f\2]\36\3\2\2\2^_"+
		"\7#\2\2_`\b\20\r\2` \3\2\2\2ab\7`\2\2bc\b\21\16\2c\"\3\2\2\2de\7?\2\2"+
		"ef\7?\2\2fg\3\2\2\2gh\b\22\17\2h$\3\2\2\2ij\7#\2\2jk\7?\2\2kl\3\2\2\2"+
		"lm\b\23\20\2m&\3\2\2\2no\7?\2\2op\b\24\21\2p(\3\2\2\2qr\7-\2\2rs\7?\2"+
		"\2st\3\2\2\2tu\b\25\22\2u*\3\2\2\2vw\7/\2\2wx\7?\2\2xy\3\2\2\2yz\b\26"+
		"\23\2z,\3\2\2\2{}\t\4\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\u0081\b\27\24\2\u0081.\3\2\2\2\4\2~\25\3\5\2\3\6"+
		"\3\3\7\4\3\b\5\3\t\6\3\n\7\3\13\b\3\f\t\3\r\n\3\16\13\3\17\f\3\20\r\3"+
		"\21\16\3\22\17\3\23\20\3\24\21\3\25\22\3\26\23\3\27\24";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
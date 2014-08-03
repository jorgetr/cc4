// Generated from Lab03.g by ANTLR 4.3

  package laboratorios.lab03;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Lab03 extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ESPACIOS=1, ENTERO=2, FLOTANTE=3, SUMA=4, RESTA=5, MULT=6, DIV=7, AND=8, 
		OR=9, POT=10, EQUAL=11, PUNTOCOMA=12, COMA=13, PARC=14, PARA=15, INT=16, 
		VARBOOLEAN=17, HEX=18, CHAR=19, STRING=20, BOOLEAN=21, VAR=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'"
	};
	public static final String[] ruleNames = {
		"ESPACIOS", "DIGIT", "LETTER", "SIGNO", "ENTERO", "FLOTANTE", "SUMA", 
		"RESTA", "MULT", "DIV", "AND", "OR", "POT", "EQUAL", "PUNTOCOMA", "COMA", 
		"PARC", "PARA", "INT", "VARBOOLEAN", "HEX", "CHAR", "STRING", "BOOLEAN", 
		"VAR"
	};


	public Lab03(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lab03.g"; }

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
		case 0: ESPACIOS_action((RuleContext)_localctx, actionIndex); break;

		case 4: ENTERO_action((RuleContext)_localctx, actionIndex); break;

		case 5: FLOTANTE_action((RuleContext)_localctx, actionIndex); break;

		case 6: SUMA_action((RuleContext)_localctx, actionIndex); break;

		case 7: RESTA_action((RuleContext)_localctx, actionIndex); break;

		case 8: MULT_action((RuleContext)_localctx, actionIndex); break;

		case 9: DIV_action((RuleContext)_localctx, actionIndex); break;

		case 10: AND_action((RuleContext)_localctx, actionIndex); break;

		case 11: OR_action((RuleContext)_localctx, actionIndex); break;

		case 12: POT_action((RuleContext)_localctx, actionIndex); break;

		case 13: EQUAL_action((RuleContext)_localctx, actionIndex); break;

		case 14: PUNTOCOMA_action((RuleContext)_localctx, actionIndex); break;

		case 15: COMA_action((RuleContext)_localctx, actionIndex); break;

		case 16: PARC_action((RuleContext)_localctx, actionIndex); break;

		case 17: PARA_action((RuleContext)_localctx, actionIndex); break;

		case 18: INT_action((RuleContext)_localctx, actionIndex); break;

		case 19: VARBOOLEAN_action((RuleContext)_localctx, actionIndex); break;

		case 20: HEX_action((RuleContext)_localctx, actionIndex); break;

		case 21: CHAR_action((RuleContext)_localctx, actionIndex); break;

		case 22: STRING_action((RuleContext)_localctx, actionIndex); break;

		case 23: BOOLEAN_action((RuleContext)_localctx, actionIndex); break;

		case 24: VAR_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void ENTERO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:  System.out.println("entero"); break;
		}
	}
	private void BOOLEAN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20:  System.out.println ("booleano"); break;
		}
	}
	private void POT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:  System.out.println("potencia"); break;
		}
	}
	private void HEX_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17:  System.out.println("NumeroHEX"); break;
		}
	}
	private void EQUAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:  System.out.println("igual"); break;
		}
	}
	private void VARBOOLEAN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:  System.out.println("PalabraReservadaBOOLEAN"); break;
		}
	}
	private void OR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:  System.out.println("or"); break;
		}
	}
	private void CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18:  System.out.println ("caracter"); break;
		}
	}
	private void RESTA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:  System.out.println("resta"); break;
		}
	}
	private void VAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 21:  System.out.println ("variable"); break;
		}
	}
	private void INT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:  System.out.println("PalabraReservadaINT"); break;
		}
	}
	private void SUMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:  System.out.println("suma"); break;
		}
	}
	private void ESPACIOS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  skip();  break;
		}
	}
	private void FLOTANTE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:  System.out.println("real"); break;
		}
	}
	private void MULT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:  System.out.println("multiplicacion"); break;
		}
	}
	private void DIV_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:  System.out.println("division"); break;
		}
	}
	private void PUNTOCOMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:  System.out.println("puntoYcoma"); break;
		}
	}
	private void AND_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:  System.out.println("and"); break;
		}
	}
	private void COMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:  System.out.println("coma"); break;
		}
	}
	private void PARC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:  System.out.println("parentecisCerrado"); break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19:  System.out.println ("string"); break;
		}
	}
	private void PARA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:  System.out.println("parentecisAbierto"); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u00ce\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\6\2\67\n\2\r\2\16\28\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\5\6D\n\6\3\6\6\6G\n\6\r\6\16\6H\3\6\3\6\3\7\5\7N\n\7\3\7\7\7Q\n"+
		"\7\f\7\16\7T\13\7\3\7\3\7\6\7X\n\7\r\7\16\7Y\3\7\3\7\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u008a\n\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u009c\n\25\3\26\3\26\3\26\3\26\6\26\u00a2\n\26\r\26\16\26\u00a3"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\7\30\u00af\n\30\f\30\16"+
		"\30\u00b2\13\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u00c0\n\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u00c8\n\32\f"+
		"\32\16\32\u00cb\13\32\3\32\3\32\2\2\33\3\3\5\2\7\2\t\2\13\4\r\5\17\6\21"+
		"\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25/"+
		"\26\61\27\63\30\3\2\t\5\2\13\f\17\17\"\"\4\2C\\c|\4\2--//\4\2ZZzz\4\2"+
		"CHch\5\2\13\f\17\17))\5\2\13\f\17\17$$\u00d9\2\3\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\66\3\2\2\2\5<\3\2\2\2\7>\3\2\2"+
		"\2\t@\3\2\2\2\13C\3\2\2\2\rM\3\2\2\2\17]\3\2\2\2\21`\3\2\2\2\23c\3\2\2"+
		"\2\25f\3\2\2\2\27i\3\2\2\2\31l\3\2\2\2\33o\3\2\2\2\35r\3\2\2\2\37u\3\2"+
		"\2\2!x\3\2\2\2#{\3\2\2\2%~\3\2\2\2\'\u0089\3\2\2\2)\u009b\3\2\2\2+\u009d"+
		"\3\2\2\2-\u00a7\3\2\2\2/\u00ac\3\2\2\2\61\u00bf\3\2\2\2\63\u00c3\3\2\2"+
		"\2\65\67\t\2\2\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29:\3\2"+
		"\2\2:;\b\2\2\2;\4\3\2\2\2<=\4\62;\2=\6\3\2\2\2>?\t\3\2\2?\b\3\2\2\2@A"+
		"\t\4\2\2A\n\3\2\2\2BD\5\t\5\2CB\3\2\2\2CD\3\2\2\2DF\3\2\2\2EG\5\5\3\2"+
		"FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\b\6\3\2K\f\3\2\2"+
		"\2LN\5\t\5\2ML\3\2\2\2MN\3\2\2\2NR\3\2\2\2OQ\5\5\3\2PO\3\2\2\2QT\3\2\2"+
		"\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UW\7\60\2\2VX\5\5\3\2WV\3\2"+
		"\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\b\7\4\2\\\16\3\2\2\2]"+
		"^\7-\2\2^_\b\b\5\2_\20\3\2\2\2`a\7/\2\2ab\b\t\6\2b\22\3\2\2\2cd\7,\2\2"+
		"de\b\n\7\2e\24\3\2\2\2fg\7\61\2\2gh\b\13\b\2h\26\3\2\2\2ij\7(\2\2jk\b"+
		"\f\t\2k\30\3\2\2\2lm\7~\2\2mn\b\r\n\2n\32\3\2\2\2op\7`\2\2pq\b\16\13\2"+
		"q\34\3\2\2\2rs\7?\2\2st\b\17\f\2t\36\3\2\2\2uv\7=\2\2vw\b\20\r\2w \3\2"+
		"\2\2xy\7.\2\2yz\b\21\16\2z\"\3\2\2\2{|\7+\2\2|}\b\22\17\2}$\3\2\2\2~\177"+
		"\7*\2\2\177\u0080\b\23\20\2\u0080&\3\2\2\2\u0081\u0082\7K\2\2\u0082\u0083"+
		"\7P\2\2\u0083\u008a\7V\2\2\u0084\u0085\7k\2\2\u0085\u0086\7p\2\2\u0086"+
		"\u0087\7v\2\2\u0087\u0088\3\2\2\2\u0088\u008a\b\24\21\2\u0089\u0081\3"+
		"\2\2\2\u0089\u0084\3\2\2\2\u008a(\3\2\2\2\u008b\u008c\7D\2\2\u008c\u008d"+
		"\7Q\2\2\u008d\u008e\7Q\2\2\u008e\u008f\7N\2\2\u008f\u0090\7G\2\2\u0090"+
		"\u0091\7C\2\2\u0091\u009c\7P\2\2\u0092\u0093\7d\2\2\u0093\u0094\7q\2\2"+
		"\u0094\u0095\7q\2\2\u0095\u0096\7n\2\2\u0096\u0097\7g\2\2\u0097\u0098"+
		"\7c\2\2\u0098\u0099\7p\2\2\u0099\u009a\3\2\2\2\u009a\u009c\b\25\22\2\u009b"+
		"\u008b\3\2\2\2\u009b\u0092\3\2\2\2\u009c*\3\2\2\2\u009d\u009e\7\62\2\2"+
		"\u009e\u00a1\t\5\2\2\u009f\u00a2\5\5\3\2\u00a0\u00a2\t\6\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\b\26\23\2\u00a6,\3\2\2"+
		"\2\u00a7\u00a8\7)\2\2\u00a8\u00a9\n\7\2\2\u00a9\u00aa\7)\2\2\u00aa\u00ab"+
		"\b\27\24\2\u00ab.\3\2\2\2\u00ac\u00b0\7$\2\2\u00ad\u00af\n\b\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7$\2\2\u00b4"+
		"\u00b5\b\30\25\2\u00b5\60\3\2\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7t\2"+
		"\2\u00b8\u00b9\7w\2\2\u00b9\u00c0\7g\2\2\u00ba\u00bb\7h\2\2\u00bb\u00bc"+
		"\7c\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7u\2\2\u00be\u00c0\7g\2\2\u00bf"+
		"\u00b6\3\2\2\2\u00bf\u00ba\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\b\31"+
		"\26\2\u00c2\62\3\2\2\2\u00c3\u00c9\5\7\4\2\u00c4\u00c8\5\7\4\2\u00c5\u00c8"+
		"\5\5\3\2\u00c6\u00c8\7a\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\b\32\27\2\u00cd"+
		"\64\3\2\2\2\21\28CHMRY\u0089\u009b\u00a1\u00a3\u00b0\u00bf\u00c7\u00c9"+
		"\30\3\2\2\3\6\3\3\7\4\3\b\5\3\t\6\3\n\7\3\13\b\3\f\t\3\r\n\3\16\13\3\17"+
		"\f\3\20\r\3\21\16\3\22\17\3\23\20\3\24\21\3\25\22\3\26\23\3\27\24\3\30"+
		"\25\3\31\26\3\32\27";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
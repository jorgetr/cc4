// Generated from Lab02.g by ANTLR 4.3

  package laboratorios.lab02;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Lab02 extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DIGIT=1, ENTERO=2, FLOTANTE=3, SUMA=4, RESTA=5, MULT=6, DIV=7, ESPACIOS=8, 
		VAR=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'"
	};
	public static final String[] ruleNames = {
		"DIGIT", "ENTERO", "FLOTANTE", "SUMA", "RESTA", "MULT", "DIV", "ESPACIOS", 
		"VAR", "DIGT", "ALPHA"
	};


	public Lab02(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lab02.g"; }

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
		case 1: ENTERO_action((RuleContext)_localctx, actionIndex); break;

		case 2: FLOTANTE_action((RuleContext)_localctx, actionIndex); break;

		case 3: SUMA_action((RuleContext)_localctx, actionIndex); break;

		case 4: RESTA_action((RuleContext)_localctx, actionIndex); break;

		case 5: MULT_action((RuleContext)_localctx, actionIndex); break;

		case 6: DIV_action((RuleContext)_localctx, actionIndex); break;

		case 7: ESPACIOS_action((RuleContext)_localctx, actionIndex); break;

		case 8: VAR_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void RESTA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:  System.out.println("resta"); break;
		}
	}
	private void ENTERO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  System.out.println("entero"); break;
		}
	}
	private void VAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:  System.out.println("ERROR LETRAS"); break;
		}
	}
	private void SUMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:  System.out.println("suma"); break;
		}
	}
	private void ESPACIOS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:  skip();  break;
		}
	}
	private void DIV_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:  System.out.println("division"); break;
		}
	}
	private void MULT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:  System.out.println("multiplicacion"); break;
		}
	}
	private void FLOTANTE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:  System.out.println("real"); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13P\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\6\3\35\n\3\r\3\16\3\36\3\3\3\3\3\4\6\4$\n\4\r"+
		"\4\16\4%\3\4\3\4\6\4*\n\4\r\4\16\4+\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\t\6\t=\n\t\r\t\16\t>\3\t\3\t\3\n\3\n\3\n\7\n"+
		"F\n\n\f\n\16\nI\13\n\3\n\3\n\3\13\3\13\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\2\27\2\3\2\4\5\2\13\f\17\17\"\"\5\2C\\aac|S"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\31\3\2\2\2\5\34\3\2\2\2"+
		"\7#\3\2\2\2\t/\3\2\2\2\13\62\3\2\2\2\r\65\3\2\2\2\178\3\2\2\2\21<\3\2"+
		"\2\2\23B\3\2\2\2\25L\3\2\2\2\27N\3\2\2\2\31\32\4\62;\2\32\4\3\2\2\2\33"+
		"\35\5\3\2\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37"+
		" \3\2\2\2 !\b\3\2\2!\6\3\2\2\2\"$\5\3\2\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2"+
		"\2%&\3\2\2\2&\'\3\2\2\2\')\7\60\2\2(*\5\3\2\2)(\3\2\2\2*+\3\2\2\2+)\3"+
		"\2\2\2+,\3\2\2\2,-\3\2\2\2-.\b\4\3\2.\b\3\2\2\2/\60\7-\2\2\60\61\b\5\4"+
		"\2\61\n\3\2\2\2\62\63\7/\2\2\63\64\b\6\5\2\64\f\3\2\2\2\65\66\7,\2\2\66"+
		"\67\b\7\6\2\67\16\3\2\2\289\7\61\2\29:\b\b\7\2:\20\3\2\2\2;=\t\2\2\2<"+
		";\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\b\t\b\2A\22\3\2\2"+
		"\2BG\5\27\f\2CF\5\27\f\2DF\5\25\13\2EC\3\2\2\2ED\3\2\2\2FI\3\2\2\2GE\3"+
		"\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\b\n\t\2K\24\3\2\2\2LM\4\62;\2M"+
		"\26\3\2\2\2NO\t\3\2\2O\30\3\2\2\2\t\2\36%+>EG\n\3\3\2\3\4\3\3\5\4\3\6"+
		"\5\3\7\6\3\b\7\3\t\b\3\n\t";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
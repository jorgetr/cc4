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
		WHITESPACE=1, INT=2, FLOAT=3, PLUS=4, MINUS=5, NUMBER=6;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'"
	};
	public static final String[] ruleNames = {
		"WHITESPACE", "INT", "FLOAT", "PLUS", "MINUS", "NUMBER", "DIGIT"
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
		case 0: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;

		case 1: INT_action((RuleContext)_localctx, actionIndex); break;

		case 2: FLOAT_action((RuleContext)_localctx, actionIndex); break;

		case 3: PLUS_action((RuleContext)_localctx, actionIndex); break;

		case 4: MINUS_action((RuleContext)_localctx, actionIndex); break;

		case 5: NUMBER_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  skip();  break;
		}
	}
	private void PLUS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:  System.out.println ("suma"); break;
		}
	}
	private void FLOAT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:  System.out.println("palabra reservada: float"); break;
		}
	}
	private void INT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:  System.out.println("palabra reservada: int o bo"); break;
		}
	}
	private void MINUS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:  System.out.println ("resta"); break;
		}
	}
	private void NUMBER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:  System.out.println ("numero"); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\b?\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\23\n\2\r\2\16\2"+
		"\24\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3#\n\3\r\3\16\3"+
		"$\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7"+
		"\6\78\n\7\r\7\16\79\3\7\3\7\3\b\3\b\2\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\2\3\2\3\5\2\13\f\17\17\"\"A\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\22\3\2\2\2\5\"\3\2\2\2\7(\3\2\2\2\t"+
		"\60\3\2\2\2\13\63\3\2\2\2\r\67\3\2\2\2\17=\3\2\2\2\21\23\t\2\2\2\22\21"+
		"\3\2\2\2\23\24\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\26\3\2\2\2\26\27"+
		"\b\2\2\2\27\4\3\2\2\2\30\31\7k\2\2\31\32\7p\2\2\32#\7v\2\2\33\34\7d\2"+
		"\2\34\35\7q\2\2\35\36\7q\2\2\36\37\7n\2\2\37 \7g\2\2 !\7c\2\2!#\7p\2\2"+
		"\"\30\3\2\2\2\"\33\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'"+
		"\b\3\3\2\'\6\3\2\2\2()\7h\2\2)*\7n\2\2*+\7q\2\2+,\7c\2\2,-\7v\2\2-.\3"+
		"\2\2\2./\b\4\4\2/\b\3\2\2\2\60\61\7-\2\2\61\62\b\5\5\2\62\n\3\2\2\2\63"+
		"\64\7/\2\2\64\65\b\6\6\2\65\f\3\2\2\2\668\5\17\b\2\67\66\3\2\2\289\3\2"+
		"\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\b\7\7\2<\16\3\2\2\2=>\4\62;\2>"+
		"\20\3\2\2\2\7\2\24\"$9\b\3\2\2\3\3\3\3\4\4\3\5\5\3\6\6\3\7\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
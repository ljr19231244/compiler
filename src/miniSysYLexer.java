// Generated from C:/Users/ASUS/Desktop/大三上软件/编译原理/实验/正式实验/src\miniSysY.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miniSysYLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FuncType=1, Ident=2, Left_bracket=3, Right_bracket=4, Left_braces=5, Right_braces=6, 
		RETURN=7, Semicolon=8, Zero=9, Hexadecimal_prefix=10, Nonzero_digit=11, 
		Octal_digit=12, Hexadecimal_digit=13, Notes1=14, Notes2=15, Space=16, 
		White_space=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FuncType", "Ident", "Left_bracket", "Right_bracket", "Left_braces", 
			"Right_braces", "RETURN", "Semicolon", "Zero", "Hexadecimal_prefix", 
			"Nonzero_digit", "Octal_digit", "Hexadecimal_digit", "Notes1", "Notes2", 
			"Space", "White_space"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'main'", "'('", "')'", "'{'", "'}'", "'return'", "';'", 
			"'0'", null, null, null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FuncType", "Ident", "Left_bracket", "Right_bracket", "Left_braces", 
			"Right_braces", "RETURN", "Semicolon", "Zero", "Hexadecimal_prefix", 
			"Nonzero_digit", "Octal_digit", "Hexadecimal_digit", "Notes1", "Notes2", 
			"Space", "White_space"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public miniSysYLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "miniSysY.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23p\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\5\13F\n"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17T\n\17"+
		"\f\17\16\17W\13\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20b"+
		"\n\20\f\20\16\20e\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3U\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23\3\2\5\5\2\62;CHch\4\2\f\f\17\17\4\2\13\f\17\17"+
		"\2s\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3"+
		"\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
		"\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3"+
		"\2\2\2\3%\3\2\2\2\5)\3\2\2\2\7.\3\2\2\2\t\60\3\2\2\2\13\62\3\2\2\2\r\64"+
		"\3\2\2\2\17\66\3\2\2\2\21=\3\2\2\2\23?\3\2\2\2\25E\3\2\2\2\27G\3\2\2\2"+
		"\31I\3\2\2\2\33K\3\2\2\2\35M\3\2\2\2\37]\3\2\2\2!h\3\2\2\2#l\3\2\2\2%"+
		"&\7k\2\2&\'\7p\2\2\'(\7v\2\2(\4\3\2\2\2)*\7o\2\2*+\7c\2\2+,\7k\2\2,-\7"+
		"p\2\2-\6\3\2\2\2./\7*\2\2/\b\3\2\2\2\60\61\7+\2\2\61\n\3\2\2\2\62\63\7"+
		"}\2\2\63\f\3\2\2\2\64\65\7\177\2\2\65\16\3\2\2\2\66\67\7t\2\2\678\7g\2"+
		"\289\7v\2\29:\7w\2\2:;\7t\2\2;<\7p\2\2<\20\3\2\2\2=>\7=\2\2>\22\3\2\2"+
		"\2?@\7\62\2\2@\24\3\2\2\2AB\7\62\2\2BF\7z\2\2CD\7\62\2\2DF\7Z\2\2EA\3"+
		"\2\2\2EC\3\2\2\2F\26\3\2\2\2GH\4\63;\2H\30\3\2\2\2IJ\4\629\2J\32\3\2\2"+
		"\2KL\t\2\2\2L\34\3\2\2\2MN\7\61\2\2NO\7,\2\2OU\3\2\2\2PT\13\2\2\2QR\7"+
		"\61\2\2RT\7p\2\2SP\3\2\2\2SQ\3\2\2\2TW\3\2\2\2UV\3\2\2\2US\3\2\2\2VX\3"+
		"\2\2\2WU\3\2\2\2XY\7,\2\2YZ\7\61\2\2Z[\3\2\2\2[\\\b\17\2\2\\\36\3\2\2"+
		"\2]^\7\61\2\2^_\7\61\2\2_c\3\2\2\2`b\n\3\2\2a`\3\2\2\2be\3\2\2\2ca\3\2"+
		"\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\b\20\2\2g \3\2\2\2hi\7\"\2\2ij\3"+
		"\2\2\2jk\b\21\2\2k\"\3\2\2\2lm\t\4\2\2mn\3\2\2\2no\b\22\2\2o$\3\2\2\2"+
		"\7\2ESUc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
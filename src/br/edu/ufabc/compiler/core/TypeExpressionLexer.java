// Generated from TypeExpression.g4 by ANTLR 4.13.0
package br.edu.ufabc.compiler.core;

	import java.util.ArrayList;
	import java.util.List;
	import symbols.DataType;
	import java.util.Stack;
	import symbols.Identifier;
	import symbols.SymbolTable;
	import expressions.*;
	import ast.*;
	

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TypeExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		NUMBER=10, TEXT=11, ATTR=12, SUM=13, SUB=14, DIV=15, MUL=16, OPREL=17, 
		ID=18, VIRG=19, PF=20, AP=21, FP=22, BLANK=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"NUMBER", "TEXT", "ATTR", "SUM", "SUB", "DIV", "MUL", "OPREL", "ID", 
			"VIRG", "PF", "AP", "FP", "BLANK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog.'", "'INTEGER'", "'REAL'", "'se'", "'entao'", 
			"'senao'", "'leia'", "'escreva'", null, null, "':='", "'+'", "'-'", "'/'", 
			"'*'", null, null, "','", "'.'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "NUMBER", 
			"TEXT", "ATTR", "SUM", "SUB", "DIV", "MUL", "OPREL", "ID", "VIRG", "PF", 
			"AP", "FP", "BLANK"
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


		private SymbolTable symbolTable = new SymbolTable();
		private DataType currentType;
		private AbstractExpression expression;
		private char operator;
		private DataType leftDT;
		private DataType rightDT;
		private String   idAtribuido;
		private String   text;
		private Program  program = new Program();
		private Stack<List<AbstractCommand>> stack = new Stack<List<AbstractCommand>>();
		
		public void init(){
			program.setSymbolTable(symbolTable);
			stack.push(new ArrayList<AbstractCommand>());
		}
			
		public void exibirID(){
			symbolTable.getSymbols().values().stream().forEach((id)->System.out.println(id));
		}
		
		public void generateObjectCode(){
			program.generateTarget();
		}
		
		public void runInterpreter(){
			program.run();
		}


	public TypeExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TypeExpression.g4"; }

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
		"\u0004\u0000\u0017\u00a2\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0004\tl\b\t\u000b\t\f\tm\u0001\n\u0001\n\u0005\nr\b\n\n\n"+
		"\f\nu\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u008e\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u0092\b\u0011\n\u0011\f\u0011\u0095"+
		"\t\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0000\u0000\u0017\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017\u0001\u0000\u0005\u0001\u000009\u0006\u0000"+
		"\t\t !--09AZaz\u0001\u0000az\u0003\u000009AZaz\u0003\u0000\t\n\r\r  \u00a9"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0001/"+
		"\u0001\u0000\u0000\u0000\u00038\u0001\u0000\u0000\u0000\u0005A\u0001\u0000"+
		"\u0000\u0000\u0007I\u0001\u0000\u0000\u0000\tN\u0001\u0000\u0000\u0000"+
		"\u000bQ\u0001\u0000\u0000\u0000\rW\u0001\u0000\u0000\u0000\u000f]\u0001"+
		"\u0000\u0000\u0000\u0011b\u0001\u0000\u0000\u0000\u0013k\u0001\u0000\u0000"+
		"\u0000\u0015o\u0001\u0000\u0000\u0000\u0017x\u0001\u0000\u0000\u0000\u0019"+
		"{\u0001\u0000\u0000\u0000\u001b}\u0001\u0000\u0000\u0000\u001d\u007f\u0001"+
		"\u0000\u0000\u0000\u001f\u0081\u0001\u0000\u0000\u0000!\u008d\u0001\u0000"+
		"\u0000\u0000#\u008f\u0001\u0000\u0000\u0000%\u0096\u0001\u0000\u0000\u0000"+
		"\'\u0098\u0001\u0000\u0000\u0000)\u009a\u0001\u0000\u0000\u0000+\u009c"+
		"\u0001\u0000\u0000\u0000-\u009e\u0001\u0000\u0000\u0000/0\u0005p\u0000"+
		"\u000001\u0005r\u0000\u000012\u0005o\u0000\u000023\u0005g\u0000\u0000"+
		"34\u0005r\u0000\u000045\u0005a\u0000\u000056\u0005m\u0000\u000067\u0005"+
		"a\u0000\u00007\u0002\u0001\u0000\u0000\u000089\u0005f\u0000\u00009:\u0005"+
		"i\u0000\u0000:;\u0005m\u0000\u0000;<\u0005p\u0000\u0000<=\u0005r\u0000"+
		"\u0000=>\u0005o\u0000\u0000>?\u0005g\u0000\u0000?@\u0005.\u0000\u0000"+
		"@\u0004\u0001\u0000\u0000\u0000AB\u0005I\u0000\u0000BC\u0005N\u0000\u0000"+
		"CD\u0005T\u0000\u0000DE\u0005E\u0000\u0000EF\u0005G\u0000\u0000FG\u0005"+
		"E\u0000\u0000GH\u0005R\u0000\u0000H\u0006\u0001\u0000\u0000\u0000IJ\u0005"+
		"R\u0000\u0000JK\u0005E\u0000\u0000KL\u0005A\u0000\u0000LM\u0005L\u0000"+
		"\u0000M\b\u0001\u0000\u0000\u0000NO\u0005s\u0000\u0000OP\u0005e\u0000"+
		"\u0000P\n\u0001\u0000\u0000\u0000QR\u0005e\u0000\u0000RS\u0005n\u0000"+
		"\u0000ST\u0005t\u0000\u0000TU\u0005a\u0000\u0000UV\u0005o\u0000\u0000"+
		"V\f\u0001\u0000\u0000\u0000WX\u0005s\u0000\u0000XY\u0005e\u0000\u0000"+
		"YZ\u0005n\u0000\u0000Z[\u0005a\u0000\u0000[\\\u0005o\u0000\u0000\\\u000e"+
		"\u0001\u0000\u0000\u0000]^\u0005l\u0000\u0000^_\u0005e\u0000\u0000_`\u0005"+
		"i\u0000\u0000`a\u0005a\u0000\u0000a\u0010\u0001\u0000\u0000\u0000bc\u0005"+
		"e\u0000\u0000cd\u0005s\u0000\u0000de\u0005c\u0000\u0000ef\u0005r\u0000"+
		"\u0000fg\u0005e\u0000\u0000gh\u0005v\u0000\u0000hi\u0005a\u0000\u0000"+
		"i\u0012\u0001\u0000\u0000\u0000jl\u0007\u0000\u0000\u0000kj\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001"+
		"\u0000\u0000\u0000n\u0014\u0001\u0000\u0000\u0000os\u0005\"\u0000\u0000"+
		"pr\u0007\u0001\u0000\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000vw\u0005\"\u0000\u0000w\u0016\u0001"+
		"\u0000\u0000\u0000xy\u0005:\u0000\u0000yz\u0005=\u0000\u0000z\u0018\u0001"+
		"\u0000\u0000\u0000{|\u0005+\u0000\u0000|\u001a\u0001\u0000\u0000\u0000"+
		"}~\u0005-\u0000\u0000~\u001c\u0001\u0000\u0000\u0000\u007f\u0080\u0005"+
		"/\u0000\u0000\u0080\u001e\u0001\u0000\u0000\u0000\u0081\u0082\u0005*\u0000"+
		"\u0000\u0082 \u0001\u0000\u0000\u0000\u0083\u008e\u0005>\u0000\u0000\u0084"+
		"\u0085\u0005>\u0000\u0000\u0085\u008e\u0005=\u0000\u0000\u0086\u008e\u0005"+
		"<\u0000\u0000\u0087\u0088\u0005<\u0000\u0000\u0088\u008e\u0005=\u0000"+
		"\u0000\u0089\u008a\u0005=\u0000\u0000\u008a\u008e\u0005=\u0000\u0000\u008b"+
		"\u008c\u0005<\u0000\u0000\u008c\u008e\u0005>\u0000\u0000\u008d\u0083\u0001"+
		"\u0000\u0000\u0000\u008d\u0084\u0001\u0000\u0000\u0000\u008d\u0086\u0001"+
		"\u0000\u0000\u0000\u008d\u0087\u0001\u0000\u0000\u0000\u008d\u0089\u0001"+
		"\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\"\u0001\u0000"+
		"\u0000\u0000\u008f\u0093\u0007\u0002\u0000\u0000\u0090\u0092\u0007\u0003"+
		"\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000"+
		"\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000"+
		"\u0000\u0000\u0094$\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0005,\u0000\u0000\u0097&\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0005.\u0000\u0000\u0099(\u0001\u0000\u0000\u0000\u009a\u009b\u0005"+
		"(\u0000\u0000\u009b*\u0001\u0000\u0000\u0000\u009c\u009d\u0005)\u0000"+
		"\u0000\u009d,\u0001\u0000\u0000\u0000\u009e\u009f\u0007\u0004\u0000\u0000"+
		"\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0006\u0016\u0000\u0000"+
		"\u00a1.\u0001\u0000\u0000\u0000\u0007\u0000mqs\u008d\u0091\u0093\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
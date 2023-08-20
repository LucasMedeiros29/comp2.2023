// Generated from Gramatica.g4 by ANTLR 4.13.0
package comp.src.parser;

    import comp.src.datastructures.*;
import comp.src.parser.GramaticaParser.cmdLeContext;
import comp.src.parser.GramaticaParser.cmdIfContext;
import comp.src.parser.GramaticaParser.cmdWhileContext;
import comp.src.parser.GramaticaParser.cmdAtribuiContext;
import comp.src.parser.GramaticaParser.cmdEscreveContext;
import comp.src.ast.*;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Stack;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, SINGLETERMOPERATOR=12, OPENPARENTHESIS=13, CLOSEPARENTHESIS=14, 
		OPENBRACKETS=15, CLOSEBRACKETS=16, SEMICOLON=17, OPERATOR=18, ATTRIBUTION=19, 
		RELATIONALOPERATOR=20, IDENTIFIER=22, NUMBER=23, TEXT=24, 
		COMMA=25, DOUBLEQUOTE=26, WHITESPACE=27;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_declarationStatement = 2, 
		RULE_block = 3, RULE_command = 4, RULE_cmdLe = 5, RULE_cmdEscreve = 6, 
		RULE_cmdAtribui = 7, RULE_cmdIf = 8, RULE_cmdWhile = 9, RULE_expression = 10, 
		RULE_term = 11, RULE_type = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "declarationStatement", "block", "command", 
			"cmdLe", "cmdEscreve", "cmdAtribui", "cmdIf", "cmdWhile", 
			"expression", "term", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog;'", "'declara'", "'leia'", "'escreva'", 
			"'se'", "'senao'", "'enquanto'", "'texto'", "'numero'", 
			null, "'('", "')'", "'{'", "'}'", "';'", null, "'='", null, null, null, 
			null, null, "','", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"SINGLETERMOPERATOR", "OPENPARENTHESIS", "CLOSEPARENTHESIS", "OPENBRACKETS", 
			"CLOSEBRACKETS", "SEMICOLON", "OPERATOR", "ATTRIBUTION", "RELATIONALOPERATOR", 
			"IDENTIFIER", "NUMBER", "TEXT", "COMMA", "DOUBLEQUOTE", "WHITESPACE"
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

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private int _type;
	    private String _varName;
	    private String _varValue;
	    private List<String> _unusedVariables = new ArrayList<String>();
	    private GramaticaSymbol symbol;
	    private GramaticaSymbolTable symbolTable = new GramaticaSymbolTable();

	    //Generate code variables start

	    private Program program = new Program();
	    private ArrayList<AbstractCommand> currentThread;

	    private Stack<ArrayList<AbstractCommand>> allCommands = new Stack<ArrayList<AbstractCommand>>();

	    private String _commandId;
	    private String _expressionId;
	    private String _expressionContent;
	    private Stack<String> _expressionConditionStack = new Stack<String>();
	    private String _expressionCondition;
	    private String _expressionWhileCondition;
	    private Stack<String> _expressionWhileConditionStack = new Stack<String>();
	    private ArrayList<AbstractCommand> TipoLista;
	    private ArrayList<AbstractCommand> NaoLista;
	    private ArrayList<AbstractCommand> whileList;

	    //Generate code variables end


	    public void exibeComandos(){
	        for (AbstractCommand c : program.getCommands()){
	             System.out.println(c);
	        }
	    }
	    public void generateCode(){
	        program.generateTarget();
	    }

	    public void verifyID(String id) throws Exception{
	       if (!symbolTable.exists(id)){
	           throw new Exception("Symbol "+id+" not declared");
	       }
	    }
	    public void verifyType(String id, int type) throws Exception{
	       if (((GramaticaVariable) symbolTable.get(id)).getType() != type){
	           throw new Exception("Symbol "+id+" has wrong type");
	       }
	    }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws Exception {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__0);
			setState(27);
			declaration();
			setState(28);
			block();
			setState(29);
			match(T__1);

			    program.setVartable(symbolTable);
			    program.setCommands(allCommands.pop());
			    if(_unusedVariables.size() > 0){
			        System.err.println("Unused variables: "+_unusedVariables);
			    }

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public List<DeclarationStatementContext> declarationStatement() {
			return getRuleContexts(DeclarationStatementContext.class);
		}
		public DeclarationStatementContext declarationStatement(int i) {
			return getRuleContext(DeclarationStatementContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws Exception {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				declarationStatement();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationStatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(GramaticaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GramaticaParser.IDENTIFIER, i);
		}
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
		}
		public DeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclarationStatement(this);
		}
	}

	public final DeclarationStatementContext declarationStatement() throws Exception {
		DeclarationStatementContext _localctx = new DeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__2);
			setState(38);
			type();
			setState(39);
			match(IDENTIFIER);

				                  _varName = _input.LT(-1).getText();
				                  _varValue = null;
				                  symbol = new GramaticaVariable(_varName, _type, _varValue);
				                  if (!symbolTable.exists(_varName)){
				                     symbolTable.add(symbol);
				                     _unusedVariables.add(_varName);
				                  }
				                  else{
				                  	 throw new Exception("Symbol "+_varName+" already declared");
				                  }
			                    
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(41);
				match(COMMA);
				setState(42);
				match(IDENTIFIER);

					                  _varName = _input.LT(-1).getText();
					                  _varValue = null;
					                  symbol = new GramaticaVariable(_varName, _type, _varValue);
					                  if (!symbolTable.exists(_varName)){
					                    symbolTable.add(symbol);
					                    _unusedVariables.add(_varName);
					                  }
					                  else{
					                  	 throw new Exception("Symbol "+_varName+" already declared");
					                  }
				                    
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws Exception {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			    currentThread = new ArrayList<AbstractCommand>();
			    allCommands.push(currentThread);

			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				command();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << IDENTIFIER))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public cmdLeContext cmdLe() {
			return getRuleContext(cmdLeContext.class,0);
		}
		public cmdEscreveContext cmdEscreve() {
			return getRuleContext(cmdEscreveContext.class,0);
		}
		public cmdAtribuiContext cmdAtribui() {
			return getRuleContext(cmdAtribuiContext.class,0);
		}
		public cmdIfContext cmdIf() {
			return getRuleContext(cmdIfContext.class,0);
		}
		public cmdWhileContext cmdWhile() {
			return getRuleContext(cmdWhileContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws Exception {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_command);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				cmdLe();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				cmdEscreve();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				cmdAtribui();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				cmdIf();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				cmdWhile();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class cmdLeContext extends ParserRuleContext {
		public TerminalNode OPENPARENTHESIS() { return getToken(GramaticaParser.OPENPARENTHESIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GramaticaParser.IDENTIFIER, 0); }
		public TerminalNode CLOSEPARENTHESIS() { return getToken(GramaticaParser.CLOSEPARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public cmdLeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).entercmdLe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitcmdLe(this);
		}
	}

	public final cmdLeContext cmdLe() throws Exception {
		cmdLeContext _localctx = new cmdLeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmdLe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__3);
			setState(65);
			match(OPENPARENTHESIS);
			setState(66);
			match(IDENTIFIER);

			                   verifyID(_input.LT(-1).getText());
			                   _commandId = _input.LT(-1).getText();
			               
			setState(68);
			match(CLOSEPARENTHESIS);
			setState(69);
			match(SEMICOLON);

			                    GramaticaVariable var = (GramaticaVariable) symbolTable.get(_commandId);
								cmdLe command = new cmdLe(_commandId, var);
			                    allCommands.peek().add(command);
			               
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class cmdEscreveContext extends ParserRuleContext {
		public TerminalNode OPENPARENTHESIS() { return getToken(GramaticaParser.OPENPARENTHESIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GramaticaParser.IDENTIFIER, 0); }
		public TerminalNode CLOSEPARENTHESIS() { return getToken(GramaticaParser.CLOSEPARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public cmdEscreveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEscreve; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).entercmdEscreve(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitcmdEscreve(this);
		}
	}

	public final cmdEscreveContext cmdEscreve() throws Exception {
		cmdEscreveContext _localctx = new cmdEscreveContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdEscreve);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__4);
			setState(73);
			match(OPENPARENTHESIS);
			setState(74);
			match(IDENTIFIER);

			                            verifyID(_input.LT(-1).getText());
			                            _commandId = _input.LT(-1).getText();
			                        
			setState(76);
			match(CLOSEPARENTHESIS);
			setState(77);
			match(SEMICOLON);

			                            cmdEscreve command = new cmdEscreve(_commandId);
			                            allCommands.peek().add(command);
			                        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class cmdAtribuiContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GramaticaParser.IDENTIFIER, 0); }
		public TerminalNode ATTRIBUTION() { return getToken(GramaticaParser.ATTRIBUTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public cmdAtribuiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtribui; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).entercmdAtribui(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitcmdAtribui(this);
		}
	}

	public final cmdAtribuiContext cmdAtribui() throws Exception {
		cmdAtribuiContext _localctx = new cmdAtribuiContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdAtribui);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(IDENTIFIER);

			                   _varName = _input.LT(-1).getText();
			                   verifyID(_varName);
			                   _unusedVariables.remove(_varName);
			                   _expressionId = _varName;
			               
			setState(82);
			match(ATTRIBUTION);
			 _expressionContent = ""; 
			setState(84);
			expression();
			setState(85);
			match(SEMICOLON);

			                   verifyType(_varName, _type);
			                   cmdAtribui command = new cmdAtribui(_expressionId, _expressionContent);
			                   allCommands.peek().add(command);
			               
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class cmdIfContext extends ParserRuleContext {
		public TerminalNode OPENPARENTHESIS() { return getToken(GramaticaParser.OPENPARENTHESIS, 0); }
		public TerminalNode CLOSEPARENTHESIS() { return getToken(GramaticaParser.CLOSEPARENTHESIS, 0); }
		public List<TerminalNode> OPENBRACKETS() { return getTokens(GramaticaParser.OPENBRACKETS); }
		public TerminalNode OPENBRACKETS(int i) {
			return getToken(GramaticaParser.OPENBRACKETS, i);
		}
		public List<TerminalNode> CLOSEBRACKETS() { return getTokens(GramaticaParser.CLOSEBRACKETS); }
		public TerminalNode CLOSEBRACKETS(int i) {
			return getToken(GramaticaParser.CLOSEBRACKETS, i);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode RELATIONALOPERATOR() { return getToken(GramaticaParser.RELATIONALOPERATOR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(GramaticaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GramaticaParser.IDENTIFIER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(GramaticaParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(GramaticaParser.NUMBER, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(GramaticaParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(GramaticaParser.TEXT, i);
		}
		public cmdIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).entercmdIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitcmdIf(this);
		}
	}

	public final cmdIfContext cmdIf() throws Exception {
		cmdIfContext _localctx = new cmdIfContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__5);
			setState(89);
			match(OPENPARENTHESIS);
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				{
				setState(90);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L) | (1L << IDENTIFIER) | (1L << NUMBER) | (1L << TEXT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}

				                    _expressionCondition = _input.LT(-1).getText();
				                
				setState(92);
				match(RELATIONALOPERATOR);
				 _expressionCondition += _input.LT(-1).getText(); 
				setState(94);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L) | (1L << IDENTIFIER) | (1L << NUMBER) | (1L << TEXT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				 _expressionCondition += _input.LT(-1).getText(); 
				}
				}
				break;
			case 2:
				{
				setState(96);
				 _expressionCondition = _input.LT(-1).getText(); 
				}
				break;
			}
			setState(100);
			match(CLOSEPARENTHESIS);

			                    _expressionConditionStack.push(_expressionCondition);
			                
			setState(102);
			match(OPENBRACKETS);

			                    currentThread = new ArrayList<AbstractCommand>();
			                    allCommands.push(currentThread);
			                
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				command();
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << IDENTIFIER))) != 0) );
			setState(109);
			match(CLOSEBRACKETS);

			                    TipoLista = allCommands.pop();
			                
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(111);
				match(T__6);
				setState(112);
				match(OPENBRACKETS);

				                      currentThread = new ArrayList<AbstractCommand>();
				                      allCommands.push(currentThread);
				                  
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(114);
					command();
					}
					}
					setState(117); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << IDENTIFIER))) != 0) );
				setState(119);
				match(CLOSEBRACKETS);

				                      NaoLista = allCommands.pop();
				                      cmdIf command = new cmdIf(_expressionConditionStack.pop(), TipoLista, NaoLista);
				                      allCommands.peek().add(command);
				                  
				}
			}


			                      if(NaoLista == null){
									cmdIf command = new cmdIf(_expressionConditionStack.pop(), TipoLista, new ArrayList<AbstractCommand>());
			                          allCommands.peek().add(command);
			                      }
			                      NaoLista = null;
			                
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class cmdWhileContext extends ParserRuleContext {
		public TerminalNode OPENPARENTHESIS() { return getToken(GramaticaParser.OPENPARENTHESIS, 0); }
		public TerminalNode CLOSEPARENTHESIS() { return getToken(GramaticaParser.CLOSEPARENTHESIS, 0); }
		public TerminalNode OPENBRACKETS() { return getToken(GramaticaParser.OPENBRACKETS, 0); }
		public TerminalNode CLOSEBRACKETS() { return getToken(GramaticaParser.CLOSEBRACKETS, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode RELATIONALOPERATOR() { return getToken(GramaticaParser.RELATIONALOPERATOR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(GramaticaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GramaticaParser.IDENTIFIER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(GramaticaParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(GramaticaParser.NUMBER, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(GramaticaParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(GramaticaParser.TEXT, i);
		}
		public cmdWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).entercmdWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitcmdWhile(this);
		}
	}

	public final cmdWhileContext cmdWhile() throws Exception {
		cmdWhileContext _localctx = new cmdWhileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdWhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__7);
			setState(127);
			match(OPENPARENTHESIS);
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				{
				setState(128);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L) | (1L << IDENTIFIER) | (1L << NUMBER) | (1L << TEXT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				 _expressionWhileCondition = _input.LT(-1).getText(); 
				setState(130);
				match(RELATIONALOPERATOR);
				 _expressionWhileCondition += _input.LT(-1).getText(); 
				setState(132);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L) | (1L << IDENTIFIER) | (1L << NUMBER) | (1L << TEXT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				 _expressionWhileCondition += _input.LT(-1).getText(); 
				}
				}
				break;
			case 2:
				{
				setState(134);
				 _expressionWhileCondition = _input.LT(-1).getText(); 
				}
				break;
			}
			setState(138);
			match(CLOSEPARENTHESIS);

			                     _expressionWhileConditionStack.push(_expressionWhileCondition);
			                
			setState(140);
			match(OPENBRACKETS);

			                    currentThread = new ArrayList<AbstractCommand>();
			                    allCommands.push(currentThread);
			                
			setState(143); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(142);
				command();
				}
				}
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << IDENTIFIER))) != 0) );
			setState(147);
			match(CLOSEBRACKETS);

			                    whileList = allCommands.pop();
			                    cmdWhile command = new cmdWhile(_expressionWhileConditionStack.pop(), whileList);
			                    allCommands.peek().add(command);
			                
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode OPERATOR() { return getToken(GramaticaParser.OPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SINGLETERMOPERATOR() { return getToken(GramaticaParser.SINGLETERMOPERATOR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws Exception {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		int _la;
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case NUMBER:
			case TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				term();
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATOR) {
					{
					setState(151);
					match(OPERATOR);
					 _expressionContent += _input.LT(-1).getText(); 
					setState(153);
					expression();
					}
				}

				}
				break;
			case SINGLETERMOPERATOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(SINGLETERMOPERATOR);
				 _expressionContent += _input.LT(-1).getText(); 
				setState(158);
				term();
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATOR) {
					{
					setState(159);
					match(OPERATOR);
					 _expressionContent += _input.LT(-1).getText(); 
					setState(161);
					expression();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GramaticaParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(GramaticaParser.NUMBER, 0); }
		public TerminalNode TEXT() { return getToken(GramaticaParser.TEXT, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws Exception {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_term);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(IDENTIFIER);
				 verifyID(_input.LT(-1).getText());
				                  _type = ((GramaticaVariable) symbolTable.get(_input.LT(-1).getText())).getType();
				                  _expressionContent += _input.LT(-1).getText();
				                
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(NUMBER);

				        _type = GramaticaVariable.NUMBER;
				        _expressionContent += _input.LT(-1).getText();
				    
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(TEXT);

				        _type = GramaticaVariable.TEXT;
				        _expressionContent += _input.LT(-1).getText();
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(T__8);
				_type = GramaticaVariable.TEXT;
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(T__9);
				_type = GramaticaVariable.NUMBER;
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001b\u00b9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0004\u0001\"\b\u0001\u000b\u0001\f\u0001"+
		"#\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002-\b\u0002\n\u0002\f\u00020\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0004\u00036\b\u0003\u000b\u0003"+
		"\f\u00037\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004?\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bc\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0004\bj\b\b\u000b\b\f\bk\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0004\bt\b\b\u000b\b\f\bu\u0001\b\u0001\b\u0001\b\u0003"+
		"\b{\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0089\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0004\t\u0090\b\t\u000b\t\f\t\u0091\u0001\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u009b\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00a3\b\n\u0003\n\u00a5\b\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00af\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00b7\b\f\u0001\f\u0000\u0000\r\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0001"+
		"\u0001\u0000\u0015\u0018\u00c0\u0000\u001a\u0001\u0000\u0000\u0000\u0002"+
		"!\u0001\u0000\u0000\u0000\u0004%\u0001\u0000\u0000\u0000\u00063\u0001"+
		"\u0000\u0000\u0000\b>\u0001\u0000\u0000\u0000\n@\u0001\u0000\u0000\u0000"+
		"\fH\u0001\u0000\u0000\u0000\u000eP\u0001\u0000\u0000\u0000\u0010X\u0001"+
		"\u0000\u0000\u0000\u0012~\u0001\u0000\u0000\u0000\u0014\u00a4\u0001\u0000"+
		"\u0000\u0000\u0016\u00ae\u0001\u0000\u0000\u0000\u0018\u00b6\u0001\u0000"+
		"\u0000\u0000\u001a\u001b\u0005\u0001\u0000\u0000\u001b\u001c\u0003\u0002"+
		"\u0001\u0000\u001c\u001d\u0003\u0006\u0003\u0000\u001d\u001e\u0005\u0002"+
		"\u0000\u0000\u001e\u001f\u0006\u0000\uffff\uffff\u0000\u001f\u0001\u0001"+
		"\u0000\u0000\u0000 \"\u0003\u0004\u0002\u0000! \u0001\u0000\u0000\u0000"+
		"\"#\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000"+
		"\u0000$\u0003\u0001\u0000\u0000\u0000%&\u0005\u0003\u0000\u0000&\'\u0003"+
		"\u0018\f\u0000\'(\u0005\u0016\u0000\u0000(.\u0006\u0002\uffff\uffff\u0000"+
		")*\u0005\u0019\u0000\u0000*+\u0005\u0016\u0000\u0000+-\u0006\u0002\uffff"+
		"\uffff\u0000,)\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/1\u0001\u0000\u0000\u0000"+
		"0.\u0001\u0000\u0000\u000012\u0005\u0011\u0000\u00002\u0005\u0001\u0000"+
		"\u0000\u000035\u0006\u0003\uffff\uffff\u000046\u0003\b\u0004\u000054\u0001"+
		"\u0000\u0000\u000067\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u00008\u0007\u0001\u0000\u0000\u00009?\u0003\n\u0005"+
		"\u0000:?\u0003\f\u0006\u0000;?\u0003\u000e\u0007\u0000<?\u0003\u0010\b"+
		"\u0000=?\u0003\u0012\t\u0000>9\u0001\u0000\u0000\u0000>:\u0001\u0000\u0000"+
		"\u0000>;\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>=\u0001\u0000"+
		"\u0000\u0000?\t\u0001\u0000\u0000\u0000@A\u0005\u0004\u0000\u0000AB\u0005"+
		"\r\u0000\u0000BC\u0005\u0016\u0000\u0000CD\u0006\u0005\uffff\uffff\u0000"+
		"DE\u0005\u000e\u0000\u0000EF\u0005\u0011\u0000\u0000FG\u0006\u0005\uffff"+
		"\uffff\u0000G\u000b\u0001\u0000\u0000\u0000HI\u0005\u0005\u0000\u0000"+
		"IJ\u0005\r\u0000\u0000JK\u0005\u0016\u0000\u0000KL\u0006\u0006\uffff\uffff"+
		"\u0000LM\u0005\u000e\u0000\u0000MN\u0005\u0011\u0000\u0000NO\u0006\u0006"+
		"\uffff\uffff\u0000O\r\u0001\u0000\u0000\u0000PQ\u0005\u0016\u0000\u0000"+
		"QR\u0006\u0007\uffff\uffff\u0000RS\u0005\u0013\u0000\u0000ST\u0006\u0007"+
		"\uffff\uffff\u0000TU\u0003\u0014\n\u0000UV\u0005\u0011\u0000\u0000VW\u0006"+
		"\u0007\uffff\uffff\u0000W\u000f\u0001\u0000\u0000\u0000XY\u0005\u0006"+
		"\u0000\u0000Yb\u0005\r\u0000\u0000Z[\u0007\u0000\u0000\u0000[\\\u0006"+
		"\b\uffff\uffff\u0000\\]\u0005\u0014\u0000\u0000]^\u0006\b\uffff\uffff"+
		"\u0000^_\u0007\u0000\u0000\u0000_c\u0006\b\uffff\uffff\u0000`a\u0005\u0015"+
		"\u0000\u0000ac\u0006\b\uffff\uffff\u0000bZ\u0001\u0000\u0000\u0000b`\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0005\u000e\u0000\u0000"+
		"ef\u0006\b\uffff\uffff\u0000fg\u0005\u000f\u0000\u0000gi\u0006\b\uffff"+
		"\uffff\u0000hj\u0003\b\u0004\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mn\u0005\u0010\u0000\u0000nz\u0006\b\uffff\uffff\u0000"+
		"op\u0005\u0007\u0000\u0000pq\u0005\u000f\u0000\u0000qs\u0006\b\uffff\uffff"+
		"\u0000rt\u0003\b\u0004\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001\u0000"+
		"\u0000\u0000wx\u0005\u0010\u0000\u0000xy\u0006\b\uffff\uffff\u0000y{\u0001"+
		"\u0000\u0000\u0000zo\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000|}\u0006\b\uffff\uffff\u0000}\u0011\u0001\u0000"+
		"\u0000\u0000~\u007f\u0005\b\u0000\u0000\u007f\u0088\u0005\r\u0000\u0000"+
		"\u0080\u0081\u0007\u0000\u0000\u0000\u0081\u0082\u0006\t\uffff\uffff\u0000"+
		"\u0082\u0083\u0005\u0014\u0000\u0000\u0083\u0084\u0006\t\uffff\uffff\u0000"+
		"\u0084\u0085\u0007\u0000\u0000\u0000\u0085\u0089\u0006\t\uffff\uffff\u0000"+
		"\u0086\u0087\u0005\u0015\u0000\u0000\u0087\u0089\u0006\t\uffff\uffff\u0000"+
		"\u0088\u0080\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u000e\u0000\u0000"+
		"\u008b\u008c\u0006\t\uffff\uffff\u0000\u008c\u008d\u0005\u000f\u0000\u0000"+
		"\u008d\u008f\u0006\t\uffff\uffff\u0000\u008e\u0090\u0003\b\u0004\u0000"+
		"\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000"+
		"\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0010\u0000\u0000"+
		"\u0094\u0095\u0006\t\uffff\uffff\u0000\u0095\u0013\u0001\u0000\u0000\u0000"+
		"\u0096\u009a\u0003\u0016\u000b\u0000\u0097\u0098\u0005\u0012\u0000\u0000"+
		"\u0098\u0099\u0006\n\uffff\uffff\u0000\u0099\u009b\u0003\u0014\n\u0000"+
		"\u009a\u0097\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000"+
		"\u009b\u00a5\u0001\u0000\u0000\u0000\u009c\u009d\u0005\f\u0000\u0000\u009d"+
		"\u009e\u0006\n\uffff\uffff\u0000\u009e\u00a2\u0003\u0016\u000b\u0000\u009f"+
		"\u00a0\u0005\u0012\u0000\u0000\u00a0\u00a1\u0006\n\uffff\uffff\u0000\u00a1"+
		"\u00a3\u0003\u0014\n\u0000\u00a2\u009f\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u0096"+
		"\u0001\u0000\u0000\u0000\u00a4\u009c\u0001\u0000\u0000\u0000\u00a5\u0015"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0016\u0000\u0000\u00a7\u00af"+
		"\u0006\u000b\uffff\uffff\u0000\u00a8\u00a9\u0005\u0017\u0000\u0000\u00a9"+
		"\u00af\u0006\u000b\uffff\uffff\u0000\u00aa\u00ab\u0005\u0018\u0000\u0000"+
		"\u00ab\u00af\u0006\u000b\uffff\uffff\u0000\u00ac\u00ad\u0005\u0015\u0000"+
		"\u0000\u00ad\u00af\u0006\u000b\uffff\uffff\u0000\u00ae\u00a6\u0001\u0000"+
		"\u0000\u0000\u00ae\u00a8\u0001\u0000\u0000\u0000\u00ae\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u0017\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0005\t\u0000\u0000\u00b1\u00b7\u0006\f\uffff"+
		"\uffff\u0000\u00b2\u00b3\u0005\n\u0000\u0000\u00b3\u00b7\u0006\f\uffff"+
		"\uffff\u0000\u00b4\u00b5\u0005\u000b\u0000\u0000\u00b5\u00b7\u0006\f\uffff"+
		"\uffff\u0000\u00b6\u00b0\u0001\u0000\u0000\u0000\u00b6\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u0019\u0001\u0000"+
		"\u0000\u0000\u000f#.7>bkuz\u0088\u0091\u009a\u00a2\u00a4\u00ae\u00b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
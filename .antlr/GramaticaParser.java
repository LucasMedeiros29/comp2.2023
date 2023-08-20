// Generated from c:\Users\lucas\Desktop\comp2023.2 - att Lucas\Gramatica.g4 by ANTLR 4.13.0

    import comp.src.datastructures.*;
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, SINGLETERMOPERATOR=11, OPENPARENTHESIS=12, CLOSEPARENTHESIS=13, 
		OPENBRACKETS=14, CLOSEBRACKETS=15, SEMICOLON=16, OPERATOR=17, ATTRIBUTION=18, 
		RELATIONALOPERATOR=19, IDENTIFIER=20, NUMBER=21, TEXT=22, COMMA=23, DOUBLEQUOTE=24, 
		WHITESPACE=25;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_declarationStatement = 2, 
		RULE_block = 3, RULE_command = 4, RULE_cmdLe = 5, RULE_cmdEscreve = 6, 
		RULE_cmdAtribui = 7, RULE_cmdIf = 8, RULE_cmdWhile = 9, RULE_expression = 10, 
		RULE_term = 11, RULE_type = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "declarationStatement", "block", "command", 
			"cmdLe", "cmdEscreve", "cmdAtribui", "cmdIf", "cmdWhile", "expression", 
			"term", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog;'", "'declara'", "'leia'", "'escreva'", 
			"'se'", "'senao'", "'enquanto'", "'texto'", "'numero'", null, "'('", 
			"')'", "'{'", "'}'", "';'", null, "'='", null, null, null, null, "','", 
			"'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "SINGLETERMOPERATOR", 
			"OPENPARENTHESIS", "CLOSEPARENTHESIS", "OPENBRACKETS", "CLOSEBRACKETS", 
			"SEMICOLON", "OPERATOR", "ATTRIBUTION", "RELATIONALOPERATOR", "IDENTIFIER", 
			"NUMBER", "TEXT", "COMMA", "DOUBLEQUOTE", "WHITESPACE"
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
		public CmdLeContext cmdLe() {
			return getRuleContext(CmdLeContext.class,0);
		}
		public CmdEscreveContext cmdEscreve() {
			return getRuleContext(CmdEscreveContext.class,0);
		}
		public CmdAtribuiContext cmdAtribui() {
			return getRuleContext(CmdAtribuiContext.class,0);
		}
		public CmdIfContext cmdIf() {
			return getRuleContext(CmdIfContext.class,0);
		}
		public CmdWhileContext cmdWhile() {
			return getRuleContext(CmdWhileContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
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

	public static class CmdLeContext extends ParserRuleContext {
		public TerminalNode OPENPARENTHESIS() { return getToken(GramaticaParser.OPENPARENTHESIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GramaticaParser.IDENTIFIER, 0); }
		public TerminalNode CLOSEPARENTHESIS() { return getToken(GramaticaParser.CLOSEPARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public CmdLeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLe; }
	}

	public final CmdLeContext cmdLe() throws Exception {
		CmdLeContext _localctx = new CmdLeContext(_ctx, getState());
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

	public static class CmdEscreveContext extends ParserRuleContext {
		public TerminalNode OPENPARENTHESIS() { return getToken(GramaticaParser.OPENPARENTHESIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GramaticaParser.IDENTIFIER, 0); }
		public TerminalNode CLOSEPARENTHESIS() { return getToken(GramaticaParser.CLOSEPARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public CmdEscreveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEscreve; }
	}

	public final CmdEscreveContext cmdEscreve() throws Exception {
		CmdEscreveContext _localctx = new CmdEscreveContext(_ctx, getState());
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

	public static class CmdAtribuiContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GramaticaParser.IDENTIFIER, 0); }
		public TerminalNode ATTRIBUTION() { return getToken(GramaticaParser.ATTRIBUTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public CmdAtribuiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtribui; }
	}

	public final CmdAtribuiContext cmdAtribui() throws Exception {
		CmdAtribuiContext _localctx = new CmdAtribuiContext(_ctx, getState());
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

	public static class CmdIfContext extends ParserRuleContext {
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
		public CmdIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIf; }
	}

	public final CmdIfContext cmdIf() throws Exception {
		CmdIfContext _localctx = new CmdIfContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__5);
			setState(89);
			match(OPENPARENTHESIS);
			{
			{
			setState(90);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << NUMBER) | (1L << TEXT))) != 0)) ) {
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << NUMBER) | (1L << TEXT))) != 0)) ) {
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
			setState(97);
			match(CLOSEPARENTHESIS);

			                    _expressionConditionStack.push(_expressionCondition);
			                
			setState(99);
			match(OPENBRACKETS);

			                    currentThread = new ArrayList<AbstractCommand>();
			                    allCommands.push(currentThread);
			                
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(101);
				command();
				}
				}
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << IDENTIFIER))) != 0) );
			setState(106);
			match(CLOSEBRACKETS);

			                    TipoLista = allCommands.pop();
			                
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(108);
				match(T__6);
				setState(109);
				match(OPENBRACKETS);

				                      currentThread = new ArrayList<AbstractCommand>();
				                      allCommands.push(currentThread);
				                  
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(111);
					command();
					}
					}
					setState(114); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << IDENTIFIER))) != 0) );
				setState(116);
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

	public static class CmdWhileContext extends ParserRuleContext {
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
		public CmdWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWhile; }
	}

	public final CmdWhileContext cmdWhile() throws Exception {
		CmdWhileContext _localctx = new CmdWhileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdWhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__7);
			setState(124);
			match(OPENPARENTHESIS);
			{
			{
			setState(125);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << NUMBER) | (1L << TEXT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 _expressionWhileCondition = _input.LT(-1).getText(); 
			setState(127);
			match(RELATIONALOPERATOR);
			 _expressionWhileCondition += _input.LT(-1).getText(); 
			setState(129);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << NUMBER) | (1L << TEXT))) != 0)) ) {
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
			setState(132);
			match(CLOSEPARENTHESIS);

			                     _expressionWhileConditionStack.push(_expressionWhileCondition);
			                
			setState(134);
			match(OPENBRACKETS);

			                    currentThread = new ArrayList<AbstractCommand>();
			                    allCommands.push(currentThread);
			                
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(136);
				command();
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << IDENTIFIER))) != 0) );
			setState(141);
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
	}

	public final ExpressionContext expression() throws Exception {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		int _la;
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case NUMBER:
			case TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				term();
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATOR) {
					{
					setState(145);
					match(OPERATOR);
					 _expressionContent += _input.LT(-1).getText(); 
					setState(147);
					expression();
					}
				}

				}
				break;
			case SINGLETERMOPERATOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(SINGLETERMOPERATOR);
				 _expressionContent += _input.LT(-1).getText(); 
				setState(152);
				term();
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATOR) {
					{
					setState(153);
					match(OPERATOR);
					 _expressionContent += _input.LT(-1).getText(); 
					setState(155);
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
	}

	public final TermContext term() throws Exception {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_term);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(IDENTIFIER);
				 verifyID(_input.LT(-1).getText());
				                  _type = ((GramaticaVariable) symbolTable.get(_input.LT(-1).getText())).getType();
				                  _expressionContent += _input.LT(-1).getText();
				                
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(NUMBER);

				        _type = GramaticaVariable.NUMBER;
				        _expressionContent += _input.LT(-1).getText();
				    
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
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
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(T__8);
				_type = GramaticaVariable.TEXT;
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(T__9);
				_type = GramaticaVariable.NUMBER;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u00b1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3$\n\3\r"+
		"\3\16\3%\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4/\n\4\f\4\16\4\62\13\4\3\4\3\4"+
		"\3\5\3\5\6\58\n\5\r\5\16\59\3\6\3\6\3\6\3\6\3\6\5\6A\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6"+
		"\ni\n\n\r\n\16\nj\3\n\3\n\3\n\3\n\3\n\3\n\6\ns\n\n\r\n\16\nt\3\n\3\n\3"+
		"\n\5\nz\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\6\13\u008c\n\13\r\13\16\13\u008d\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\5\f\u0097\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009f\n\f\5\f"+
		"\u00a1\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a9\n\r\3\16\3\16\3\16\3\16\5"+
		"\16\u00af\n\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\3\2\26"+
		"\30\2\u00b4\2\34\3\2\2\2\4#\3\2\2\2\6\'\3\2\2\2\b\65\3\2\2\2\n@\3\2\2"+
		"\2\fB\3\2\2\2\16J\3\2\2\2\20R\3\2\2\2\22Z\3\2\2\2\24}\3\2\2\2\26\u00a0"+
		"\3\2\2\2\30\u00a8\3\2\2\2\32\u00ae\3\2\2\2\34\35\7\3\2\2\35\36\5\4\3\2"+
		"\36\37\5\b\5\2\37 \7\4\2\2 !\b\2\1\2!\3\3\2\2\2\"$\5\6\4\2#\"\3\2\2\2"+
		"$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\5\3\2\2\2\'(\7\5\2\2()\5\32\16\2)*\7\26"+
		"\2\2*\60\b\4\1\2+,\7\31\2\2,-\7\26\2\2-/\b\4\1\2.+\3\2\2\2/\62\3\2\2\2"+
		"\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64\7\22\2\2"+
		"\64\7\3\2\2\2\65\67\b\5\1\2\668\5\n\6\2\67\66\3\2\2\289\3\2\2\29\67\3"+
		"\2\2\29:\3\2\2\2:\t\3\2\2\2;A\5\f\7\2<A\5\16\b\2=A\5\20\t\2>A\5\22\n\2"+
		"?A\5\24\13\2@;\3\2\2\2@<\3\2\2\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\13\3\2"+
		"\2\2BC\7\6\2\2CD\7\16\2\2DE\7\26\2\2EF\b\7\1\2FG\7\17\2\2GH\7\22\2\2H"+
		"I\b\7\1\2I\r\3\2\2\2JK\7\7\2\2KL\7\16\2\2LM\7\26\2\2MN\b\b\1\2NO\7\17"+
		"\2\2OP\7\22\2\2PQ\b\b\1\2Q\17\3\2\2\2RS\7\26\2\2ST\b\t\1\2TU\7\24\2\2"+
		"UV\b\t\1\2VW\5\26\f\2WX\7\22\2\2XY\b\t\1\2Y\21\3\2\2\2Z[\7\b\2\2[\\\7"+
		"\16\2\2\\]\t\2\2\2]^\b\n\1\2^_\7\25\2\2_`\b\n\1\2`a\t\2\2\2ab\b\n\1\2"+
		"bc\3\2\2\2cd\7\17\2\2de\b\n\1\2ef\7\20\2\2fh\b\n\1\2gi\5\n\6\2hg\3\2\2"+
		"\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7\21\2\2my\b\n\1\2no\7\t"+
		"\2\2op\7\20\2\2pr\b\n\1\2qs\5\n\6\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3"+
		"\2\2\2uv\3\2\2\2vw\7\21\2\2wx\b\n\1\2xz\3\2\2\2yn\3\2\2\2yz\3\2\2\2z{"+
		"\3\2\2\2{|\b\n\1\2|\23\3\2\2\2}~\7\n\2\2~\177\7\16\2\2\177\u0080\t\2\2"+
		"\2\u0080\u0081\b\13\1\2\u0081\u0082\7\25\2\2\u0082\u0083\b\13\1\2\u0083"+
		"\u0084\t\2\2\2\u0084\u0085\b\13\1\2\u0085\u0086\3\2\2\2\u0086\u0087\7"+
		"\17\2\2\u0087\u0088\b\13\1\2\u0088\u0089\7\20\2\2\u0089\u008b\b\13\1\2"+
		"\u008a\u008c\5\n\6\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7\21\2\2"+
		"\u0090\u0091\b\13\1\2\u0091\25\3\2\2\2\u0092\u0096\5\30\r\2\u0093\u0094"+
		"\7\23\2\2\u0094\u0095\b\f\1\2\u0095\u0097\5\26\f\2\u0096\u0093\3\2\2\2"+
		"\u0096\u0097\3\2\2\2\u0097\u00a1\3\2\2\2\u0098\u0099\7\r\2\2\u0099\u009a"+
		"\b\f\1\2\u009a\u009e\5\30\r\2\u009b\u009c\7\23\2\2\u009c\u009d\b\f\1\2"+
		"\u009d\u009f\5\26\f\2\u009e\u009b\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1"+
		"\3\2\2\2\u00a0\u0092\3\2\2\2\u00a0\u0098\3\2\2\2\u00a1\27\3\2\2\2\u00a2"+
		"\u00a3\7\26\2\2\u00a3\u00a9\b\r\1\2\u00a4\u00a5\7\27\2\2\u00a5\u00a9\b"+
		"\r\1\2\u00a6\u00a7\7\30\2\2\u00a7\u00a9\b\r\1\2\u00a8\u00a2\3\2\2\2\u00a8"+
		"\u00a4\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\31\3\2\2\2\u00aa\u00ab\7\13\2"+
		"\2\u00ab\u00af\b\16\1\2\u00ac\u00ad\7\f\2\2\u00ad\u00af\b\16\1\2\u00ae"+
		"\u00aa\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\33\3\2\2\2\17%\609@jty\u008d"+
		"\u0096\u009e\u00a0\u00a8\u00ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
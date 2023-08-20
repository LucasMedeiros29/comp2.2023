grammar Gramatica;
@header{
    import comp.src.datastructures.*;
    import comp.src.ast.*;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Stack;
}

@members{
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
}

program  : 'programa' declaration block 'fimprog;' {
    program.setVartable(symbolTable);
    program.setCommands(allCommands.pop());
    if(_unusedVariables.size() > 0){
        System.err.println("Unused variables: "+_unusedVariables);
    }
}
;

declaration: (declarationStatement)+;

declarationStatement : 'declara' type IDENTIFIER  {
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
              (  COMMA
              	 IDENTIFIER {
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
              )*
               SEMICOLON
;

block : {
    currentThread = new ArrayList<AbstractCommand>();
    allCommands.push(currentThread);
}
        (command)+
;

command: cmdLe
       | cmdEscreve
       | cmdAtribui
       | cmdIf
       | cmdWhile
;

cmdLe : 'leia' OPENPARENTHESIS
               IDENTIFIER {
                   verifyID(_input.LT(-1).getText());
                   _commandId = _input.LT(-1).getText();
               }
               CLOSEPARENTHESIS
               SEMICOLON {
                    GramaticaVariable var = (GramaticaVariable) symbolTable.get(_commandId);
                    cmdLe command = new cmdLe(_commandId, var);
                    allCommands.peek().add(command);
               }
;

cmdEscreve: 'escreva' OPENPARENTHESIS
                        IDENTIFIER {
                            verifyID(_input.LT(-1).getText());
                            _commandId = _input.LT(-1).getText();
                        }

                        CLOSEPARENTHESIS
                        SEMICOLON {
                            cmdEscreve command = new cmdEscreve(_commandId);
                            allCommands.peek().add(command);
                        }
;


cmdAtribui: IDENTIFIER {
                   _varName = _input.LT(-1).getText();
                   verifyID(_varName);
                   _unusedVariables.remove(_varName);
                   _expressionId = _varName;
               }
               ATTRIBUTION { _expressionContent = ""; }
               expression
               SEMICOLON {
                   verifyType(_varName, _type);
                   cmdAtribui command = new cmdAtribui(_expressionId, _expressionContent);
                   allCommands.peek().add(command);
               }
;

cmdIf: 'se' OPENPARENTHESIS
                (
                (
                (IDENTIFIER | NUMBER | TEXT) {
                    _expressionCondition = _input.LT(-1).getText();
                }
                RELATIONALOPERATOR { _expressionCondition += _input.LT(-1).getText(); }
                (IDENTIFIER | NUMBER | TEXT) { _expressionCondition += _input.LT(-1).getText(); }
                )
                )
                CLOSEPARENTHESIS {
                    _expressionConditionStack.push(_expressionCondition);
                }
                OPENBRACKETS {
                    currentThread = new ArrayList<AbstractCommand>();
                    allCommands.push(currentThread);
                }
                (command)+
                CLOSEBRACKETS {
                    TipoLista = allCommands.pop();
                }
                ( 'senao'
                  OPENBRACKETS {
                      currentThread = new ArrayList<AbstractCommand>();
                      allCommands.push(currentThread);
                  }
                  (command)+
                  CLOSEBRACKETS {
                      NaoLista = allCommands.pop();
                      cmdIf command = new cmdIf(_expressionConditionStack.pop(), TipoLista, NaoLista);
                      allCommands.peek().add(command);
                  }
                )?
                {
                      if(NaoLista == null){
                          cmdIf command = new cmdIf(_expressionConditionStack.pop(), TipoLista, new ArrayList<AbstractCommand>());
                          allCommands.peek().add(command);
                      }
                      NaoLista = null;
                }
;

cmdWhile: 'enquanto' OPENPARENTHESIS
                (
                (
                (IDENTIFIER | NUMBER | TEXT) { _expressionWhileCondition = _input.LT(-1).getText(); }
                RELATIONALOPERATOR { _expressionWhileCondition += _input.LT(-1).getText(); }
                (IDENTIFIER | NUMBER | TEXT) { _expressionWhileCondition += _input.LT(-1).getText(); }
                )
                )
                CLOSEPARENTHESIS {
                     _expressionWhileConditionStack.push(_expressionWhileCondition);
                }
                OPENBRACKETS {
                    currentThread = new ArrayList<AbstractCommand>();
                    allCommands.push(currentThread);
                }
                (command)+
                CLOSEBRACKETS {
                    whileList = allCommands.pop();
                    cmdWhile command = new cmdWhile(_expressionWhileConditionStack.pop(), whileList);
                    allCommands.peek().add(command);
                }
;

expression: term (OPERATOR { _expressionContent += _input.LT(-1).getText(); }
            expression)? |
            SINGLETERMOPERATOR { _expressionContent += _input.LT(-1).getText(); }
            term (
            OPERATOR { _expressionContent += _input.LT(-1).getText(); }
            expression)? 
;

term: IDENTIFIER { verifyID(_input.LT(-1).getText());
                  _type = ((GramaticaVariable) symbolTable.get(_input.LT(-1).getText())).getType();
                  _expressionContent += _input.LT(-1).getText();
                }
    | NUMBER {
        _type = GramaticaVariable.NUMBER;
        _expressionContent += _input.LT(-1).getText();
    }
    | TEXT {
        _type = GramaticaVariable.TEXT;
        _expressionContent += _input.LT(-1).getText();
    }
;

type: 'texto'{_type = GramaticaVariable.TEXT;} | 'numero'{_type = GramaticaVariable.NUMBER;};

SINGLETERMOPERATOR  :   'raiz' | 'log';

OPENPARENTHESIS	: '(';

CLOSEPARENTHESIS	: ')';

OPENBRACKETS  : '{';

CLOSEBRACKETS  : '}';

SEMICOLON	: ';';

OPERATOR	: '+' | '-' | '*' | '/' | '**';

ATTRIBUTION : '=';

RELATIONALOPERATOR    : '>' | '<' | '>=' | '<=' | '==' | '!=';

IDENTIFIER	: [a-z] ([a-z] | [A-Z] | [0-9])*;

NUMBER	: [0-9]+ ('.' [0-9]+)?;

TEXT: DOUBLEQUOTE (  [a-z] | [A-Z] | [0-9] | ' ' )+ DOUBLEQUOTE;

COMMA: ',';

DOUBLEQUOTE: '"';

WHITESPACE	: (' ' | '\t' | '\n' | '\r') -> skip;
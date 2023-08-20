// Generated from Gramatica.g4 by ANTLR 4.13.0
package comp.src.parser;

    import comp.src.datastructures.*;
    import comp.src.ast.*;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Stack;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GramaticaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GramaticaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(GramaticaParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(GramaticaParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(GramaticaParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(GramaticaParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GramaticaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GramaticaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(GramaticaParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(GramaticaParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#cmdLe}.
	 * @param ctx the parse tree
	 */
	void entercmdLe(GramaticaParser.cmdLeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#cmdLe}.
	 * @param ctx the parse tree
	 */
	void exitcmdLe(GramaticaParser.cmdLeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#cmdEscreve}.
	 * @param ctx the parse tree
	 */
	void entercmdEscreve(GramaticaParser.cmdEscreveContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#cmdEscreve}.
	 * @param ctx the parse tree
	 */
	void exitcmdEscreve(GramaticaParser.cmdEscreveContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#cmdAtribui}.
	 * @param ctx the parse tree
	 */
	void entercmdAtribui(GramaticaParser.cmdAtribuiContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#cmdAtribui}.
	 * @param ctx the parse tree
	 */
	void exitcmdAtribui(GramaticaParser.cmdAtribuiContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void entercmdIf(GramaticaParser.cmdIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void exitcmdIf(GramaticaParser.cmdIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void entercmdWhile(GramaticaParser.cmdWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void exitcmdWhile(GramaticaParser.cmdWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GramaticaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GramaticaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(GramaticaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(GramaticaParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GramaticaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GramaticaParser.TypeContext ctx);
}
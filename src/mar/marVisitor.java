// Generated from C:/Users/Roberto/Desktop/UAlg/6º Semestre/COMPILADORES/trabalhoPart1 SAVE3/trabalhoPart1/src\mar.g4 by ANTLR 4.12.0
package mar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link marParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface marVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link marParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(marParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link marParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(marParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link marParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(marParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Store}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStore(marParser.StoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SoloCall}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoloCall(marParser.SoloCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(marParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfThen}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThen(marParser.IfThenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(marParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfBlock}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(marParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElseThen}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseThen(marParser.ElseThenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElseBlock}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(marParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(marParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Useless}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseless(marParser.UselessContext ctx);
	/**
	 * Visit a parse tree produced by {@link marParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(marParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link marParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(marParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link marParser#blockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmt(marParser.BlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link marParser#then}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThen(marParser.ThenContext ctx);
	/**
	 * Visit a parse tree produced by {@link marParser#do}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo(marParser.DoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OR}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOR(marParser.ORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(marParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(marParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(marParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(marParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NIL}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNIL(marParser.NILContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Neg}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg(marParser.NegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(marParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCa}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCa(marParser.FuncCaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqDif}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqDif(marParser.EqDifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AND}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAND(marParser.ANDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ID}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitID(marParser.IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(marParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinMai}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinMai(marParser.MinMaiContext ctx);
	/**
	 * Visit a parse tree produced by {@link marParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(marParser.ArgListContext ctx);
}
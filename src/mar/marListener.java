// Generated from C:/Users/Roberto/Desktop/UAlg/6º Semestre/COMPILADORES/trabalhoPart1 SAVE3/trabalhoPart1/src\mar.g4 by ANTLR 4.12.0
package mar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link marParser}.
 */
public interface marListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link marParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(marParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link marParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(marParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link marParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(marParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link marParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(marParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link marParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(marParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link marParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(marParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Store}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterStore(marParser.StoreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Store}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitStore(marParser.StoreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SoloCall}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterSoloCall(marParser.SoloCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SoloCall}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitSoloCall(marParser.SoloCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterPrint(marParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitPrint(marParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfThen}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterIfThen(marParser.IfThenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfThen}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitIfThen(marParser.IfThenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(marParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(marParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfBlock}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(marParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfBlock}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(marParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseThen}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterElseThen(marParser.ElseThenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseThen}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitElseThen(marParser.ElseThenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseBlock}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(marParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseBlock}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(marParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(marParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(marParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Useless}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterUseless(marParser.UselessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Useless}
	 * labeled alternative in {@link marParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitUseless(marParser.UselessContext ctx);
	/**
	 * Enter a parse tree produced by {@link marParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(marParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link marParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(marParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link marParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(marParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link marParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(marParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link marParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmt(marParser.BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link marParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmt(marParser.BlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link marParser#then}.
	 * @param ctx the parse tree
	 */
	void enterThen(marParser.ThenContext ctx);
	/**
	 * Exit a parse tree produced by {@link marParser#then}.
	 * @param ctx the parse tree
	 */
	void exitThen(marParser.ThenContext ctx);
	/**
	 * Enter a parse tree produced by {@link marParser#do}.
	 * @param ctx the parse tree
	 */
	void enterDo(marParser.DoContext ctx);
	/**
	 * Exit a parse tree produced by {@link marParser#do}.
	 * @param ctx the parse tree
	 */
	void exitDo(marParser.DoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OR}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOR(marParser.ORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OR}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOR(marParser.ORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(marParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(marParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(marParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(marParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(marParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(marParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(marParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(marParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NIL}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNIL(marParser.NILContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NIL}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNIL(marParser.NILContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Neg}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNeg(marParser.NegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Neg}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNeg(marParser.NegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(marParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(marParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCa}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncCa(marParser.FuncCaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCa}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncCa(marParser.FuncCaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqDif}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqDif(marParser.EqDifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqDif}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqDif(marParser.EqDifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AND}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAND(marParser.ANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AND}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAND(marParser.ANDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ID}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterID(marParser.IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ID}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitID(marParser.IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(marParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(marParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinMai}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinMai(marParser.MinMaiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinMai}
	 * labeled alternative in {@link marParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinMai(marParser.MinMaiContext ctx);
	/**
	 * Enter a parse tree produced by {@link marParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(marParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link marParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(marParser.ArgListContext ctx);
}
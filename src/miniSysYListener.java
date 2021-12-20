// Generated from C:/Users/ASUS/Desktop/大三上软件/编译原理/实验/正式实验/src\miniSysY.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miniSysYParser}.
 */
public interface miniSysYListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#compUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompUnit(miniSysYParser.CompUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#compUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompUnit(miniSysYParser.CompUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(miniSysYParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(miniSysYParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(miniSysYParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(miniSysYParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(miniSysYParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(miniSysYParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(miniSysYParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(miniSysYParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#decimal_const}.
	 * @param ctx the parse tree
	 */
	void enterDecimal_const(miniSysYParser.Decimal_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#decimal_const}.
	 * @param ctx the parse tree
	 */
	void exitDecimal_const(miniSysYParser.Decimal_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#octal_const}.
	 * @param ctx the parse tree
	 */
	void enterOctal_const(miniSysYParser.Octal_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#octal_const}.
	 * @param ctx the parse tree
	 */
	void exitOctal_const(miniSysYParser.Octal_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#hexadecimal_const}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimal_const(miniSysYParser.Hexadecimal_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#hexadecimal_const}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimal_const(miniSysYParser.Hexadecimal_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(miniSysYParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(miniSysYParser.DigitContext ctx);
}
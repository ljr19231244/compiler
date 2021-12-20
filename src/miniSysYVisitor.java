// Generated from C:/Users/ASUS/Desktop/大三上软件/编译原理/实验/正式实验/src\miniSysY.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link miniSysYParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface miniSysYVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#compUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompUnit(miniSysYParser.CompUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(miniSysYParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(miniSysYParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(miniSysYParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(miniSysYParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#decimal_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal_const(miniSysYParser.Decimal_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#octal_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctal_const(miniSysYParser.Octal_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#hexadecimal_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimal_const(miniSysYParser.Hexadecimal_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit(miniSysYParser.DigitContext ctx);
}
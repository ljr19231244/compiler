public class Visitor<T> extends  miniSysYBaseVisitor<T> {
    @Override public T visitCompUnit(miniSysYParser.CompUnitContext ctx){
        visit(ctx.funcDef());
        return null;
    }

    @Override public T visitFuncDef(miniSysYParser.FuncDefContext ctx) {
        System.out.print("define dso_local i32 ");
        System.out.print("@main");
        System.out.print(ctx.Left_bracket().toString());
        System.out.print(ctx.Right_bracket().toString());
        visit(ctx.block());
        return null;
    }

    @Override public T visitBlock(miniSysYParser.BlockContext ctx) {
        System.out.println(ctx.Left_braces().toString());
        visit(ctx.stmt());
        System.out.println("\n" + ctx.Right_braces().toString());
        return null;
    }

    @Override public T visitStmt(miniSysYParser.StmtContext ctx) {
        System.out.print("  ret i32 ");
        visit(ctx.number());
//        System.out.print(ctx.Semicolon().toString());
        return null;
    }

    @Override public T visitNumber(miniSysYParser.NumberContext ctx) {
        if(ctx.decimal_const()!=null)
            visit(ctx.decimal_const());
        else if(ctx.octal_const()!=null)
            visit(ctx.octal_const());
        else if(ctx.hexadecimal_const()!=null)
            visit(ctx.hexadecimal_const());

        return null;
    }

    @Override public T visitDecimal_const(miniSysYParser.Decimal_constContext ctx) {
        if(ctx.Nonzero_digit()!=null)
            System.out.print(ctx.Nonzero_digit().toString());
        else if(ctx.decimal_const()!=null && ctx.digit()!=null){
            visit(ctx.decimal_const());
            visit(ctx.digit());
        }
        return null;
    }

    @Override public T visitOctal_const(miniSysYParser.Octal_constContext ctx) {
        if(ctx.Zero()!=null)
            System.out.print(ctx.Zero().toString());
        else if (ctx.octal_const()!=null && ctx.Octal_digit()!=null){
            visit(ctx.octal_const());
            System.out.print(ctx.Octal_digit().toString());
        }
        return null;
    }

    @Override public T visitHexadecimal_const(miniSysYParser.Hexadecimal_constContext ctx) {
        if(ctx.Hexadecimal_prefix()!=null){
            System.out.print(ctx.Hexadecimal_prefix().toString());
            System.out.print(ctx.Hexadecimal_prefix().toString());
        }
        else if(ctx.hexadecimal_const()!=null && ctx.Hexadecimal_digit()!=null){
            visit(ctx.hexadecimal_const());
            System.out.print(ctx.Hexadecimal_digit().toString());
        }
        return null;
    }

    @Override public T visitDigit(miniSysYParser.DigitContext ctx) {
        if(ctx.Zero()!=null)
            System.out.print(ctx.Zero().toString());
        else if(ctx.Nonzero_digit()!=null)
            System.out.print(ctx.Nonzero_digit().toString());
        return null;
    }

}

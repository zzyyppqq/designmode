package com.zyp.designmode.interpreter;

public class Test {

    //规则：Robert 和 John 是男性
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("robert");
        Expression john = new TerminalExpression("john");
        return new OrExpression(robert,john);
    }


    //规则：Julie 是一个已婚的女性
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("julie");
        Expression married = new TerminalExpression("married");
        return new AndExpression(julie,married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("john"));
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("married julie"));
    }
}

package com.github.kaczors.gof.behavioral.interpreter;

public class OrExpression extends BiExpression {

    public OrExpression(Expression operand1, Expression operand2) {
        super(operand1, operand2);
    }

    @Override
    public boolean interpret(Context context) {
        return operand1.interpret(context) || operand2.interpret(context);
    }
}

package com.github.kaczors.gof.behavioral.interpreter;

public abstract class BiExpression implements Expression {

    protected final Expression operand1;
    protected final Expression operand2;

    public BiExpression(Expression operand1, Expression operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

}

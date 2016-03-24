package com.github.kaczors.gof.behavioral.interpreter;

public class BooleanExpression implements Expression {

    private final String name;

    public BooleanExpression(String name) {
        this.name = name;
    }

    @Override
    public boolean interpret(Context context) {
        return context.lookup(name);
    }
}

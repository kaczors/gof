package com.github.kaczors.gof.behavioral.interpreter;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InterpreterTest {

    @Test
    public void example(){

        BooleanExpression x = new BooleanExpression("x");
        BooleanExpression y = new BooleanExpression("y");

        Context context = new ContextImpl();
        context.assign("x", true);
        context.assign("y", false);

        Assert.assertFalse(new AndExpression(x, y).interpret(context));
        Assert.assertTrue(new OrExpression(x, y).interpret(context));
        Assert.assertTrue(new OrExpression(x, new AndExpression(x, y)).interpret(context));
    }

}
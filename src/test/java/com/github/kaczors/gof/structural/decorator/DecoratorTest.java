package com.github.kaczors.gof.structural.decorator;

import org.testng.annotations.Test;

public class DecoratorTest {

    @Test
    public void example(){
        Text bordered = new BorderedText(new PureText("text"));

        System.out.println(bordered.getText());
    }
}

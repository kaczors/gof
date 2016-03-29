package com.github.kaczors.gof.behavioral.templatemethod;

import org.testng.annotations.Test;

public class TemplateMethodTest {

    @Test
    public void example(){
        CarFactory fiatFactory = new FiatFactory();
        CarFactory fordFactory = new FordFactory();

        System.out.println(fiatFactory.produce());
        System.out.println(fordFactory.produce());
    }
}
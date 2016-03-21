package com.github.kaczors.gof.creational.factorymethod;

import org.testng.annotations.Test;

public class FactoryMethodTest {

    @Test
    public void example(){
        CarFactory fordFactory = new FordFactory();
        CarFactory opelFactory = new OpelFactory();

        String ford = fordFactory.getCar();
        String opel = opelFactory.getCar();

    }
}

package com.github.kaczors.gof.creational.abstractfactory;

import org.testng.annotations.Test;

public class AbstractFactoryTest {

    @Test
    public void example(){
        Country poland = new Country("Poland", new FordPartFactory());
        Country slovakia = new Country("Slovakia", new OpelPartsFactory());

        Wheel wheelFromPoland = poland.createWheel();
        Wheel wheelFromSlovakia = slovakia.createWheel();
    }

}
package com.github.kaczors.gof.creational.prototype;

import org.testng.annotations.Test;

public class PrototypeTest {

    @Test
    public void example(){
        Car fordPrototype = new Ford("Mondeo");
        Car opelPrototpe = new Opel("Insignia");

        Car ford = (Car) fordPrototype.clone();
        Car opel = (Car) opelPrototpe.clone();
    }
}

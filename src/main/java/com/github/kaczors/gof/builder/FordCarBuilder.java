package com.github.kaczors.gof.builder;

public class FordCarBuilder extends CarBuilder {

    public FordCarBuilder(){
        car = new Car("Ford", "Mondeo");
    }

    @Override
    public void addWheels() {
        car.addParts("FordWheels");
    }

    @Override
    public void addBody() {
        car.addParts("FordBody");
    }

    @Override
    public void addElectronics() {
        car.addParts("FordElectronics");
    }
}

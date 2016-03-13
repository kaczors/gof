package com.github.kaczors.gof.builder;

public class CarAssemblyDirector {

    private final CarBuilder builder;

    public CarAssemblyDirector(CarBuilder carBuilder) {
        this.builder = carBuilder;
    }

    public void construct() {
        builder.addWheels();
        builder.addElectronics();
        builder.addBody();
    }

    public Car getCar() {
        return builder.getCar();
    }
}

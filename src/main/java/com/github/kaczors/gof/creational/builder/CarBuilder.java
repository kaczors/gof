package com.github.kaczors.gof.creational.builder;

public abstract class CarBuilder {

    protected Car car;

    public abstract void addWheels();

    public abstract void addBody();

    public abstract void addElectronics();

    public Car getCar(){
        return car;
    }
}

package com.github.kaczors.gof.creational.factorymethod;

public abstract class CarFactory {

    private String car;

    protected CarFactory(){
        car = createWheel() + createWheel() + createWheel() + createWheel();
    }

    protected abstract String createWheel();

    public String getCar(){
        return car;
    }
}

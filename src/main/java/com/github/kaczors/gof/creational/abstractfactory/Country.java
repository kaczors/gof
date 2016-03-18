package com.github.kaczors.gof.creational.abstractfactory;

public class Country {

    private final String name;
    private final CarPartsFactory factory;

    public Country(String name, CarPartsFactory factory) {
        this.name = name;
        this.factory = factory;
    }

    public Wheel createWheel(){
        return factory.createWheel();
    }

    public Roof createRoof(){
        return factory.createRoof();
    }

}

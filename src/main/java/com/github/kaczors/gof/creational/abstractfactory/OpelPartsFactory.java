package com.github.kaczors.gof.creational.abstractfactory;

public class OpelPartsFactory implements CarPartsFactory{
    public Wheel createWheel() {
        return new OpelWheel();
    }

    public Roof createRoof() {
        return new OpelRoof();
    }
}

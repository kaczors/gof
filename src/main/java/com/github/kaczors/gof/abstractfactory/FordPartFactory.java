package com.github.kaczors.gof.abstractfactory;

public class FordPartFactory implements CarPartsFactory{
    public Wheel createWheel() {
        return new FordWheel();
    }

    public Roof createRoof() {
        return new FordRoof();
    }
}

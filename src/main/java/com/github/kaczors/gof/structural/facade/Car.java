package com.github.kaczors.gof.structural.facade;

public class Car implements CarFacade{

    private Chassis chassis = new Chassis();
    private Engine engine = new Engine();

    @Override
    public void startEngine() {
        engine.startEngine();
    }

    @Override
    public void openDoor() {
        chassis.openDoor();
    }
}

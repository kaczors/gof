package com.github.kaczors.gof.builder;

public class MazdaCarBuilder extends CarBuilder {

    public MazdaCarBuilder(){
        car = new Car("Mazda", "6");
    }

    public void addWheels() {
        car.addParts("MazdaWheels");
    }

    public void addBody() {
        car.addParts("MazdaBody");
    }

    public void addElectronics() {
        car.addParts("MazdaElectronics");
    }
}

package com.github.kaczors.gof.creational.prototype;

public class Opel extends Car {

    public Opel(String name) {
        this.name = name;
    }

    @Override
    public String printName() {
        return "Opel: " + name;
    }
}

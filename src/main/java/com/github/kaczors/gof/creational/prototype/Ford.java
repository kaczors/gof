package com.github.kaczors.gof.creational.prototype;

public class Ford extends Car {

    public Ford(String name){
        this.name = name;
    }

    @Override
    public String printName() {
        return "Ford: " + name;
    }
}

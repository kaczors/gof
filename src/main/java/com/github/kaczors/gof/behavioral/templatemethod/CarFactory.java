package com.github.kaczors.gof.behavioral.templatemethod;

abstract class CarFactory {

    String produce(){
        return getWheels() + " + " + getChassis();
    }

    abstract String getWheels();

    abstract String getChassis();

}

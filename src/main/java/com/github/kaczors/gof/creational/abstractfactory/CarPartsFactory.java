package com.github.kaczors.gof.creational.abstractfactory;

public interface CarPartsFactory {

    Wheel createWheel();

    Roof createRoof();
}

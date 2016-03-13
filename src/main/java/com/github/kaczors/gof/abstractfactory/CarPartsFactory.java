package com.github.kaczors.gof.abstractfactory;

public interface CarPartsFactory {

    Wheel createWheel();

    Roof createRoof();
}

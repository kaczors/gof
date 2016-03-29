package com.github.kaczors.gof.behavioral.strategy;

interface CarManufacturer {

    boolean accept(CarBrand brand);

    String buildCar();
}

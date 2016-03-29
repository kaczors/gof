package com.github.kaczors.gof.behavioral.strategy;

class FordManufacturer implements CarManufacturer {

    public boolean accept(CarBrand brand) {
        return CarBrand.FORD == brand;
    }

    public String buildCar() {
        return "Ford Mondeo 2.0 Pb";
    }
}

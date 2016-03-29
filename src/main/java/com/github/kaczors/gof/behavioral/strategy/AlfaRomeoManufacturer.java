package com.github.kaczors.gof.behavioral.strategy;


class AlfaRomeoManufacturer implements CarManufacturer {

    public boolean accept(CarBrand brand) {
        return CarBrand.ALFA_ROMEO == brand;
    }

    public String buildCar() {
        return "Alfa Romeo 156 1.9 jtd";
    }
}

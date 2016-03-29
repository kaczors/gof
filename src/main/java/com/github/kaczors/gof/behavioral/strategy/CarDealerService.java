package com.github.kaczors.gof.behavioral.strategy;

class CarDealerService {

    private final CarManufacturerResolver carManufacturerResolver;

    CarDealerService(CarManufacturerResolver carManufacturerResolver) {
        this.carManufacturerResolver = carManufacturerResolver;
    }

    String orderNewCar(CarBrand carBrand){
        return carManufacturerResolver.resolve(carBrand).buildCar();
    }
}

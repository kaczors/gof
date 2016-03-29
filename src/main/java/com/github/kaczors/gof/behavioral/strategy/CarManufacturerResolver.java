package com.github.kaczors.gof.behavioral.strategy;

import java.util.Collection;

class CarManufacturerResolver {

    private final Collection<CarManufacturer> strategies;

    CarManufacturerResolver(Collection<CarManufacturer> strategies) {
        this.strategies = strategies;
    }

    CarManufacturer resolve(CarBrand brand) {
        for (CarManufacturer carManufacturer : strategies) {
            if (carManufacturer.accept(brand)) {
                return carManufacturer;
            }
        }
        throw new RuntimeException("Not suitable manufacturer found for type: " + brand);
    }
}

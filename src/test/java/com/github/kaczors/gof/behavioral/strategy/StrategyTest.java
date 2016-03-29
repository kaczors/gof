package com.github.kaczors.gof.behavioral.strategy;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;

public class StrategyTest {

    @Test
    public void example(){
        CarManufacturer alfa = new AlfaRomeoManufacturer();
        CarManufacturer ford = new FordManufacturer();

        Collection<CarManufacturer> manufacturers = new ArrayList<>();
        manufacturers.add(alfa);
        manufacturers.add(ford);

        CarManufacturerResolver strategyResolver = new CarManufacturerResolver(manufacturers);

        CarDealerService dealer = new CarDealerService(strategyResolver);

        dealer.orderNewCar(CarBrand.ALFA_ROMEO);
        dealer.orderNewCar(CarBrand.FORD);
    }


}
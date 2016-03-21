package com.github.kaczors.gof.structural.facade;

import org.testng.annotations.Test;

public class FacadeTest {

    @Test
    public void example(){
        CarFacade car = new Car();

        car.openDoor();
        car.startEngine();
    }

}
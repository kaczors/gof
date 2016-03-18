package com.github.kaczors.gof.creational.builder;

import org.testng.annotations.Test;

public class CarClientTest {

    @Test
    public void example(){
        CarAssemblyDirector director = new CarAssemblyDirector(new FordCarBuilder());
//        CarAssemblyDirector director = new CarAssemblyDirector(new MazdaCarBuilder());
        director.construct();
        Car car = director.getCar();
    }
}
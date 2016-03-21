package com.github.kaczors.gof.structural.bridge;

import org.testng.annotations.Test;

public class BridgeTest {

    @Test
    public void example(){
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }

}
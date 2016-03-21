package com.github.kaczors.gof.structural.composite;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class CompositeTest {

    @Test
    public void example(){
        Part wheel = new Wheel();

        //also variant where composite related code is located in the Part type is possible
        PartComposite steeringParts = new SteeringParts();
        steeringParts.addSubPart(wheel);

        List<Part> parts = new ArrayList<>();
        parts.add(wheel);
        parts.add(steeringParts);

        parts.forEach(Part::printLabel);
    }
}
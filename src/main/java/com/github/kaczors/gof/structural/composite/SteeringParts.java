package com.github.kaczors.gof.structural.composite;

public class SteeringParts extends PartComposite {
    public void printLabel() {
        subParts.forEach(Part::printLabel);
    }
}

package com.github.kaczors.gof.behavioral.templatemethod;

class FordFactory extends CarFactory {
    @Override
    String getWheels() {
        return "Ford wheels";
    }

    @Override
    String getChassis() {
        return "Ford chassis";
    }
}

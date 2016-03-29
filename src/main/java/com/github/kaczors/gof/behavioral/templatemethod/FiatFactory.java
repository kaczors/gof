package com.github.kaczors.gof.behavioral.templatemethod;

class FiatFactory extends CarFactory {
    @Override
    String getWheels() {
        return "Fiat wheels";
    }

    @Override
    String getChassis() {
        return "Fiat chassis";
    }
}

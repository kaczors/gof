package com.github.kaczors.gof.creational.factorymethod;

public class FordFactory extends CarFactory {
    @Override
    protected String createWheel() {
        return " FordWheel";
    }
}

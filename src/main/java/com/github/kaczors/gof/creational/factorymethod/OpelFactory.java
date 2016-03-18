package com.github.kaczors.gof.creational.factorymethod;

public class OpelFactory extends CarFactory {
    @Override
    protected String createWheel() {
        return " OpelWheel ";
    }
}

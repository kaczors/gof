package com.github.kaczors.gof.builder;

public class Car {

    private final String brand;
    private final String model;
    private String parts = "";

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getParts() {
        return parts;
    }

    public void addParts(String parts) {
        this.parts += parts;
    }

}

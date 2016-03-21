package com.github.kaczors.gof.structural.bridge;

class Triangle extends Shape{

    Triangle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangle filled with color ");
        color.applyColor();
    }

}
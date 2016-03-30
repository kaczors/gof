package com.github.kaczors.gof.behavioral.visitor;

abstract class Part implements Visitable {

    private final int price;

    Part(int price) {
        this.price = price;
    }

    int getPrice() {
        return price;
    }
}

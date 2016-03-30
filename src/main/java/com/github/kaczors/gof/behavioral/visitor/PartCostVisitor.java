package com.github.kaczors.gof.behavioral.visitor;

class PartCostVisitor implements PartVisitor{

    private int total = 0;

    @Override
    public int visitChassis(Chassis chassis) {
        return total += chassis.getPrice();
    }

    @Override
    public int visitElectronics(Electronics electronics) {
        return total += electronics.getPrice() + 5;
    }

    @Override
    public int visitWheel(Wheel wheel) {
        return total += wheel.getPrice() * 4;
    }

    int getTotal() {
        return total;
    }
}

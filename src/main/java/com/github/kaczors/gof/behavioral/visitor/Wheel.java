package com.github.kaczors.gof.behavioral.visitor;

class Wheel extends Part{
    protected Wheel(int price) {
        super(price);
    }

    @Override
    public int accept(PartVisitor partVisitor) {
        return partVisitor.visitWheel(this);
    }
}

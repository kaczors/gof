package com.github.kaczors.gof.behavioral.visitor;

class Chassis extends Part{
    protected Chassis(int price) {
        super(price);
    }

    @Override
    public int accept(PartVisitor partVisitor) {
        return partVisitor.visitChassis(this);
    }
}

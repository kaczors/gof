package com.github.kaczors.gof.behavioral.visitor;

class Electronics extends Part {
    protected Electronics(int price) {
        super(price);
    }

    @Override
    public int accept(PartVisitor partVisitor) {
        return partVisitor.visitElectronics(this);
    }
}

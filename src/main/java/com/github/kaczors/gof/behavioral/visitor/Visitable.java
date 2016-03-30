package com.github.kaczors.gof.behavioral.visitor;

interface Visitable {

    int accept(PartVisitor partVisitor);
}

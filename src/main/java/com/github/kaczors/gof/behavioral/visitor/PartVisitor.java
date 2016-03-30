package com.github.kaczors.gof.behavioral.visitor;

interface PartVisitor {

    int visitChassis(Chassis chassis);

    int visitElectronics(Electronics electronics);

    int visitWheel(Wheel wheel);
}

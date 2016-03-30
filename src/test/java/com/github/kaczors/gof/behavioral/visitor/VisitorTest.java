package com.github.kaczors.gof.behavioral.visitor;

import org.testng.annotations.Test;

public class VisitorTest {

    @Test
    public void example(){
        Part chassis = new Chassis(5);
        Part electronics = new Electronics(10);
        Part wheel = new Wheel(1);

        PartCostVisitor sumVisitor = new PartCostVisitor();

        chassis.accept(sumVisitor);
        electronics.accept(sumVisitor);
        wheel.accept(sumVisitor);

        System.out.println(sumVisitor.getTotal());
    }

}
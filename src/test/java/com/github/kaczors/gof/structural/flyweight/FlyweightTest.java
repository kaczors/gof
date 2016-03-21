package com.github.kaczors.gof.structural.flyweight;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FlyweightTest {

    @Test
    public void example(){
        ElementFactory elementFactory = new ElementFactory();

        Element element1 = elementFactory.getElement("e1");
        Element element2 = elementFactory.getElement("e1");

        Assert.assertTrue(element1 == element2);
    }

}
package com.github.kaczors.gof.structural.proxy;

import org.testng.annotations.Test;

public class ProxyTest {

    @Test
    public void example(){
        Image imageProxy = new ImageProxy();
        //we have an object, but real heavy stuff is not initialized until we call getImage();

        imageProxy.getImage();
    }

}
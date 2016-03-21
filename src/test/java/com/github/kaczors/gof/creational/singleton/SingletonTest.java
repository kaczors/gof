package com.github.kaczors.gof.creational.singleton;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SingletonTest {

    @Test
    public void example(){
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        assertTrue(singleton1 == singleton2);
    }
}

package com.github.kaczors.gof.creational.singleton;

/**
 * It's threadsafe, and it's lazy (initialization happens at class loading time, and Java does not load classes until they are are first referred).
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }
}

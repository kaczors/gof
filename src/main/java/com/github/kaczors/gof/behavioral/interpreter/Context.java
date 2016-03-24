package com.github.kaczors.gof.behavioral.interpreter;

public interface Context {

    boolean lookup(String name);

    void assign(String name, boolean value);
}

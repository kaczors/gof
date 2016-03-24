package com.github.kaczors.gof.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

public class ContextImpl implements Context {

    private final Map<String, Boolean> variables = new HashMap<>();

    @Override
    public boolean lookup(String name) {
        return variables.get(name);
    }

    @Override
    public void assign(String name, boolean value) {
        variables.put(name, value);
    }
}

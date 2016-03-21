package com.github.kaczors.gof.creational.prototype;

public abstract class Car implements Cloneable{

    protected String name;

    public abstract String printName();

    @Override
    public Object clone(){
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}

package com.github.kaczors.gof.structural.adapter;

public class System110VAdapter implements System230V {

    private System110V adaptee;

    public System110VAdapter(System110V adaptee) {
        this.adaptee = adaptee;
    }

    public String get220VSocket() {
        return adaptee.get110VSocket() + "120V";
    }
}

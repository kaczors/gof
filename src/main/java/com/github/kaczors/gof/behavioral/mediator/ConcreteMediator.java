package com.github.kaczors.gof.behavioral.mediator;

class ConcreteMediator implements ViewMediator {

    private String display = "";

    @Override
    public void keyPressed(Key key) {
        display += key;
    }

    String getDisplay() {
        return display;
    }
}

package com.github.kaczors.gof.behavioral.observer;

class ButtonObserver implements Observer {

    private final String name;

    public ButtonObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Button button) {
        System.out.println("Observer: " + name + ", Buttton " + button + " clicked.");
    }
}

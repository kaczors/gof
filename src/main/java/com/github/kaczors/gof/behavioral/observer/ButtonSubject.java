package com.github.kaczors.gof.behavioral.observer;

import java.util.ArrayList;
import java.util.Collection;

class ButtonSubject implements Subject {
    private Collection<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(Button button) {
        observers.forEach(o -> o.update(button));
    }
}

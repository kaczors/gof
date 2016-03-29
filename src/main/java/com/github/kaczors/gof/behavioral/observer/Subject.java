package com.github.kaczors.gof.behavioral.observer;

interface Subject {
    void addObserver(Observer observer);
    void notifyObservers(Button button);
}

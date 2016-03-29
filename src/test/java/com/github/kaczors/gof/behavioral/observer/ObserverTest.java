package com.github.kaczors.gof.behavioral.observer;

import org.testng.annotations.Test;

public class ObserverTest {

    @Test
    public void example(){
        Observer observer1 = new ButtonObserver("a");
        Observer observer2 = new ButtonObserver("b");

        Subject subject = new ButtonSubject();
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.notifyObservers(Button.OK);
        subject.notifyObservers(Button.CANCEL);
    }

}
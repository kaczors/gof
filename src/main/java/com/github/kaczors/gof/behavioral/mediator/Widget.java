package com.github.kaczors.gof.behavioral.mediator;

abstract class Widget {

    final ViewMediator viewMediator;

    Widget(ViewMediator viewMediator){
        this.viewMediator = viewMediator;
    }
}

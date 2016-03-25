package com.github.kaczors.gof.behavioral.mediator;

class OkButton extends Widget {

    OkButton(ViewMediator viewMediator) {
        super(viewMediator);
    }

    void pressOk(){
        viewMediator.keyPressed(Key.OK);
    }
}

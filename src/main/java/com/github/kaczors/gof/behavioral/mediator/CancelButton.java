package com.github.kaczors.gof.behavioral.mediator;

class CancelButton extends Widget {

    CancelButton(ViewMediator viewMediator) {
        super(viewMediator);
    }

    void pressCancel() {
        viewMediator.keyPressed(Key.CANCEL);
    }
}

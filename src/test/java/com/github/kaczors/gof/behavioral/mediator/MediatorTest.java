package com.github.kaczors.gof.behavioral.mediator;

import org.testng.annotations.Test;

public class MediatorTest {

    @Test
    public void example(){
        ConcreteMediator mediator = new ConcreteMediator();

        OkButton okButton = new OkButton(mediator);
        CancelButton cancelButton = new CancelButton(mediator);

        okButton.pressOk();
        cancelButton.pressCancel();

        System.out.println(mediator.getDisplay());
    }

}
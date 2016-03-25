package com.github.kaczors.gof.behavioral.chainofresponsibility;

import org.testng.annotations.Test;

public class ChainOfResponsibilityTest {

    @Test
    public void example(){
        Solider general = new Solider(null, DecisionLevel.HIGH);
        Solider captain = new Solider(general, DecisionLevel.MEDIUM);
        Solider major = new Solider(captain, DecisionLevel.LOW);

        Request request = new Request(DecisionLevel.MEDIUM);

        major.decide(request);
    }

}
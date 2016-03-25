package com.github.kaczors.gof.behavioral.chainofresponsibility;

interface DecisionMaker {
    boolean decide(Request request);
}

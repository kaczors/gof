package com.github.kaczors.gof.behavioral.chainofresponsibility;

class Request {

    private final DecisionLevel decisionLevel;

    Request(DecisionLevel decisionLevel) {
        this.decisionLevel = decisionLevel;
    }

    DecisionLevel getDecisionLevel() {
        return decisionLevel;
    }
}

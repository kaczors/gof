package com.github.kaczors.gof.behavioral.chainofresponsibility;

class Solider implements DecisionMaker {

    private final DecisionMaker boss;
    private final DecisionLevel decisionLevel;

    Solider(DecisionMaker boss, DecisionLevel decisionLevel) {
        this.boss = boss;
        this.decisionLevel = decisionLevel;
    }

    @Override
    public boolean decide(Request request) {
        if (decisionLevel == request.getDecisionLevel()) {
            return false;
        } else
            return boss.decide(request);
    }
}

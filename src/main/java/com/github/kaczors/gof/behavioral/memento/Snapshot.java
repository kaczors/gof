package com.github.kaczors.gof.behavioral.memento;

class Snapshot {

    private final String content;

    Snapshot(String content) {
        this.content = content;
    }

    String getContent(){
        return content;
    }
}

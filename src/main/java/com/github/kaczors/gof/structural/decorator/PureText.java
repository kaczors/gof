package com.github.kaczors.gof.structural.decorator;

public class PureText implements Text {

    private String text;

    public PureText(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

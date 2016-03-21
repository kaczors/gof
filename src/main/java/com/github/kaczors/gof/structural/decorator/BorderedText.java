package com.github.kaczors.gof.structural.decorator;

public class BorderedText implements Text {

    Text decorated;

    public BorderedText(Text decorated) {
        this.decorated = decorated;
    }

    public String getText() {
        return "<border>" + decorated.getText() + "</border>";
    }

}

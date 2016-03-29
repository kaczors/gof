package com.github.kaczors.gof.behavioral.memento;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MementoTest {

    @Test
    public void example(){
        TextEditor textEditor = new TextEditor();

        textEditor.addText("a");
        textEditor.addText("b");

        Snapshot abSnapshot = textEditor.save();

        textEditor.addText("c");
        textEditor.addText("d");

        textEditor.restore(abSnapshot);

        Assert.assertEquals("ab", textEditor.getContent());
    }
}
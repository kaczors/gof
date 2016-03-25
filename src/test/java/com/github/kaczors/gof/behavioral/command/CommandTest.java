package com.github.kaczors.gof.behavioral.command;

import org.testng.annotations.Test;

public class CommandTest {

    @Test
    public void execute(){
        Command printYes = () -> System.out.println("Yes");
        Command printNo = () -> System.out.println("No");

        System.out.println("Nothing printed yet");
        printYes.execute();
        printNo.execute();
        printNo.execute();

        //and some other fancy stuff
    }

}
package com.github.kaczors.gof.behavioral.state;

import org.testng.annotations.Test;

public class StateTest {

    @Test
    public void example(){
        Door door = new Door(ClosedDoors.INSTANCE);

        door.open();
        door.close();
        door.close();
        door.open();

        System.out.println(door.getState().toString());
    }
}
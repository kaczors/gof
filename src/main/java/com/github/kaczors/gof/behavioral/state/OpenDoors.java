package com.github.kaczors.gof.behavioral.state;

class OpenDoors implements DoorState {

    final static DoorState INSTANCE = new OpenDoors();

    @Override
    public void open(StateAware state) {
        //do nothing
    }

    @Override
    public void close(StateAware state) {
        state.changeState(ClosedDoors.INSTANCE);
    }
}

package com.github.kaczors.gof.behavioral.state;

class ClosedDoors implements DoorState {

    final static DoorState INSTANCE = new ClosedDoors();

    @Override
    public void open(StateAware state) {
        state.changeState(OpenDoors.INSTANCE);
    }

    @Override
    public void close(StateAware state) {
        //do nothing
    }
}

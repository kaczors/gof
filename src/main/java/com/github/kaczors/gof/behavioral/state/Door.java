package com.github.kaczors.gof.behavioral.state;

class Door implements StateAware {

    private DoorState state;

    Door(DoorState state) {
        this.state = state;
    }

    public void open() {
        state.open(this);
    }

    public void close() {
        state.close(this);
    }

    @Override
    public void changeState(DoorState state) {
        this.state = state;
    }

    public DoorState getState() {
        return this.state;
    }
}

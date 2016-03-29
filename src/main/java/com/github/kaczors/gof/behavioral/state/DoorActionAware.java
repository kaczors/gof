package com.github.kaczors.gof.behavioral.state;

interface DoorActionAware {

    void open(StateAware state);

    void close(StateAware state);
}

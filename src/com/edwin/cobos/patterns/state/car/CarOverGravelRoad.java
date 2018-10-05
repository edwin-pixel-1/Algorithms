package com.edwin.cobos.patterns.state.car;

public class CarOverGravelRoad implements CarState {

    @Override
    public int getLeft() {
        return 3;
    }

    @Override
    public int getAcceleration() {
        return 7;
    }

    @Override
    public int getRight() {
        return 3;
    }

    @Override
    public int getBrake() {
        return 6;
    }
}

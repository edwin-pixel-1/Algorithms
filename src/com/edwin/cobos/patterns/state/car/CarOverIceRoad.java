package com.edwin.cobos.patterns.state.car;

public class CarOverIceRoad implements CarState {
    @Override
    public int getLeft() {
        return 1;
    }

    @Override
    public int getAcceleration() {
        return 3;
    }

    @Override
    public int getRight() {
        return 1;
    }

    @Override
    public int getBrake() {
        return 2;
    }
}

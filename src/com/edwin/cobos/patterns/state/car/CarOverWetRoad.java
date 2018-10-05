package com.edwin.cobos.patterns.state.car;

public class CarOverWetRoad implements CarState {
    @Override
    public int getLeft() {
        return 4;
    }

    @Override
    public int getAcceleration() {
        return 9;
    }

    @Override
    public int getRight() {
        return 4;
    }

    @Override
    public int getBrake() {
        return 7;
    }
}

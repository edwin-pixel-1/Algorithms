package com.edwin.cobos.patterns.state.car;

public class CarOverRegularRoad implements CarState {

    @Override
    public int getAcceleration() {
        return 9;
    }

    @Override
    public int getLeft() {
        return 5;
    }

    @Override
    public int getRight() {
        return 5;
    }

    @Override
    public int getBrake() {
        return 8;
    }
}

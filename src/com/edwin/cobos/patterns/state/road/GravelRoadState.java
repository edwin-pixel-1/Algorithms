package com.edwin.cobos.patterns.state.road;

import com.edwin.cobos.patterns.state.car.Car;

public class GravelRoadState implements RoadState {

    private Car car;

    public GravelRoadState(Car car) {
        this.car = car;
    }

    @Override
    public void changeCarConditions() {
        car.setCarState(car.getCarOverGravelRoad());
    }
}

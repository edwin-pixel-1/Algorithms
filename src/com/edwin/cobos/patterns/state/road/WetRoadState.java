package com.edwin.cobos.patterns.state.road;

import com.edwin.cobos.patterns.state.car.Car;

public class WetRoadState implements RoadState {

    private Car car;

    public WetRoadState(Car car) {
        this.car = car;
    }

    @Override
    public void changeCarConditions() {
        car.setCarState(car.getCarOverWetRoad());
    }
}

package com.edwin.cobos.patterns.state.road;

import com.edwin.cobos.patterns.state.car.Car;

public class IceRoadState implements RoadState {

    private Car car;

    public IceRoadState(Car car) {
        this.car = car;
    }

    @Override
    public void changeCarConditions() {
        car.setCarState(car.getCarOverIceRoad());
    }
}

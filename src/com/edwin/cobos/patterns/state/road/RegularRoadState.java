package com.edwin.cobos.patterns.state.road;

import com.edwin.cobos.patterns.state.car.Car;

public class RegularRoadState implements RoadState {

    private Car car;

    public RegularRoadState(Car car) {
        this.car = car;
    }

    @Override
    public void changeCarConditions() {
        car.setCarState(car.getCarOverRegularRoad());
    }
}

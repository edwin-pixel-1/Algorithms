package com.edwin.cobos.patterns.state.road;

import com.edwin.cobos.patterns.state.car.Car;

import java.util.ArrayList;
import java.util.List;

public class Road {

    private RoadState currentState;
    private List<RoadState> roadStatesList;

    public Road(Car car) {
        RoadState regularState = new RegularRoadState(car);
        RoadState gravelState = new GravelRoadState(car);
        RoadState wetState = new WetRoadState(car);
        RoadState iceState = new IceRoadState(car);

        roadStatesList = new ArrayList<>();
        roadStatesList.add(regularState);
        roadStatesList.add(gravelState);
        roadStatesList.add(wetState);
        roadStatesList.add(iceState);

        currentState = regularState;
        currentState.changeCarConditions();
    }

    public void setCurrentState(int level) {
        currentState = roadStatesList.get(level);
        currentState.changeCarConditions();
    }

    public String getStateName() {
        return currentState.getClass().getSimpleName();
    }
}

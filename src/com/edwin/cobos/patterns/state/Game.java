package com.edwin.cobos.patterns.state;

import com.edwin.cobos.patterns.state.car.Car;
import com.edwin.cobos.patterns.state.road.Road;

public class Game {

    private final Car car;
    private int level = 0;
    private final Road road;
    private final int maxLevelNumber = 4;

    public Game() {
        car = new Car();
        road = new Road(car);
    }

    public void nextLevel() {
        level += 1;
        if (level >= maxLevelNumber)
            level = 0;

        road.setCurrentState(level);
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Road State: ").append(road.getStateName()).append("\n");
        sb.append("Car Speed: ").append(car.getSpeed()).append("\n");
        sb.append("Car Steering: ").append(car.getSteering()).append("\n");
        sb.append("Car Acceleration: ").append(car.getAcceleration()).append("\n");
        sb.append("Car Brake: ").append(car.getBrake()).append("\n");
        return sb.toString();
    }
}

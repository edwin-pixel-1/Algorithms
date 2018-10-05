package com.edwin.cobos.patterns.state.car;

public class Car implements CarControls {

    private final CarState carOverRegularRoad;
    private final CarState carOverGravelRoad;
    private final CarState carOverWetRoad;
    private final CarState carOverIceRoad;
    private CarState carState;
    private int speed;
    private String steering = "";

    public Car() {
        carOverRegularRoad = new CarOverRegularRoad();
        carOverGravelRoad = new CarOverGravelRoad();
        carOverWetRoad = new CarOverWetRoad();
        carOverIceRoad = new CarOverIceRoad();
    }

    @Override
    public void turnLeft() {
        System.out.println("Steering Lef: " + carState.getLeft());
        steering = "Left "+ carState.getLeft();
    }

    @Override
    public void turnRight() {
        System.out.println("Steering Right: " + carState.getRight());
        steering = "Right "+ carState.getRight();
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating: " + carState.getAcceleration());
        speed += carState.getAcceleration();
    }

    @Override
    public void pushBrake() {
        System.out.println("Breaking: " + carState.getBrake());
        speed -= carState.getBrake();
        if (speed < 0) speed = 0;
    }

    public int getAcceleration() {
        return carState.getAcceleration();
    }

    public int getBrake() {
        return carState.getBrake();
    }

    public int getSpeed() {
        return speed;
    }

    public String getSteering() {
        return steering;
    }

    public void resetSteering(){
        steering = "";
    }

    public void setCarState(CarState carState) {
        this.carState = carState;
    }

    public CarState getCarOverRegularRoad() {
        return carOverRegularRoad;
    }

    public CarState getCarOverGravelRoad() {
        return carOverGravelRoad;
    }

    public CarState getCarOverWetRoad() {
        return carOverWetRoad;
    }

    public CarState getCarOverIceRoad() {
        return carOverIceRoad;
    }
}

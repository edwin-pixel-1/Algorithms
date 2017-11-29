package com.exercises;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Exercises exercises = new Exercises();
        System.out.println("EXERCISE: " + exercises.getClass().getSuperclass().getSimpleName());
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("TIME: " + duration);
    }
}

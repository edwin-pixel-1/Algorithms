package com.edwin.cobos.patterns.singleton;

public class SingletonA {

    private static SingletonA instance;

    private SingletonA() {
    }

    public static synchronized SingletonA getInstance() {
        if (instance == null) {
            instance = new SingletonA();
        }
        return instance;
    }
}

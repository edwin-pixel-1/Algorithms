package com.edwin.cobos.patterns.singleton;

public final class SingletonD {

    private static final SingletonD INSTANCE = new SingletonD();

    private SingletonD() {
    }

    public static SingletonD getInstance() {
        return INSTANCE;
    }
}

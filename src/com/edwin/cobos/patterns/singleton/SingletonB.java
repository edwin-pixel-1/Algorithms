package com.edwin.cobos.patterns.singleton;

public class SingletonB {

    private static volatile SingletonB instance;

    private SingletonB() {
    }

    public static SingletonB getInstance() {
        if(instance == null){
            synchronized (SingletonB.class) {
                if(instance == null){
                    instance = new SingletonB();
                }
            }
        }
        return instance;
    }
}

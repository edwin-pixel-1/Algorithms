package com.edwin.cobos.patterns.observer.services;

import com.edwin.cobos.patterns.observer.observer.Observer;
import com.edwin.cobos.patterns.observer.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class NamesService implements Subject {

    private List<String> names;
    private List<Observer> observers;
    private final Object MUTEX = new Object();

    public NamesService() {
        names = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
        sendStockData();
    }

    @Override
    public void attach(Observer observer) {
        synchronized (MUTEX) {
            if (!observers.contains(observer))
                observers.add(observer);
        }
    }

    @Override
    public void detach(Observer observer) {
        synchronized (MUTEX) {
            int i = observers.indexOf(observer);
            if (i >= 0)
                observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        synchronized (MUTEX) {
            int n = observers.size();
            for (int i = 0; i < n; ++i) {
                Observer observer = (Observer)
                        observers.get(i);
                observer.updateNames(names);
            }
        }
    }

    public void sendStockData() {
        notifyObservers();
    }

    public void addName(String name) {
        names.add(name);
        sendStockData();
    }



}

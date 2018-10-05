package com.edwin.cobos.patterns.observer.observer;

public interface Subject {

    public void attach(Observer observer);

    public void detach(Observer observer);

    public void notifyObservers();


}

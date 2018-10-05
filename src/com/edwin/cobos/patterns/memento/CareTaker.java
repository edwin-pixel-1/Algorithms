package com.edwin.cobos.patterns.memento;

import java.util.Stack;

public class CareTaker {
    private Stack<Memento> mementoList = new Stack<>();

    public void push(Memento state) {
        mementoList.push(state);
    }

    public Memento pop() {
        return !mementoList.empty() ? mementoList.pop() : null;
    }

    public void clear() {
        mementoList.clear();
    }
}

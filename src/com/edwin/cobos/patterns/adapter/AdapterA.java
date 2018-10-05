package com.edwin.cobos.patterns.adapter;

public class AdapterA implements QueueTarget, StackTarget {

    private Adaptee adaptee;

    //Stack
    @Override
    public void push(String str) {
        adaptee.add(str);
    }

    @Override
    public String pop() {
        int end = adaptee.getEnd();
        String str = adaptee.get(end);
        adaptee.remove(end);
        return str;
    }

    @Override
    public boolean isEmpty() {
        return adaptee.empty();
    }

    //Queue
    @Override
    public String dequeue() {
        String removed = adaptee.get(0);
        adaptee.remove(0);
        return removed;
    }

    @Override
    public void enqueue(String e) {
        adaptee.add(e);
    }
}

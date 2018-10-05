package com.edwin.cobos.patterns.adapter;

public interface QueueTarget {

    public boolean isEmpty();

    public String dequeue();

    public void enqueue(String e);

}

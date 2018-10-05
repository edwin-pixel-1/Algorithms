package com.edwin.cobos.patterns.adapter;

public interface StackTarget {

    public void push(String str);

    public String pop();

    public boolean isEmpty();

}

package com.edwin.cobos.patterns.decorator;

import java.util.*;

public class LinkedListProfilerDecorator extends ListProfilerDecorator {

    public LinkedListProfilerDecorator(AbstractList list) {
        super(list);
    }

    @Override
    public Object get(int index) {
        return list.get(index);
    }

    @Override
    public boolean add(Object o) {
        long time1 = System.nanoTime();
        boolean result = list.add(o);
        long time2 = System.nanoTime();
        long totalTime = time2 - time1;
        System.out.println("LinkedList Add method time: " + totalTime);
        return result;
    }

    @Override
    public boolean remove(Object o) {
        long time1 = System.nanoTime();
        boolean result = list.remove(o);
        long time2 = System.nanoTime();
        long totalTime = time2 - time1;
        System.out.println("LinkedList Remove method time: " + totalTime);
        return result;
    }

    @Override
    public boolean contains(Object o) {
        long time1 = System.nanoTime();
        boolean result = list.contains(o);
        long time2 = System.nanoTime();
        long totalTime = time2 - time1;
        System.out.println("LinkedList Contains method time: " + totalTime);
        return result;
    }

    @Override
    public int size() {
        long time1 = System.nanoTime();
        int result = list.size();
        long time2 = System.nanoTime();
        long totalTime = time2 - time1;
        System.out.println("LinkedList size method time: " + totalTime);
        return result;
    }
}

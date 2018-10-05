package com.edwin.cobos.patterns.decorator;

import java.util.AbstractList;

public class ArrayListProfilerDecorator extends ListProfilerDecorator {

    public ArrayListProfilerDecorator(AbstractList list) {
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
        System.out.println("ArrayList Add method time: " + totalTime);
        return result;
    }

    @Override
    public boolean remove(Object o) {
        long time1 = System.nanoTime();
        boolean result = list.remove(o);
        long time2 = System.nanoTime();
        long totalTime = time2 - time1;
        System.out.println("ArrayList Remove method time: " + totalTime);
        return result;
    }

    @Override
    public boolean contains(Object o) {
        long time1 = System.nanoTime();
        boolean result = list.contains(o);
        long time2 = System.nanoTime();
        long totalTime = time2 - time1;
        System.out.println("ArrayList Contains method time: " + totalTime);
        return result;
    }

    @Override
    public int size() {
        long time1 = System.nanoTime();
        int result = list.size();
        long time2 = System.nanoTime();
        long totalTime = time2 - time1;
        System.out.println("ArrayList size method time: " + totalTime);
        return result;
    }
}

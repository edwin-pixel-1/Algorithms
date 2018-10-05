package com.edwin.cobos.patterns.decorator;

import java.util.AbstractList;
import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        AbstractList arrayListProfilerDecorator = new ArrayListProfilerDecorator(arrayList);

        AbstractList linkedListProfilerDecorator = new LinkedListProfilerDecorator(arrayListProfilerDecorator);

        for (int i = 0; i < 10; i++) {
            linkedListProfilerDecorator.add("Hello " + i);
            System.out.println("---");
        }
    }
}

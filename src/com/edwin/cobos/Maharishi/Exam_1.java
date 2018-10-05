package com.edwin.cobos.Maharishi;

import java.util.*;

public class Exam_1 {

    public Exam_1() {
        ArrayList<String> arrayTest1 = new ArrayList<>();
        arrayTest1.add("1");
        arrayTest1.add("2");
        arrayTest1.add("3");
        arrayTest1.add("3");
        arrayTest1.add("2");
        arrayTest1.add("3");
        arrayTest1.add("5");
        arrayTest1.add("4");
        arrayTest1.add("4");

        long startTime = System.nanoTime();
        System.out.println(Arrays.deepToString(arrayTest1.toArray()));
        removeDuplicates_1_1(arrayTest1);
        System.out.println(Arrays.deepToString(arrayTest1.toArray()));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("TIME 1: " + duration);

/*
        startTime = System.nanoTime();
        System.out.println(Arrays.deepToString(arrayTest1.toArray()));
        result = removeDuplicates_2(arrayTest1);
        System.out.println(Arrays.deepToString(result.toArray()));

        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("TIME 2: " + duration);*/
    }

    private ArrayList<String> removeDuplicates_1(ArrayList<String> array) {
        if (array == null || array.size() < 2)
            return array;

        int nextStart = 0;
        String value = array.get(nextStart);
        if (array.lastIndexOf(value) != nextStart) {
            array.remove(nextStart);
            return removeDuplicates_1(array);
        }
        nextStart++;
        ArrayList<String> sarray = new ArrayList<>(array.subList(nextStart, array.size()));
        sarray = removeDuplicates_1(sarray);
        sarray.add(0, value);
        return sarray;
    }

    private void removeDuplicates_1_1(ArrayList<String> array) {
        if (array == null || array.size() < 2)
            return;

        int nextStart = 0;
        String value = array.get(nextStart);
        boolean isDuplicated = array.lastIndexOf(value) != nextStart;

        array.remove(nextStart);
        removeDuplicates_1_1(array);

        if (!isDuplicated) {
            array.add(0, value);
        }
    }

    private ArrayList<String> removeDuplicates_2(ArrayList<String> array) {
        return removeDuplicates_2(array, 0);
    }

    private ArrayList<String> removeDuplicates_2(ArrayList<String> array, int index) {
        if (array == null || array.size() < 2) {
            return null;
        }

        if (index == array.size() - 1)
            return array;

        String obj = array.get(index);
        int lastIndex = array.lastIndexOf(obj);
        int nextIndex = index;
        if (lastIndex > index) {
            array.remove(index);
            nextIndex--;
        }

        return removeDuplicates_2(array, nextIndex + 1);
    }

    private ArrayList<String> removeDuplicates(ArrayList<String> array) {
        if(array.size()<=1) {
            return array;
        }
        String element = array.get(0);
        ArrayList<String> returnArr = new ArrayList<String>();
        returnArr.add(element);
        array.removeAll(returnArr);
        returnArr.addAll(removeDuplicates(array));
        return returnArr;
    }
}

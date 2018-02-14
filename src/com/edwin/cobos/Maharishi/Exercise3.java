package com.edwin.cobos.Maharishi;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise3 {

    /**
     * Write a function to return an array containing all elements common to two given arrays containing distinct positive integers.
     * You should not use any inbuilt methods. You are allowed to use any number of arrays.
     * <p>
     * The signature of the function is:
     * int[] f(int[] first, int[] second)
     */
    public Exercise3() {

        int[] result = f(new int[]{1, 3, 7, 9}, new int[]{7, 1, 9, 3});
        System.out.println(Arrays.toString(result));
    }

    private int[] f(int[] first, int[] second) {

        if (first == null || second == null) {
            return null;
        }

        if (first.length == 0 || second.length == 0) {
            return new int[0];
        }

        int[] minArray;
        int[] maxArray;
        if (first.length < second.length) {
            minArray = first;
            maxArray = second;
        } else {
            minArray = second;
            maxArray = first;
        }

        int[] kArray = new int[minArray.length];
        int countK = 0;
        for (int i : minArray) {
            for (int j : maxArray) {
                if (i == j) {
                    kArray[countK] = i;
                    countK++;
                }
            }
        }

        int[] result = new int[countK];
        for (int i = 0; i < countK; i++) {
            result[i] = kArray[i];
        }

        //return result;
        return Arrays.copyOf(kArray, countK);
    }

}

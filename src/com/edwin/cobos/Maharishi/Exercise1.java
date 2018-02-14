package com.edwin.cobos.Maharishi;

public class Exercise1 {

    /**
     * Write a function that takes an array of integers as an argument and returns a value based on the sums of the even and odd numbers in the array.
     * Let X = the sum of the odd numbers in the array and let Y = the sum of the even numbers. The function should return X - Y
     * <p>
     * The signature of the function is:
     * int f(int[ ] a)
     */
    public Exercise1() {
        int r = f(new int[]{3, 2, 3, 4});
        System.out.println(r);
    }

    private int f(int[] a) {

        int x = 0;
        int y = 0;

        for (int i = 0; i < a.length; i++) {
            int number = a[i];
            if (number % 2 == 0) {
                y += number;
            } else {
                x += number;
            }
        }

        return x - y;
    }
}

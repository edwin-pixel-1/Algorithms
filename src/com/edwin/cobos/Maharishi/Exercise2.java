package com.edwin.cobos.Maharishi;

public class Exercise2 {

    /**
     * Write a function to reverse an integer using numeric operators and without using any arrays or other data structures.
     * <p>
     * The signature of the function is:
     * int f(int n)
     */

    public Exercise2() {
        int r = f(159632);
        System.out.println(r);
    }

    private int f(int n) {
        int sign = 1;
        if (n == 0) return 0;
        if (n < 0) {
            sign = -1;
            n = -n;
        }

        int reverse = 0;
        while (n != 0) {
            reverse = (reverse * 10) + (n % 10);
            n /= 10;
        }

        return sign * reverse;
    }
}

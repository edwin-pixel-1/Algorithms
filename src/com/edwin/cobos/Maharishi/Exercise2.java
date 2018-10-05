package com.edwin.cobos.Maharishi;

public class Exercise2 {

    /**
     * Write a function to reverse an integer using numeric operators and without using any arrays or other data structures.
     * <p>
     * The signature of the function is:
     * int f(int n)
     */

    public Exercise2() {
        int r = f(1534236469);
        //1534236469
        //243423649
        //2147483647
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
        int temp;
        while (n != 0) {
            temp = reverse;
            reverse = (reverse * 10) + (n % 10);
            n /= 10;

            if(temp != reverse/10)
                return 0;
        }


        return sign * reverse;
    }
}

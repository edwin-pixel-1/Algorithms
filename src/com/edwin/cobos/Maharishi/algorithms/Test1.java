package com.edwin.cobos.Maharishi.algorithms;

import java.util.ArrayList;

public class Test1 {

    public int foo(int n) {
        int count = 0;
        for (int i = 0; i < n; i++)
            for (int j = i; j * j > 0; j--)
                count = count + 1;
        return count;
    }


    public int foo2(int n) {
        int m = 0;
        while (n >= 2) {
            n = n / 3;
            m = m + 1;
            System.out.println(m);
        }
        return m;
    }

    public void search1(int[] input) {
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        for (int i=0; i < input.length; i++) {
            if(input[i] < minValue)
                minValue = input[i];

            if(input[i] > maxValue)
                maxValue = input[i];
        }
        System.out.println("maxValue: " + maxValue);
        System.out.println("minValue: " + minValue);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        System.out.println("--");
        int result = t.foo(10);
        System.out.println("--result : " + result);
        /*
        for (int i = 0; i <= 1000; i++) {
            System.out.println("--" + i);
            int result = t.foo2(i);
            System.out.println("--result : " + result);
        }*/
        //t.search1(new int[]{ 1, 3, 2, 1, 3, 5, 3});
    }

}

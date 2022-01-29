package com.edwin.cobos.Maharishi.algorithms.Lab2;

public class FibonacciIterative {

    private int getFibIterative(int n) {
        int[] store = new int[n+1];
        store[0] = 0;
        store[1] = 1;
        for(int i = 2; i <= n; i++) {
            store[i] = store[i-1] + store[i-2];
        }
        return store[n];
    }

    public static void main(String[] args) {
        FibonacciIterative prob = new FibonacciIterative();
        int result = prob.getFibIterative(10);
        System.out.println(result);
    }

}

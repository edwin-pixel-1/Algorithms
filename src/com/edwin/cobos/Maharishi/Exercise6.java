package com.edwin.cobos.Maharishi;

public class Exercise6 {

    public Exercise6() {

        int result = f(null);
        System.out.println(result);
    }

    private int f(int[] a) {
        if(a == null)
            return 0;

        int last = -1;
        int preLast = -1;
        for (int i : a) {
            if (i > last) {
                preLast = last;
                last = i;
            } else {
                if (i < last && i > preLast) {
                    preLast = i;
                }
            }
        }

        return preLast;
    }
}

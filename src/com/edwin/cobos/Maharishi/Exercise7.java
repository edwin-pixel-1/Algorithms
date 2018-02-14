package com.edwin.cobos.Maharishi;

public class Exercise7 {

    public Exercise7() {
        int rr = isMadhavArray(new int[]{2, 1, 1, 4, -1, -1});
        System.out.println(rr);
    }

    private int isMadhavArray(int[] a) {
        if (a == null || a.length < 3)
            return 0;

        int baseNumber = a[0];
        int countIncrement = 2;
        int startingIndex = 1;
        while (startingIndex < a.length) {
            int sum = 0;
            int limit = startingIndex + countIncrement;

            if(limit > a.length)
                return 0;

            for (int i = startingIndex; i < limit; i++) {
                sum += a[i];
            }

            if (sum != baseNumber)
                return 0;

            startingIndex += countIncrement;
            countIncrement++;
        }

        return 1;
    }
}

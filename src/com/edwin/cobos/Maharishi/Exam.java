package com.edwin.cobos.Maharishi;

public class Exam {

    public Exam() {
        //Test 1
        //int rr = hasSingleMaximum(new int[]{-6, -6, -6, -6, -6, -6, -6});
        //System.out.println(rr);

        //Test 2
        //int rr = isPairedN(new int[]{}, 0);
        //System.out.println(rr);

        //Test 3
        //int rr = isSelfReferential(new int[]{1, 2, 1, 0});
        //System.out.println(rr);
//        rr = isSelfReferential(new int[]{2, 0, 2, 0});
//        System.out.println("{2, 0, 2, 0} = " + rr);
//        rr = isSelfReferential(new int[]{2, 1, 2, 0, 0});
//        System.out.println("{2, 1, 2, 0, 0} = " + rr);
//        rr = isSelfReferential(new int[]{3, 2, 1, 1, 0, 0, 0});
//        System.out.println("{3, 2, 1, 1, 0, 0, 0} = " + rr);
//        rr = isSelfReferential(new int[]{4, 2, 1, 0, 1, 0, 0, 0});
//        System.out.println("{4, 2, 1, 0, 1, 0, 0, 0} = " + rr);
//        rr = isSelfReferential(new int[]{5, 2, 1, 0, 0, 1, 0, 0, 0});
//        System.out.println("{5, 2, 1, 0, 0, 1, 0, 0, 0} = " + rr);
//        rr = isSelfReferential(new int[]{6, 2, 1, 0, 0, 0, 1, 0, 0, 0});
//        System.out.println("{6, 2, 1, 0, 0, 0, 1, 0, 0, 0} = " + rr);

    }

    public int isSelfReferential(int[] a) {
        boolean isSelfReferential = false;

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int value : a) {
                if (value == i)
                    count++;
            }
            isSelfReferential = count == a[i];
        }

        return isSelfReferential ? 1 : 0;
    }

    public int isPairedN(int[] a, int n) {
        if (a == null || a.length < 2 || n < 1 || n > a.length)
            return 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int sumValues = a[i] + a[j];
                int sumIndex = i + j;
                if (sumValues == n && sumIndex == n) {
                    return 1;
                }
            }
        }

        return 0;
    }

    public int hasSingleMaximum(int[] a) {
        if (a == null || a.length == 0)
            return 0;

        int max = Integer.MIN_VALUE;
        boolean isSingleMax = true;
        for (int value : a) {
            if (value == max) {
                isSingleMax = false;
            } else if (value > max) {
                max = value;
                isSingleMax = true;
            }
        }

        return isSingleMax ? 1 : 0;
    }
}

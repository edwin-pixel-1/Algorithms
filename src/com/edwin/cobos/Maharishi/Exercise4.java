package com.edwin.cobos.Maharishi;

public class Exercise4 {

    /**
     * Consider an array A with n of positive integers. An integer idx is called a POE (point of equilibrium) of A,
     * if A[0] + A[1] + … + A[idx – 1] is equal to A[idx + 1] + A[idx + 2] + … + A[n – 1].
     * Write a function to return POE of an array, if it exists and -1 otherwise.
     * <p>
     * The signature of the function is:
     * int f(int[] a)
     */
    public Exercise4() {
        int rr = f2(new int[]{1, 5, 3, 1, 1, 1, 1, 1, 1});
        System.out.println(rr);
    }

    private int f(int[] a) {
        if (a == null || a.length == 0)
            return -1;

        int result = -1;
        for (int i = 1; i < a.length; i++) {
            int leftSum = 0;
            for (int k = 0; k < i; k++) {
                leftSum += a[k];
            }

            int rightSum = 0;
            for (int l = i + 1; l < a.length; l++) {
                rightSum += a[l];
                if (rightSum > leftSum)
                    break;
            }

            if (leftSum == rightSum) {
                result = i;
                break;
            }
        }

        return result;
    }

    private int f2(int[] a) {
        if (a.length < 3) return -1;
        int i = 0;
        int j = a.length - 1;
        int idx = 1;
        int leftSum = a[i];
        int rightSum = a[j];
        for (int k = 0; k < a.length - 3; k++) {
            if (leftSum < rightSum) {
                i++;
                leftSum += a[i];
                idx = i + 1;
            } else {
                j--;
                rightSum += a[j];
                idx = j - 1;
            }
        }
        if (leftSum == rightSum)
            return idx;
        else
            return -1;
    }
}

package com.edwin.cobos.Maharishi.algorithms.Lab2;

import java.util.Arrays;

public class Problem3 {

    public int[] merge(int[] arr1, int[] arr2) {
        int k = arr1.length;
        int j = arr2.length;
        int m = 0;
        int[] arr3 = new int[k + j];
        for (int i = 0; i < arr3.length; i++) {
            if (m < k && m < j) {
                if (arr1[m] <= arr2[m]) {
                    arr3[i] = arr1[m];
                    arr3[i + 1] = arr2[m];
                } else {
                    arr3[i] = arr2[m];
                    arr3[i + 1] = arr1[m];
                }
                for (int h = i; h > 0; h--) {
                    if (arr3[h] < arr3[h - 1]) {
                        int tmp = arr3[h];
                        arr3[h] = arr3[h - 1];
                        arr3[h - 1] = tmp;
                    } else {
                        break;
                    }
                }
                i++;
            } else if (m < k) {
                arr3[i] = arr1[m];
            } else {
                arr3[i] = arr2[m];
            }
            m++;
        }
        return arr3;
    }

    public static void main(String[] args) {
        Problem3 prob = new Problem3();
        int[] items1 = {1, 4, 5, 6, 8, 17};
        int[] items2 = {2, 4, 7, 8, 11, 13, 21, 23, 25};
        int[] result = prob.merge(items2, items1);
        System.out.println(Arrays.toString(result));
    }
}

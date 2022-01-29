package com.edwin.cobos.Maharishi.algorithms.Lab2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Problem8 {
    private int[] generateRandomDistinctNumbers(int n) {
        int[] result = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            result[i] = random.nextInt(n*10);
        }
        return result;
    }

    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
        int no = s.nextInt();
        Problem8 p = new Problem8();
        int[] arr = p.generateRandomDistinctNumbers(no);
        System.out.println(Arrays.toString(arr));
    }
}

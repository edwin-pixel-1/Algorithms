package com.edwin.cobos.exercises.Necklaces;

import java.util.Arrays;

class Necklaces2 {

    private int buildNecklaces(int number) {

        if (number < 2 || number > 18)
            return 0;

        if (!isEven(number))
            return 0;

        int[] workArray = new int[number];

        for (int i = 1; i <= number; i++) {
            workArray[i - 1] = i;
        }
        System.out.println(Arrays.toString(workArray));
        System.out.println("---");
        int result = checkPrimes(workArray) ? 1 : 0;
        for (int i = 0; i < workArray.length; i++) {
            for (int j = 0; j < workArray.length - 1; j++) {
                swap(workArray, j, j + 1);
                if (i == 0 || j < workArray.length - 3) {
                    if (checkPrimes(workArray)) {
                        result++;
                        System.out.println(Arrays.toString(workArray));
                    }
                }
            }
            System.out.println("---");
        }
        return result;
    }

    private boolean checkPrimes(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index1 = getNextIndex(i + 1, array.length);
            int index2 = getNextIndex(i + 2, array.length);
            if (!isPrime(array[index1] + array[index2]))
                return false;
        }

        return true;
    }

    private int getNextIndex(int index, int length) {
        return index > (length - 1) ? (index - length) : index;
    }

    private void swap(int[] array, int index1, int index2) {
        int aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }

    private boolean isPrime(int number) {
        if (number == 2)
            return true;

        if (number < 2)
            return false;

        for (int i = 3; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Necklaces2 result = new Necklaces2();
        System.out.println(result.buildNecklaces(4));
    }
}

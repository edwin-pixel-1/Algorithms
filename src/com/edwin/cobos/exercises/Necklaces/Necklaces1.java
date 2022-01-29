package com.edwin.cobos.exercises.Necklaces;

import java.util.Arrays;

public class Necklaces1 {

    private static int[] initArray;

    public static void main (String[] args) {
        int result = buildNecklaces(6);
        System.out.println(result);
    }

    private static int buildNecklaces(int number) {
        if(number < 2 || number > 18)
            return 0;

        if(!isEven(number))
            return 0;

        initArray = new int[number];

        //int[] initArray = new int[number];
        int[] workArray = new int[number];

        for(int i = 1; i <= number; i++){
            initArray[i-1] = i;
            workArray[i-1] = i;
        }

        int result = countNecklaces(workArray, 0, 0, 0, true);

        String s = "";
        s.toLowerCase().contains("Set");
        return result;
    }

    private static int countNecklaces(int[] array, int index, int round, int count, boolean noSwap) {

        if(round > 1) {
            if(Arrays.equals(initArray, array)) {
                return count;
            }
        }


        int index1 = getFirstNextIndex(index, array.length);
        int index2 = getSecondNextIndex(index, array.length);

        if(!isPrime(array[index1] + array[index2])) {
            swap(array, index, index1);
            return countNecklaces(array, index1, round, count, false);
        }

        if(index == array.length-1) {
            round = round + 1;
            index = -1;
            count = noSwap ? count+1 : count;
            noSwap = true;
        }

        return countNecklaces(array, index+1, round, count, noSwap);
    }


    private static int getFirstNextIndex(int index, int length) {
        int index1 = index + 1;
        return index1 > (length-1) ? 0 : index1;
    }

    private static int getSecondNextIndex(int index, int length) {
        int index2 = (index + 2);
        return index2 > (length-1) ? (index2 - length) : index2;
    }

    private static void swap(int[] array, int index1, int index2) {
        int aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;
    }

    private static boolean isEven(int number) {
        if(number % 2 == 0)
            return true;

        return false;
    }

    private static boolean isPrime(int number) {
        if(number == 2) {
            return true;
        }

        if(number < 2)
            return false;

        for(int i = 3; i < number; i++ ) {
            if(number % i == 0)
                return false;
        }

        return true;
    }

}

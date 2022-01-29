package com.edwin.cobos.exercises.PascalTriangle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PascalTriangle {

    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if (numRows <= 0)
            return result;

        List<Integer> init = new ArrayList<>();
        init.add(1);
        result.add(init);
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(result.size() - 1);

            List<Integer> row = new ArrayList<>();
            row.add(1);

            if (prevRow.size() > 1) {
                for (int j = 1; j < prevRow.size(); j++) {
                    int value = prevRow.get(j) + prevRow.get(j - 1);
                    row.add(value);
                }
            }

            row.add(1);
            result.add(row);
        }
        return result;
    }

    private static List<Integer> generateRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();

        result.add(1);

        if (rowIndex <= 0)
            return result;

        for (int i = 0; i < rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < result.size(); j++) {
                int value = result.get(j) + result.get(j - 1);
                row.add(value);
            }
            row.add(1);
            result = row;
        }
        return result;
    }

    private static List<Integer> generateRow2(int rowIndex) {
        List<Integer> result = new ArrayList<>();

        int i = 0;
        while (i <= rowIndex) {
            List<Integer> row = new ArrayList<>(result);
            result.add(1);
            for (int j = 1; j < i; j++) {
                int value = row.get(j) + row.get(j - 1);
                result.set(j, value);
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {

        long time1 = 0;
        long time2 = 0;
        String resultStr = "";
        List<Integer> result = null;

        time1 = System.nanoTime();
        result = generateRow(3);
        resultStr = result.stream().map(Object::toString).collect(Collectors.joining(","));
        System.out.println(resultStr);
        time2 = System.nanoTime();
        System.out.println("time: " + (time2 - time1));

        time1 = System.nanoTime();
        result = generateRow2(3);
        resultStr = result.stream().map(Object::toString).collect(Collectors.joining(","));
        System.out.println(resultStr);
        time2 = System.nanoTime();
        System.out.println("time: " + (time2 - time1));



        List<List<Integer>> result2 = generate(3);
        result2.forEach(System.out::println);


    }
}

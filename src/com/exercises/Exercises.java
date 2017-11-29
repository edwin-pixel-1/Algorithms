package com.exercises;

import java.util.*;
import java.util.stream.Collectors;

public class Exercises {

    public Exercises() {
        //char result = getMostPopularLetter("Hello app");

        List<int[]> list = Arrays.asList(
                new int[]{1, 0},
                new int[]{0, 5},
                new int[]{3, 0},
                new int[]{1, 0},
                new int[]{10, 10},
                new int[]{15, 9},
                new int[]{2, 0},
                new int[]{1, 3},
                new int[]{3, 1},
                new int[]{5, 1}
                );

        List<int[]> result =closestPoints(list, 2);

        //executeNumMatrix();
        System.out.println("Result: " + Arrays.deepToString(result.toArray()));
    }

    private List<int[]> closestPoints(List<int[]> points, int k) {
        Map<Double, int[]> result = new TreeMap<>();

        if (k <= 0 || points.size() == 0) return new ArrayList<>();

        for (int[] point : points) {
            double distance = Math.sqrt(Math.pow(point[0], 2) + Math.pow(point[1], 2));

            result.put(distance, point);
        }

        return result
                .values()
                .stream()
                .limit(k)
                .collect(Collectors.toList());
    }

    /**
     *
     */
    public char getMostPopularLetter(String input) {
        HashMap<Character, Integer> map = new HashMap<>();
        Character result = null;

        for (char c : input.toCharArray()) {
            map.put(c, map.containsKey(c) ? (map.get(c) + 1) : 1);

            if (result == null) {
                result = c;
            } else if (map.get(result) <= map.get(c)) {
                result = c;
            }
        }

        return result;
    }


    /**
     * https://leetcode.com/problems/range-sum-query-2d-immutable/description/
     */
    private void executeNumMatrix() {
        int[][] matrix = new int[][]{
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}};
        NumMatrix2 obj = new NumMatrix2(matrix);
        int result = obj.sumRegion(1, 2, 3, 4);

        System.out.println("Result: " + result);
    }


    class NumMatrix1 {
        private int[][] matrix;

        public NumMatrix1(int[][] matrix) {
            this.matrix = matrix;
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            if (matrix.length < row1 || matrix.length < row2 || matrix[0].length < col1 || matrix[0].length < col2) {
                throw new IllegalArgumentException("No match region");
            }

            int result = 0;
            for (int i = row1; i <= row2; i++) {
                for (int j = col1; j <= col2; j++) {
                    result += matrix[i][j];
                }
            }

            return result;
        }
    }

    class NumMatrix2 {
        private int[][] matrix;

        public NumMatrix2(int[][] matrix) {
            if (matrix.length == 0 || matrix[0].length == 0) return;
            this.matrix = new int[matrix.length][matrix[0].length + 1];
            for (int r = 0; r < matrix.length; r++) {
                for (int c = 0; c < matrix[0].length; c++) {
                    this.matrix[r][c + 1] = this.matrix[r][c] + matrix[r][c];
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            int sum = 0;
            for (int row = row1; row <= row2; row++) {
                sum += this.matrix[row][col2 + 1] - this.matrix[row][col1];
            }
            return sum;
        }
    }
}

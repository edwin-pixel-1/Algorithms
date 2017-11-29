package com.edwin.cobos.exercises;

public class SumRegionMatrix {

    /**
     * https://leetcode.com/problems/range-sum-query-2d-immutable/description/
     */
    public SumRegionMatrix(){
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

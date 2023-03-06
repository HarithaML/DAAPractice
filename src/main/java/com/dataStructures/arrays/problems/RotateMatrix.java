package com.dataStructures.arrays.problems;

public class RotateMatrix {
    int n;
    int[][] matrix = new int[n][n];


    public RotateMatrix(int n, int[][] matrix) {
        this.n = n;
        this.matrix = matrix;
    }

    //rotation of a matrix
//    123
    // 456
    //789
    //rotated
    //741
    //852
    //963
    public void rotate() {
        // Traverse each cycle
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {

                // Swap elements of each cycle
                // in clockwise direction
                int temp = this.matrix[i][j];
                this.matrix[i][j] = this.matrix[n - 1 - j][i];
                this.matrix[n - 1 - j][i] = this.matrix[n - 1 - i][n - 1 - j];
                this.matrix[n - 1 - i][n - 1 - j] = this.matrix[j][n - 1 - i];
                this.matrix[j][n - 1 - i] = temp;
            }
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }
}

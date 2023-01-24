package com.epam.training.student_andrii_dolhopolov.arrays;

import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {

        // a - matrix1
        // b - matrix2

        int ar = matrix1.length;
        int bc = matrix2[0].length;
        int br = matrix2.length;
        int[][] x = new int[ar][bc];

        for (int i = 0; i < ar; i++) {
            for (int j = 0; j < bc; j++) {
                x[i][j] = 0;
                for(int k = 0; k < br; k++) {
                    x[i][j] += (matrix1[i][k] * matrix2[k][j]);
                }
            }
        }
        return x;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] a = {
                {0, 12345},
                {4509, 0},
                {3, 567} };

        int[][] b = {
                {653, 0, 25353},
                {0, 61, 6} };

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}


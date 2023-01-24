package com.epam.training.student_andrii_dolhopolov.arrays;

public class MaxMethod {
    public static int max(int[] values) {
        int max = values[0];
        for (int i : values) {
            if (i>max){max=i;}
        }
        return max;
    }
}


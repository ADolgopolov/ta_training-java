package com.epam.training.student_andrii_dolhopolov.arrays;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 8, 15, 199};

        System.out.println(sum(array));
    }

    public static int sum(int[] array){

        int sum = 0;
        if( array != null ){
            for ( int i: array ) {
                if(i%2==0) {
                    sum += i;
                }
            }
        }
        return sum;
    }
}


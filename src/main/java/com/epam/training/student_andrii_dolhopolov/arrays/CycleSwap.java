package com.epam.training.student_andrii_dolhopolov.arrays;
import java.util.Arrays;
class CycleSwap {

    public static void main(String[] args) {
        {
            int[] array = new int[]{1, 3, 2, 7, 4};
            CycleSwap.cycleSwap(array);
            System.out.println(Arrays.toString(array));
        }
        {
            int[] array = new int[]{1, 3, 2, 7, 4};
            CycleSwap.cycleSwap(array, 2);
            System.out.println(Arrays.toString(array));
        }
        {
            int[] array = new int[]{1, 3, 2, 7, 4};
            CycleSwap.cycleSwap(array, 5);
            System.out.println(Arrays.toString(array));
        }
    }
    static void cycleSwap(int[] array) {

        if (array != null && array.length > 1){

            int temp = array[0];
            int temp2 = 0;

            for (int i = 1; i < array.length; i++){

                temp2 = array[i];
                array[i] = temp;
                temp = temp2;

            }
            array[0] = temp2;
        }
    }

    static void cycleSwap(int[] array, int shift) {

        if (array != null && array.length > 1) {

            shift %= array.length;

            int[] copiedArray = new int[array.length];

            System.arraycopy(array, 0, copiedArray, shift, array.length - shift);

            System.arraycopy(array, array.length - shift, copiedArray, 0, shift);

            System.arraycopy(copiedArray, 0, array, 0, copiedArray.length);
        }
    }
}


package com.epam.training.student_andrii_dolhopolov.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){

        List<Integer> al = new ArrayList<>();

        if (array[0] <= array[1] ) {
            al.add(array[0]);
        }

        int lastIndex = array.length-1;

        for (int cur = 1; cur < lastIndex; cur ++) {
            if (array[cur - 1] >= array[cur] || array[cur + 1] >= array[cur]){
                al.add(array[cur]);
            }
        }

        if (array[lastIndex] <= array[lastIndex-1] ) {
            al.add(array[lastIndex]);
        }

        int[] res = new int[al.size()];

        for (int i = 0; i < al.size(); i++)
            res[i] = al.get(i);

        return res;
    }
}


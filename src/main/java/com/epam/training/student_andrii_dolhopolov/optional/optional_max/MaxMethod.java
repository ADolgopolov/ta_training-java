package com.epam.training.student_andrii_dolhopolov.optional.optional_max;
import java.util.OptionalInt;
public class MaxMethod {
    private MaxMethod(){}

    public static OptionalInt max (int[] array) {
        OptionalInt result;
        if(array != null && array.length > 0) {
            int m = array[0];
            for (int i : array) {
                if( m < i) {
                    m = i;
                }
            }
            result = OptionalInt.of(m);
        } else {
            result = OptionalInt.empty();
        }
        return result;
    }
}

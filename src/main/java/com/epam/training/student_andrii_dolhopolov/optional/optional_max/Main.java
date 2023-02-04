package com.epam.training.student_andrii_dolhopolov.optional.optional_max;

import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) {
        int[] vals = new int[]{-2, 0, 10, 5};
        OptionalInt result = MaxMethod.max(vals);
        result.ifPresent(System.out::println);
    }
}

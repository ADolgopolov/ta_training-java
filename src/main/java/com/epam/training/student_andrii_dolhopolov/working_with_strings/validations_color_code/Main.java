package com.epam.training.student_andrii_dolhopolov.working_with_strings.validations_color_code;

import static com.epam.training.student_andrii_dolhopolov.working_with_strings.validations_color_code.ColorCodeValidation.validateColorCode;

public class Main {

    public static void main(String[] args) {
        String[] strings = new String[]{
                "123456",
                "#afafah",
                "#afafa",
                "#afafag",
                "#afzfax",
                "#123abce",
                "#1234",
                "#-123",
                " ",
                "#000000",
                "#999999",
                "#1a1a1a",
                "#1A1A1A",
                "#0f0f0f",
                "#0F0F0F",
                "#bcbcbf",
                "#BcbCbC",
                "#000",
                "#FFF",
                "#abc"};
        for (String s: strings) {
            System.out.println(s + " result : " + validateColorCode(s));
        }
    }
}

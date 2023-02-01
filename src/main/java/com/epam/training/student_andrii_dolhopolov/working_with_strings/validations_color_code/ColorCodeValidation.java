package com.epam.training.student_andrii_dolhopolov.working_with_strings.validations_color_code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCodeValidation {
    public static boolean validateColorCode(String color) {
        if(color == null) {
            return false;
        } else {
                String regex = "^#[A-Fa-f0-9]{3}([A-Fa-f0-9]{3})?$";
                Matcher m = Pattern.compile(regex).matcher(color);
                return m.find();
                }
    }

}






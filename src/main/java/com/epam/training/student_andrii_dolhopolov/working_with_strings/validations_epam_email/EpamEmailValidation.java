package com.epam.training.student_andrii_dolhopolov.working_with_strings.validations_epam_email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EpamEmailValidation {

    public static boolean validateEpamEmail(String email) {

        if(email == null || email.isBlank()) { return false;}
        Matcher m = Pattern.compile("^[a-z]+_[a-z]+(\\d+)?@epam\\.com$").matcher(email);
        return m.find();
    }
    public static void main(String[] args) {
        String[] strings = new String[]{
                " ",
                "william@epam.com",
                "william.shakespeare@epam.com",
                "william...shakespeare@epam.com",
                "william-shakespeare@epam.com",
                "shakespeare123@epam.com",
                "william_$hakespeare@epam.com",
                "william_shakespeare@epam.org",
                "_shakespeare@epam.com",
                "shakespeare_@epam.com",
                "william.shakespeare@epam@com",
                "william.shakespeare@epamcom",
                "william_shakespeare@epam.com",
                "lu_e@epam.com",
                "william_shakespeare1@epam.com",
                "william_shakespeare2@epam.com"
        };
        for (String s: strings) {
            System.out.println(s + " result : " + validateEpamEmail(s));
        }
    }
}






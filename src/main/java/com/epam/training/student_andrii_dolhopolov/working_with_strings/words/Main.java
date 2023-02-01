package com.epam.training.student_andrii_dolhopolov.working_with_strings.words;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] words = new String[]{" game", "  game", "          game     \t "};
        String[] copy = Arrays.copyOf(words, words.length);
        String sample = "game";
        System.out.println(3 +"\n" + StringUtil.countEqualIgnoreCaseAndSpaces(words, sample));
    }
}

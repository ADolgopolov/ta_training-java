package com.epam.training.student_andrii_dolhopolov.working_with_strings.words;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
    public static int countEqualIgnoreCaseAndSpaces(String[] words, String sample) {
        if(words == null || words.length == 0) {return 0;}
        if(sample == null || sample.isBlank()) {return 0;}
        int i = 0;
        String str = sample.strip();
        for (String word: words) {
            if(str.equalsIgnoreCase(word.strip())) {
                i++;
            }
        }

        return i;
    }

    public static String[] splitWords(String text) {
        if(text == null) { return null;}
        ArrayList<String> list = new ArrayList<>();
        // (?=\w*(?!\d)\w)(?=\w*\d)\w+
        Pattern p = Pattern.compile("\\b[a-zA-Z0-9]+\\b");
        Matcher m = p.matcher(text);
        while (m.find()) {
            int start = m.start();
            int end = m.end();
            list.add(text.substring(start,end));
        }
        if(list.isEmpty()){ return null;}
        return list.toArray(new String[0]);
    }

    public static String convertPath(String path, boolean toWin) {
        if (path == null) return null;
        if (path.isBlank()) return null;
        String unixreg = "^(~?/?\\.{0,2}/?)(([\\w .]+/)+)?(([\\w .]+)?)";
        String winreg = "^((C:\\\\)?(User)?\\\\?\\.{0,2}\\\\?)((([\\w .]+)\\\\)+)?(([\\w .]+)+)?";
        if (!Pattern.matches(winreg, path) && !Pattern.matches(unixreg, path)) return null;
        if ((toWin && Pattern.matches(winreg, path)) || (!toWin && Pattern.matches(unixreg, path))) {
            return path;
        } else if (toWin && !Pattern.matches(winreg, path)) {
            if (Pattern.matches("^~/root.*", path)) {
                path = path.replaceAll("^~/", "C:\\\\");
            } else if (Pattern.matches("^~.*", path)) {
                path = path.replaceAll("^~", "C:\\\\User");
            } else if (Pattern.matches("^/.*", path)) {
                path = path.replaceAll("^/", "C:\\\\");
            }
            path = path.replaceAll("/", "\\\\");
            return path;
        } else if (!toWin && Pattern.matches(winreg, path)) {
            if (Pattern.matches("^C:\\\\User.*", path)) {
                path = path.replaceAll("^C:\\\\User", "~");
            } else if (Pattern.matches("^C:\\\\.*", path)) {
                path = path.replaceAll("^C:\\\\", "/");
            }
            path = path.replaceAll("\\\\", "/");
            return path;
        }
        return null;
    }

    public static String joinWords(String[] words) {
        if(words == null || words.length == 0) {return null;}
        boolean isEmpty = true;
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (String s: words) {
            if( !s.isBlank()) {
                sj.add(s);
                isEmpty = false;
            }
        }
        if (isEmpty) {return null;}
        return sj.toString();
    }

    public static void main(String[] args) {
        System.out.println("Test 1: countEqualIgnoreCaseAndSpaces");
        String[] words = new String[]{" WordS    \t", "words", "w0rds", "WOR  DS", };
        String sample = "words   ";
        int countResult = countEqualIgnoreCaseAndSpaces(words, sample);
        System.out.println("Result: " + countResult);
        int expectedCount = 2;
        System.out.println("Must be: " + expectedCount);

        System.out.println("Test 2: splitWords");
        String text = "   ,, first, second!!!! third";
        String[] splitResult = splitWords(text);
        System.out.println("Result : " + Arrays.toString(splitResult));
        String[] expectedSplit = new String[]{"first", "second", "third"};
        System.out.println("Must be: " + Arrays.toString(expectedSplit));

        System.out.println("Test 3: convertPath");
        String unixPath = "/some/unix/path";
        String convertResult = convertPath(unixPath, true);
        System.out.println("Result: " + convertResult);
        String expectedWinPath = "C:\\some\\unix\\path";
        System.out.println("Must be: " + expectedWinPath);

        System.out.println("Test 4: joinWords");
        String[] toJoin = new String[]{"go", "with", "the", "", "FLOW"};
        String joinResult = joinWords(toJoin);
        System.out.println("Result: " + joinResult);
        String expectedJoin = "[go, with, the, FLOW]";
        System.out.println("Must be: " + expectedJoin);
    }
}
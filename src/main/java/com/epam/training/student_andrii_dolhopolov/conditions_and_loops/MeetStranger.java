package com.epam.training.student_andrii_dolhopolov.conditions_and_loops;

import java.util.Scanner;
public class MeetStranger {
    public static void main(String[] args) {
        //Write a program, which read a String from System.in and print "Hello, <input string>"
        Scanner scan = new Scanner(System.in);
        String InputString = scan.nextLine();
        System.out.println("Hello, " + InputString);
    }
}

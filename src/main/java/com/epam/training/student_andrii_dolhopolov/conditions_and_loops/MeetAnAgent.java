package com.epam.training.student_andrii_dolhopolov.conditions_and_loops;

import java.util.Scanner;
public class MeetAnAgent {
    final static int PASSWORD = 133976; //You can change pass, but don't change the type

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int passWord = scanner.nextInt();

        if(passWord == PASSWORD){
            System.out.println("Hello, Agent");
        } else{
            System.out.println("Access denied");
        }
    }
}


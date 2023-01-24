package com.epam.training.student_andrii_dolhopolov.data_types;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        int hours = (seconds % 86400) / 3600;
        int minutes = (seconds % 3600) / 60;
        int sec = seconds%60;

        String timeString = String.format("%d:%02d:%02d", hours, minutes, sec);

        System.out.println(timeString);
    }
}

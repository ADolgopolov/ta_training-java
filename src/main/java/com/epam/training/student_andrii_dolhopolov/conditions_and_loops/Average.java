package com.epam.training.student_andrii_dolhopolov.conditions_and_loops;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        scanner = new Scanner(s);
        int sum = 0, i =0, next;
        do{
            next = scanner.nextInt();
            if (next == 0) { break; }
            sum += next;
            i++;
        } while (true);

        sum/=i;

        System.out.println(sum);
    }

}

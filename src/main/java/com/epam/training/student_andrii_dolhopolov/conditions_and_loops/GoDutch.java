package com.epam.training.student_andrii_dolhopolov.conditions_and_loops;

import java.util.Scanner;
public class GoDutch {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int bill  = scan.nextInt();
        int friendsAmount = scan.nextInt();

        if ( bill < 0 ) {
            System.out.println("Bill total amount cannot be negative");
        } else {
            if ( friendsAmount < 1 ) {
                System.out.println("Number of friends cannot be negative or zero");
            } else {
                bill *= 1.1; // +10%
                bill /= friendsAmount;
                System.out.println(bill);
            }
        }
    }
}


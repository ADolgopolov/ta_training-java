package com.epam.training.student_andrii_dolhopolov.conditions_and_loops;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan = new Scanner(s);

        int people = scan.nextInt();
        int pieces = scan.nextInt();

        int remainder, pizaAmount = 1, piecesAmount = pieces;
        remainder = piecesAmount % people;
        while (remainder != 0)
        {
            piecesAmount += pieces;
            pizaAmount++;
            remainder = piecesAmount % people;
        }
        System.out.println(pizaAmount);

    }
}


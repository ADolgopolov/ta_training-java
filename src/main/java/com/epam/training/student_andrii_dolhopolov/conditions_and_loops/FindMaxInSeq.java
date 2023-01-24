package com.epam.training.student_andrii_dolhopolov.conditions_and_loops;

import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan = new Scanner(s);
        int max = 0, i;
        do{
            i = scan.nextInt();
            if (i == 0) { break; }
            if ( max == 0) {max = i;}
            if ( i > max ){
                max = i;
            }

        } while (true);

        return max;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}


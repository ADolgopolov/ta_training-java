package com.epam.training.student_andrii_dolhopolov.conditions_and_loops;

import java.util.Scanner;
public class Snail
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int h = scan.nextInt();

        if ( a <= b && a < h) {
            System.out.println("Impossible");
        }
        else
        {
            int day = 1;
            for(int position = a; position < h; position+= a, day++)
            {
                position -= b;
            }
            System.out.println(day);
        }// end else

    }
}


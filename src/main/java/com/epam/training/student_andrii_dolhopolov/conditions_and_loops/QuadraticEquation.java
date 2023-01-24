package com.epam.training.student_andrii_dolhopolov.conditions_and_loops;

import java.util.Locale;
import java.util.Scanner;


public class QuadraticEquation {

    public static String fmt(double d)
    {
        if(d == (long) d)
            return String.format("%d",(long)d);
        else
            return String.format("%s",d);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double d = b*b - 4*a*c;

        if ( d < 0) {
            System.out.println("no roots"); }
        else {
            if (d == 0) {
                System.out.println(-b / (2 * a));
            } else {
                double x1 = ((-b - Math.sqrt(d)) / (2 * a));
                double x2 = ((-b + Math.sqrt(d)) / (2 * a));

                String timeString = String.format("%s %s", fmt(x1), fmt(x2));
                System.out.println(timeString);
            }
        }
    }

}

package com.epam.training.student_andrii_dolhopolov.enums.compas;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <360 ; i+=45) {
            System.out.println(Direction.ofDegrees(i));
        }
        System.out.println("################################");

        for (int i = 0; i <360 ; i += (int)(45*Math.random())) {
            System.out.println(Direction.closestToDegrees(i));
        }
        System.out.println("################################");

        for (int i = 0; i <360 ; i+=45) {
            System.out.println(Direction.ofDegrees(i).opposite());
        }
        System.out.println("################################");
    }
}

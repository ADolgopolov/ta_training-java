package com.epam.training.student_andrii_dolhopolov.abstract_classes_and_interfaces.figures_extra;

public class Main {
    public static void main(String[] args) {
        Figure circle = null;
        circle = new Circle(new Point(0, 0), 1);
        circle = new Circle(new Point(1, 3), 1);
        circle = new Circle(new Point(-23.5, 236), 56);
        circle = new Circle(new Point(-28.5, -2), 0.001);
        circle = new Circle(new Point(56, -87), 11.1235);

        System.out.println(circle == null);


    }
}

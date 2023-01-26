package com.epam.training.student_andrii_dolhopolov.introduction_to_oop.decrementing_carousel_with_limit;

public class Main {
    public static void main(String[] args) {
        {
            DecrementingCarousel carousel = new DecrementingCarouselWithLimitedRun(7, 10);

            carousel.addElement(20);
            carousel.addElement(30);
            carousel.addElement(10);

            CarouselRun run = carousel.run();

            System.out.println(run.isFinished()); //false

            System.out.println(run.next()); //20
            System.out.println(run.next()); //30
            System.out.println(run.next()); //10

            System.out.println(run.next()); //19
            System.out.println(run.next()); //29
            System.out.println(run.next()); //9

            System.out.println(run.next()); //18
            System.out.println(run.next()); //28
            System.out.println(run.next()); //8

            System.out.println(run.next()); //17

            System.out.println(run.isFinished()); //true
            System.out.println(run.next()); //-1
        }
    }
}

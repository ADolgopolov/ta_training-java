package com.epam.training.student_andrii_dolhopolov.introduction_to_oop.halving_carousel;


public class CarouselRun {
    private final DecrementingCarousel carousel;

    public CarouselRun(DecrementingCarousel carousel) {
        this.carousel = carousel;
    }

    public int next() {
        return this.carousel.next();
    }

    public boolean isFinished() {
        return this.carousel.isFinished();
    }


}

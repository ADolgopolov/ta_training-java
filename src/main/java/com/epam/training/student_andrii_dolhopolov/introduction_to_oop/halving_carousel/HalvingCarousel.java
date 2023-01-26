package com.epam.training.student_andrii_dolhopolov.introduction_to_oop.halving_carousel;

public class HalvingCarousel extends DecrementingCarousel {

    public HalvingCarousel(final int capacity) {
        super(capacity);
    }
    @Override
    public int next() {
        int temp = -1;
        if (!isFinished()) {
            temp = carouselArr[cur];
            carouselArr[cur] = ( carouselArr[cur] >> 1 );
            goNext();
        }
        return temp;
    }
}

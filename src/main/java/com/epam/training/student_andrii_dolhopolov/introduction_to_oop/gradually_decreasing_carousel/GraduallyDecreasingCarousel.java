package com.epam.training.student_andrii_dolhopolov.introduction_to_oop.gradually_decreasing_carousel;

public class GraduallyDecreasingCarousel extends DecrementingCarousel{

    private int decrement = 1;
    public GraduallyDecreasingCarousel(final int capacity) {
        super(capacity);
    }

    @Override
    public int next() {
        int temp = -1;
        if (!isFinished()) {
            temp = carouselArr[cur];
            carouselArr[cur] -= decrement;
            goNext();
        }
        return temp;
    }

    @Override
    protected void goNext(){
        do {
            cur++;
            if (cur >= curEnd) {
                cur = 0;
                this.decrement++;
            }
        }while ( (this.carouselArr[this.cur] < 1) && !this.isFinished());
    }
}

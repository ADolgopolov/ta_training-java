package com.epam.training.student_andrii_dolhopolov.introduction_to_oop.decrementing_carousel_with_limit;

public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel{

    private int actionLimit;
    public DecrementingCarouselWithLimitedRun(final int capacity, final int actionLimit) {
        super(capacity);
        this.actionLimit = actionLimit;
    }
    @Override
    public int next() {


        int temp = -1;
        if (!isFinished()) {
            this.actionLimit--;

            temp = carouselArr[cur];
            carouselArr[cur] --;
            goNext();
        }
        return temp;
    }

    @Override
    public boolean isFinished() {

        if (this.actionLimit <= 0) { return true;}

        boolean allZero = true;
        for (int i : this.carouselArr) {
            if( i > 0) {
                allZero = false;
                break;
            }
        }
        return allZero;
    }
}

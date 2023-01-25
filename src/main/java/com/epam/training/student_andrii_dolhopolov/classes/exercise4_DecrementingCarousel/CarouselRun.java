package com.epam.training.student_andrii_dolhopolov.classes.exercise4_DecrementingCarousel;

public class CarouselRun {

    private final DecrementingCarousel crsl;

    public CarouselRun(DecrementingCarousel carousel) {
        this.crsl = carousel;
    }

    public int next() {
        int temp = -1;
        if (!this.isFinished()) {
            temp = this.crsl.carouselArr[crsl.cur];
            this.crsl.carouselArr[crsl.cur]--;
            this.goNext();
        }
        return temp;
    }

    public boolean isFinished() {
        boolean allZero = true;
        for (int i : this.crsl.carouselArr) {
            if( i > 0) {
                allZero = false;
                break;
            }
        }
        return allZero;
    }

    private void goNext(){
        do {
            crsl.cur++;
            if (crsl.cur >= crsl.curEnd) {
                crsl.cur = 0;
            }
        }while ( (this.crsl.carouselArr[crsl.cur] < 1) && !this.isFinished());
    }



}

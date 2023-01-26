package com.epam.training.student_andrii_dolhopolov.introduction_to_oop.halving_carousel;

public class DecrementingCarousel {

    public int[] carouselArr;
    public int cur, curEnd = -1;
    private boolean isEnable;
    public DecrementingCarousel(int capacity) {
        this.carouselArr = new int[capacity];
        this.cur = 0;
        this.isEnable = true;
    }

    public boolean addElement(int element){

        if ( !this.isEnable ) { return false; }
        if ( element < 1 )   { return false; }
        if ( cur < this.carouselArr.length ){
            this.carouselArr[cur] = element;
            cur++;
            return true;
        } else return false;
    }

    public CarouselRun run(){
        if ( !this.isEnable ) { return null; }
        this.isEnable = false;
        this.curEnd = this.cur;
        this.cur = 0;
        return new CarouselRun(this);
    }

    public int next() {
        int temp = -1;
        if (!this.isFinished()) {
            temp = this.carouselArr[cur];
            this.carouselArr[cur]--;
            this.goNext();
        }
        return temp;
    }
    public boolean isFinished() {
        boolean allZero = true;
        for (int i : this.carouselArr) {
            if( i > 0) {
                allZero = false;
                break;
            }
        }
        return allZero;
    }

    protected void goNext(){
        do {
            this.cur++;
            if (this.cur >= this.curEnd) {
                this.cur = 0;
            }
        }while ( (this.carouselArr[this.cur] < 1) && !this.isFinished());
    }
}

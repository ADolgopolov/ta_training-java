package com.epam.training.student_andrii_dolhopolov.classes.exercise4_DecrementingCarousel;

public class DecrementingCarousel {

    //private final int capacity;
    public int[] carouselArr;
    public int cur, curEnd = -1;
    private boolean isEnable;
    public DecrementingCarousel(int capacity) {
        //this.capacity = capacity;
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
}

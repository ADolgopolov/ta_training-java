package com.epam.training.student_andrii_dolhopolov.abstract_classes_and_interfaces.task_carousel;

public class CountDownTask implements Task{

    private int value;
    private boolean isFinished;

    public CountDownTask(int value) {
        if (value > 0) {
            this.value = value;
            this.isFinished = false;
        } else {
            this.value = 0;
            this.isFinished = true;
        }
    }

    public int getValue() {
        return this.value;
    }


    @Override
    public void execute() {
        this.value --;
        if (this.value < 1) {
            this.value = 0;
            this.isFinished = true; }
    }

    @Override
    public boolean isFinished() {
        return this.isFinished;
    }
}

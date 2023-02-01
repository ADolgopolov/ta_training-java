package com.epam.training.student_andrii_dolhopolov.abstract_classes_and_interfaces.task_carousel;

public class Carousel {

    private final Task[] array;
    private int cur = 0, taskAmount = 0;
    public Carousel(int capacity) {
        this.array = new Task[capacity];
    }

    public boolean isEmpty()
    {
        return (taskAmount == 0);
    }
    public boolean isFull()
    {
        return (taskAmount == this.array.length);
    }
    private int searchEmpty(){
        int i;
        for(i=0; i< array.length; i++)
        {
            if(this.array[i] == null) break;
        }
        return i;
    }

    public boolean add(Task newTask)
    {
        int curPos;
        if ( taskAmount < this.array.length ){
            curPos = this.searchEmpty();
            this.array[curPos] = newTask;
            this.taskAmount++;
            return true;
        } else return false;
    }

    public Task next()
    {
        while (array[cur] == null)
        {
            this.takeStep();
        }
        return array[cur];
    }
    public void deleteCurrent(){
        this.array[cur] = null;
        this.taskAmount --;
    }
    public void takeStep(){
        this.cur++;
        if(cur >= array.length) cur=0;
    }
}

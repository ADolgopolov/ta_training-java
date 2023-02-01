package com.epam.training.student_andrii_dolhopolov.abstract_classes_and_interfaces.task_carousel;

public class TaskCarousel {

    private final Carousel carousel;

    public TaskCarousel(int capacity) {
        this.carousel = new Carousel(capacity);
    }

    public boolean addTask(Task task) {
        if (task == null) return false;
        if (task.isFinished()) return false;
        return this.carousel.add(task); // false if carousel is FULL
    }

    public boolean execute() {
        if (this.carousel.isEmpty()){ return false; }
        Task task = this.carousel.next();
        task.execute();
        if(task.isFinished()) {
            this.carousel.deleteCurrent();
        }
        this.carousel.takeStep();
        return true;
    }

    public boolean isFull() {
        return this.carousel.isFull();
    }

    public boolean isEmpty() {
        return this.carousel.isEmpty();
    }

}

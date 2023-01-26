package com.epam.training.student_andrii_dolhopolov.introduction_to_oop.sprint_planning;

public class Ticket {

    protected final int id;
    protected final String name;
    protected final int estimate;

    protected boolean isCompleted = false;

    public Ticket(int id, String name, int estimate) {
        this.id = id;
        this.name = name;
        this.estimate = estimate;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean isCompleted() {
        return this.isCompleted;
    }

    public void complete() {
        this.isCompleted = true;
    }

    public int getEstimate() {
        return this.estimate;
    }
}

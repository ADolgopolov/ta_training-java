package com.epam.training.student_andrii_dolhopolov.introduction_to_oop.sprint_planning;

public class Bug extends Ticket {

    private final UserStory userStory;

    public static Bug createBug(int id, String name, int estimate, UserStory userStory) {
        if(userStory.isCompleted()){
        return new Bug(id, name, estimate, userStory);
        }
        else return null;
    }

    private Bug(int id, String name, int estimate, UserStory userStory) {
        super(id, name, estimate);
        this.userStory = userStory;
    }

    @Override
    public String toString() {
        return "[Bug "+ id +"] " + this.userStory.name +": " + getName();
    }
}

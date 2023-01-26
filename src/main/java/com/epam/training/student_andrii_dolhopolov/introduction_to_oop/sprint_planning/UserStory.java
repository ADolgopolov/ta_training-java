package com.epam.training.student_andrii_dolhopolov.introduction_to_oop.sprint_planning;

public class UserStory extends Ticket {

    private final UserStory[] dependsOn;

    public UserStory(int id, String name, int estimate, UserStory... dependsOn) {
        super(id, name, estimate);
        this.dependsOn = dependsOn;
    }

    @Override
    public void complete() {
        isCompleted = true;
        for (UserStory i : this.dependsOn) {
            if(i.isCompleted == false){
                isCompleted = false;
            }
        }
    }

    public UserStory[] getDependencies() {
        return dependsOn.clone();
    }

    @Override
    public String toString() {
        return "[US "+ id + "] " + name;
    }
}

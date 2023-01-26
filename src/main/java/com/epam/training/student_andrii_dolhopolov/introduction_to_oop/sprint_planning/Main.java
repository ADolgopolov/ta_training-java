package com.epam.training.student_andrii_dolhopolov.introduction_to_oop.sprint_planning;

public class Main {
    public static void main(String[] args) {
        //
        int nextId = 1;
        Sprint sprint = new Sprint(40, 30);
        System.out.println(sprint.toString());

        UserStory us1 = new UserStory(nextId++, "User Registration Entity", 8);
        UserStory us2 = new UserStory(nextId++, "User Registration Form", 8);
        System.out.println(us2.toString());

        us1.complete();

        Bug bug1 = Bug.createBug(nextId++, "Bug 1", 4, us1);
        Bug bug2 = Bug.createBug(nextId++, "Bug 2", 4, us1);
        System.out.println(bug2.toString());

        bug1.complete();

    }
}

package com.epam.training.student_andrii_dolhopolov.introduction_to_oop.sprint_planning;

public class Sprint {

    private final int capacity;
    private int totalEstimate = 0;
    private final int ticketsLimit;
    private int ticketsAmount = 0;
    private final Ticket[] ticketsList;


    public Sprint(int capacity, int ticketsLimit) {

        this.capacity = capacity;

        this.ticketsLimit = ticketsLimit;
        this.ticketsList = new Ticket[ticketsLimit];
    }

    public boolean addUserStory(UserStory userStory) {
        if (userStory == null) return false;
        if (userStory.isCompleted()) return false;
        if ( this.ticketsAmount >= this.ticketsLimit ) return false;
        if ( (userStory.getEstimate() + this.totalEstimate) > this.capacity ) return false;

        int activeDep = 0; int inList = 0;
        UserStory[] Dependencies = userStory.getDependencies();
        for (UserStory c : Dependencies) {
            if (c.isCompleted() == false){
                activeDep++;
                for (Ticket t : this.getTickets()) {
                    if (t.getId() == c.getId()) {inList++;}
                }
            }
        }
        if (activeDep == 0 || (activeDep == inList)){
            this.ticketsList[this.ticketsAmount] = userStory;
            this.ticketsAmount++;
            this.totalEstimate += userStory.getEstimate();
            return true;
        }else {
            return false;
        }


    }

    public boolean addBug(Bug bugReport) {
        if (bugReport == null) return false;
        if (bugReport.isCompleted()) return false;
        if ( this.ticketsAmount >= this.ticketsLimit ) return false;
        if ( (bugReport.getEstimate() + this.totalEstimate) > this.capacity ) return false;
        
        this.ticketsList[this.ticketsAmount] = bugReport;
        this.ticketsAmount++;
        this.totalEstimate += bugReport.getEstimate();
        return true;
    }

    public Ticket[] getTickets() {
        Ticket[] copyArr = new Ticket[ticketsAmount];
        System.arraycopy(this.ticketsList, 0, copyArr, 0, ticketsAmount);
        return copyArr;
        //return this.ticketsList.clone();
    }

    public int getTotalEstimate() {
        return this.totalEstimate;
    }

}

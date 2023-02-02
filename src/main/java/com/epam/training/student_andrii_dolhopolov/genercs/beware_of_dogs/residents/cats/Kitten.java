package com.epam.training.student_andrii_dolhopolov.genercs.beware_of_dogs.residents.cats;

public class Kitten extends Cat {

    public Kitten(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Kitten " + name;
    }
}

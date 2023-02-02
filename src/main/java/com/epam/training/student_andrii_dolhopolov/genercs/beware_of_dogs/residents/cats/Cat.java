package com.epam.training.student_andrii_dolhopolov.genercs.beware_of_dogs.residents.cats;

public class Cat {

    protected String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat " + name;
    }
}

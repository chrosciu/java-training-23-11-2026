package eu.chrost.day4.s6interfaces.lectures.animals;


import eu.chrost.day4.s6interfaces.lectures.names.Nameable;

//klasa Animal implementuje interfejs Nameable
//dlatego tez albo musi miec zaimplementowana metode getName
//albo musi to byc zrobione w klasach po niej dziedziczacych
public abstract class Animal implements Nameable {
    protected final String name;
    protected final int age;

    protected Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }
}

package eu.chrost.day4.s6interfaces.lectures.people;

import eu.chrost.day4.s6interfaces.lectures.names.FullNameable;

//jezeli dana klasa jednoczesnie dziedziczy po innej i implementuje interfejsy lub interfejsy
//to najpierw podaje sie klauzule extends a potem implements (pozniej jeszcze moze byc permits)
public class Employee extends Worker implements FullNameable {
    private final String name;
    private final String surname;

    public Employee(int salary, String name, String surname) {
        super(salary);
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getFullName() {
        //jezeli chcemy zawolac domyslna implementacje metody
        //z interfejsu ktory implementuje dana klasa
        //to musimy uzyc nazwy tego interfejsu przed slowem super
        //gdyz samo super odnosilo by sie do klasy bazowej (czyli Worker)
        //return FullNameable.super.getFullName();

        //my jednak nadpiszemy te metode
        return name + " " + surname;
    }
}

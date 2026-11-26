package eu.chrost.day4.s6interfaces.lectures;

import eu.chrost.day4.s6interfaces.lectures.animals.Dog;
import eu.chrost.day4.s6interfaces.lectures.greeter.Greeter;
import eu.chrost.day4.s6interfaces.lectures.names.FullNameable;
import eu.chrost.day4.s6interfaces.lectures.names.Nameable;
import eu.chrost.day4.s6interfaces.lectures.people.Employee;
import eu.chrost.day4.s6interfaces.lectures.cars.Car;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        //do tej metody mozemy przekazac obiekt typu Dog bez zadnego rzutowania
        //gdyz implementuje on interfejs Nameable
        Greeter.greet(dog);

        Employee employee = new Employee(2000, "Alice", "Johnson");
        Greeter.greet(employee);
        greetFull(employee);

        Nameable hiddenDog = dog;
        Dog revealedDog = (Dog) hiddenDog;

        //rowniez instanceof dziala analogicznie
        if (hiddenDog instanceof Dog d) {
            System.out.println("This is a dog!");
        }

        Car car = new Car("Fiat", "Punto");


    }

    private static void greetFull(FullNameable fullNameable) {
        System.out.println("Hello, " + fullNameable.getFullName());
    }
}

package eu.chrost.day4.s6interfaces.lectures.greeter;

import eu.chrost.day4.s6interfaces.lectures.names.Nameable;

public class Greeter {
    //naszym zadaniem jest stworzenie mechanizmu
    //pozwalajacego pozdrowic istoty zywe
    //z wykorzystaniem ich imienia :)

    //skoro mamy interfejs Nameable
    //to mozemy go po prostu przekazac jako argument metody
    //i nie zastanawiac sie w ogole co pod spodem go implementuje
    public static void greet(Nameable nameable) {
        System.out.println("Hello, " + nameable.getName());
    }
}

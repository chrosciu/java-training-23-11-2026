package eu.chrost.day5.s4streams.lectures.p0base;

import java.util.ArrayList;
import java.util.List;

record User(String name, int age) {
}

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Marcin", 44),
                new User("Tomasz", 41),
                new User("Pawel", 38)
        );
        System.out.println("All users names: " + getUsersNames(users));
        System.out.println("Users above 40 names: " + getUsersAbove40(users));
        System.out.println("Aggregate age: " + getAggregateAge(users));
    }

    //pobierz imiona wszystkich uzytkownikow i zwroc jako liste
    private static List<String> getUsersNames(List<User> users) {
        //klasyczne rozwiazanie wymaga stworzenia nowej listy
        List<String> names = new ArrayList<>();

        //a nastepnie iteracji po oryginalnej liscie
        //wyciagniecia kazdego imienia
        //i wlozenia na nowa liste
        for (User user : users) {
            names.add(user.name());
        }

        //i na koncu trzeba zwrocic nowa liste
        return names;
    }

    //zrob to samo co powyzej ale tylko dla uzytkownikow starszych niz 40 lat
    private static List<User> getUsersAbove40(List<User> users) {
        List<User> usersAbove40 = new ArrayList<>();
        for (User user : users) {
            if (user.age() > 40) {
                usersAbove40.add(user);
            }
        }
        return usersAbove40;
    }

    //zsumuj wiek wszystkic uzytkownikow
    private static int getAggregateAge(List<User> users) {
        int aggregateAge = 0;
        for (User user : users) {
            aggregateAge += user.age();
        }
        return aggregateAge;
    }
}

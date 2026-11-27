package eu.chrost.day5.s4streams.lectures.p2anonymous;

import java.util.List;
import java.util.function.Function;

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
    }

    //pobierz imiona wszystkich uzytkownikow i zwroc jako liste
    private static List<String> getUsersNames(List<User> users) {
        return users.stream()
                .map(new Function<User, String>() {
                    @Override
                    public String apply(User user) {
                        return user.name();
                    }
                }).toList();
    }




}

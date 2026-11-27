package eu.chrost.day5.s4streams.lectures.p1streams;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;


record User(String name, int age) {
}

class UserToNameMapper implements Function<User, String> {
    @Override
    public String apply(User user) {
        return user.name();
    }
}

class UserToAgeMapper implements Function<User, Integer> {
    @Override
    public Integer apply(User user) {
        return user.age();
    }
}

class UserAbove40Predicate implements Predicate<User> {
    @Override
    public boolean test(User user) {
        return user.age() > 40;
    }
}

class AgeAggregator implements BinaryOperator<Integer> {

    @Override
    public Integer apply(Integer accumulatedAge, Integer toAdd) {
        return accumulatedAge + toAdd;
    }
}

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Marcin", 44),
                new User("Tomasz", 41),
                new User("Pawel", 38)
        );
        System.out.println("All users names: " + getUsersNames(users));
        System.out.println("All users names: " + getUsersNamesShortened(users));
        System.out.println("Users above 40 names: " + getUsersAbove40(users));
        System.out.println("Aggregate age: " + getAggregateAge(users));
    }

    //pobierz imiona wszystkich uzytkownikow i zwroc jako liste
    private static List<String> getUsersNames(List<User> users) {
        //strumieniowe przetwarzanie danych sluzy nam do
        //przetworzenia wszytkich elementow jakiejs kolekcji
        //i wygenerowania jakiegos wyniku (kolekcji, pojedynczej wartosci, etc.)

        //aby moc pracowac strumieniowo nalezy przede wszystkim stworzyc strumien
        //jest on typu Stream
        //a wiekszosc kolekcji oferuje metode stream,
        //ktora pozwala na wygenerowanie strumienia z kolekcji
        Stream<User> usersStream = users.stream();

        //kolejnym etapem jest podpiecie jednej z operacji posrednich
        //jest ich sporo, ale ta najbardziej podstawowa jest map()
        //ktora to operacja zamienia kazdy element strumienia wejsciowego na inny (moze to zmienic typ elementu)
        //na podstawie tzw. funkcji mapujacej implementujacej interfejs Function
        //po takiej operacji dalej mamy strumien ale obiektow typu String
        Stream<String> namesStream = usersStream.map(new UserToNameMapper());

        //aby strumien faktycznie sie uruchomil i wygenerowal nam jakas wartosc
        //jest wpiecie tzw. operacji terminujacej
        //my uzyjemy takiej najbardziej podstawowej - czyli toList()
        List<String> names = namesStream.toList();

        //na koncu zwracamy liste
        return names;
    }

    private static List<String> getUsersNamesShortened(List<User> users) {
        return users.stream()
                .map(new UserToNameMapper())
                .toList();
    }

    //zrob to samo co powyzej ale tylko dla uzytkownikow starszych niz 40 lat
    private static List<User> getUsersAbove40(List<User> users) {
        return users.stream()
                .filter(new UserAbove40Predicate())
                .toList();
    }

    //zsumuj wiek wszystkic uzytkownikow
    private static int getAggregateAge(List<User> users) {
        return users.stream()
                .map(new UserToAgeMapper())
                .reduce(0, new AgeAggregator());
    }


}

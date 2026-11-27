package eu.chrost.day5.s1exceptions.lectures.p4trywithresources;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //w klauzuli try mozemy stworzyc zmienna, ktora to zmienna
        //zostanie zwolniona w momencie kiedy zakonczy sie blok try
        //niezaleznie od tego czy wystapil w nim jakis wyjatek czy tez nie
        //warunek jest taki ze zmienna stworzona w ten sposob
        //musi implementowac interfejs AutoCloseable
        //zmienna stworzona w ten sposob jest dostepna w calym bloku try-catch-finally
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Podaj dwie liczby całkowite:");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("Wczytana liczba 1: " + number);
            input = scanner.nextLine();
            number = Integer.parseInt(input);
            System.out.println("Wczytana liczba 2: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Błąd: Podana wartość nie jest liczbą całkowitą.");
        }
    }

}

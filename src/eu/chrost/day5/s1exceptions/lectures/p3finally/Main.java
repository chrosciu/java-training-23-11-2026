package eu.chrost.day5.s1exceptions.lectures.p3finally;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tworzenie scannera");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Podaj dwie liczby całkowite:");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("Wczytana liczba 1: " + number);
            input = scanner.nextLine();
            number = Integer.parseInt(input);
            System.out.println("Wczytana liczba 2: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Błąd: Podana wartość nie jest liczbą całkowitą.");
        } finally {
            //klauzula finally jest ostatnia czescia klauzuli try-catch
            //w jej bloku wstawiamy kod ktory ma sie wykonac
            //niezaleznie od tego czy kod w klauzuli try wykonal sie z wyjatkiem lub bez
            //oraz nawet wtedy gdy wyjatek nie zostal przechwycony i ma zostac wyrzucony na zewnatrz
            //ogolnie: ten blok ma wykonac sie ZAWSZE

            //klauzula finally moze takze zostac wstawiona jesli nie dajemy zadnej klauzuli catch

            System.out.println("Zamykanie scannera");
            scanner.close();
        }

    }
}

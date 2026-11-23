package eu.chrost.day1.s2conditionals.lectures;

import java.util.Random;

public class Switch {
    public static void main(String[] args) {
        int i = new Random().nextInt(10);
        System.out.println("Wylosowana liczba to: " + i);

        int remainderByFour = i % 4;

        //UWAGA: Przedstawiona tutaj wersja zostala wprowadzona w Javie 13

        //switch jest instrukcja ktora pozwala wykonac jedna z galezi
        //na podstawie wartosci przekazanej jako argument do switch-a
        //lista wspieranych typow jest dosc krotka
        //dozwolone sa typy calkowite, logiczne, enum, String(?)
        switch (remainderByFour) {
            //galaz opisujemy przez podanie wartosci oraz po -> akcji jaka ma sie wykonac
            //czyli np jesli remainderByFour jest rowne 0 - wykonaj ponisza galaz
            case 0 -> System.out.println("Wylosowana liczba jest podzielna przez 4");
            //galezie wylaczaja sie nawzajem - jesli spelniona jest jedna, to ignorowane sa kolejne
            case 1 -> System.out.println("Wylosowana liczba przy dzieleniu przez 4 daje reszte 1");
            case 2 -> System.out.println("Wylosowana liczba przy dzieleniu przez 4 daje reszte 2");
            //case 3 -> System.out.println("Wylosowana liczba przy dzieleniu przez 4 daje reszte 3");
            //czesto stosujemy galaz domyslna (na koncu), ktora wykonuje sie zawsze jesli
            //nie zostana dopasowana zadna z poprzednich
            default -> {
                //jezeli w ramach galezi trzeba wykonac wiecej niz jedna instrukcje
                //to stosujemy nawiasy klamrowe jak w tym przypadku
                System.out.println("Wylosowana liczba przy dzieleniu przez 4 daje reszte 3");
                System.out.println("Galaz domyslna");
            }
        }
    }
}

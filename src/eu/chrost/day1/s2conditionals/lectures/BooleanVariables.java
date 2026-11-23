package eu.chrost.day1.s2conditionals.lectures;

import java.util.Random;

public class BooleanVariables {
    public static void main(String[] args) {
        //zmienne typu boolean sluza do przechowywania wartosci logicznych
        boolean aTrue = true;
        boolean aFalse = false;

        System.out.println(aTrue);

        //operator NOT - odwraca wartosc logiczna
        boolean aNotTrue = !aTrue;
        System.out.println(aNotTrue);

        int i = new Random().nextInt(10);
        System.out.println("Wylosowana liczba to: " + i);

        //operator porownania - dwa znaki ==
        boolean isEven = (i % 2 == 0);
        if (isEven) {
            System.out.println("Wylosowana liczba jest parzysta");
        }

        //operator braku rownosci !=
        boolean isOdd = (i % 2 != 0);
        if (isOdd) {
            System.out.println("Wylosowana liczba jest nieparzysta");
        }

        boolean isDivisibleByThree = (i % 3 == 0);
        if (isDivisibleByThree) {
            System.out.println("Wylosowania liczba jest podzielna przez 3");
        }

        //operator AND - wynik prawdziwy tylko wtedy gdy oba warunki sa prawdziwe
        boolean isDivisibleBySix = isEven && isDivisibleByThree;
        if (isDivisibleBySix) {
            System.out.println("Wylosowania liczba jest podzielna przez 6");
        }

        //Operator AND wystepuje w dwoch postaciach && oraz &
        //Pierwsza z nich (najczesciej uzywana) dziala w ten sposob
        //ze jezeli pierwszy warunek jest falszywy
        //to drugi w ogole nie jest sprawdzany

        //operatorow mozna uzyc takze bez deklarowania zmiennych typu boolean
        isDivisibleBySix = (i % 2 == 0) && (i % 3 == 0);
        if (isDivisibleBySix) {
            System.out.println("Wylosowania liczba jest podzielna przez 6");
        }

        //mozna czegos takiego uzyc nawet bezposrednio w if
        if ((i % 2 == 0) && (i % 3 == 0)) {
            System.out.println("Wylosowania liczba jest podzielna przez 6");
        }

        //operator OR - wynik prawdziwy gdy co najmniej jeden z warunkow jest prawdziwy
        //rowniez on wystepuje w dwoch postaciach: || oraz |
        boolean isDivisibleByTwoOrThree = isEven || isDivisibleByThree;

        if (isDivisibleByTwoOrThree) {
            System.out.println("Wylosowania liczba jest podzielna przez 2 lub 3");
        }

        //operator XOR - wynik prawdziwy gdy dokladnie jeden z warunkow jest prawdziwy
        boolean isDivisibleByTwoOrThreeButNotSix = isEven ^ isDivisibleByThree;
        if (isDivisibleByTwoOrThreeButNotSix) {
            System.out.println("Wylosowana liczba jest podzielna przez 2 lub 3 ale nie przez 6");
        }
    }
}

package eu.chrost.day1.s1variables.lectures;

import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        //do wczytywania z konsoli niezbedny jest obiekt Scanner, ktory trzeba stworzyc tak
        Scanner scanner = new Scanner(System.in);

        //dobrze jest zawsze zrobic prompt mowiacy o tym czego aktualnie oczekujemy od uzytkownika
        System.out.println("Podaj pierwsza liczbe: ");

        //wczytujemy liczbe jako String za pomoca operatora nextLine
        String input = scanner.nextLine();
        //UWAGA: Scanner ma inne metody (np. nextInt()), ktore mozna wykorzystac wprost do
        //czytania liczb calkowitych - ale ODRADZAM !!! korzystanie z nich w przypadku konsoli
        //nextLine() jest dosc prymitywne - czyta cala linie jako lancuch znakowy, ale dziala zawsze

        //wczytana linie konwertujemy na int
        //zakladamy ze to jest poprawna liczba - na tym etapie nie przejmujemy sie obsluga bledow
        int firstNumber = Integer.parseInt(input);

        //z druga liczba robimy analogicznie
        System.out.println("Podaj druga liczbe: ");
        input = scanner.nextLine();
        int secondNumber = Integer.parseInt(input);

        //liczymy sume wprowadzonych liczb
        int sum = firstNumber + secondNumber;

        //dodatkowo wykorzystamy operator + od razu w println
        //nie trzeba tworzyc posredniej zmiennej
        System.out.println("Suma: " + sum);

    }
}

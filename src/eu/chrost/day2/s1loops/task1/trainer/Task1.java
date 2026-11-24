package eu.chrost.day2.s1loops.task1.trainer;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        String input = scanner.nextLine();
        scanner.close();

        //gorna granica sumowania - N
        int n = Integer.parseInt(input);
        //suma - w kazdym obrocie petli bedziemy do niej dodawac
        //aktualna liczbe (i jednoczesnie numer iteracji)
        int suma = 0;
        //licznik do petli - reprezentuje aktualny numer iteracji
        //oraz jednoczesnie liczbe ktora dodajemy do aktualnej sumy
        int k = 1;

        //wykonujemy n iteracji petli (k w zakresie 1..n)
        while (k <= n) {
            //dodajemy aktualna liczbe do sumy
            suma += k;
            //podnosimy licznik o 1
            k++;
        }

        System.out.println("Suma wynosi: " + suma);
    }
}

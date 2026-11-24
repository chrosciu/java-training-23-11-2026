package eu.chrost.day1.s2conditionals.task2.trainer;

import java.util.Scanner;

public class Task2a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj rok: ");
        String input = scanner.nextLine();
        int year = Integer.parseInt(input);

        if (year % 400 == 0) {
            System.out.println("Rok " + year + " jest przestępny.");
        } else if (year % 100 == 0) {
            System.out.println("Rok " + year + " nie jest przestępny.");
        } else if (year % 4 == 0) {
            System.out.println("Rok " + year + " jest przestępny.");
        } else {
            System.out.println("Rok " + year + " nie jest przestępny.");
        }
    }
}

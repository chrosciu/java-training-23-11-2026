package eu.chrost.day2.s1loops.task2.trainer;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        String input = scanner.nextLine();
        scanner.close();

        int n = Integer.parseInt(input);
        int suma = 0;

        for (int k = 1; k <= n; k++) {
            suma += k;
        }

        System.out.println("Suma wynosi: " + suma);
    }
}

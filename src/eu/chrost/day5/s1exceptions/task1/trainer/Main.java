package eu.chrost.day5.s1exceptions.task1.trainer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Podaj indeks pod ktory mam wpisac liczbe w tablicy");
            String input = scanner.nextLine();
            int index = Integer.parseInt(input);

            System.out.println("Podaj liczbe do wpisania do tablicy");
            input = scanner.nextLine();
            int number = Integer.parseInt(input);

            array[index] = number;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Bledny indeks tablicy!");
        } catch (NumberFormatException e) {
            System.out.println("Podano tekst zamiast liczby!");
        } finally {
            //to sie musi wypisac zawsze - niezaleznie od tego czy poleca bledy
            System.out.println(Arrays.toString(array));
        }
    }
}

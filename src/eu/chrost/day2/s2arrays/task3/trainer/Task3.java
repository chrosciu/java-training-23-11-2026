package eu.chrost.day2.s2arrays.task3.trainer;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int[] reversedNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            reversedNumbers[numbers.length - i - 1] = numbers[i];
        }

        System.out.println(Arrays.toString(reversedNumbers));
     }
}
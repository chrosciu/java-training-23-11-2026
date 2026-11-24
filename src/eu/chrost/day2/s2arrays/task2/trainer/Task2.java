package eu.chrost.day2.s2arrays.task2.trainer;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int argsSize = args.length;
        int[] argsAsNumbers = new int[argsSize];

        for (int n = 0; n < argsSize; n++) {
            String arg = args[n];
            int argAsNumber = Integer.parseInt(arg);
            argsAsNumbers[n] = argAsNumber;
        }

        if (argsSize == 0) {
            System.out.println("Brak argumentow, nie można znalezc maksymalnego");
            return;
        }

        int maxNumber = argsAsNumbers[0];
        for (int argAsNumber : argsAsNumbers) {
            if (argAsNumber > maxNumber) {
                maxNumber = argAsNumber;
            }
        }

        System.out.println("Najwiekszy argument to: " + maxNumber);
    }
}

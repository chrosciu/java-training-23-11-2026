package eu.chrost.day2.s3methods.task3.trainer;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(isPerfect(6));
        System.out.println(isPerfect(8));
        System.out.println(isPerfect(6, true));
        System.out.println(isPerfect(8, true));
        System.out.println(isPerfect(0, true));
        System.out.println(isPerfect(-1, true));
    }

    public static boolean isPerfect(int n) {
        return isPerfect(n, false);
    }

    public static boolean isPerfect(int n, boolean verbose) {
        log("Sprawdzanie czy liczba " + n + " jest doskonala", verbose);

        if (n <= 0) {
            log("Liczba mniejsza lub rowna 0 - nie jest doskonala", verbose);
            return false;
        }

        int dividerSum = 0;

        for (int i = 1; i < n; ++i) {
            if (n % i == 0) {
                log("Znaleziono dzielnik " + i, verbose);
                dividerSum += i;
            }
        }

        log("Suma dzielnikow: " + dividerSum, verbose);

        if (dividerSum == n) {
            log("Liczba jest doskonala", verbose);
            return true;
        }

        log("Liczba nie jest doskonala", verbose);
        return false;
    }

    public static void log(String message, boolean verbose) {
        if (verbose) {
            System.out.println(message);
        }
    }
}

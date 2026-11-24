package eu.chrost.day1.s2conditionals.task3.trainer;

//klasy spoza pakietu java.lang nalezy zaimportowac aby ich uzyc
//(IntelliJ robi to prawie zawsze automatycznie)
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //jesli nie importujemy klasy to mozna wciaz jej uzyc
        //ale wtedy trzeba podac w pelni kwalifikowana nazwe
        //java.util.Scanner scanner = new java.util.Scanner(System.in);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę od 1 do 7: ");
        //tu moze byc, ale przy wczytywaniu wiecej niz 1 liczby moze sie rozsypac :)
        int number = scanner.nextInt();
        //dobra praktyka jest zamykanie scannera jesli juz nie jest potrzebny
        scanner.close();

        String kind = switch (number) {
            case 1 -> "Poniedziałek";
            case 2 -> "Wtorek";
            case 3 -> "Sroda";
            case 4 -> "Czwartek";
            case 5 -> "Piatek";
            case 6 -> "Sobota";
            case 7 -> "Niedziela";
            default -> "wrong number ";

        };
        System.out.println(kind);

    }
}

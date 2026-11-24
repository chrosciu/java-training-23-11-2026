package eu.chrost.day2.s3methods.lectures;

public class OverloadedMethods {
    public static void main(String[] args) {
        String firstName = "Marcin";
        String lastName = "Chrost";
        String fullName = joinWords(firstName, lastName, " ");
        System.out.println(fullName);
        //tu skorzystamy z przeladowanej metody
        System.out.println(joinWords("Jan", "Kowalski"));
        //a tu zawolamy oryginalna - bo potrzebujemy tego przecinka
        System.out.println(joinWords("Adam", "Nowak", ", "));

    }

    public static String joinWords(String firstWord, String secondWord, String joiner) {
        return firstWord + joiner + secondWord;
    }

    //czesto stosowany wzorzec - metoda o tej samej nazwie ale z innymi argumentami
    //zwana metoda przeladowana (overloaded)
    //czesto jest tak ze deleguje ona swoje dzialanie do oryginalnej metody
    //pozwalajac na tzw. argumenty domyslne
    public static String joinWords(String firstWord, String secondWord) {
        return joinWords(firstWord, secondWord, " ");
    }

    //nie kompiluje sie - druga metoda o takiej samej nazwie i takim samym zestawie argumentow
//    public static String joinWords(String a, String b) {
//        return "";
//    }
}

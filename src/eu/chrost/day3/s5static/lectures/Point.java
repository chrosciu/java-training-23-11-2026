package eu.chrost.day3.s5static.lectures;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        counter++;
    }

    //slowo static oznacza iz dane pole albo metoda
    //nie jest powiazane z konkretna instancja obiektu danej klasy
    //tylko z klasa jako taka
    //dzieki temu mozna miec dostep do czegos takiego
    //zanim zostanie w ogole utworzony obiekt danej klasy
    private static int counter = 0;

    //ta metoda tez powinna byc statyczna bo nie uzywa niczego
    //co jest powiazane z konkretna instancja obiektu
    public static int getCounter() {
        //nie da sie z metody statycznej dostac do pol i metod niestatycznych
        //gdyz nie jestesmy w kontekscie zadnego obiektu
        //System.out.println(x);

        //this nie dziala z tego samego powodu
        //System.out.println(this);

        //w druga strone dziala to bez problemu
        //do pol i metod statycznych mozna dostac sie z kazdego miejsca w klasie
        //(patrz zmiana wartosci pola counter w konstruktorze)
        return counter;
    }
}

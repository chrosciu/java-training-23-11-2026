package eu.chrost.day3.s5static.lectures;

public class Main {
    public static void main(String[] args) {
        //zanim stworze jakikolwiek obiekt
        //to licznik powinien wynosic 0

        //statyczna metode mozna zawolac uzywajac nazwy klasy
        //a nie referencji do obiektu
        System.out.println(Point.getCounter());

        Point p1 = new Point(2.5, 3.5);
        //zadziala ale jest niezalecane
        System.out.println(p1.getCounter());

        Point p2 = new Point(3, 4);
        System.out.println(Point.getCounter());

//        Weather weather1 = new Weather();
//        Weather weather2 = new Weather();

        Weather weather1 = Weather.getInstance();
        Weather weather2 = Weather.getInstance();

        System.out.println(weather1);
        System.out.println(weather2);
    }
}

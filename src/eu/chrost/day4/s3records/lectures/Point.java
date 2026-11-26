package eu.chrost.day4.s3records.lectures;

//rekord jest zdegenerowana klasa
//przechowujaca wartosci swoich pol w formie niemutowalnej
//oraz dajaca z automatu kilka metod bez koniecznosci ich nadpisywania

//rekord deklarujemy poprzez podanie listy w naglowku rekordu
//pola w rekordzie sa automatycznie typu private final
public record Point(double x, double y) {

    //innych pol dodawac nie wolno
    //(nie dotyczy static)

    //rekordy nie moga tez uczestniczyc w hierarchii dziedziczenia
    //(czyli rekord nie moze dziedziczyc po niczym, ani tez nic
    //nie moze dziedziczyc po rekordzie)

    //oprocz metod dostarczonych automatycznie przez  Java mozna tworzyc swoje wlasne
    //i odwolywac sie w nich do pol
    public double distanceFromZero() {
        return Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0));
    }

    public static void main(String[] args) {
        Point p1 = new Point(2.5, 3.5);
        Point p2 = new Point(2, 3);
        Point p3 = new Point(2.5, 3.5);

        //rekordy odeszly od konwencji nazywania getterow - zamiast getX() jest x()
        System.out.println(p1.x());

        //z automatu mamy dostep do toString(),  equals() i hashCode()
        System.out.println(p1);

        System.out.println("p1.equals(p2) -> " + p1.equals(p2));
        System.out.println("p1.equals(p3) -> " + p1.equals(p3));

        System.out.println(p1.distanceFromZero());
    }
}

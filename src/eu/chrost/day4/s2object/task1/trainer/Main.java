package eu.chrost.day4.s2object.task1.trainer;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alfa Romeo",2000);
        Vehicle v2 = new Vehicle("Skoda",1986);
        Vehicle v3 = new Vehicle("Alfa Romeo",2000);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        System.out.println("v1==v2 -> " + (v1 == v2));
        System.out.println("v1==v3 -> " + (v1 == v3));
        System.out.println("v1.equals(v2) -> " + (v1.equals(v2)));
        System.out.println("v1.equals(v3) -> " + (v1.equals(v3)));

        Car c1 = new Car("Toyota", 2020, 5);
        Car c2 = new Car("Skoda", 2001, 5);
        Car c3 = new Car("Skoda", 2001, 5);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("c1==c2 -> " + (c1 == c2));
        System.out.println("c2==c3 -> " + (c2 == c3));
        System.out.println("c1.equals(c2) -> " + (c1.equals(c2)));
        System.out.println("c2.equals(c3) -> " + (c2.equals(c3)));

        Vehicle v4 = new Vehicle("Skoda", 1986);
        Car c4 = new Car("Skoda", 1986, 4);

        System.out.println("v4==c4 -> " + (v4 == c4));
        System.out.println("v4.equals(c4) -> " + (v4.equals(c4)));
        System.out.println("v4==c4 -> " + (c4 == v4));
        System.out.println("c4.equals(v4) -> " + (c4.equals(v4)));

        System.out.println("c4.hashCode() -> " + c4.hashCode());
        System.out.println("v4.hashCode() -> " + v4.hashCode());







    }

}

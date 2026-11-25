package eu.chrost.day3.s1classes.task2.trainer;

class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Peugeot", "308");
        Car car3 = new Car("Peugeot", "3008", 2010);
        System.out.println("Samochody: ");
        car1.print();
        car2.print();
        car3.print();
        System.out.println(car3.isOlderThan(2009));
        System.out.println(car3.isOlderThan(car2));
        System.out.println(car2.isOlderThan(car3));
    }
}

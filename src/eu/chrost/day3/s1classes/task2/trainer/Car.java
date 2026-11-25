package eu.chrost.day3.s1classes.task2.trainer;

public class Car {
    public String brand;
    public String model;
    public int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Car(String brand, String model) {
        this(brand, model, 2000);
    }

    public Car() {
        this("Unknown", "Unknown", 2000);
    }


    public void print() {
        System.out.println("Car{" + "brand='" + brand + '\'' + ", model='" + model + '\'' + ", year=" + year + '}');
    }

    public boolean isOlderThan(int year) {
        return this.year < year;
    }

    //nie ma zadnych przeciwwskazan do tego aby metoda z klasy Car
    //nie mogla przyjmowac jako argumentu innego obiektu klasy Car
    //dzieki temu mozna np. porownac wiek dwoch samochodow
    public boolean isOlderThan(Car car) {
        return isOlderThan(car.year);
        //lub tez:
        //return this.year < car.year;
    }

}

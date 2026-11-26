package eu.chrost.day4.s1inheritance.lectures;

public class Employee {
    //prywatne pola klasy sa naprawde prywatne
    //co oznacza ze nawet klasa potomna nie ma do nich dostepu
    //dlatego jezeli wiemy ze beda one jednak w niej potrzebne
    //to trzeba zmienic im poziom widocznosci na protected
    //oznaczajacy widocznosc w ramach danej klasy, klas potomnych
    //i innych klas z tego samego pakietu
    protected final String name;
    protected final int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String asString() {
        return "Employee[name = " + name + ", salary = " + salary + "]";
    }

    public static String whoAmI() {
        return "Employee";
    }
}

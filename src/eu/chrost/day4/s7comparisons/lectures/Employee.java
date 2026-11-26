package eu.chrost.day4.s7comparisons.lectures;

import java.util.Arrays;
import java.util.Comparator;

//dany plik .java moze zawierac tylko jedna klase publiczna
//i nazwa takiej klasy musi byc taka sama jak nazwa pliku

//natomiast to ograniczenie nie odnosi sie do klas ktore nie sa publiczne
//kazdy plik moze zawierac dowolna ilosc takich klas
class EmployeeSurnameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        //to jest najprostsza implementacja
        //w wersji produkcyjnej nalezaloby sie zabezpieczyc przed sytuacja
        //w ktorej o1, o2 oraz zawarte w nich pole surname sa rowne null
        return o1.getSurname().compareTo(o2.getSurname());
    }
}


public class Employee implements Comparable<Employee> {
    private final String name;
    private final String surname;
    private final int salary;

    public Employee(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Alice", "Johnson", 2000);
        Employee employee2 = new Employee("John", "Doe", 3000);
        Employee employee3 = new Employee("Jane", "Smith", 1000);

        Employee[] employees = {employee1, employee2, employee3};

        System.out.println("Before sort");
        displayArray(employees);

        //Jak to posortowac ?
        //jezeli jest jeden domyslny sposob sortowania
        //to wystarczy zaimplementowac interfejs Comparable
        //i zawolac metode Arrays.sort
        Arrays.sort(employees);

        System.out.println("After default sort");
        displayArray(employees);

        //jezeli chcemy miec kilka sposobow sortowania to wowczas
        //musimy napisac klase ktora implementuje interfejs Comparator
        //a nastepnie instancje takiej klasy przekazac jako drugi argument
        //do metody Arrays.sort
        Arrays.sort(employees, new EmployeeSurnameComparator());
        System.out.println("After custom sort");
        displayArray(employees);
    }

    private static void displayArray(Object[] objects) {
        for (Object o : objects) {
            System.out.println(o);
        }
    }

    @Override
    public int compareTo(Employee o) {
        //zalozmy ze domyslnym sposobem sortowania jest rosnace sortowanie po placy
        if (this.salary < o.salary) {
            return -1;
        } else if (this.salary == o.salary) {
            return 0;
        } else {
            return 1;
        }
    }
}

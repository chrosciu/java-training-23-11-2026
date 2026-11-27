package eu.chrost.day5.s1exceptions.lectures.p2custom;

//wyjatki w Javie dzielimy na niesprawdzalne (wiekszosc z jakimi bedziecie miec do czynienia)
//oraz sprawdzalne (zwykle sa powiazane z operacjami wejscia / wyjscia)
//niesprawdzalne dziedzicza po RuntimeException, sprawdzalne - po Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(int age) {
        super("Age is invalid : " + age + " - should be at least 18");
    }
}

//niesprawdzalny wyjatek bedacy wysokopoziomowym wrapperem dla niskopoziomowego
//wyjatku sprawdzalnego
class BusinessAgeException extends RuntimeException {
    public BusinessAgeException(InvalidAgeException original) {
        //bardzo wazne jest przekazanie owijanego oryginalnego wyjatku
        //tak aby pojawil sie na stacktrace
        super(original);
    }
}

public class Employee {
    private final String name;
    private final int age;

    //zalozenie - nie zgadzamy sie na niepelnoletnich pracownikow i na puste nazwisko
    public Employee(String name, int age) throws InvalidAgeException {
        if (name.isBlank()) {
            //jezeli w konstruktorze wykryjemy ze nie przechodzi nam jakas walidacja obiektu
            //to wlasciwie jedynym rozsadnym wyjsciem jest rzucenie wyjatku
            //zawsze jesli rzucamy wyjatek nalezy zawrzec w nim rozsadny message pozwalajacy stwierdzic
            //jaki byl faktyczny powod jego rzucenia
            //zarowno wyjatki wbudowane jak i customowe rzucamy poprzez slowo kluczowe throw
            //+ obiekt wyjatku do rzucenia
            throw new IllegalArgumentException("Name is invalid - cannot be blank");
        }
        if (age < 18) {
            //w momencie wykrycia ze kod moze rzucic wyjatek sprawdzalny
            //jestesmy zmuszeni do zrobienia jednej z dwoch rzeczy
            //1) do jego przechwycenia
            //2) do zadeklarownia za pomoca slowa throws ze nasza metoda moze rzucic taki wyjatek
            throw new InvalidAgeException(age);
        }
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        //poniewaz tu mamy zawolanie metody rzucajacej wyjatek sprawdzalny
        //to musimy albo oznaczyc rowniez metode main klauzula throws
        //albo wyjatek przechwycic
        try {
            Employee employee = new Employee("Marcin", 17);
        } catch (InvalidAgeException e) {
            //czesta praktyka - lapanie wyjatku, owiniecie innym - bardziej biznesowym, wysokopoziomowym
            //i rzucenie ponownie
            throw new BusinessAgeException(e);
        }
    }
}

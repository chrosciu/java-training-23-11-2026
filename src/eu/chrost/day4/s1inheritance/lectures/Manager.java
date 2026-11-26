package eu.chrost.day4.s1inheritance.lectures;

//klasa Manager reuzywa tego co jest w klasie Employee
//dodajac nowe pola i metody
//czyli innymi slowy Manager rozszerza Employee
public class Manager extends Employee {
    //to pole wystepujw tylko w klasie Manager (a nie w Employee)
    //innymi slowy jest to rozszerzenie
    private final String department;

    //poniewaz nie mamy wlasnego konstruktora to Java tworzy taki za nas
    //i wyglada on tak
//    public Manager() {
//        //w domyslnie stworzonym konstruktorze
//        //jako pierwszy wolany jest konstruktor klasy bazowej
//        //do tego celu jest uzyte slowo kluczowe super
//        super()
//    }

    //czyli zeby to wszystko zadzialalo to musimy zrobic konstruktor sami
    public Manager(String name, int salary, String department) {
        //pierwsza instrukcja w konstruktorze klasy potomnej
        //musi byc zawolanie konstruktora klasy bazowej
        //(chyba ze klasa bazowa ma bezparametrowy konstruktor -
        //- to wtedy zawola sie on sam)
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    //nadpisana metoda z klasy bazowej - ma dokladnie te sama sygnature
    //wiec bedzie mogla zostac uzyta w procesie tzw. polimorfizmu
    //symbole oznaczone @ z przodu to tzw. adnotacje
    //sa to informacje dla kompilatora albo dla bibliotek
    //pozwalajace na programowe przetwarzanie informacji
    //zwiazanych z klasa, metoda, polem etc.
    //adnotacja @Override pozwala skontrolowac czy poprawnie nadpisalismy
    //metode z klasy bazowej
    @Override
    public String asString() {
        return "Manager[name = " + name + ", salary = " + salary + ", department = " + department + "]";
    }

    public static String whoAmI() {
        return "Manager";
    }
}

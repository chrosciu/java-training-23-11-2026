package eu.chrost.day3.s5static.lectures;

public class Weather {
    //odcinamy mozliwosc zawolania konstruktora spoza klasy
    private Weather() {}

    //prywatny konstruktor zawsze mozna zawolac z tej samej klasy
    private static Weather instance = new Weather();

    //jedyna sposobem na pobranie instancji jest uzycie tej publicznej metody
    public static Weather getInstance() {
        return instance;
    }

}

package eu.chrost.day4.s1inheritance.lectures;

public class Null {
    public static void main(String[] args) {
        //null jest specjalna referencja jaka mozna przypisac do kazdego typu obiektowego
        //oznaczajaca nie wskazywanie na zadne miejsce w pamieci
        //tzw. pusta referencja
        Employee employee = null;

        if (employee != null) {
            //gdyby nie powyzsze sprawdzenie
            //(ktore zawsze nalezy robic jesli referencja moze byc nullowalna)
            //to ponizszy kod zakonczylby sie wyjatkiem NullPointerException
            //w skrocie NPE
            System.out.println(employee.getName());
        }
    }
}

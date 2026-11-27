package eu.chrost.day5.s1exceptions.lectures.p1basics;

public class Main {
    public static void main(String[] args) {
        String s = "abc";
        //w momencie wyrzucenia wyjatku kod metody jest przerywany
        //i nie ma mozliwosci powrotu do kolejnych instrukcji

        //jezeli spodziewamy sie wyjatku w jakims miejscu
        //mozemy sprobowac zabezpieczyc sie przed nim za pomoca klauzuli try - catch

        try {
            //w bloku try umieszczamy potencjalny kod jaki moze rzucic wyjatek
            int i = getIntNumberFromString(s);
            //rowniez ta instrukcja musi znalezc sie w try
            //zmienna i nie jest widoczna poza tym blokiem
            System.out.println(i);
        } catch (NumberFormatException e) {
            //jezeli w bloku try wystapi wyjatek o typie podanym w klauzuli catch
            //to ta klauzula zostanie wykonana
            //a dodatkowo w zmiennej (w tym przypadku) e mamy dostep do obiektu wyjatku
            //jaki zostal rzucony

            //dopasowanie wyjatkow dziala podobnie jak instanceof - klauzula catch zadziala
            //nie tylko jesli rzucony wyjatek jest dokladnie tej klasy co w klauzuli catch
            //ale takze jest jest jej potomkiem
            //czyli catch(Exception e) lapie tak naprawde wszystko

            //jezeli zlapales wyjatek to zawsze wypada cos z nim zrobic
            //minimum to zalogowanie ze cos sie stalo
            System.out.println("String: " + s  + " cannot be parsed as int");

            //exception mozna wypisac na konsole - standardowo zobaczymy jego klase i message
            System.out.println(e);

            //mozna tez sam message
            System.out.println(e.getMessage());

            //natomiast najczesciej zrzuca sie stacktrace - bo to zawiera najwiecej informacji
            e.printStackTrace();

            //przechwycony wyjatek nie jest juz propagowany do gory
        } catch (NullPointerException e) {
            //klauzul catch moze byc wiecej niz jedna
            //zostanie wykonana ta, ktora dopasuje sie jako pierwszy
        }


    }

    private static int getIntNumberFromString(String s) {
        //ta operacja sie nie udaje bo nie da sie zamienic podanego lancucha
        //na poprawna liczbe calkowita
        //i w zwiazku z tym rzucany jest wyjatek NumberFormatException
        //(faktycznie rzucenie wyjatku wystepuje o wiele nizej w klasie Integer)
        //poniewaz ten wyjatek nie jest tu obsluzony to wyskoczy wyzej - do metody ktora nas zawolala
        //(czyli main)
        return Integer.parseInt(s);
    }
}

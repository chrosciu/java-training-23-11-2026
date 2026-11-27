package eu.chrost.day5.s3collections;

class MySpecialWithClassWithVeryLongName {

}

public class Var {
    public static void main(String[] args) {
        int i = 3;

        MySpecialWithClassWithVeryLongName myClass = new MySpecialWithClassWithVeryLongName();

        //slowo kluczowe var pozwala zdeklarowac zmienna bez podawania jej typu
        //to nie oznacza ze k jest dowolnego typu albo nie ma typu
        //typ jest ustalany na podstawie tego co jest przypisane do zmiennej
        //w tym przypadku bedzie to int
        var k = 3;

        //zmienna k mimo tego ze jest zadeklarowana var-em to ma okreslony typ
        //i nie mozna do niej przypisac wartosci innego typu
        //k = "Ala"

        //var ma sens szczegolnie przy dlugich nazwach typow
        var myAnotherClass = new MySpecialWithClassWithVeryLongName();

        //nie kompiluje sie - nie mozna ustalic typu zmiennej
        //var p;
    }
}

package eu.chrost.day4.s4abstract;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    //oznaczajac metode jako final
    //uniemozliwiamy jej nadpisanie w klasie potomnej
    @Override
    public final String greet() {
        return "Woof! My name is: " + name;
    }
}

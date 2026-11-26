package eu.chrost.day4.s4abstract;

public class AnimalShelter {
    //dzieki temu ze Cat i Dog maja tego wspolnego przodka Animal
    //moge go tutaj uzyc i jestem dzieki temu w stanie trzymac tutaj
    //dowolne zwierze (nawet jesli w przyszlosci pojawi sie nowy typ)
    private Animal[] animals = new Animal[0];

    public void admit(Animal animal) {
        Animal[] newAnimals = new Animal[animals.length + 1];
        for (int i = 0; i < animals.length; ++i) {
            newAnimals[i] = animals[i];
        }
        newAnimals[animals.length] = animal;
        animals = newAnimals;
    }

    //dzieki klasie abstrakcyjnej Animal
    //klasa AnimalShelter w ogole nie musi wiedziec
    //ze istnieje cos takiego jak Dog i Cat
    public void displayGreetings() {
        for (Animal animal : animals) {
            System.out.println(animal.greet());
        }
    }

    public static void main(String[] args) {
        AnimalShelter animalShelter = new AnimalShelter();

        Dog dog = new Dog("Maja");
        Cat cat = new Cat("Maniek");

        //nie da sie stworzyc instancji klasy abstrakcyjnej
        //Animal animal = new Animal("Burek");

        //ale mozna uzyc jej typu jako referencji do
        //obiektu klasy dziedziczacej po niej
        Animal animal = dog;

        animalShelter.admit(dog);
        animalShelter.admit(cat);

        animalShelter.displayGreetings();

    }

}

## Zadanie 1: Hierarchia klas + nadpisanie metod z klasy Object

1. Utwórz klasę Vehicle z polami:
- String brand (protected final).
- int year (protected final).
- Dodaj konstruktor ustawiający wartości pól.
2. Utwórz klasę Car dziedziczącą po Vehicle:
- Dodaj pole int seats (private final).
- Zdefiniuj konstruktor przyjmujący brand, year i seats. Skorzystaj z super().
3. W każdej klasie nadpisz metodę toString(), aby zwracała informacje o pojeździe.
4. W kazdej klasie nadpisz metodę equals() i hashCode() tak aby dało się porównywać pojazdy 
na podstawie wszystkich ich pól.
5. Utwórz klasę Main z metodą main().
- W metodzie main() utwórz obiekty różnych typów pojazdów i wyświetl ich dane oraz porownaj je ze soba
(zrob tak aby ktores porownanie zwrocilo wyniku true)

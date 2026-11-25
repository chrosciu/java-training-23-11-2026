## Zadanie 1: Licznik obiektów

1. Utwórz klasę Counter z polami:
* Prywatne statyczne pole int objectCount, które przechowuje liczbę utworzonych obiektów klasy.
* Prywatne pole int id, przechowujące unikalny identyfikator obiektu.

2. Dodaj:
* Konstruktor, który zwiększa wartość objectCount i przypisuje jej wartość do pola id.
* Metodę static int getObjectCount(), która zwraca liczbę utworzonych obiektów.
* Metodę void print() wyswietlajaca tekstowa reprezentację obiektu.

3. W metodzie main():
* Utwórz kilka obiektów klasy Counter.
* Wyświetl ich id oraz liczbę utworzonych obiektów za pomocą getObjectCount().
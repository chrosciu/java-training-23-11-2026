## Zadanie 2: Klasa Car

1. Utwórz klasę Car z polami:
   * `String brand`
   * `String model`
   * `int year`

2. Dodaj trzy przeciążone konstruktory:
   * Bez parametrów (ustawia domyślne wartości brand = "Unknown", model = "Unknown", year = 2000).
   * Z parametrami brand i model (ustawia rok na 2000).
   * Z wszystkimi trzema parametrami.

3. Dodaj metodę `print()`

4. Dodaj metodę `boolean isOlderThan(int year)` sprawdzającą, czy samochód jest starszy niż podany rok.

5. Utwórz klasę Main z metodą `main()` i w tej metodzie:
   * Utwórz różne samochody, korzystając z różnych konstruktorów.
   * Sprawdź, które samochody są starsze od podanej wartości.
   * Wypisz na konsolę samochody oraz ich pola
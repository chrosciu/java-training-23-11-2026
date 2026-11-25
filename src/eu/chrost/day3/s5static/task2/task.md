## Zadanie 2: Kalkulator ze stałymi

1. Utwórz klasę Calculator z polami:
    * static final double PI (wartość 3.14159) 
    * static final double E (wartość 2.71828).
2. Dodaj statyczne metody:
   * double add(double a, double b) – zwraca sumę dwóch liczb.
   * double subtract(double a, double b) – zwraca różnicę dwóch liczb.
   * double multiply(double a, double b) – zwraca iloczyn dwóch liczb.
   * double divide(double a, double b) – zwraca iloraz dwóch liczb.
3. Zablokuj mozliwosc tworzenia instancji klasy Calculator (tak aby nie dalo sie zawolac new Calculator())
4. Dodaj metode main() do klasy Calculator i w tej metodzie:
   * Wykorzystaj stałe PI i E jako argumenty w metodach kalkulatora.
   * Wyświetl wyniki operacji.
   
## Zadanie 1: Klasa BankAccount

1. Utwórz klasę BankAccount z polami:
* String accountNumber
* double balance
 
2. Dodaj trzy przeciążone konstruktory:
* Bez parametrów (ustawia domyślne wartości accountNumber = "0000", balance = 0.0).
* Z parametrem accountNumber (ustawia numer konta, a saldo na 0.0).
* Z parametrami accountNumber i balance.

3. Dodaj metodę print() wypisujaca dane o koncie

4. Dodaj metody:
* void deposit(double amount) – zwiększa saldo o podaną kwotę.
* void withdraw(double amount) – zmniejsza saldo o podaną kwotę (jeśli na koncie są wystarczające środki).

5. Utwórz klasę Main z metodą main() i w tej metodzie:
* Utwórz różne konta bankowe przy użyciu przeciążonych konstruktorów.
* Wykonaj operacje wpłat i wypłat dla każdego konta.

6. Sprawdź działanie tych operacji poprzez wypisanie zawartości kont przed i po operacji

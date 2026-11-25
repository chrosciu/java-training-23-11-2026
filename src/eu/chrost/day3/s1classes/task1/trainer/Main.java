package eu.chrost.day3.s1classes.task1.trainer;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.print();

        account1.deposit(10);
        account1.print();

        account1.withdraw(10);
        account1.print();

        BankAccount account2 = new BankAccount("0004", 400.0);
        account2.print();

        account2.deposit(200.0);
        account2.print();

        account2.withdraw(75.0);
        account2.print();

        BankAccount bankAccount3 = new BankAccount("1234");
        bankAccount3.print();

        bankAccount3.deposit(-50);
        bankAccount3.print();

        bankAccount3.deposit(50);
        bankAccount3.print();

        bankAccount3.withdraw(-30);
        bankAccount3.print();

        bankAccount3.withdraw(60);
        bankAccount3.print();

        bankAccount3.withdraw(40);
        bankAccount3.print();
    }

}

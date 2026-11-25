package eu.chrost.day3.s1classes.task1.trainer;

public class BankAccount {
    public String accountNumber;
    public double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount() {
        this("0000", 0.0);
    }

    public BankAccount(String accountNumber) {
        this(accountNumber, 0.0);
    }

    public void print() {
        System.out.println("Numer konta: " + accountNumber + ", stan konta: " + balance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            return;
        }
        if (amount > balance) {
            return;
        }
        balance -= amount;
    }
}


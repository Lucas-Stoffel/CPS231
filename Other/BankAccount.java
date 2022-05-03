package Other;

import FinalProject.Person;

public class BankAccount extends Person {

    private double balance;

    BankAccount(String firstname, String lastname, double balance) {
        balance = this.balance;
    }

    public BankAccount(double startBalance) {
        deposit(startBalance);
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount >= 0.0) {
            balance += amount;
        } else {
            System.err.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {

        if (amount >= 0.0 && amount <= balance)
            balance -= amount;
        else
            System.err.println("Withdrawal amount must be positive and cannot be greater than balance");
    }

}
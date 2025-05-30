package com.chris.bank;

/**
 * Main application class to test basic banking operations.
 */
public class BankApp {
    public static void main(String[] args) {
        // Create a new bank account for Chris.
        Account acc = new Account("Chris");

        // Deposit $100 into the account.
        acc.deposit(100);

        // Withdraw $30 from the account.
        acc.withdraw(30);

        // Display the account owner's name.
        System.out.println("Account Owner: " + acc.getOwner());

        // Display the final balance after transactions.
        System.out.println("Final Balance: $" + acc.getBalance());
    }
}

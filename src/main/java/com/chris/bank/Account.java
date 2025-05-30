package com.chris.bank;

/**
 * Represents a simple bank account with basic operations.
 */
public class Account {
    // The name of the person who owns the account.
    private String owner;

    // The current balance in the account.
    private double balance;

    /**
     * Constructor to create an account for a specific owner.
     * The balance is set to 0.0 by default.
     *
     * @param owner The name of the account holder.
     */
    public Account(String owner) {
        this.owner = owner;
        this.balance = 0.0;
    }

    /**
     * Adds money to the account.
     *
     * @param amount The amount to deposit.
     * @throws IllegalArgumentException if the deposit amount is zero or negative.
     */
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be positive.");
        }
        balance += amount;
    }

    /**
     * Takes money out of the account.
     *
     * @param amount The amount to withdraw.
     * @throws IllegalArgumentException if the amount is negative or more than what's available.
     */
    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            throw new IllegalArgumentException("Invalid withdrawal.");
        }
        balance -= amount;
    }

    /**
     * Returns the current balance of the account.
     *
     * @return The account balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns the owner's name.
     *
     * @return The name of the account holder.
     */
    public String getOwner() {
        return owner;
    }
}

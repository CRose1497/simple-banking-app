package com.chris.bank;

public class BankApp {
    public static void main(String[] args) {
        Account acc = new Account("Chris");
        acc.deposit(100);
        acc.withdraw(30);

        System.out.println("Account Owner: " + acc.getOwner());
        System.out.println("Final Balance: $" + acc.getBalance());
    }
}

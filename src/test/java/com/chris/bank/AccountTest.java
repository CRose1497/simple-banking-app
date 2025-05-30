package com.chris.bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Account class to verify core banking behavior.
 */
public class AccountTest {

    @Test
    void depositShouldIncreaseBalance() {
        // Create a new account and deposit $100.
        Account acc = new Account("Chris");
        acc.deposit(100);

        // Confirm the balance is now $100.
        assertEquals(100, acc.getBalance());
    }

    @Test
    void withdrawShouldDecreaseBalance() {
        // Create a new account, deposit $200, then withdraw $50.
        Account acc = new Account("Chris");
        acc.deposit(200);
        acc.withdraw(50);

        // Check that the remaining balance is $150.
        assertEquals(150, acc.getBalance());
    }

    @Test
    void withdrawTooMuchShouldThrowException() {
        // Deposit $100 and try to withdraw $200 (will fail).
        Account acc = new Account("Chris");
        acc.deposit(100);

        // Expect an exception when withdrawing more than the balance.
        assertThrows(IllegalArgumentException.class, () -> {
            acc.withdraw(200);
        });
    }
}

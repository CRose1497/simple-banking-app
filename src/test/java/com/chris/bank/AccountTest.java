package com.chris.bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    void depositShouldIncreaseBalance() {
        Account acc = new Account("Chris");
        acc.deposit(100);
        assertEquals(100, acc.getBalance());
    }

    @Test
    void withdrawShouldDecreaseBalance() {
        Account acc = new Account("Chris");
        acc.deposit(200);
        acc.withdraw(50);
        assertEquals(150, acc.getBalance());
    }

    @Test
    void withdrawTooMuchShouldThrowException() {
        Account acc = new Account("Chris");
        acc.deposit(100);
        assertThrows(IllegalArgumentException.class, () -> {
            acc.withdraw(200);
        });
    }
}

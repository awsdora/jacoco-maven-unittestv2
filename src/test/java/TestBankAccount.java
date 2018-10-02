package com.bogotobogo;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBankAccount {
    @Test
public void testFunds() {
        System.out.println("Account intial balance: 10Rs");
       BankAccount account = new BankAccount(10);
       System.out.println("Debitted amount:" + 5.0);
       double amount = account.debit(5);
       System.out.println("Balance : " +amount);
       System.out.println("Depositing : " + 100.0);
       double balance = account.deposit(100);
       System.out.println("Balance: " + balance);
    }
}

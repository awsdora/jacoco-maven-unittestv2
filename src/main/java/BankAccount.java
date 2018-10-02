package com.bogotobogo;

public class BankAccount {

          private double balance;

          public BankAccount(double balance) {
            this.balance = balance;
          }

          public double debit(double amount) {
            if (balance < amount) {
              amount = balance;
            }

            balance -= amount;
            return amount;
          }
           public double deposit(double amount) {
              if(amount >= 0) {
                  this.balance = this.balance + amount;
              } else {
                  System.out.println("Depositing amount should not be negative");
              }
		   return this.balance;
		   }
}

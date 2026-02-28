package com.q5;

import java.util.Scanner;

class Bank {
    
    
    float deposit(float amount, float balance) 
    {
        return balance + amount;
    }

    
    float withdraw(float amount, float balance) 
    {
        if(balance >= amount) 
        {
            return balance - amount;
        } else 
        {
            return 0;
        }
    }

}

public class BakingSystem {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        float balance = scanner.nextFloat();
        System.out.print("Enter amount to deposit: ");
        float depositAmount = scanner.nextFloat();
        balance = bank.deposit(depositAmount, balance);
        System.out.println("Balance after deposit: " + balance);
        System.out.print("Enter amount to withdraw: ");
        float withdrawAmount = scanner.nextFloat();
        balance = bank.withdraw(withdrawAmount, balance);
        if(balance == 0) {
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            System.out.println("Balance after withdrawal: " + balance);
        }
        scanner.close();
    }

}

package com.company;

public class Account {
    int balance;

    Account(int balance) {
        this.balance = balance;
    }
    public String getBalance(){
        return("Balance: $" + balance);
    }

    public void add(int amount){
        balance += amount;
    }

    public void subtract(int amount){
        if (balance <= amount){
            balance = 0;
        } else {
            balance -= amount;
        }
    }




}

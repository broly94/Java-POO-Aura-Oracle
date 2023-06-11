package com.bytebank;

public class Account {
    private double balance;
    private int agency;
    private int number;
    private String headline;

    public boolean deposit(double value){
        if(value > 0){
            this.balance += value;
            return true;
        }else {
            return false;
        }
    }

    public boolean withdraw(double value) {
        if(this.balance >= value) {
            this.balance -= value;
            return true;
        }else {
            return false;
        }
    }

    public boolean transfer(double value, Account accountToTransfer) {
        if (this.balance >= value) {
            accountToTransfer.deposit(value);
            this.withdraw(value);
            return true;
        } else {
            return false;
        }
    }
    // Setters and Getters
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }
}

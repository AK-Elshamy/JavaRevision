package com.model;

public class Accounts {
    private String iban;
    private double balance;

    public Accounts(String iban, double balance) {
        validateIban(iban);
        this.iban = iban;
        this.balance = balance;
    }

    private void validateIban(String iban) {
        if (iban == null || iban.length() != 22 || !iban.matches("[A-Z]{2}\\d{20}")) {
            throw new IllegalArgumentException("Invalid IBAN format");
        }
    }

    public String getIban() {
        return iban;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }

    public void displayData(){
        System.out.println("------------------------------");
        System.out.println("IBAN: " + this.iban);
        System.out.println("Balance: " + this.balance);
        System.out.println("------------------------------");
    }
}
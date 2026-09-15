package com;

public class Visa implements Payment{

    @Override
    public void pay(double amount) {
        validate(amount);
        System.out.println("Pay: " + amount + " VisaBank");

    }
}

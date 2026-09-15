package com;

public class Paypal implements Payment{
    @Override
    public void pay(double amount){
        validate(amount);

        System.out.println("Pay: " + amount + " with PayPal");
    }
}

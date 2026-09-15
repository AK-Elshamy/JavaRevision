package com;

public class Cash implements Payment{
    @Override
    public void pay(double amount) {
        validate(amount);

        System.out.println("Pay: " + amount + " CashMoney");
    }
}

package com;

public interface Payment {

    void pay(double amount);

    default void validate(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Invalid amount");
        }
    }
}

package com;

public class Main {


    public static void main(String [] args){


        Car bmw = new Car("BMW X5", "Black", "2023", "BMW", 60000, 240, false);
        bmw.turnOn();
        bmw.brake();
        bmw.turnOff();
        bmw.displayInfo();




    }



}
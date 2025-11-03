package com;

public class Car {

    private String name;
    private String color;
    private String model;
    private String company;
    private int salary;
    private int speed;
    boolean isHatchBack;
    //
    Car(){}

    public Car(String name, String color, String model, String company, int salary, int speed, boolean isHatchBack) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.company = company;
        this.salary = salary;
        this.speed = speed;
        this.isHatchBack = isHatchBack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getIsHatchBack() {
        return isHatchBack;
    }

    public void setHatchBack(boolean hatchBack) {
        isHatchBack = hatchBack;
    }


    public void turnOn(){
        System.out.println("The car is being turned on.");
    }
    public void turnOff(){
        System.out.println("The car is being turned off.");
    }

    public void brake(){
        System.out.println("The car is brake.");
    }


    public void displayInfo(){
        System.out.println("------------- The Information about the car -------------");

        System.out.println("The Car Name is: " + name);
        System.out.println("The Car Salary is: " + salary + "$");
        System.out.println("The Company of car is: " + company);
        System.out.println("The model of Car is Year: " + model);
        System.out.println("The color of Car is : " + color);
        System.out.println("The Car Speed is: " + speed + "KM");
        if(getIsHatchBack()){
            System.out.println("The Car is HatchBack");
        }else{
            System.out.println("The Car Not hatchBack");
        }

    }


}

package org.example.learnjdbc.dao;

import java.util.Date;

public class Employee {
    private int id;
    private String name;
    private boolean gender;
    private Date birthDate;
    private double salary;

    public Employee(int i, String ahmed, boolean b, String name, double salary) {
    }

    public Employee(Date birthDate, boolean gender, int id, String name, double salary) {
        this.birthDate = birthDate;
        this.gender = gender;
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Employee{" +
                "id=" + id +
                ", name=" + name +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", salary=" + salary +
                '}';
    }
}

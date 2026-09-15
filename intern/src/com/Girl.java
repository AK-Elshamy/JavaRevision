package com;

public class Girl extends Person{
    public Girl(int age, String name) {
        super(age, name);
    }
    @Override
    public void print(){
        super.print();
        System.out.println("I\'m " + getName());
        System.out.println("I have " + getAge() + " year");
    }
    @Override
    public void sayHello(){
        System.out.println("Hello I\'m a girl.");
    }
}

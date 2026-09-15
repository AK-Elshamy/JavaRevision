package com;

public class Main {
    public  static void main(String []args){
        Boy b = new Boy(21, "Ahmed");
        Girl g = new Girl(12, "yara");
        b.print();
        b.sayHello();
        System.out.println("--------------");
        g.print();
        g.sayHello();
    }


}

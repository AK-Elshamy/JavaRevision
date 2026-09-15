import java.net.InetAddress;
import java.util.Collection;

public class Main {
    public static void main(String[] args){

        Dog a = new Dog();
        a.aa(); // "Animal sound" !! مش "Woof"


    }
}
class Animal {
    public  static void aa() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    public static void aa() {
        System.out.println("Woof");
    }
}


package math;

public class Circle implements Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calcArea(){
        double area = radius * radius * Math.PI;
        System.out.println("Circle Area is: " + area);
    }
}

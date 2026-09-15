package math;

public class Rectangle implements Shape{

    private double high , width;
    public Rectangle(double high, double width){
        this.high = high;
        this.width = width;
    }
    @Override
    public void calcArea(){
        double area = high * width;
        System.out.println("Rectangle Area is: " + area);
    }
}

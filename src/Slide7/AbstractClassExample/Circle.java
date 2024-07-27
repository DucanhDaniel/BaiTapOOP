package Slide7.AbstractClassExample;

public class Circle extends Shape{
    private double radius;
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    public double calculateArea() {
        return 3.14*radius*radius;
    }
}

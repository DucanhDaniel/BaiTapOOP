package Slide7.Exercise3;

public class Circle extends Shape{
    //Attributes
    protected double radius;

    //Constructor
    public Circle(){}
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    //Setter and getter
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 3.14*2*radius;
    }

    @Override
    public String toString() {
        return "Circle ---> radius = " + radius;
    }
}

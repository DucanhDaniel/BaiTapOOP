package Slide7.Exercise3;


public class Rectangle extends Shape{
    //Attributes
    protected double length, width;

    //Constructor
    public Rectangle(){}
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    //Setter and getter
    public double getWidth(){
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(length + width);
    }

    @Override
    public String toString() {
        return "Rectangle ---> length = " + length + " | width = " + width;
    }

}

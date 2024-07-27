package Slide7.AbstractClassExample;

public class Square extends Shape {
    private double side;

    public Square(String name, double side) {
        super(name);
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }
}

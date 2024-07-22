package Slide3.Bai1;

public class Square {
    private double length;

    public Square() {
        length = 0;
    }

    public Square(double length) {
        this.length = length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getPerimeter() {
        return length * 4;
    }

    public double getArea() {
        return length * length;
    }
}

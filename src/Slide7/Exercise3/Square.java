package Slide7.Exercise3;

public class Square extends Rectangle{
    //Constructor
    public Square(){}
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    //Setter and getter
    public double getSide() {
        return super.getLength();
    }
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square ---> side = " + super.getWidth();
    }
}

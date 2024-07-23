package Slide7.AbstractClassExample;

abstract public class Shape {
    protected String name;
    Shape(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract double calculateArea();
}

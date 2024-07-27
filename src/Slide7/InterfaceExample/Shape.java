package Slide7.InterfaceExample;

abstract class Shape {
    protected String name;
    protected int x, y;
    Shape(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }
    public String getName() {
        return name;
    }
    public abstract double calculateArea();
}

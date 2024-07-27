package Slide7.InterfaceExample;
import java.awt.Graphics;

public class Circle extends Shape implements Actable{ 
    private int radius;
    public Circle(String name, int x, int y, int radius) {
        super(name, x, y);
        this.radius = radius;
    }
    public double calculateArea() {
        return 3.14 * radius * radius;
    }
    public void draw(Graphics g) {
        g.drawOval(x - radius, y - radius, 2*radius, 2*radius);
    }
    public void moveTo(Graphics g, int x1, int y1) {
        x = x1;
        y = y1;
        draw(g);
    }

    public void fill(Graphics g) {
        g.fillOval(x - radius, y - radius, 2*radius, 2*radius);
    }
}

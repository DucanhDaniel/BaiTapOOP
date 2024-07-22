package Slide3.Bai2;

public class Vector {
    private double x, y, z;
    public Vector(){}
    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector add(Vector other) {
        return new Vector(x + other.x, y + other.y, z + other.z);
    }
    public Vector subtract(Vector other) {
        return new Vector(x - other.x, y - other.y, z - other.z);
    }
    public Vector multiply(double scalar) {
        return new Vector(x * scalar, y * scalar, z * scalar);
    }
    public double dotProduct(Vector other) {
        return x*other.x + y*other.y + z*other.z;
    }
}

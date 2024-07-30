package Slide8.InstanceOfExample;
import java.io.*;
import java.rmi.server.LogStream;
import java.lang.String;
public class Test {
    public static void checkInstanceof(Person p) {
        if (p instanceof Employee) {
            System.out.println("Employee");
        }
        else
            if (p instanceof Student) {
                System.out.println("Student");
            }
            else {
                System.out.println("Unknown");
            }
    }
    public static void main(String[] args) {
        checkInstanceof(new Employee());
        checkInstanceof(new Student());
        if (System.out instanceof Object) {
            System.out.println("System.out is obj");
        }
        else {
            System.out.println("System.out is not obj");
        }
    }
}

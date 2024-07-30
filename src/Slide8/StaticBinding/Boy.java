package Slide8.StaticBinding;
class Human {
    public static void walk() {
        System.out.println("Human walks");
    }
}
public class Boy extends Human {
    public static void walk() {
        System.out.println("Boy walks");
    }
    public static void main(String args[]) {
// Reference is of Human type and object is Boy type
        Human obj1 = new Boy(); //Dynamic binding
// Reference is of Human type and object is Human type.
        Human obj2 = new Human(); //Static binding
// Reference is of Human type and object is Human type.
        Boy obj3 = new Boy(); //Static binding
        obj1.walk(); //Call walk() of Human class
        obj2.walk(); //Call walk() of Human class
        obj3.walk(); //Call walk() of Boy class
        obj1 = obj3;
        obj1.walk(); //Call walk() of Human class
    }
}
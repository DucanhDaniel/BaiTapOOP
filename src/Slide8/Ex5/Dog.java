package Slide8.Ex5;

public class Dog extends Animal {
    public void greeting() {
        System.out.println("From Dog class without any argument");
    }
    public void greeting(Dog another) {
        System.out.println("From Dog class with Dog argument");
    }
}

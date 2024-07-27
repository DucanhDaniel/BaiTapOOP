package Slide7.InterfaceExample;

class A {

    public int x = 10;
    public void display1() {
        System.out.println(this.x);
    }
}

class B extends A {

    public int x = 1000;

    public void display() {
        System.out.println(this.x);
    }

}

public class Entry {

    public static void main(String[] args) {
        A b = new B();
        b.display1();

    }
}
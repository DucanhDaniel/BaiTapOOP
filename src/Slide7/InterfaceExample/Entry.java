package Slide7.InterfaceExample;

interface Interface3 {
    default void doSomething() {
        System.out.println("Execute in Interface3");
    }

    public static void test() {
        System.out.println("test");
    }
}

abstract class Parent {
    public void doSomething() {
        System.out.println("Execute in Parent");
    }
}

public class Entry implements Interface3 {
    public static void main(String[] args) {
        Entry m = new Entry();
        m.doSomething(); // Calls the overridden method in Entry
        Interface3.test();
    }

    @Override
    public void doSomething() {
        System.out.println("Execute in Entry");
    }
}
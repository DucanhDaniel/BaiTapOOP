package Slide9.IteratorComparator;

import java.util.ArrayList;

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Person> arrList = new ArrayList<>();
        Person p = new Person();
        p.setAge(35); p.setName("A");
        arrList.add(p);

        p = new Person();
        p.setAge(30); p.setName("B");
        arrList.add(p);

        p = new Person();
        p.setAge(32); p.setName("C");
        arrList.add(p);

        arrList.sort(new AgeComparator());

        System.out.println("Sorted ArrayList: ");
        System.out.println(arrList);

    }
}

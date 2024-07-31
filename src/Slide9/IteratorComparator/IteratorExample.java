package Slide9.IteratorComparator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrList.add(i);
        }
        System.out.println("Original ArrayList: " + arrList);

        // Using Iterator to iterate ArrayList
        Iterator<Integer> iterator = arrList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        iterator.remove();

        System.out.println("ArrayList after deletion: " + arrList);

    }
}

package Slide9.IteratorComparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        int age1 = p1.getAge();
        int age2 = p2.getAge();
        if (age1 < age2) return -1;
        else if (age1 == age2) return 0;
        else return 1;
    }
}


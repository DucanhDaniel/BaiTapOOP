package Slide9.Wildcard;

import java.util.Iterator;
import java.util.List;
public class ListMethod {
    public static void printList(List<? super String> list) {
        Iterator iterator = list.iterator();
        for (; iterator.hasNext();) {
            System.out.println(iterator.next());
        }
    }
}
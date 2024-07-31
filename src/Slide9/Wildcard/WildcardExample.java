package Slide9.Wildcard;
import java.util.List;
import java.util.ArrayList;


public class WildcardExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("!");
        ListMethod.printList(stringList);
    }
}

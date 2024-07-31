package Slide9.GenericProgramming;

public class GenericMethod {
    public static <T extends Comparable<T>> T findMax(T a, T b) {
        return a.compareTo(b) > 0? a : b;
    }
    public static <E> void printArray(E[] arr) {
        for (E element : arr) {
            System.out.println(element + " ");
        }
        System.out.println();
    }
}

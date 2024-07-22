package Slide5.Bai3;

public class CompareStringAndStringBuffer {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String str1 = "";
        for (int i = 0; i <= 10000; i++)
            str1 = str1 + "Hello ";
       long end1 = System.currentTimeMillis();

        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i <= 10000; i++)
            buffer.append("Hello ");
        long end2 = System.currentTimeMillis();

        long totalStringAdding = end1 - start;
        long totalBufferAppending = end2 - end1;
        if (totalStringAdding < totalBufferAppending) {
            System.out.println("String concatenation is faster than StringBuffer appending");
        }
        else {
            System.out.println("StringBuffer appending is faster than String concatenation");
        }
    }
}

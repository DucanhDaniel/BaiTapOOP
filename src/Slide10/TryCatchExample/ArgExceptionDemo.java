package Slide10.TryCatchExample;

public class ArgExceptionDemo {
    public static void main(String[] args) {
        try {
            String text = args[0];
            System.out.println("Text: " + text);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Argument not provided");
        }

        //Step 1: cd D:\TestSomething\src\Slide10\TryCatchExample\
        //Step 2: javac ArgExceptionDemo.java
        //Step 3: cd D:\TestSomething\src\
        //Step 4: java Slide10.TryCatchExample.ArgExceptionDemo argument1

    }
}

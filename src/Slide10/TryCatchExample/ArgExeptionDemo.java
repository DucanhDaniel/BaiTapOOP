package Slide10.TryCatchExample;

public class ArgExeptionDemo {
    public static void main(String[] args) {
        try {
            String text = args[0];
            System.out.println("Text: " + text);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Argument not provided");
        }
    }
}

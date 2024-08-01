package Slide10.ThrowableExample;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String str = null;
        try {
            getStringLength(str);
        }
        catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    /**
     * This function calculates and prints the length of a given string.
     * If the input string is null, it throws a NullPointerException with a custom error message.
     *
     * @param str The string whose length needs to be calculated.
     * @throws NullPointerException If the input string is null.
     * @return This function does not return any value. It prints the length of the string.
     */
    public static void getStringLength(String str) {
        if (str == null) {
            throw new NullPointerException("Input string str is null");
        }
        System.out.println("Length of the string: " + str.length());
    }
}

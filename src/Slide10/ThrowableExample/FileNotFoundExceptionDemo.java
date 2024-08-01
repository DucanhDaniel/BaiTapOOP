package Slide10.ThrowableExample;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionDemo {
    public static void main(String[] args) {
        try {
            readFile("nonexistentfile.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        }
    }
    public static void readFile(String fileName)
    throws FileNotFoundException {
        FileReader reader = new FileReader(fileName);
    }
}

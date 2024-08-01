package Slide10.Ex2;

import Slide10.Ex1.EmptyStringException;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        FileReader fr = new FileReader();
        try {
            fr.readListIntegers("D:\\TestSomething\\src\\Slide10\\Ex2\\Input.txt");
        } catch (EmptyStringException ese) {
            System.out.println("EmptyStringException" + ese.getMessage());
        } catch (FileNotFoundException fnfe) {
            System.out.println("FileNotFoundException: " + fnfe.getMessage());
        } catch (CannotOpenFileException cofe) {
            System.out.println("CannotOpenFileException: " + cofe.getMessage());
        } catch (InputIsNotIntegerException iinie) {
            System.out.println("InputIsNotIntegerException: " + iinie.getMessage());
        }
    }
}

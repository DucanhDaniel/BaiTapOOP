package Slide10.Ex3;

import Slide10.Ex1.EmptyStringException;
import Slide10.Ex2.CannotOpenFileException;
import Slide10.Ex2.InputIsNotIntegerException;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            FileProcessing.splitListIntegers(
                    "D:\\TestSomething\\src\\Slide10\\Ex3\\input.txt");
        } catch (EmptyStringException ese) {
            System.out.println("EmptyStringException: " + ese.getMessage());
        } catch (CannotOpenFileException cofe) {
            System.out.println("CannotOpenFileException: " + cofe.getMessage());
        } catch (InputIsNotIntegerException iie) {
            System.out.println("InputIsNotIntegerException: " + iie.getMessage());
        } catch (CannotWriteIntoFileException cwe) {
            System.out.println("CannotWriteIntoFileException: " + cwe.getMessage());
        } catch (FileNotFoundException fnfe) {
            System.out.println("FileNotFoundException: " + fnfe.getMessage());
        }
    }
}

package Slide10.Ex2;
import Slide10.Ex1.EmptyStringException;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;

public class FileReader {
    public void readListIntegers(String fileName)
    throws  EmptyStringException,
            FileNotFoundException,
            CannotOpenFileException,
            InputIsNotIntegerException {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            if (!file.canRead()) {
                throw new CannotOpenFileException("Cannot open/read the file!");
            }
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                int number = scanner.nextInt();
                System.out.println(number);
            }

        } catch (NullPointerException npe) {
            throw new EmptyStringException("File name is empty!");
        } catch (FileNotFoundException fnfe) {
            throw new FileNotFoundException("File not found!");
        } catch (InputMismatchException ime) {
            throw new InputIsNotIntegerException("Input is not an integer!");
        } catch (SecurityException se) {
            throw new CannotOpenFileException("Cannot open the file, permission denied!");
        }
    }
}

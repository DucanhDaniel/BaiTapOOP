package Slide10.Ex3;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;
import Slide10.Ex2.InputIsNotIntegerException;
import Slide10.Ex2.CannotOpenFileException;
import Slide10.Ex1.EmptyStringException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileProcessing {
    public static void splitListIntegers(String fileName)
            throws EmptyStringException,
            CannotOpenFileException,
            InputIsNotIntegerException,
            CannotWriteIntoFileException,
            FileNotFoundException
    {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            if (!file.canRead()) {
                throw new CannotOpenFileException("Cannot open/read the file!");
            }
            Path[] outputName = {
                    Path.of("D:\\TestSomething\\src\\Slide10\\Ex3\\Output1.txt"),
                    Path.of("D:\\TestSomething\\src\\Slide10\\Ex3\\Output2.txt"),
                    Path.of("D:\\TestSomething\\src\\Slide10\\Ex3\\Output3.txt"),
                    Path.of("D:\\TestSomething\\src\\Slide10\\Ex3\\Output4.txt")
            };

            String[] content = new String[4];
            for (int i = 0; i < 4; i++) {
                content[i] = "";
            }
            int n = scanner.nextInt();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < n/4; j++) {
                    if (!scanner.hasNext()) break;
                    int num = scanner.nextInt();
                    content[i] += num + "\n";
                }
            }

            for (int i = 0; i < 4; i++) {
                Files.writeString(outputName[i], content[i]);
            }

        } catch (NullPointerException npe) {
            throw new EmptyStringException("Input file name is empty!");
        } catch (FileNotFoundException fnfe) {
            throw new FileNotFoundException("Cannot found the file!");
        } catch (InputMismatchException ime) {
            throw new InputIsNotIntegerException("Input file has non-integer character!");
        } catch (IOException ioe) {
            throw new CannotWriteIntoFileException("Cannot write into output file!");
        }
    }
}

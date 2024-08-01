package Slide10.TryCatchExample;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileReaderDemo {
    public void openFile() {
        FileReader reader = null;
        try {
            // constructor may throw FileNotFoundException
            reader = new FileReader("someFile");
            int i = 0;
            while (i != -1) {
                //reader.read() may throw IOException
                i = reader.read();
                System.out.println((char) i);
            }
        } catch (FileNotFoundException e) {
            //do something clever with the exception
        } catch (IOException e) {
            //do something clever with the exception
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.err.println("Error closing file");
            } catch (NullPointerException e) {
                System.err.println("Error: " + e.getMessage());
            }
            System.out.println("--- File End ---");
        }
    }
}
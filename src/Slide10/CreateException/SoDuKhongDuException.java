package Slide10.CreateException;

//Checked exception -> extends Exception
//Unchecked exception -> extends RuntimeException
public class SoDuKhongDuException extends Exception  {
    public SoDuKhongDuException(String message) {
        super(message);
    }
}

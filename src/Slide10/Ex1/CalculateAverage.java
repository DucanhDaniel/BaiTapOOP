package Slide10.Ex1;

public class CalculateAverage {
    static int count = 0;
    static double result = 0;
    public static double getAverage(String str)
    throws EmptyStringException, StringIsNotNumberException, StringIsNotIntegerException {
        try {
            double number = Integer.parseInt(str);
            result = (result*count + number)/(count + 1);
            count++;
        } catch (NumberFormatException nfe) {
            if (str.isEmpty())
                throw new EmptyStringException("This string is empty!");
            boolean hasNonNumericChr = false;
            int totalDecimalPoint = 0;
            for (int i = 0; i < str.length(); i++) {
                if ((str.charAt(i) < '0' || str.charAt(i) > '9') && str.charAt(i) != '.')
                    hasNonNumericChr = true;
                if (str.charAt(i) == '.')
                    totalDecimalPoint++;
            }
            if (!hasNonNumericChr && totalDecimalPoint == 1 && str.length() > 1)
                throw new StringIsNotIntegerException("This string is a REAL NUMBER, not an integer!");
            if (hasNonNumericChr)
                throw new StringIsNotNumberException("This string contains non-numeric characters!");
        }
        return result;
    }
}

package Slide10.TryCatchExample;

public class DivisionByZeroDemo {
    static int calculate(int no, int no1){
        int num = no / no1;
        return num;
    }
    public static void main(String args[]){
        try {
            int num = calculate(9,0);
            System.out.println(num);
        }
        catch(ArithmeticException e) {
            System.err.println("Co loi xay ra: " + e.toString());
        }
    }

}
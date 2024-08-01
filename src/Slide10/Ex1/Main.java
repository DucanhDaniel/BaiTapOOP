package Slide10.Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an INTEGER number or type 'exit' to quit:");
            String input = sc.nextLine();
            if (input.equals("exit")) return;
            try {
                System.out.println("Average: " + CalculateAverage.getAverage(input));
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

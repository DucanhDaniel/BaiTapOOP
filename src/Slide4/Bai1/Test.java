package Slide4.Bai1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numStudent = sc.nextInt();
        Student[] students = new Student[numStudent];
        for (int i = 0; i < numStudent; i++) {
            students[i] = new Student();
            System.out.println("Student " + (i + 1) + ": ");
            System.out.print("Name: ");
            students[i].setName(sc.next());
            System.out.print("Year: ");
            students[i].setYear(sc.nextInt());
        }
        for (int i = 0; i < numStudent; i++) {
            System.out.println("--------------");
            System.out.println("Student index " + (i + 1) + ": ");
            System.out.println("Name: " + students[i].getName());
            System.out.println("Year: " + students[i].getYear());
        }
        System.out.println("--------------");
        sc.close();
        int sumAge = 0;
        for (int i = 0; i < numStudent; i++) {
            sumAge += 2024 - students[i].getYear();
        }
        System.out.println("Sum of age of all students: " + sumAge);
    }
}

package Slide8.InstanceOfExample;

public class Test {
    public static void checkInstanceof(Person p) {
        if (p instanceof Employee) {
            System.out.println("Employee");
        }
        else
            if (p instanceof Student) {
                System.out.println("Student");
            }
            else {
                System.out.println("Unknown");
            }
    }
    public static void main(String[] args) {
        checkInstanceof(new Employee());
        checkInstanceof(new Student());
    }
}

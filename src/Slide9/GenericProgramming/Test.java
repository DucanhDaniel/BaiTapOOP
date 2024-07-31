package Slide9.GenericProgramming;

public class Test {
    public static void main(String[] args) {
        /*
            Testing generic class
         */
        GenericClass<Integer> intClass = new GenericClass<Integer>(100);
        GenericClass<String> stringClass = new GenericClass<>("Hello World");
//        GenericClass<Circle> circleClass = new GenericClass<>(new Circle(5));

        /*
            Testing generic method
         */
        GenericMethod.printArray(new Integer[]{10, 20, 30});
        System.out.println(GenericMethod.findMax(10, 20));


    }
}

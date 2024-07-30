package Slide8.Ex5;

public class BigDog extends Dog {
    public void greeting() {
        System.out.println("From BigDog class without any arguments");
    }
    public void greeting(Dog another) {
        System.out.println("From BigDog class with Dog argument");
    }

}

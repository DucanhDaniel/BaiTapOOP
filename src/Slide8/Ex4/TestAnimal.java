package Slide8.Ex4;

public class TestAnimal {
    public static void main(String[] args) {
        //Using the subclasses
        Cat cat1 = new Cat();
        cat1.greeting(); //From Cat class
        Dog dog1 = new Dog();
        dog1.greeting(); //From Dog class without any arguments

        BigDog bigDog1 = new BigDog();
        bigDog1.greeting(); //From BigDog class without any arguments

        //Using polymorphism
        Animal animal1 = new Cat();
        animal1.greeting(); //From Cat class

        Animal animal2 = new Dog();
        animal2.greeting(); //From Dog class without any arguments

        Animal animal3 = new BigDog();
        animal3.greeting(); //From BigDog class without any arguments

        //Err
        //Animal animal4 = new Animal(); // Cannot create an instance of Animal as it is an abstract class

        //Downcasting
        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3;
        //Cat cat2 = (Cat)animal2; Err downcasting is not possible as Dog is not a Cat

        dog2.greeting(dog3); //From Dog class with Dog argument
        dog3.greeting(dog2); //From Dog class with Dog argument

        dog2.greeting(bigDog2); //From Dog class with Dog argument

        bigDog2.greeting(dog2); //From BigDog class with Dog argument
        bigDog2.greeting(bigDog1); //From BigDog class with Cat argument


    }
}

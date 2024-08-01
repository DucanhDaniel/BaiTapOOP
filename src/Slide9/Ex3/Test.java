package Slide9.Ex3;

public class Test {
    public static void main(String[] args) {
        //Test GenericStack
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        intStack.push(40);
        intStack.push(50);

        //Test peek method:
        System.out.println("Peek: " + intStack.peek());

        //Test pop method:
        System.out.println("Pop: " + intStack.pop());
        System.out.println("Stack after pop: " + intStack);

        GenericStack<Character> charStack = new GenericStack<>();
        System.out.println(charStack.pop());
        // charStack.pop();

    }
}

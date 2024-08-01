package Slide9.Ex3;

public class StackOfIntegers {
    private int[] elements;
    private int size;
    private int capacity;

    public StackOfIntegers(){
        capacity = 1000;
        elements = new int[capacity];
    }
    public StackOfIntegers(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
    }
    public boolean isEmpty() {
        return (size == 0);
    }
    public boolean isFull() {
        return size == capacity;
    }
    public int peek() {
        if (isEmpty()) 
            throw new IllegalStateException("Stack is empty"); 
        else return elements[size - 1];
    }
    public void push(int value) {
        if (!isFull()) {
            elements[size] = value;
            size++;
        }
        else throw new IllegalStateException("Stack is full");
    }
    public int pop() {
        if (!isEmpty()) {
            size--;
            return elements[size];
        }
        else throw new IllegalStateException("Stack is empty");
    }
    public int getSize() {
        return size;
    }
}

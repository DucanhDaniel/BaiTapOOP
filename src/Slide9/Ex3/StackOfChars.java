package Slide9.Ex3;

public class StackOfChars {
    private char[] elements;
    private int size;
    private int capacity;

    public StackOfChars(){
        capacity = 1000;
        elements = new char[capacity];
    }
    public StackOfChars(int capacity) {
        this.capacity = capacity;
        elements = new char[capacity];
    }
    public boolean isEmpty() {
        return (size == 0);
    }
    public boolean isFull() {
        return size == capacity;
    }
    public char peek() {
        if (isEmpty()) 
            throw new IllegalStateException("Stack is empty"); 
        else return elements[size - 1];
    }
    public void push(char value) {
        if (!isFull()) {
            elements[size] = value;
            size++;
        }
        else throw new IllegalStateException("Stack is full");
    }
    public char pop() {
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
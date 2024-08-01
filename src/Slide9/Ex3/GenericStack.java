package Slide9.Ex3;

import java.util.ArrayList;

public class GenericStack<T> {
    private ArrayList<T> elements;
    private int size;
    private int capacity;

    public GenericStack(){
        capacity = 1000;
        elements = new ArrayList<>(capacity);
        size = 0;
    }
    public GenericStack(int capacity) {
        this.capacity = capacity;
        elements = new ArrayList<>(capacity);
    }
    public boolean isEmpty() {
        return (size == 0);
    }
    public boolean isFull() {
        return size == capacity;
    }
    public T peek() {
        if (isEmpty()) 
            throw new IllegalStateException("Stack is empty"); 
        else return elements.get(size - 1);
    }
    public void push(T value) {
        if (!isFull()) {
            elements.add(value);
            size++;
        }
        else throw new IllegalStateException("Stack is full");
    }
    public T pop() {
        if (!isEmpty()) {
            size--;
            T result = elements.remove(size);
            return result;
        }
        else throw new IllegalStateException("Stack is empty");
    }
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        String result;
        result = "Stack[";
        for (int i = 0; i < size; i++) {
            result = result + elements.get(i);
            if (i != size - 1)
                result = result + ", ";
        }
        result = result + "]";
        return result;
    }
}

package Slide9.GenericProgramming;

class GenericClass <T>{
    private T value;
    public GenericClass(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
}



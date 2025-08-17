package org.generics;

class BoxBound<T extends Number> {
    private T value;


    public BoxBound(T value) {
        this.value = value;
    }

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

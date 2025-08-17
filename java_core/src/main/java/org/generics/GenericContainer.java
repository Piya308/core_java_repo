package org.generics;

import lombok.ToString;

@ToString
public class GenericContainer<T> implements IContainer<T>{
    private T data;

    @Override
    public void add(T item) {
        data = item;
    }
    @Override
    public T get() {
        return data;
    }
}

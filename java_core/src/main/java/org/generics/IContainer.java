package org.generics;


public interface IContainer<T> {

    void add (T item);

    T get();
}

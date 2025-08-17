package org.generics;

import lombok.AllArgsConstructor;

 interface IPrintable {

    void print();
}

@AllArgsConstructor
 class MyNumber extends Number implements IPrintable {

    private final int value;

     @Override
     public int intValue() {
         return value;
     }

     @Override
     public long longValue() {
         return value;
     }

     @Override
     public float floatValue() {
         return value;
     }

     @Override
     public double doubleValue() {
         return value;
     }

     @Override
     public void print() {
         System.out.println(value);
     }
 }

class Boxx<T extends Number & IPrintable>{
    private T item;

    public Boxx(T item) {
        this.item = item;
    }
    public void display() {
        item.print();
    }
    public T getItem() {
        return item;
    }
}
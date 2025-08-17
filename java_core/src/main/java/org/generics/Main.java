package org.generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Box<Integer> box = new Box();
        box.setValue(3);
        System.out.println(box);

        //generics class can have more than one type parameter
        Pair<String , Integer> pair = new Pair<>("age", 24);
        System.out.println(pair);
        pair = new Pair("company", "abc");
        System.out.println(pair);

        Pair<Integer, Integer> pair1 = new Pair<>(1,1);
        System.out.println(pair1);

        //calling interface implemented class
        IContainer<Integer> iContainer = new GenericContainer();
        iContainer.add(3);
        System.out.println(iContainer);
        IContainer<String> iContainer2 = new GenericContainer();
        iContainer2.add("hello");
        System.out.println(iContainer2);

        //single bound call
//        BoxBound<Integer> intBox = new BoxBound<>();
//        BoxBound<Double> doubleBox = new BoxBound<>();

        //multiple bound call
        MyNumber myNumber = new MyNumber(39);
        //int below parameter i can pass a object of class which extends Number and inherits Printable class .
        //why? because i have written type safety check here class Boxx<T extends Number & IPrintable>{
        Boxx b = new Boxx(myNumber);
        b.display();

    }

    public void beforeGenerics(){
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(0, "");
        Integer i = (Integer) arrayList.get(0); //ClassCastException //runtime exception
    }
}

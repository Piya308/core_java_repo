package org.generics;

public class GenericConstructor {
    public static void main(String[] args) {
        Box2 box2 = new Box2(2);

    }

}
class Box2{
    public<T> Box2(T value){
        System.out.println("printing value in constructor"+ value.getClass().getName());
    }
}
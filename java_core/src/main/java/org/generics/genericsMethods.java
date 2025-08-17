package org.generics;

public class genericsMethods {

    public static void main(String[] args) {
        printArray(new Integer[]{42,5,7,3,8,32});
        printArray(new String[]{"hello", "india"});
        display(4);
        display("dd");
    }

    public static <T> void printArray(T[] parameter){
        for(T element : parameter){
            System.out.println(element);
        }
    }

    public static <T> void display(T element){
        System.out.println("Generic Display"+ element);
    }
    public static void display(Integer element){
        System.out.println("Integer Display"+ element);

    }
}

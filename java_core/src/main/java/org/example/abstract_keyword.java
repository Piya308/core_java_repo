package org.example;

public  class abstract_keyword {
    public void fun1(){}

    public static void main(String[] args) {
        language lang = new hindi();
        lang.fun1();
    }
}

abstract class language{
    public language() {
        //when its reference is created with subclass object
        //it is called
        System.out.println("hello from language class");
    }
    abstract void greetings();

    public void fun1(){
        System.out.println("from f1");
    }
}

 class hindi extends language{
     public hindi() {
         System.out.println("hello from hindi class");
     }

     @Override
     void greetings() {
         System.out.println("hindi language");
     }

     public void fun2(){
         System.out.println("from f2");
     }
 }

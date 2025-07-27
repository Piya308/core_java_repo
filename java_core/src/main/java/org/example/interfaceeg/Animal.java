package org.example.interfaceeg;

public interface Animal {
    int l = 0;
    void makesound();
    public abstract   void eat();
}

 class elephant implements Animal{

     @Override
     public void makesound() {
         System.out.println("elephant sound");
     }

     @Override
     public void eat() {
         System.out.println("elephant eat");
     }
 }

 class lion implements Animal {

     @Override
     public void makesound() {
         System.out.println("roar lion");
     }

     @Override
     public void eat() {
         System.out.println("lion eat flesh");
     }
 }

 class solution{
     public static void main(String[] args) {
         Animal a;
         a = new lion();
         a.eat();
         a.makesound();

         a = new elephant();
         a.eat();
         a.makesound();
     }
 }

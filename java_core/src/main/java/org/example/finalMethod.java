package org.example;

//final method
/*once a method is declared as final, it’s locked down from being modified in any subclass.
but can access method read only
 */
public class finalMethod {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.breathe(); //output: Animal Breathing
    }
}
class Animal {
    final void breathe() {
        System.out.println("Animal Breathing...");
    }
}

class Dog extends Animal {
    // This will cause a compile-time error!
    // void breathe() {
    // System.out.println("Dog breathing...");
    // }
}

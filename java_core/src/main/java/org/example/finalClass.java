package org.example;


//final class
/*A final class cannot be subclassed. That means no class can extend or inherit from it.
 a final class can absolutely extend a non-final class. The keyword final only prevents further inheritance, not upward inheritance.
*/
class finalClass{
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}

class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

final class Car extends Vehicle {
    // Still allowed!
    void drive() {
        System.out.println("Car is driving");
    }
}

//class SportsCar extends Car {} // Compile-time error! due to final

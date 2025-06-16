package org.example;

/*super() calls the superclass constructor, and it must be the first statement in a subclass constructor.

super.methodName() invokes a superclass method, even if it is overridden.

super.variableName accesses a superclass variable hidden by a subclass variable.

In multi-level inheritance, super() calls the immediate superclass constructor.

super() cannot be used in static methods, static blocks, or static contexts.

super can call overloaded methods from the superclass.

super() can invoke constructors of abstract classes, but abstract methods must be implemented.

Constructor execution follows the hierarchy from superclass to subclass in multi-level inheritance.*/

public class super_keyword {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}

class A {
    private int num1;

    public A() {
        System.out.println("Constructor A called");
    }

    public A(int age) {
        System.out.println("Parameterized Constructor A called" + age);
    }

    public void display() {
        System.out.println("display called from class A");
    }

    public void print() {
        System.out.println("print called from class A");
    }
}

class B extends A{
    public B() {
        super(5);
        System.out.println("Constructor B called");
    }
    public void show(){
       super.display();
        print();
    }
}

/*Output::Parameterized Constructor A called5
Constructor B called
display called from class A
print called from class A
* */
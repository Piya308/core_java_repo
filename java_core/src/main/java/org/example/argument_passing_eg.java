package org.example;

//Java only supports Call by value
//reasons why java doesnot support Call by reference
//1. Due to safety reason
//2.memory leaks, dangling pointers, and undefined behavior
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class argument_passing_eg {
    // This method modifies the internal state of the object, but can't change the reference
    public static void modifyPerson(Person p) {
        p.name = "Alice";  // Modifying the internal state (name)
        p = new Person("Bob", 30);  // Attempt to reassign the reference (won't affect the original object)
        p.display();
    }

    public static void main(String[] args) {
        Person p1 = new Person("John", 25);
        p1.display();  // Prints: Name: John, Age: 25

        modifyPerson(p1);  // Pass by value (reference copy)

        p1.display();  // Prints: Name: Alice, Age: 25 (name changed, but reference still points to the original object)
    }
}


/* todo -below is c++ code understand concept properly
#include <iostream>
using namespace std;

class Person {
public:
    string name;
    int age;

    Person(string name, int age) : name(name), age(age) {}

    void display() {
        cout << "Name: " << name << ", Age: " << age << endl;
    }
};

// This function modifies the object directly (by reference)
void modifyPerson(Person& p) {
    p.name = "Alice";  // Modifying the internal state (name)
    p = Person("Bob", 30);  // Reassigning the reference to a new object (affects the original reference)
}

int main() {
    Person p1("John", 25);
    p1.display();  // Prints: Name: John, Age: 25

    modifyPerson(p1);  // Pass by reference

    p1.display();  // Prints: Name: Bob, Age: 30 (object is modified because of pass by reference)
}
*/

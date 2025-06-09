package org.example.static_;
/*
#Instance variables  -->  are tied to objects and have separate copies for each object.
-When you create an object of the `demo` class, memory is allocated for the instance variables (`a` and `b`).
These instance variables are unique to each object, meaning that for every object you create, separate copies of `a` and `b` are created. For example, if you create 2 objects, you will have 4 copies of the instance variables (`a` and `b` for each object).*/
/*
#Static variables  -->  are shared across all objects and only have one copy, even if multiple objects are created.
-On the other hand, the static variable `x` is shared across all objects of the class. This means that whether you create one object or a hundred objects, there will be only one copy of the static variable `x`, which is associated with the class itself, not with any individual object.
The memory for `x` is allocated as soon as the class is loaded, regardless of whether any objects are created.*/


class demo {
    int a;  // instance variable
    int b;
    static int x;  // static variable
}

public class static_keyword {
    public static void main(String[] args) {
        demo d1 = new demo();
        demo d2 = new demo();
        demo d3 = new demo();
        d1.a =10;
        d2.a = 20;
        d3.a = 30;
        System.out.println("d1-"+d1.a + "\t d2-"+ d2.a + "\t d3-"+d3.a);
        d1.x =10;
        d2.x = 20;
        d3.x = 30;
        //even if we are write in above way in the end it is going to be accessed by class name internally
        // below is correcct way to assign static value accessing directly by class name
//        demo.x =10;
//        demo.x = 20;
//        demo.x = 30;
        System.out.println("d1-"+d1.a + "\t d2-"+ d2.a + "\t d3-"+d3.a);

    }
}


package org.example.static_;

import java.util.Map;

//static-methods ===> static methods can access only static members directly,
//if they want to use non-static members then need to create object and then access it.(not the problem for non-static methods)
//useful for creating utility, helper methods
public class static_method  {
    int a;
    static int b;

    static public void main(String[] args) {
        static_method staticMethod = new static_method(); // created obj to access non-static var
        staticMethod.a = 20;
        staticMethod.main();
        System.out.println("a-"+staticMethod.a+ "\t b-"+ b);
    }

    public void main(){
        a = 70; //able to access non-static variable easily
        b = 3;

    }
}

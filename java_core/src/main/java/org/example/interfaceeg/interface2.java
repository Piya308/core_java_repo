package org.example.interfaceeg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class interface2 {
    public static void main(String[] args) {
        C c = new C();
        c.fun1();
    }
}

interface A{
    public void fun1();
}

interface B extends A{
    public  void fun2();

    public static void s(){

    }
}

class C implements A{

    @Override
    public void fun1() {
        Collection a = new ArrayList<>();
        List b = new ArrayList<>();

        a.add("Apple");      // ✅ Allowed
        a.size();            // ✅ Allowed
        //a.get(0);            // ❌ Compile error — not in Collection

        b.add("Banana");     // ✅ Allowed
        b.size();
        b.get(0);            // ✅ Allowed — List supports indexing


        Iterable iterable = a;

        iterable.forEach(w-> System.out.println(w));
    }

}

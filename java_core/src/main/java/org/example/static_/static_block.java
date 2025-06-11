package org.example.static_;

/* static block ===>
is used to initialize static variables or perform static operations when the class is first loaded into memory.
 It runs only once when the class is loaded, even before the main method is called or any object is created.*/
public class static_block {

    public static void main(String[] args) {
        User u=new User();

        System.out.println("main function execcuted");

    }

    static{
        System.out.println("static block execcuted");
    }
    static{
        System.out.println("static block2 execcuted");
    }
}

class User{
    static {
        System.out.println("static block from User called");
    }

    User(){
        System.out.println("constructor from User called");

    }
}

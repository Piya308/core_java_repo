package org.example;

import java.awt.*;

public class Polymorphism {

    public static void main(String[] args) {
        shape s = new rectangle();
        s.show();
        s = new square();
        s.show();

    }
}


class shape{
    void show(){

    }
}

class rectangle extends shape{
        void show(){
            System.out.println("from rectangle class");
        }
}

class square extends shape{
    void show(){
        System.out.println("from square class");

    }
}




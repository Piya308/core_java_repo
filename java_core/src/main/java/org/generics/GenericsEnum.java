package org.generics;

public class GenericsEnum {
    public static void main(String[] args) {

        System.out.println(Operation.MULTIPLY.apply(1,2));
    }



}

enum Operation {
    ADD {
        public double apply(double x, double y) {
            return x + y;
        }
    },
    SUBTRACT {
        public double apply(double x, double y) {
            return x - y;
        }
    },
    MULTIPLY {
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE {
        public double apply(double x, double y) {
            return x / y;
        }
    };

    public  abstract <T extends Number>  double apply(double x, double y);
}






package org.example;

    //final keyword
/*once a variable is marked final, its value cannot be reassigned.
 - Instance Variables (Fields):
If a field is declared final, it must be initialized:
- Directly at the point of declaration, or
- Inside every constructor of the class.
*/
    public class finalVariable {
        public static void main(String[] args) {
            finalVariable a=new finalVariable();
            System.out.println(a.pi);
            finalVariable b = new finalVariable(6);
            System.out.println(b.pi);
        }
        private final int pi;
        public finalVariable() {
            pi = 3;
        }
        public finalVariable(int a){
            pi = 5;
        }
        void show(){
// pi = 4; //throw compilation error, you can not assign value in normal method to final variable
        }
    }

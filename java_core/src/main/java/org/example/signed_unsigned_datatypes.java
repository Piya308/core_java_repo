package org.example;

public class signed_unsigned_datatypes {
    /*Why char Can Be Promoted to int but Not to short or byte
char is a 16-bit unsigned type (range: 0 to 65,535)
byte is 8-bit signed (range: -128 to 127)
short is 16-bit signed (range: -32,768 to 32,767)
int is 32-bit signed (range: -2,147,483,648 to 2,147,483,647)
Because char is unsigned(can not stored negative value), its values can exceed the maximum of byte and short. So:
✅ char → int: Safe and implicit
❌ char → byte or short: Unsafe without casting, because you might lose data
     */

    public static void main(String[] args) {
         char c = 'A';       // Unicode value is 65
        int i = c;          //  promoted to int
        short s = (short) c; // normally won't work, Needs explicit cast
        byte b = (byte) c;   // normal won't work, Needs explicit cast
        s = b;
    }

}

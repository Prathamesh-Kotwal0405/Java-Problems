// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class NumberSwap {
    public static void main(String[] args) {
        int a=20;
        int b=10;
        b = a + b; // b=30
        a = b - a; // a = 20
        b = b - a; // b = 10
        System.out.println("Swapping a with b gives a = "+ a + " b = "+ b);
    }
}

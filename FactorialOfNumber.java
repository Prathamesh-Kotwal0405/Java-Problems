// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.stream.*;
class FactorialOfNumber {
    public static void main(String[] args) {
        //factorial of a number
        int num=5;
        int fact=1;
        while(num!=0){
            fact = fact * num;
            num--;
        }
        System.out.println(fact);
        
    }
}

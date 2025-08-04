// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.stream.*;
class StringReverseWithOutSB {
    public static void main(String[] args) {
        //Reverse a string without stringbuffer
        String numValue = "abcd";
        char[] charA = numValue.toCharArray();
        String reversed = "";
        for(int i=charA.length-1;i>=0;i--){
            reversed+=charA[i];
        }
        System.out.println(reversed);
    }
}

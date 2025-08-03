// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class CheckVowel {
    public static void main(String[] args) {
        //Check if vowel present in a String
        String name = "Prathamesh Kotwal";
        boolean hasWovel = name.matches(".*[aeiouAEIOU]*.");
        if(hasWovel){
            System.out.println("The given string has wovel");
        }else{
            System.out.println("The given string doesnot have wovel");
        }
        
    }
}

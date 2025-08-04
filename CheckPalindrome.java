// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.stream.*;
class checkPalindrome {
    public static void main(String[] args) {
        //check if a string is palindrome
        String s1 = "dad";
        String s2 = "";
        char[] s1Array = s1.toCharArray();
        for(int i=s1.length()-1;i>=0;i--){
            s2+=s1Array[i];
        }
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Strings are palindrome");
        }else{
            System.out.println("Strings are not palindrome");
        }
        
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.stream.*;
class CheckNumeric {
    public static void main(String[] args) {
        //Check if a string contains only numeric values.
        String numValue = "abcd";
        boolean isNumeric = numValue.matches(".*\\d.*");
        if(isNumeric){
            System.out.println("The given string is numeric");
        }else{
            System.out.println("Non numeric");
        }
    }
}

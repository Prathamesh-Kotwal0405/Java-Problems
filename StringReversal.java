// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class StringReversal {
    public static void main(String[] args) {
        String name = "Prathamesh Kotwal";
        StringBuilder reversedString = new StringBuilder();
        for(int i=name.length()-1;i>=0;i--){
            reversedString.append(name.charAt(i));
        }
        System.out.println(reversedString.toString());
        
    }
}

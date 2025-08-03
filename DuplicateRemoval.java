// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class DuplicateRemoval {
    public static void main(String[] args) {
        String name = "Prathamesh Kotwal";
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];
        for(char c : name.toCharArray()){
            if(!seen[c]){
                seen[c]=true;
                result.append(c);
            }
        }
        System.out.println("After removing duplicates"+result.toString());
        
    }
}

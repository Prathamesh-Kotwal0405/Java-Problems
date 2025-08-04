// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.stream.*;
class PrintDuplicates {
    public static void main(String[] args) {
        //print duplicate elements in an array in Java.
        int[] arr = {1,2,3,2,4};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for(int num: arr){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }
        System.out.println(duplicates.toString());
    }
}

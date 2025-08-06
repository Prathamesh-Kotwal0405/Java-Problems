// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.stream.*;
class ListToUpperCase {
    public static void main(String[] args) {
        // Convert List<String> to UpperCase
        List<String> myList = Arrays.asList("one","Two","Three");
        System.out.println(myList.stream().map(String::toUpperCase).collect(Collectors.toList()));
    }
}

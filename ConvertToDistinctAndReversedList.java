// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.stream.*;
class ConvertToDistinctAndReversedList {
    public static void main(String[] args) {
        //inputArrayList= [1,3,2,4,3,1,2]
        //outputArrayList = [4,3,2,1]
        
        List<Integer> inputList = Arrays.asList(1,3,2,4,3,1,2);
        List<Integer> outputList = inputList.stream()
                                .distinct()
                                .sorted(Comparator.reverseOrder())
                                .collect(Collectors.toList());
                                System.out.println(outputList.toString());
    }
}

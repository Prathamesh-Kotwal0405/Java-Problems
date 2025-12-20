// Write a code to merge two arrays in one using java 8 features.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoArrayInOne {
    public static void main(String[] args) {
        //Using arrays
        Integer firstArr[]  = {1,2,3,4,5};
        Integer secArr[] = {6,7,8,9};
        Integer opArray[] = Stream.concat(Arrays.stream(firstArr), Arrays.stream(secArr)).toArray(Integer[]::new); 
        System.out.println(Arrays.toString(opArray));

        //Using list this uses proper java 8 approach
        List<Integer> arr1 = Arrays.asList(1,2,3,4,5);
        List<Integer> arr2 = Arrays.asList(6,7,8,9);
        List<Integer> outputArr = Stream.concat(arr1.stream(),arr2.stream()).collect(Collectors.toList());
        System.out.println(outputArr);
    }
}

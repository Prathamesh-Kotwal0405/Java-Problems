// Find the duplicate elements from a List using java 8 features

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateInList {

    public static void main(String[] args) {
        List<Integer> number = List.of(1,2,3,4,5,6,2,4,9);
        //using java 8 feature
        // Map<Integer,Long> collect = number.stream()
        //                             .collect(Collectors.groupingBy(n-> n, Collectors.counting()));
        // System.out.println(collect);

        Set<Integer> result = number.stream().collect(Collectors.groupingBy(n-> n, Collectors.counting())).entrySet().stream()
            .filter(e->e.getValue()>1).map(n->n.getKey()).collect(Collectors.toSet());
        System.out.println(result);
    }
    
}

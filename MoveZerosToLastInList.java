import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveZerosToLastInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,0,-3,0,5,-2,0,8,0,-4);
        List<Integer> collect = Stream.concat(list.stream().filter(n->n!=0), list.stream().filter(n->n==0)).collect(Collectors.toList());
        System.out.println(collect);
    }

    //space complexity is O(n)
}

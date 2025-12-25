import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapUsageExample {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("Apple");
        arr1.add("Banana");
        arr1.add("Chiku");
        arr1.add("Orange");
        arr1.add("Pineapple");
        System.out.println("List elements are " + arr1.toString());

        List<Integer> list = arr1.stream().map(s -> s.length()).collect(Collectors.toList());
        System.out.println("Mapped size of these elements are "+list.toString());
    }
}

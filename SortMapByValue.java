import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValue {
    public static void main(String[] args) {
        Map<String,Integer> inputMap = new HashMap<>();
        inputMap.put("A",20);
        inputMap.put("B",50);
        inputMap.put("P",30);
        inputMap.put("D",10);
        inputMap.put("S",90);
        inputMap.put("F",70);

        LinkedHashMap<String,Integer> sortedMap = inputMap.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
        System.out.println(sortedMap);
    }
}

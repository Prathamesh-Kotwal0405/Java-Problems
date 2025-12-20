//Find first repeated character using Java 8 features
// input: String s = " Java stream API is very good concept"

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFirstRepeatedCharacters {
    public static void main(String[] args) {
        String s = "Java stream API is very good concept";
        Character key = s.chars().mapToObj(ch -> (char)ch)
            .filter(ch->ch!=' ')
            .collect(Collectors.groupingBy(ch->ch, Collectors.counting()))
            .entrySet().stream().filter(entry->entry.getValue()>1).findFirst().get().getKey();
        System.out.println(key);
        
    }
}

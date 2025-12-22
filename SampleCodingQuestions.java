import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SampleCodingQuestions {
    public static void main(String[] args) {
         // Input a = "babac" --> Output a = "b2a2c1"
         String a = "babac";
         Map<Character,Long> frqOfEachChar = a.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c -> c, LinkedHashMap:: new ,Collectors.counting()));
         System.out.println(frqOfEachChar);
         String op = frqOfEachChar.entrySet().stream().map(entry -> entry.getKey()+ "" + entry.getValue()).collect(Collectors.joining());
         System.out.println(op);
    }
    
}

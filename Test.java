import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.printFrequencyOfEachChar("Prathamesh");
    }

    public void printFrequencyOfEachChar(String str){
        // Map<Character, Integer> freqMap = 
        System.out.println(str.chars().mapToObj(c -> (char) c)
                                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())
                                    ));
                                                       
        
    }
}

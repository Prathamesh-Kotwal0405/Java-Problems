// We have one string sentence with multiple words that finds the word which starts with 'b'
// Input : "apple banana mango box been fox auto bike"
// Output : [banana, box, been, bike]

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheWordsInSentenceWhichStartsWithChar {
    public static void main(String[] args) {
        String input = "apple banana mango box been fox auto bike";
        char ch = 'b';
        List<String> words = Arrays.stream(input.split(" "))
            .filter(word -> word.startsWith(String.valueOf(ch)))
            .collect(Collectors.toList());
        System.out.println(words);
    }
}

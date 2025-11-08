/*Find the element that appears once when every other element appears twice
Example: [2, 3, 5, 4, 5, 3, 4] → 2
Hint: Use XOR — all duplicates cancel out (x ^ x = 0, x ^ 0 = x).
 */

import java.util.Arrays;
import java.util.List;

public class ProblemOne {
    public static void main(String[] args) {
        // Example input where every other element appears exactly twice
        List<Integer> list1 = Arrays.asList(2,3,5,4,5,3,4);

        // 1) XOR approach — when every other element appears exactly twice
        //    This cancels out duplicate pairs because x ^ x = 0 and x ^ 0 = x.
        int xor = 0;
        for (int v : list1) {
            xor ^= v;
        }
        System.out.println("Unique element (XOR method): " + xor);
        

    }
    
}

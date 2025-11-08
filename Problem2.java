/*Find the two elements that appear once when every other appears twice
Example: [2, 4, 7, 9, 2, 4] → 7, 9
Hint: XOR all → result = xor = 7 ^ 9, find rightmost set bit, divide into two groups and XOR separately.

 */

import java.util.Arrays;
import java.util.List;

public class Problem2 {
    
    public static void main(String[] args) {

        // Example input where every other element appears exactly twice
        List<Integer> list1 = Arrays.asList(2, 4, 7, 9, 2, 4);
        // 2) XOR approach — when every other element appears exactly twice
        //    This cancels out duplicate pairs because x ^ x = 0 and x ^ 0 = x.
        int xor = 0;
        for (int v : list1) {
            xor ^= v;
        }

        // Find rightmost set bit in xor (this bit is different between the two unique numbers)
        int rightmostSetBit = xor & -xor;

        int num1 = 0;
        int num2 = 0;

        // Divide elements into two groups based on the rightmost set bit and XOR separately
        for (int v : list1) {
            if ((v & rightmostSetBit) != 0) {
                num1 ^= v; // Group with the set bit
            } else {
                num2 ^= v; // Group without the set bit
            }
        }

        System.out.println("Unique elements are: " + num1 + " and " + num2);
    }
}

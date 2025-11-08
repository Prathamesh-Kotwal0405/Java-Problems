/*
 * 
1) Product of Array Except Self

Example: [1,2,3,4] → [24,12,8,6]

 */

public class D4PB1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int n = nums.length;
        int[] output = new int[n];

        // Initialize the output array with 1s for multiplication
        for (int i = 0; i < n; i++) {
            output[i] = 1;
        }

        // Calculate left products
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            output[i] *= leftProduct;
            leftProduct *= nums[i];
        }

        // Calculate right products
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        // Print the result
        System.out.print("Output array: [");
        for (int i = 0; i < n; i++) {
            System.out.print(output[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
}

import java.util.HashSet;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] nums = {2,5,6,7,3,1,9,0,5,3,2};
        System.out.print("Duplicate elements: ");
        HashSet<Integer> duplicates = new HashSet<>();
        for(int i : nums){
            if(!duplicates.add(i)){
                System.out.print(i + " ");
            }
        }
    }
}

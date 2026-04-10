//	b. Write a java code to get those two elements in the arr = {1,2,4,7,8,9} such that there sum equals to target = 6.


public class DeloitteInterviewQ2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,8,9};
        int target = 6;
        int left = 0;
        int right = arr.length-1;

        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum==target){
                System.out.println("Pairs are : " + arr[left] + " ," + arr[right]);
                return;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }

        System.out.println("No pair found");
    }
}

//Find sum of first n numbers
public class SumOfFirstNnumbers {
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        for(int i =1;i<n+1;i++){
            sum+=i;
        }
        System.out.println("Sum of first n numbers is: "+sum);
    }
}

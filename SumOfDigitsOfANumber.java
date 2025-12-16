//Find the sum of the digits of a number
public class SumOfDigitsOfANumber {
    public static void main(String[] args) {
        int n = 9576;
        int sum=0;
        while(n>0){
            int d = n % 10;
            sum+=d;
            n = n / 10;
        }
        System.out.println("Sum of the digits of given number is : "+sum);
    }
}

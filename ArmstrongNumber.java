// Check if the given number is Armstrong number

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int m = n;
        int sum = 0;
        while(n>0){
            int r = n%10;
            System.out.println(r);
            sum+= (r*r*r);
            System.out.println(sum);
            n = n / 10;
        }
        if(sum==m){
            System.out.println("The given number is armstrong number");
        }else{
            System.out.println("The given number is not armstrong number");
        }
    }
}

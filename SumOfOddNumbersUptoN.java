//Sum of odd numbers between 1 -100

import java.util.Scanner;

public class SumOfOddNumbersUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which you want to sum odd numbers:");
        int n = sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println("Sum of odd numbers upto "+n+" is: "+sum);
    }
    
}

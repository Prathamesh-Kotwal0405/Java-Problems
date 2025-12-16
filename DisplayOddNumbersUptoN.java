//Display odd numbers between 1 -100

import java.util.Scanner;

public class DisplayOddNumbersUptoN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number upto which you want to display odd numbers:");
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            if(i%2!=0)
            System.out.println(i);
        }
        
    }
}

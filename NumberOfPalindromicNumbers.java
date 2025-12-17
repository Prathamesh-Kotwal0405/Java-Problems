//Program to print palindrome number upto N numbers

import java.util.ArrayList;
import java.util.List;

public class NumberOfPalindromicNumbers {
    public static void main(String[] args) {
        List<Integer> listOfPalindromes = new ArrayList<>();
        int n = 100;
        for(int i=1;i<=n;i++){
            if(isPalindromic(i)){
                listOfPalindromes.add(i);
            }
        }
        System.out.println("Following is the list of palindromic numbers : "+ listOfPalindromes);
    }

    public static boolean isPalindromic(int i){
        String reversedFormOfNumber = "";
        int intermediate = 0;
        int a = i;
        while(a>0){
            intermediate = a%10;
            reversedFormOfNumber = reversedFormOfNumber+String.valueOf(intermediate);
            a = a / 10;
        }
        if(reversedFormOfNumber.equals(String.valueOf(i))){
            return true;
        }
        else{
            return false;
        }
    }
}

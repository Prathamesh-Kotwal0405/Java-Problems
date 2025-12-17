public class CheckPalindromeNumber {
    public static void main(String[] args) {
        int n = 010;
        if (isPalindromic(n)) {
            System.out.println("The given number is a palindromic number.");
        }else{
            System.out.println("The given number is not a palindromic number.");
        }
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

//Program to print Armstrong number between 1 to 1000
public class CheckAllArmStrongNumbersTill100 {
    public static void main(String[] args) {
        for(int i=1;i<1000;i++){
            if(isArmstrongNumber(i)){
                System.out.println("The Armstrong number is: "+ i);
            }
        }
    }

    public static boolean isArmstrongNumber(int n){
    int m = n;
        int sum = 0;
        while(n>0){
            int r = n%10;
            sum+= (r*r*r);
            n = n / 10;
        }
        if(sum==m){
            return true;
        }else{
            return false;
        }
}
}


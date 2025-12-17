// Print given number in words
public class PrintGivenNumberInWords {
    public void pw(int n, String ch){
        String one[] =  {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
        "Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};

        String tens[] = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

        if(n>19){
            System.out.println(tens[n/10] + "" + one[n%10]);
        }
        else{
            System.out.println(one[n]);
        }
        if(n>0)
            System.out.println(ch);
    }

    public static void main(String[] args) {
        int n=28000;
        System.out.println(n);
        if(n<=0){
            System.err.println("Enter numbers greater than 0");
        }
        else{
            PrintGivenNumberInWords pn = new PrintGivenNumberInWords();
            pn.pw((n/1000000000), "Hundred");
            pn.pw((n/10000000)%100, "crore");
            pn.pw(((n/100000)%100), "lakh");
            pn.pw(((n/1000)%100), "thousand");
            pn.pw(((n/100)%10), "hundred");
            pn.pw((n%100), "");
        }
    }
}

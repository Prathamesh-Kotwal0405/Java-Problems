// Create one function which takes input as 7 and return 11 and if given input as 11 it will return 7 without using conditional statement if else
public class TheSevenElevenQuestion {
    public static void main(String[] args) {
        System.out.println(testData(7));
        System.out.println(testData(11));
    }

    public static int testData(int num){
        return 7+11-num;
    }
}

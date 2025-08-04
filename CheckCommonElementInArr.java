// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.stream.*;
class CheckCommonElementInArr {
    public static void main(String[] args) {
        //check common element between two arrays
        int[] a1 = {1,4,5,6,7};
        int[] a2 = {1,2,3,4};
        List<Integer> commonList = new ArrayList<>();
        for(int i=0;i<a1.length;i++){
            for(int j=0;j<a2.length;j++){
                if(a1[i]==a2[j]){
                    commonList.add(a1[i]);
                }
            }
        }
        System.out.println(commonList.toString());
        
    }
}

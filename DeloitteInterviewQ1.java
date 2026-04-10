
// /Write a java code to find the first unique element in the string str = "abcabfcg".

import java.util.LinkedHashMap;
import java.util.Map;

public class DeloitteInterviewQ1{
    public static void main(String[] args) {
        String str = "abcabfcg";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println("First unique character : " + entry.getKey());
                return;
            }
        }
        System.out.println("No unique character found.");
    }
}
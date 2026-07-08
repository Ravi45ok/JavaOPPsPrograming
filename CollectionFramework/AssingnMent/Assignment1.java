//!Write a program to find the frequency of each character in a string using a Map. Input: "programming" Output: {p=1, r=2, o=1, g=2, a=1, m=2, i=1, n=1}
import java.util.*;
public class Assignment1 {
    public static void main(String[] args) {
        String str= "programming";
        Map<Character, Integer> map= new LinkedHashMap<>();
        for(int i=0; i<str.length(); i++){
            Character key=str.charAt(i);
            if(map.get(key)==null){
                map.put(key, 1);
            }else{
                map.put(key, map.get(key)+1);
            }
        }
        System.out.println(map);
        
    }
}

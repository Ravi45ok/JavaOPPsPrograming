// !Write a program to find the first non-repeating character in a string using LinkedHashMap. Input: "aabbcdeff" Output: c
import java.util.*;
public class Assignment2 {
    public static void main(String[] args) {
         String str= "aabbcdeff";
        Map<Character, Integer> map= new LinkedHashMap<>();
        for(int i=0; i<str.length(); i++){
            Character key=str.charAt(i);
            if(map.get(key)==null){
                map.put(key, 1);
            }else{
                map.put(key, map.get(key)+1);
            }
        }
        Character c=null;
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                c= entry.getKey();
                break;
            }
        }
        System.out.println(c);
    }
}

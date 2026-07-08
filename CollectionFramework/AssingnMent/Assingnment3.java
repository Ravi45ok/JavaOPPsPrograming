// !Write a program to group students by their marks using Map. 
import java.util.*;
public class Assingnment3 {
    public static void main(String[] args) {
        Map<String, Integer> Inputmap= new LinkedHashMap<>();
        Inputmap.put("Ravi", 85);
        Inputmap.put("Amit", 92);
        Inputmap.put("Suresh", 85);
        Inputmap.put("kumar", 92);
        Inputmap.put("John", 78);
        Map<Integer,List<String>> outputMap=new LinkedHashMap<>();
        for(Map.Entry<String,Integer> entry : Inputmap.entrySet()){
             Integer key= entry.getValue();
             if(outputMap.containsKey(key)){
                List<String> list = outputMap.get(key);
                list.add(entry.getKey());
                outputMap.put(key, list);
             }else{
                List<String> list=new ArrayList<>();
                list.add(entry.getKey());
                outputMap.put(key, list);
             }
        }
        System.out.println(outputMap);
    }
}

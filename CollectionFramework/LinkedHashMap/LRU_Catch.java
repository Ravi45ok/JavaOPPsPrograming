import java.util.*;
public class LRU_Catch extends LinkedHashMap<String, Integer> {
    LRU_Catch(){
        super(16,0.75f,true);
    }
    @Override
     protected  boolean removeEldestEntry(Map.Entry<String, Integer> OldestElement){
           return size()>3;
    }

    public static void main(String[] args) {
        LRU_Catch lc= new LRU_Catch();
        lc.put("A", 1);
        lc.put("B", 2);
        lc.put("C",3);
        System.out.println(lc);
        lc.put("D", 4);
        System.out.println(lc);
        lc.get("B");
        lc.put("F", 5);
        System.out.println(lc);
    }
}

import java.security.Key;
import java.util.*;

public class Methods {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // !1. V put(k,v) put key and value into map if key don't exist and retuen null or update the value if key exist and return old value
        map.put("A", 1);
        map.put("B", 2);
        System.out.println(map.put("C", 3));// *null because key does not exist privisloy so old value is there
        map.put("D", 4);
        map.put("R", 26);
        System.out.println(map);
        System.out.println(map.put("B", 3));// * 2 because the old value for key "B" was 2 and 2 will be replaced with
                                            // 3*/
        System.out.println(map);
        // !2. V get(Object key) Get value — null if not found
        Integer k1 = map.get("B");
        System.out.println(k1);
        Integer k2 = map.get("F");
        System.out.println(k2);
        // !3. V remove(Object k) Remove — returns removed value or null
        map.remove("R");
        map.remove("G");
        System.out.println(map);
        // ! 4 .void clear()-> to clear the map
        // ! 5. boolean isEmpty() to check wheather map is empty or not
        // ! 6. int size()->total no of Entry/node/key in map
        System.out.println(map.size());
        // ! 7. void putAll(map) Copy all entries
        HashMap<String, Integer> map1= new HashMap<>();
        map1.put("E", 10);
        map1.put("H", 20);
        map1.put("A", 9);
        map1.put("T", 28);
          
        map.putAll(map1);
        System.out.println(map);// *old values will be udated and new key will be added


        // ! 8. Set<k> keySet()  All keys — live view
        Set<String> set= map.keySet();
        System.out.println(set);
        //*set.add("N"); can not do that because set key without value will is not possible UnsupportedOperationException
        for(String ele : set){
            System.out.print(ele+" ");
        }
        System.out.println();
        // ! 9. Collection<v> values() All values- live view
        Collection<Integer> c= map.values();
        System.out.println(c);
       //* c.add(50) it is a live view of map addtion of value without key is not possible UnsupportedOperationException
       for(Integer ele: c){
        System.out.print(ele+" ");
       }
       System.out.println();
      
       // ! 10. Set<Map.Entry(k,v)> entrySet()  it returns set of all the nodes
       Set<Map.Entry<String,Integer>> EntrySet= map.entrySet();
        
       for(Map.Entry<String, Integer> entry : EntrySet){
         String key=   entry.getKey(); // getKey() method returns the key of node
         Integer value= entry.getValue();// getValue() will return the value for iterating key
         if(key == "D"){
            entry.setValue(100);// it will change the value for iterating key and returns the old value
         }
         System.out.println("Key : "+ key+ " Value : "+ value);
       }
       System.out.println(map);
    }
    
}

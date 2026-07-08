import java.util.*;

public class methods {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        // ! put(K,V)
        map.put("Apple", 5);
        map.put("Banana", 3);
        map.put("Orange", 7);
        map.put("Mango", 2);
        map.put("Grapes", 8);
        System.out.println(map);
        map.put("Banana", 4);
        System.out.println(map);
        // ! get(Object o)
        System.out.println(map.get("Banana"));
        // ! remvoe(Objcet O)
        System.out.println(map.remove("Mango"));
        System.out.println(map.remove("guavava"));
        System.out.println(map);
        // ! void putAll(map)
        map.putAll(map);
        System.out.println(map);
        // ! keySet()
        Set<String> set = map.keySet();
        System.out.println(set);// *it will maintain the ordere in becase it is giving the view of LinkedHashMap
                                // */
        for (String ele : set) {
            System.out.print(ele + " ");
        }
        System.out.println();
        // ! values()
        Collection<Integer> set1 = map.values();
        System.out.println(set1);
        for (Integer ele : map.values()) {
            System.out.print(ele + " ");
        }
        System.out.println();
        // ! entrySet()
        Set<Map.Entry<String, Integer>> EntrySet = map.entrySet();
        System.out.println(EntrySet);
        for (Map.Entry<String, Integer> entry : EntrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            
        }
        

    }
}

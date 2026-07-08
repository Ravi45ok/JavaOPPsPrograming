// !Write a program to sort a Map by value (ascending) using TreeMap or Collections.sort(). Input: {Ravi=85, Amit=92, Suresh=78} Output: {Suresh=78, Ravi=85, Amit=92}

import java.util.*;

public class Assignment8 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ravi",   85);
        map.put("Amit",   92);
        map.put("Suresh", 78);

        // Step 1 — get entries as list
        List<Map.Entry<String, Integer>> entryList =
            new ArrayList<>(map.entrySet());

        // Step 2 — sort by value ascending
        Collections.sort(entryList,
            new Comparator<Map.Entry<String, Integer>>() {
                public int compare(Map.Entry<String, Integer> e1,
                                   Map.Entry<String, Integer> e2) {
                    return e1.getValue() - e2.getValue();
                    // ascending — smaller value first
                }
            }
        );

        // Step 3 — put into LinkedHashMap — preserves sorted order
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> entry : entryList){
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println(sortedMap);
        // {Suresh=78, Ravi=85, Amit=92} ✅
    }
}
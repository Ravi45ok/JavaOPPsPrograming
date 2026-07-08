import java.util.*;

public class Constructors {

    public static void main(String[] args) {

        //! 1. Default constructor
        LinkedHashMap<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        System.out.println("Default constructor: " + map1);


        //!2. Constructor with initial capacity
        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>(10);
        map2.put("A", 1);
        map2.put("B", 2);
        System.out.println("Capacity constructor: " + map2);


        //! 3. Constructor with capacity + load factor
        LinkedHashMap<String, Integer> map3 = new LinkedHashMap<>(10, 0.75f);
        map3.put("A", 1);
        map3.put("B", 2);
        System.out.println("Capacity + LoadFactor: " + map3);


        //! 4. Constructor with capacity + load factor + access order
        LinkedHashMap<String, Integer> map4 = new LinkedHashMap<>(10, 0.75f, true);
        map4.put("A", 1);
        map4.put("B", 2);
        map4.put("C", 3);

        // Access A → will move to end
        map4.get("A");

        System.out.println("Access order constructor: " + map4);


        //! 5. Copy constructor
        Map<String, Integer> tempMap = new HashMap<>();
        tempMap.put("X", 100);
        tempMap.put("Y", 200);

        LinkedHashMap<String, Integer> map5 = new LinkedHashMap<>(tempMap);
        System.out.println("Copy constructor: " + map5);
    }
}

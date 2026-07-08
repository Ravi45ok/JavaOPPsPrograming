import java.util.HashMap;
import java.util.Map;

public class Constructors {
    public static void main(String[] args) {
        // ! Static function Map.of()
        Map<String,Integer> map0= Map.of("Rohit",20, "Aman", 30, "Ram",44);
        System.out.println(map0);
        // ! Constructors->
        // *Constructor 1 — Default */
        HashMap<String, Integer> map = new HashMap<>();
        // capacity = 16
        // loadFactor = 0.75
        // threshold = 12//* number of nodes before resizing and rehasing */
        // table = null (lazy — allocated on first put)
        // *Constructor 2 — With Initial Capacity
        HashMap<String, Integer> map1 = new HashMap<>(32);
        // capacity = 32 (next power of 2 if not already)
        // loadFactor = 0.75 (default)
        // threshold = 32 × 0.75 = 24
        // *Constructor 3 — With Capacity And Load Factor
        HashMap<String, Integer> map2 = new HashMap<>(32, 0.5f);
        // capacity = 32
        // loadFactor = 0.5
        // threshold = 32 × 0.5 = 16
        // *Constructor 4 — From Existing Map
        Map<String, Integer> existing = new HashMap<>();
        existing.put("A", 1);

        HashMap<String, Integer> map3 = new HashMap<>(existing);
        // copies all entries from existing map
        // capacity = enough to hold all entries without resize
        // loadFactor = 0.75


     //* map allows hetorgenous data structors */
         Object a= 10;
       Object b= "10";
       System.out.println(a.equals(b));
    }
}

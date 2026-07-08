import java.util.TreeMap;

public class Constructors {
    public static void main(String[] args) {
        // Constructor 1 — default, natural ordering via Comparable
        TreeMap<Integer, Integer> map = new TreeMap<>();

        // Constructor 2 — with Comparator
        TreeMap<Integer, Integer> map1 = new TreeMap<>(new MyComparator());

        // Constructor 3 — from existing Map — natural ordering
        TreeMap<Integer, Integer> map2 = new TreeMap<>(map);

        // Constructor 4 — from existing SortedMap — preserves ordering
        TreeMap<Integer, Integer> map3 = new TreeMap<>(map1);
      
    }
}

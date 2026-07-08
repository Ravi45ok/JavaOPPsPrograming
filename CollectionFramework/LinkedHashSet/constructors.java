import java.util.Arrays;
import java.util.LinkedHashSet;

public class constructors {
    public static void main(String[] args) {
        // !Constructor 1 — default
        // capacity 16, loadFactor 0.75
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // !Constructor 2 — with initial capacity
        LinkedHashSet<String> set1 = new LinkedHashSet<>(50);

        // !Constructor 3 — with capacity and load factor
        LinkedHashSet<String> set2 = new LinkedHashSet<>(50, 0.5f);

        // !Constructor 4 — from existing collection
        LinkedHashSet<String> set3 = new LinkedHashSet<>(set1);
        // ! methods
         // *does not add any extra method on top of collection or set
         set.add(10);
         set.add(56);
         set.add(45);
         set.add(5);
         set.add(6);
         System.out.println(set);
         boolean output =set.addAll(Arrays.asList(5,6,30, 56, 90));
         System.out.println(set +" "+ output );
         output= set.addAll(Arrays.asList(10,45,56,6,5,30,90));
         System.out.println(set+" "+ output);
    }
}

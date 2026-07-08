import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class constructors {
    // ! Set have a static method called Set.of() which return immutable Set Set.of()
    public static void main(String[] args) {
        // !Constructor 1 — default
        // creates backing HashMap with capacity 16, loadFactor 0.75
        HashSet<Integer> set = new HashSet<>(Set.of(34,65,90,100,56,99));

        // !Constructor 2 — with initial capacity
        HashSet<String> set1 = new HashSet<>(50);

        // !Constructor 3 — with capacity and load factor
        HashSet<String> set2 = new HashSet<>(50, 0.5f);
        //*load factor->Load factor is a threshold that decides when to resize the internal HashMap array. */

        // Constructor 4 — from existing collection
        HashSet<String> set3 = new HashSet<>(set1);
        // ! methods
        set.add(10);
        set.add(20);
        set.add(10);
        set.add(45);
        set.add(60);
        set.add(90);
        set.add(90);
        System.out.println(set);
        set.addAll(Arrays.asList(100, 100,45));
        System.out.println(set);
        set.remove(10);
        System.out.println(set);
        set.removeAll(Arrays.asList(10, 20));
        System.out.println(set);
        set.retainAll(Arrays.asList(90, 45, 50,89));
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set);
    }
}

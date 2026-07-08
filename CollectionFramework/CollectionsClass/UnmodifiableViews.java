import java.util.*;

public class UnmodifiableViews {
    public static void main(String[] args) {
        // !Collection<T> unmodifiableCollection(Collection<? extends T> c)
        // !List<T> unmodifiableList(List<? extends T> list)
        // ! Set<T> unmodifiableSet(Set<? extends T> s)
        // ! SortedSet<T> unmodifiableSortedSet(SortedSet<T> s)
        // !Map<K,V> unmodifiableMap(Map<? extends K,? extends V> m)
        // !SortedMap<K,V> unmodifiableSortedMap(SortedMap<K,? extends V> m)

        // returns VIEW — NOT a copy
        // any modification attempt → UnsupportedOperationException
        // but original collection can still be modified

        // Example-1
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        List<String> unmod = Collections.unmodifiableList(list);

        unmod.get(0); // ✅ reading allowed
       //* unmod.add("D"); // 💥 UnsupportedOperationException
        // *unmod.remove(0); // 💥 UnsupportedOperationException

        list.add("D"); // ✅ original still modifiable
        System.out.println(unmod); // [A, B, C, D] — view reflects change
        // Example-2
        Map<String, Integer> map= new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        Map<String, Integer> unmodMap=Collections.unmodifiableMap(map);
        System.out.println(unmodMap);
        //*unmodMap.put("C", 3);
        map.put("C", 3);
        System.out.println(unmodMap);
    }
}

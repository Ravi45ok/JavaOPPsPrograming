import java.util.*;

public class Methods {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        // ! 1.form Map
        // ! V put(K key, V value)
        // inserts in sorted position
        // returns OLD value if key existed, null if new key
        map.put(1, 100);
        map.put(0, 50);
        map.put(-1, 30);
        map.put(4, 45);
        map.put(5, 100);
        System.out.println(map);

        // !V get(Object key)
        // returns value for key — O(log n) tree walk
        // returns null if not found
        System.out.println(map.get(4));

        // !V remove(Object key)
        // removes entry — O(log n)
        // returns removed value, null if not found
        System.out.println(map.remove(1));
        System.out.println(map);

        // !boolean containsKey(Object key)
        // O(log n) tree walk
        // returns true if key exists
        System.out.println(map.containsKey(-1));
        // !boolean containsValue(Object value)
        // O(n) — must scan entire tree
        // returns true if value exists
        System.out.println(map.containsValue(100));

        // !int size() // number of entries
        System.out.println(map.size());
        // !boolean isEmpty() // true if no entries
        System.out.println(map.isEmpty());
        // !void clear() // remove all entries
        // !void putAll(Map m) // copy all entries
        MyComparator obj = new MyComparator();
        TreeMap<Integer, Integer> map1 = new TreeMap<>(obj);
        map1.put(7, 40);
        map1.put(3, 50);
        map1.put(4, 55);
        map1.put(-2, 79);
        System.out.println(map1);
        map.putAll(map1);
        System.out.println(map);
        // !keySet()
        Set<Integer> set = map.keySet();
        System.out.println(set);
        for (Integer ele : map.keySet()) {
            System.out.print(ele + " ");
        }
        System.out.println();
        // ! Values()
        Collection<Integer> c = map.values();
        System.out.println(c);
        for (Integer ele : map.values()) {
            System.out.print(ele + " ");
        }
        System.out.println();
        // !entrySet()
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            if (entry.getValue() != 50) {
                entry.setValue(50);
            }
        }
        System.out.println(map);
        // !2.From SortedMap
        // ! K firstKey()
        // returns FIRST key in current ordering
        // throws NoSuchElementException if empty
        System.out.println(map.firstKey());

        // !K lastKey()
        // returns LAST key in current ordering
        // throws NoSuchElementException if empty
        System.out.println(map.lastKey());

        // !SortedMap<K,V> headMap(K toKey)
        // returns view of entries with keys STRICTLY LESS THAN toKey
        // toKey exclusive
        SortedMap<Integer, Integer> sm = map.headMap(4);
        System.out.println(sm);
        // !SortedMap<K,V> tailMap(K fromKey)
        // returns view of entries with keys GREATER THAN OR EQUAL TO fromKey
        // fromKey inclusive
        sm = map.tailMap(4);
        System.out.println(sm);

        // !SortedMap<K,V> subMap(K fromKey, K toKey)
        // returns view — fromKey inclusive, toKey exclusive
        sm = map.subMap(3, 6);
        System.out.println(sm);

        // ! Comparator<? super K> comparator()
        // returns Comparator used
        // null if natural ordering
        System.out.println(map.comparator());
        System.out.println(map1.comparator());
        System.out.println(obj);
        // ! 3.From NevigableMap
        // ! K lowerKey(K key)
        // largest key STRICTLY LESS THAN given key
        // returns null if none
        System.out.println(map.lowerKey(4));

        // !K floorKey(K key)
        // largest key LESS THAN OR EQUAL TO given key
        // returns null if none
         System.out.println(map.floorKey(4));

        // !K ceilingKey(K key)
        // smallest key GREATER THAN OR EQUAL TO given key
        // returns null if none
         System.out.println(map.ceilingKey(4));

        // !K higherKey(K key)
        // smallest key STRICTLY GREATER THAN given key
        // returns null if none
         System.out.println(map.higherKey(4));

        // !Map.Entry<K,V> lowerEntry(K key)
        // returns ENTRY with largest key < given key or entry of just before key of given key
        // returns null if none
        System.out.println(map.lowerEntry(4).getKey());
        System.out.println(map1.lowerEntry(3).getKey());

        // !Map.Entry<K,V> floorEntry(K key)
        // returns ENTRY with largest key <= given key or entry of just before equals key of given key
        System.out.println(map.floorEntry(6).getKey());
        System.out.println(map1.floorEntry(1).getKey());

        // !Map.Entry<K,V> ceilingEntry(K key)
        // returns ENTRY with smallest key >= given key or entry of just after or equals key of given key
        System.out.println(map.ceilingEntry(6).getKey());
        System.out.println(map1.ceilingEntry(1).getKey());


        // !Map.Entry<K,V> higherEntry(K key)
        // returns ENTRY with smallest key > given key or entry of just after  key of given key
         System.out.println(map.higherEntry(6).getKey());
        System.out.println(map1.higherEntry(1).getKey());
        // !Map.Entry<K,V> firstEntry()
        // returns FIRST entry (smallest key in natural order)
        // returns null if empty
        System.out.println(map.firstEntry().getKey()+" " +map.firstEntry().getValue());

        // !Map.Entry<K,V> lastEntry()
        // returns LAST entry (largest key in natural order)
        // returns null if empty
        System.out.println(map.lastEntry().getKey()+" " +map.lastEntry().getValue());

        // !Map.Entry<K,V> pollFirstEntry()
        // removes and returns FIRST entry
        // returns null if empty
        map.pollFirstEntry();
        System.out.println(map);

        // !Map.Entry<K,V> pollLastEntry()
        // removes and returns LAST entry
        // returns null if empty
        map.pollLastEntry();
        System.out.println(map);

        // !NavigableMap<K,V> descendingMap()
        // returns REVERSE ORDER view of entire map
        System.out.println( map.descendingMap());

        // !NavigableMap<K,V> subMap(K from, boolean fromInclusive,K to, boolean
        // toInclusive)
        // more control — specify inclusive/exclusive for both ends
        System.out.println(map.subMap(0,true, 5, true));

        // !NavigableMap<K,V> headMap(K toKey, boolean inclusive)
        System.out.println(map.headMap(5, true));
        // !NavigableMap<K,V> tailMap(K fromKey, boolean inclusive)
        System.out.println(map.tailMap(1, true));
    }
}

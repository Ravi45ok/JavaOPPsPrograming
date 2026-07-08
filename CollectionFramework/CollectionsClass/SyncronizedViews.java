import java.util.*;

public class SyncronizedViews {
    public static void main(String[] args) {
        // ! Collection<T> synchronizedCollection(Collection<T> c)
        // !List<T> synchronizedList(List<T> list)
        // !Set<T> synchronizedSet(Set<T> s)
        // !SortedSet<T> synchronizedSortedSet(SortedSet<T> s)
        // !Map<K,V> synchronizedMap(Map<K,V> m)
        // !SortedMap<K,V> synchronizedSortedMap(SortedMap<K,V> m)

        // wraps collection — synchronizes every method
        // similar to Hashtable/Vector approach — full lock
        // use ConcurrentHashMap instead for better performance

        // Example
        List<String> list = new ArrayList<>();
        List<String> syncList = Collections.synchronizedList(list);

        // all operations now thread safe
        syncList.add("A"); // synchronized
        syncList.get(0); // synchronized

        // BUT — iteration must be manually synchronized
        synchronized (syncList) {
            Iterator<String> it = syncList.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }
}

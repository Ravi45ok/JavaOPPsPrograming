import java.util.Collections;
import java.util.Set;

public class Singleton_Colleciton {
    public static void main(String[] args) {
        // ! Set<T> singleton(T o)
        // !List<T> singletonList(T o)
        // !Map<K,V> singletonMap(K key, V value)

        // returns immutable collection with exactly ONE element
        // useful when API requires collection but you have single element

        // Example
        Set<String> single = Collections.singleton("Ravi");
        // immutable Set containing only "Ravi"
       // * single.add("Rohit"); immutable so UnsupporatedOperationException
    }
}

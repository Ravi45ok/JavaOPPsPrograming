import java.util.ArrayDeque;
import java.util.Arrays;
// ! it does not add any extra methods on top of Deque interface
public class Constructors {
    public static void main(String[] args) {
        // !Constructor 1 — default capacity 16
        ArrayDeque<String> deque1 = new ArrayDeque<>();

        // !Constructor 2 — with initial capacity
        // actual capacity rounded up to next power of 2
        ArrayDeque<String> deque2 = new ArrayDeque<>(50);
        // actual capacity → 64 (next power of 2 after 50)

        //! Constructor 3 — from existing collection
        ArrayDeque<String> deque3 = new ArrayDeque<>(Arrays.asList("A", "B"));
    }
}

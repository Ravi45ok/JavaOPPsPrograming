import java.util.LinkedList;

public class constructors {
    public static void main(String[] args) {
        // !Constructor 1 — default
        // *creates empty doubly linked list
        // *first = null, last = null
        LinkedList<String> list = new LinkedList<>();

        //!Constructor 2 — from existing collection
        // *copies all elements maintaining order
        LinkedList<String> list2 = new LinkedList<>(list);
    }
}

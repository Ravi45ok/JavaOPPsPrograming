import java.util.*;

public class Searching {
    public static void main(String[] args) {
        //*Sorting and Searching only works on List type */
        // !1. int binarySearch(List<? extends Comparable<? super T>> list, T key)
        // searches sorted list using binary search
        // list MUST be sorted first — otherwise undefined behavior
        // returns index if found
        // returns negative value if not found
        // O(log n)

        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);
        int index = Collections.binarySearch(list, 5); // returns 2
        System.out.println(index);
        index = Collections.binarySearch(list, 4); // returns negative
        System.out.println(index);

        // !int binarySearch(List<? extends T> list, T key, Comparator<? super T> c)
        // binary search with custom Comparator
        // list must be sorted by same Comparator
        List<String> list1 = new ArrayList<>(Arrays.asList("Banana", "Apple", "Cherry", "Dog", "Cat","Grapes","Lemon"));
        // * Collections.sort(list1,new myComparator());
        list1.sort(new myComparator());// list itself has its own sort() method
        System.out.println(list1);
        index = Collections.binarySearch(list1, "Apple", new myComparator());
        System.out.println(index);
    }
}

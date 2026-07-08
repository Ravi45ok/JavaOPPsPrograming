import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        //*Sorting and Searching only works on List type */
        // ! 1.void sort(List<T> list)
        // sorts list in ASCENDING natural order
        // uses TimSort internally — O(n log n)
        // list elements must implement Comparable
        // Example
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9));
        Collections.sort(list);
        System.out.println(list); // [1, 1, 3, 4, 5, 9]

        // ! 2.void sort(List<T> list, Comparator<? super T> c)
        // sorts using custom Comparator
        // elements don't need Comparable
        // Example — sort by length
        List<String> list1 = new ArrayList<>(Arrays.asList("Banana", "Apple", "Cherry","Dog"));
        Collections.sort(list1,new myComparator());
        System.out.println(list1); // [Apple, Banana, Cherry]
    }
}
import java.util.Arrays;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Construcotrs {
    // ! Constructors---->
    public static void main(String[] args) {
        // Constructor 1 — default, natural ordering via Comparable
        TreeSet<Integer> set = new TreeSet<>();

        // Constructor 2 — with Comparator — custom ordering
        TreeSet<Integer> set1 = new TreeSet<>(new MyComparator());

        // Constructor 3 — from existing collection — natural ordering
        TreeSet<Integer> set2 = new TreeSet<>(Arrays.asList(10, 20));

        // Constructor 4 — from existing SortedSet — preserves ordering
        TreeSet<Integer> set3 = new TreeSet<>(set1);// * it will also have the same ordering as set1 */
        // ! Methods----->
        // !1.From Collection/Set — Inherited
        set.add(40);
        set.add(5);
        set.add(15);
        System.out.println(set);
        set.addAll(Arrays.asList(50, 30, 40, 0, 10, 15, 40, 30));
        System.out.println(set);
        set1.addAll(Arrays.asList(50, 30, 40, 0, 10, 15, 40, 30));
        System.out.println(set1);
        set3.addAll(Arrays.asList(50, 30, 40, 0, 10, 15, 40, 30));// * also maintain the same order as set1 */
        System.out.println(set3);
        // !2. from SortedSet--->
        // * 1.E first()
        // returns Frist element , smallest element in case of default ordering
        // throws NoSuchElementException if empty
        System.out.println(set.first());
        System.out.println(set1.first());

        // * 2.E last()
        // returns last element, larget element can case of default ordering
        // throws NoSuchElementException if empty
        System.out.println(set.last());
        System.out.println(set1.last());

        // *3.SortedSet<E> headSet(E toElement)
        // Starting form the head to strictly less then element
        // toElement → exclusive
        SortedSet<Integer> s1 = set.headSet(30);
        System.out.println(s1);
        s1 = set.headSet(35);
        System.out.println(s1);
        s1 = set1.headSet(30);
        System.out.println(s1);

        // *4.SortedSet<E> tailSet(E fromElement)
        // Starting from the grater than equals to element to till the tail
        // fromElement → inclusive
        SortedSet<Integer> s2 = set.tailSet(30);
        System.out.println(s2);
        s2 = set1.tailSet(30);
        System.out.println(s2);

        // *5.SortedSet<E> subSet(E fromElement, E toElement)
        // returns view of elements from fromElement (inclusive) to toElement
        // (exclusive)
        SortedSet<Integer> s3= set.subSet(5, 40);
        System.out.println(s3);

        // *6. Comparator<? super E> comparator()
        // returns Comparator used
        // returns null if natural ordering
        Comparator ref1= set.comparator();
        System.out.println(ref1);
        Comparator ref2= set1.comparator();
        System.out.println(ref2);
    }
}

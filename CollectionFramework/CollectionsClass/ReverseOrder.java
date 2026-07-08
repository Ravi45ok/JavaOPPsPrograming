import java.util.*;

public class ReverseOrder {
    public static void main(String[] args) {
        // ! Comparator<T> reverseOrder()
        // returns Comparator that reverses natural ordering
        // equivalent to Collections.reverseOrder()

        // !Comparator<T> reverseOrder(Comparator<T> cmp)
        // returns Comparator that reverses given Comparator

        // Example
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5));
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list); // [5, 4, 3, 1, 1]
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        set.add(3);
        set.add(1);
        set.add(4);
        System.out.println(set); // [4, 3, 1]
    }
}

import java.util.*;

public class Friquecncy_disJoint {
    public static void main(String[] args) {
        // ! int frequency(Collection<?> c, Object o)
        // counts how many times o appears in c
        // works on ANY collection — List, Set, Queue
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 3,3, 4);
        Collections.frequency(list, 3); // 3 — appears 3 times
        System.out.println(Collections.frequency(list, 3));

        // !boolean disjoint(Collection<?> c1, Collection<?> c2)
        // returns true if c1 and c2 have NO common elements
        // returns false if they share at least one element
        List<Integer> a = Arrays.asList(1, 2, 3);
        List<Integer> b = Arrays.asList(4, 5, 6);
        List<Integer> c = Arrays.asList(3, 4, 5);
        Collections.disjoint(a, b); // true — no common elements
        Collections.disjoint(a, c); // false — 3 is common
    }
}

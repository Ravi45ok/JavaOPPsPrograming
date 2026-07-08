import java.util.*;

// *Min and Max can be calculated for any types of collection, note it does not includes map hericahry.
public class Min_Max {
    public static void main(String[] args) {
        // ! T min(Collection<? extends T> coll)
        // returns smallest element — natural ordering
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9));
        System.out.println(Collections.min(list)); // 1
        // !T min(Collection<? extends T> coll, Comparator<? super T> comp)
        // returns smallest by Comparator
        Comparator<Integer> Cref = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };
        List<Integer> list1 = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9));
        System.out.println(Collections.min(list1, Cref)); // i have reverse the order with help of comparatro

        // !T max(Collection<? extends T> coll)
        // returns largest element — natural ordering
        int max= Collections.max(list);
        System.out.println(max);

        // !T max(Collection<? extends T> coll, Comparator<? super T> comp)
        // returns largest by Comparator
        max=Collections.max(list1,Cref);
        System.out.println(max);
    }
}

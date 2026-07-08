import java.util.*;

public class Fill_Copy {
    public static void main(String[] args) {
        // !void fill(List<? super T> list, T obj)
        // replaces ALL elements with specified object
        // [1,2,3,4,5] fill with 0 → [0,0,0,0,0]
        List<Integer> list = new ArrayList<>(Arrays.asList(1,4, 5,10,20));
        System.out.println(list);
        Collections.fill(list, 0);
        System.out.println(list);

        // !void copy(List<? super T> dest, List<? extends T> src)
        // copies src into dest
        // dest MUST be at least as large as src
        // otherwise IndexOutOfBoundsException
        list = new ArrayList<>(Arrays.asList(1,4, 5,10,20));
        List<Integer> list1= new ArrayList<>(Arrays.asList(5, 3,0,2,1));
        Collections.copy(list, list1);
        System.out.println(list);
        // !List<T> nCopies(int n, T o)
        // returns immutable list with n copies of o
        // nCopies(3, "Hi") → ["Hi","Hi","Hi"]
           List<String> list2 = Collections.nCopies(4, "HII");
           System.out.println(list2);

    }
}

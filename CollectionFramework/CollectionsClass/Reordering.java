import java.util.*;

public class Reordering {
    public static void main(String[] args) {
        // ! void reverse(List<?> list)
        // reverses order of elements
        // [1,2,3,4,5] → [5,4,3,2,1]
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 8,2,4,10,15,12));
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        // !void shuffle(List<?> list)
        // randomly shuffles elements
        // uses default Random
        Collections.shuffle(list);
        System.out.println(list);
        // !void rotate(List<?> list, int distance)
        // rotates elements by distance positions
        // [1,2,3,4,5] rotate by 2 → [4,5,1,2,3]
        // positive distance → right rotation
        // negative distance → left rotation
        Collections.rotate(list, 3);
        System.out.println(list);
        Collections.rotate(list, -2);
        System.out.println(list);

        // !void swap(List<?> list, int i, int j)
        // swaps elements at index i and j
        Collections.swap(list, 2, 4);
        System.out.println(list);

    }
}

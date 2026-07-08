import java.util.Arrays;
import java.util.PriorityQueue;

public class constructors {
    public static void main(String[] args) {
        // Constructor 1 — default capacity 11, natural ordering
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();

        // Constructor 2 — with initial capacity
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(20);

        // Constructor 3 — with Comparator — custom ordering
        PriorityQueue<Integer> pq3 = new PriorityQueue<>(new MyComparator());

        // Constructor 4 — with initial capacity and Comparator
        PriorityQueue<Integer> pq4 = new PriorityQueue<>(20, new MyComparator());

        // Constructor 5 — from existing collection
        PriorityQueue<Integer> pq5 = new PriorityQueue<>(pq1);
        // !it does not add extra methods on top of Queue interface
        PriorityQueue<Integer> pq = new PriorityQueue<>(Arrays.asList(15, 20, 5, 25, 15, 18, 17, 40));
        System.out.println(pq);
        // ! offer(E e)
        pq.offer(2);
        System.out.println(pq);
        // !E poll()
        System.out.println(pq.poll());
        System.out.println(pq);
        // ! E peek()
        System.out.println(pq.peek());
        // *Example with comparator type constructor to reverse order, now the largest
        // value will be removed frist */
        pq3.add(5);
        pq3.add(10);
        pq3.add(45);
        pq3.add(15);
        pq3.add(12);
        pq3.add(25);
        System.out.println(pq3);
        // ! iterate over PriorityQueue-> wii not return element in Priority order
        for (Integer ele : pq3) {
            System.out.print(ele + " ");
        }
        System.out.println();
        // ! To take element in priority order we can use while loop like this
        while (!pq3.isEmpty()) {
            System.out.print(pq3.poll()+" ");
        }
    }
}

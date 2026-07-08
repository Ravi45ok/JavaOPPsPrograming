import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class methods {
    public static void main(String[] args) {
        Queue<Integer> q1= new LinkedList<>();//* slower then ArrayDeque */
        Queue<Integer> q2=new PriorityQueue<>();//* add element based on prioraty log(n) time complexity for add/offer and remove/poll */
        Queue <Integer> q3= new ArrayDeque<>();//*fastest */
        // ! INSERT at tail
        // ! 1.boolean add(E e)
        // *adds at tail
        // *returns true if added
        // *throws IllegalStateException if capacity restricted and full
        q1.add(20);
        q1.add(30);


        // !2.boolean offer(E e)
        // *adds at tail
        // *returns true → added successfully
        // *returns false → capacity restricted and full
        // *PREFERRED over add()
        q1.offer(59);
        q1.offer(69);
        System.out.println(q1);

        // !REMOVE from head
        // !1.E remove()
        // *removes and returns HEAD element
        // *throws NoSuchElementException if empty
        System.out.println(q1.remove());

        // !2.E poll()
        // *removes and returns HEAD element
        // *returns null if empty
        // *PREFERRED over remove()
        System.out.println(q1.poll());

        // ! EXAMINE head
        // !1.E element()
        // *returns HEAD element WITHOUT removing
        // *throws NoSuchElementException if empty
        System.out.println(q1.element());

        // !2.E peek()
        // *returns HEAD element WITHOUT removing
        // *returns null if empty
        // *PREFERRED over element()
        System.out.println(q1.peek());
        q1.clear();
        System.out.println(q1.peek());

    }
}

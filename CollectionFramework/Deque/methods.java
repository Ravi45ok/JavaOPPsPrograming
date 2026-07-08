import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class methods {
    public static void main(String[] args) {

        //* Note-> Deque can works as a stack , queue , and Deque.
        // * Deque can have two implemention ArrayDeque and Linkedlist
        Deque<Integer> d1= new ArrayDeque<>();
        Deque<Integer> d2= new LinkedList<>();
        // !HEAD Operations-------------->
        // *INSERT at head
        // !1.void addFirst(E e)
        // adds at head
        // throws IllegalStateException if capacity restricted and full

        // ! 2.boolean offerFirst(E e)
        // adds at head
        // returns false if full
        // PREFERRED
        // !3. void push(E e)
        // adds at HEAD — same as addFirst()
        // throws IllegalStateException if full
        // *REMOVE from head
        // ! 1.E removeFirst()
        // removes and returns head
        // throws NoSuchElementException if empty

        // !2.E pollFirst()
        // removes and returns head
        // returns null if empty
        // PREFERRED
        // !3.E pop()
        // removes and returns HEAD — same as removeFirst()
        // throws NoSuchElementException if empty
        // ! 4.E poll()
        // same as pollFrist()
        // !5. E remove()
        // same as removeFrist()

        // * EXAMINE head
        // !1. E getFirst()
        // returns head WITHOUT removing
        // throws NoSuchElementException if empty

        // !2.E peekFirst()
        // returns head WITHOUT removing
        // returns null if empty
        // PREFERRED
        // !3. E peek()
        // returns HEAD without removing — same as peekFirst()
        // returns null if empty
        // inherited from Queue
        // ! 4. E element()
        // same as getFrist()

        // !TAIL Operations ---------------------------------->
        // *INSERT at tail
        // ! void addLast(E e)
        // adds at tail
        // throws IllegalStateException if capacity restricted and full

        // !boolean offerLast(E e)
        // adds at tail
        // returns false if full
        // PREFERRED
        // ! void add(E e)
        // same as addLast()
        // ! void offer()
        // same as offerLast()

        // *REMOVE from tail
        // ! E removeLast()
        // removes and returns tail
        // throws NoSuchElementException if empty

        // ! E pollLast()
        // removes and returns tail
        // returns null if empty
        // PREFERRED

        // * EXAMINE tail
        // !E getLast()
        // returns tail WITHOUT removing
        // throws NoSuchElementException if empty

        // !E peekLast()
        // returns tail WITHOUT removing
        // returns null if empty
        // PREFERRED
        // ! Stack methods
        // ! 1. void push(E e)
        // adds at HEAD — same as addFirst()
        // throws IllegalStateException if full

        //! E pop()
        // removes and returns HEAD — same as removeFirst()
        // throws NoSuchElementException if empty

        //! E peek()
        // returns HEAD without removing — same as peekFirst()
        // returns null if empty
        // inherited from Queue
    }
}

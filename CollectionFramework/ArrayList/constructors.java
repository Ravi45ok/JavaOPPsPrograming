import java.util.ArrayList;
import java.util.Arrays;
// ! Note-> vector has also same mehtods and constructors as arraylist it just they are synronisezed.
public class constructors {
    public static void main(String[] args) {
        //! Constructor 1 — default
        //* creates empty list, capacity 0
        //*  grows to 10 on first add
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");


        //! Constructor 2 — with initial capacity
        // *creates empty list with specified capacity upfront
        // *useful when you know approximate size — avoids resizing
        ArrayList<String> list2 = new ArrayList<>(50);

        // !Constructor 3 — from existing collection
        // *copies all elements from collection into new ArrayList
        ArrayList<String> list3 = new ArrayList<>(list1);
        System.out.println(list1);
        System.out.println(list3);
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(10, 30, 59, 10));
        System.out.println(list);
    }
}

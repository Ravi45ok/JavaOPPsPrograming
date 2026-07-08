import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class methods {
    public static void main(String[] args) {
        Collection<Integer>c1= new ArrayList<>();
        Collection<Integer>c2= new HashSet<>();
        // ! Addtion of elements->
        // ! 1.boolean add(E e)
        c1.add(15);
        c1.add(45);
        c1.add(90);
        c2.add(15);
        c2.add(30);
       boolean ans= c2.add(30);
       System.out.println(ans);//* false hashSet don't allow duplicate */
       c2.add(90);
       System.out.println("After addtion of elements collection are.......");
       System.out.println(c1);
       System.out.println(c2);
     // ! 2. boolean addAll(Collecton<? extends E> c)
        c1.addAll(c2);
        System.out.println("After Adding the c2 collection into c1 , c1 is....");
        System.out.println(c1);
        c2.addAll(c1);// * only unique value will be added
         System.out.println("After Adding the c1 collection into c2 , c2 is....");
        System.out.println(c2);
        // ! Romove of elements->
         
        // !3. boolean remove(E e) remove only the frist occureace of the element
        c1.add(15);
        c1.remove(15);
        System.out.println("after remove of a element c1 is...");
        System.out.println(c1);
        c1.add(23);
        // !4. boolean removeAll(collection<E> c)// remove all the occuarance of element preset in collection passed
        c1.removeAll(c2);
        System.out.println("after remove all element of c2 from c1 c1 collection is...");
        System.out.println(c1);
        c1.addAll(c2);
        c1.add(89);
        c2.add(67);
        // !5. boolean retainAll(collection<E> c)// give intersection of collections
        c1.retainAll(c2);
        System.out.println("After intersection of c1 with c2 both collection c1 is....");
        System.out.println(c1);
        // !6. void clear()
        c1.clear();
        c2.clear();
        System.out.println("after clear of c1 and c2 , c1 and c2 are....");
        System.out.println(c1);
        System.out.println(c2);
  
        // ! Check Methods
           c1.add(15);
        c1.add(45);
        c1.add(90);
        c2.add(15);
        c2.add(30);
        c2.add(90);
        c1.add(47);
        //! 7. boolean contains(Object o)
        System.out.println(c1.contains(15));
        // ! 8. boolean containsAll(Collection<?> c)
        System.out.println(c1.containsAll(c2));
        // ! 9. boolean isEmpty()
        System.out.println(c1.isEmpty());
        // ! 10. int size()
        System.out.println(c1.size());
        // ! conversion into array()
        // ! 11. Object[] toArray()// will convert to object type arry
        Object[] arr1= c1.toArray();
         for(Object ele: arr1){
            System.out.print(ele+" ");
         }
         System.out.println();
        // ! 12. E[] toArray(E[] a)// will convert to Element  type array we have to pass a objet of the element
        Integer[] arr2= c2.toArray(new Integer[0]);
         for(int ele: arr2){
            System.out.print(ele+" ");
         }
         System.out.println();
         // ! 13. Iterator<E> iterator()
         System.out.println(c1);
         System.out.println("Iteration through c1 collection");
         Iterator<Integer> it = c1.iterator();
         while (it.hasNext()) {
            int element = it.next();
            System.out.print(element+" ");
            if(element == 45){
                it.remove(); //* */
                // *it.remove(); twice will give illegalStateException becuase it.remove() removes the element returned by the it.next() so only one it.remove() for one it.next()
            }
         }
         System.out.println();
         for(Integer ele: c1){
            System.out.print(ele+ " ");
         }
    }
}

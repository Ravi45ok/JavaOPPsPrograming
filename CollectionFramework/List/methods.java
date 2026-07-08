import java.util.*;

public class methods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(15);
        list.add(5);
        list.add(50);
        list.add(60);
        // * CURD at index methods
        // ! 1. void add(int index, E e)
        list.add(2, 30);
        System.out.println(list);
        list.add(6, 70);
        System.out.println(list);
        // *list.add(10, 100); IndexOutOfBondException */
        // ! 2. E set(int index, E e)
        list.set(3, 20);
        System.out.println(list);
        // ! 3. E remove(int index)
        list.remove(2);// *remove behaf of the index */
        System.out.println(list);
        list.remove((Integer) 50);// * remove beheaf of Integer Object, method form Collection interface
        System.out.println(list);
        // ! 4. E get(int index)
        int ele = list.get(3);
        System.out.println(ele);
        // * Search Methods
        // ! 5. int indexOf(Object O )
        int index = list.indexOf(20);
        System.out.println(index);
        System.out.println(list.indexOf(80));
        // ! 6. int lastIndexOf(Object o)
        System.out.println(list.lastIndexOf(20));
        // *RangeView */
        // ! 7.List<E> sublist(fromIndex, toIndex)
        List<Integer> subList = list.subList(1, 4);
        System.out.println(subList);
        subList.add(69);// * change in sublist will also affact the main List also */
        System.out.println(list);
        list.add(99);
        //*System.out.println(subList); wiil give  ConcurrentModificationException
        // ! 8.. ListIterator<E> listIterator()
        ListIterator<Integer> it1 = list.listIterator();
        while (it1.hasNext()) {
            System.out.print(it1.next() + " ");
        }
        System.out.println();
        // !9. ListIterator<E> listIterator(int index)
        ListIterator<Integer> it = list.listIterator(list.size());
        while (it.hasPrevious()) {
            System.out.print(it.previous() + " ");
        }
        System.out.println();
        // ! sort(Comparator < ? super T >)
        list.sort(null);//* will sort in natural order */
        System.out.println(list);
        list.sort(Comparator.reverseOrder());//* will sort in reverse order */
        System.out.println(list);
        // ! toArray()
         Object[] arr =list.toArray();

         for(Object element : arr){
             System.out.print(element+" ");
         }
         System.out.println();
        // ! toArray(T[] a)
          Integer[] arr1 =list.toArray(new Integer[0]);

         for(Integer element : arr1){
             System.out.print(element+" ");
         }
         System.out.println();

    }
}

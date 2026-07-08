import java.util.Iterator;
//*Program for Costum iterable class */
 class NumberRange implements Iterable<Integer> {
    private int start, end;
    NumberRange(int start, int end){
        this.start= start;
        this.end= end;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>(){
            int current=start;
            @Override
            public boolean hasNext() {
                return current<= end;
            }
            @Override
            public Integer next() {
               return current++;
            }
        };
    }
    
}
public class Costum_iterable_class {
public static void main(String[] args) {
    NumberRange Nr= new NumberRange(5, 10);
    Iterator<Integer> it =Nr.iterator();
    System.out.println("Calling it.next()"+ it.next());
    // ! Travarsal through while loop
   while (it.hasNext()) {
      System.out.println(it.next());
   }
   // ! Travasal through for-each loop-> 
   //* Internally for-each loop also use iterator  */
   for(int i : Nr){
    System.out.println(i);
   }
   // ! Internal Implemtion of for-each
   /* 
      Iterator<Integer> it =Nr.iterator();
      while (it.hasNext()) {
      System.out.println(it.next()); 
   }
   */
}
    
}

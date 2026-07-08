
// !Given a List<String> of words — write a program to remove duplicates while maintaining insertion order. Which collection will you use   and why?
import java.util.*;

public class Assignment7 {
    public static void main(String[] args) {
        List<String> iList = List.of( "apple","banana","cherry","apple","date","banana","elderberry","fig","grape","cherry");
        Set<String> set= new LinkedHashSet<>();
        for(String ele: iList){
            set.add(ele);
        }
        System.out.println(set);
    }
}

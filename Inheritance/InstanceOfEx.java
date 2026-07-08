import java.util.ArrayList;
import java.util.List;

public class InstanceOfEx {
    public static void main(String[] args) {
        List<Number> list = new ArrayList<>(List.of(1, 1.5, 7.6, 5.5,5,6,7,9.9));
        List<Integer> list1= new ArrayList<>();
        for(Number n: list){
            if(n instanceof Integer){
                list1.add((Integer)n);
            }
        }
        System.out.println(list1);
    }
}

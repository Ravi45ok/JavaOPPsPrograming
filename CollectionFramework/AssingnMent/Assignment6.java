// !Write a program to find all duplicate elements in a list using Set. Input: [1,2,3,2,4,3,5] Output: [2, 3]

import java.util.*;

public class Assignment6 {
    public static void main(String[] args) {
        List<Integer> iList= new ArrayList<>(Arrays.asList(1,2,3,2,4,3,5));
        Set<Integer>checkSet= new HashSet<>();
        Set<Integer>OutputSet= new HashSet<>();
        for(Integer ele : iList){
            if(!checkSet.add(ele)){
                OutputSet.add(ele);
            }
        }
        System.out.println(OutputSet);
    }
}

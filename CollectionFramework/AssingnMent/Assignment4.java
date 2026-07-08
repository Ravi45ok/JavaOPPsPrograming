// !Write a program to find top 3 most frequent elements in a list using Map and PriorityQueue. Input: [1,1,1,2,2,3,3,3,3,4,4] Output: [3, 1, 2]

import java.util.*;

public class Assignment4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,1,2,2,3,3,3,3,4,4);

        // Step 1 — build frequency map
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(Integer ele : list){
            if(freqMap.containsKey(ele)){
                freqMap.put(ele, freqMap.get(ele) + 1);
            }else{
                freqMap.put(ele, 1);
            }
        }
        // freqMap = {1=3, 2=2, 3=4, 4=2}

        // Step 2 — MaxHeap based on frequency
        // by default PriorityQueue is minHeap
        // we need maxHeap — so reverse the comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            new Comparator<Integer>() {
                public int compare(Integer a, Integer b) {
                    return freqMap.get(b) - freqMap.get(a);
                    // b-a → larger frequency comes first
                }
            }
        );

        // Step 3 — add all keys to maxHeap
        for(Integer key : freqMap.keySet()){
            maxHeap.offer(key);
        }
        // heap orders by frequency — highest first

        // Step 4 — poll top 3
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            result.add(maxHeap.poll());
        }

        System.out.println(result);  // [3, 1, 2] or [3, 1, 4]
    }
}
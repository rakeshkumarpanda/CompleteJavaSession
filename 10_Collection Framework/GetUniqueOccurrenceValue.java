package collections;

import java.util.HashMap;
import java.util.Map;

public class GetUniqueOccurrenceValue {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 3, 2, 4, 2};
        Map<Integer, Integer> count = new HashMap<>();
        for (int x:arr) {
            if (count.containsKey(x)) {
//                int currentCount = count.get(x);
//                int finalCount = currentCount + 1;
//                count.put(x, finalCount);
                count.put(x, count.get(x)+1);
            }else {
                count.put(x, 1);
            }
        }
        System.out.println(count);
//        System.out.println(count.get(1));//null as the key is not present
        for (Map.Entry<Integer, Integer> x:count.entrySet()) {
            if (x.getValue() == 1)
                System.out.println(x.getKey());
        }

    }
}

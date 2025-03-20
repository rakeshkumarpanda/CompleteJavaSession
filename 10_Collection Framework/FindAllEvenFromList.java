package collections;

import java.util.ArrayList;
import java.util.List;

public class FindAllEvenFromList {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(43);
        l.add(345);
        l.add(54);

//        for (int i=0; i<l.size(); i++){
//            if (l.get(i)%2==0)
//                System.out.println(l.get(i));
//        }
//        for (int x:l)
//            if (x%2==0)
//                System.out.println(x);
        l.parallelStream()
                .filter(e->e%2==0)
                .forEach(System.out::println);
    }
}

package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetConcepts {
    public static void main(String[] args) {
        //Creation of set
        Set<String> s = new HashSet<>();//No sorted order
//        Set<String> s = new TreeSet<>();//Sorted order

        //Adding the value
        s.add("Lion");
        s.add("Bear");
        s.add("Tiger");
        s.add("Gorilla");
        s.add("Monkey");
        s.add("Koala");

        //Retrieving the data
        //for-each
//        for (String x:s)
//            System.out.println(x);
        //using iterator
//        Iterator<String> itr = s.iterator();
//        while (itr.hasNext())
//            System.out.println(itr.next());
        //Stream
//        s.parallelStream().forEach(System.out::println);

        s.add("Monkey");
//        s.parallelStream().forEach(System.out::println);

        s.remove("Lion");
        s.parallelStream().forEach(System.out::println);



    }
}

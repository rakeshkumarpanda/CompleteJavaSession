package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListSession {
    public static void main(String[] args) {
        //Create an empty list
        List l = new ArrayList();

        //Add elements to the list
        l.add("Java");
        l.add(10);
        l.add(false);
        l.add('e');
        l.add(576.65);

//        System.out.println(l);

        //Add value in between
        l.add(2, "Lion");
//        System.out.println(l);

        //Updating
        l.set(1, 30);
//        System.out.println(l);

        //Removing the value
//        l.remove("Lion");
//        System.out.println(l);

        //Iterating the loops
        //1st approach - Simple for loop
//        for (int i=0; i<=l.size()-1; i++) {
//            System.out.println(l.get(i));
//        }
        //2nd approach - advanced for loop
//        for(Object x:l) {
//            System.out.println(x);
//        }
        //3rd approach - direct for-each
//        l.forEach(e-> System.out.println(e));
        //4th approach - using stream
//        l.stream().forEach(e-> System.out.println(e));
        //5th approach - parallel stream
//        l.parallelStream().forEach(e-> System.out.println(e));
        //6th approach - Normal Iterator
//        Iterator iterator = l.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        //7th Approach - ListIterator
        ListIterator listIterator = l.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

    }
}

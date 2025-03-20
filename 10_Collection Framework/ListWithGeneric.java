package collections;

import java.util.ArrayList;
import java.util.List;

public class ListWithGeneric {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
//        l.add("test");//CE : because value "test" is not of int type
        l.add(43);
        l.add(56);
        l.add(98);
        l.add(103);

        //Q. Get the double of each and every number - Exp o/p - [20, 86, 112, 196, 206]
        //Using for loop
//        for (int i=0; i<l.size(); i++)
//            System.out.println(l.get(i)*2);
        //Using for-each
//        for (int x:l)
//            System.out.println(x*2);
        //direct for-each
//        l.forEach(e-> System.out.println(e*2));
        //using stream
//        l.stream().forEach(e-> System.out.println(e*2));
        //2nd approach using stream
        List<String> l1 = new ArrayList<>();
        l1.add("10");
        l1.add("43");
        l1.add("56");
        l1.add("98");
        l1.add("103");
        //using for-each
        for (String x:l1) {
            int v = Integer.parseInt(x);
            System.out.println(v*2);
        }
        //Using stream
        l1.stream()
                .map(e-> Integer.parseInt(e))//Converting String to int
                .map(e-> e*2)//Doubling each value
                .forEach(System.out::println);//Printing the doubled value


    }
}

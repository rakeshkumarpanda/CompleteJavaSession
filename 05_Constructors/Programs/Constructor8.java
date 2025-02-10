package constructors;

import java.util.Scanner;

class Cons8 {
    int i, j, k;
    public Cons8() {
        i = 10;
        j = 20;
    }

    public Cons8(int k) {
        this.k = k;
    }

    public void add() {
        System.out.println(i+j+k);
    }
}

public class Constructor8 {
    public static void main(String[] args) {
        //Case 1
        Cons8 c = new Cons8();
        /*As here we are invoking the default constructor,
        so only i will be updated to 10 and j will be updated to 20
        whereas k value will remain same with 0.
         */
        c.add();//10+20+0 = 30
    }
}

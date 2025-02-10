package constructors;

class Cons10 {
    int i, j, k;
    public Cons10() {
        this(30);
        i = 10;
        j = 20;
    }

    public Cons10(int k) {
        this.k = k;
    }

    public void add() {
        System.out.println(i+j+k);
    }
}

public class Constructor10 {
    public static void main(String[] args) {
        //Case 3
        Cons10 c = new Cons10();
        /*As here we are invoking the default constructor, from the default constructor
        we are invoking the parametrized constructor so first k value will be updated to
        30 from 0 then i will be updated to 10 & at last j will be updated to 20
         */
        c.add();//10+20+30 = 60

    }
}
/*
Note:
1. this() is useful to invoke the current class other constructors
2. The invocation happens based on the arguments passed
3. Should be the very first line inside the constructor else will get the compilation error
 */
package constructors;

class Cons9 {
    int i, j, k;
    public Cons9() {
        i = 10;
        j = 20;
    }

    public Cons9(int k) {
        this.k = k;
    }

    public void add() {
        System.out.println(i+j+k);
    }
}

public class Constructor9 {
    public static void main(String[] args) {
        //Case 2
        Cons9 c = new Cons9(30);
        /*As here we are invoking the default constructor,
        so only i & j will remain with 0
        whereas k value will be updated same with 30.
         */
        c.add();//0+0+30 = 30

        Cons9 c1 = new Cons9();//Discussed in Case 1 in Cons8 class
        c1.add();

        System.out.println(c);//Prints the address of the object where c is pointed to
        System.out.println(c1);//Prints the address of the object where c1 is pointed to
        System.out.println(c==c1);//Compares both the address to find whether both are pointing to same object
    }
}
/*
Conclusion: We can invoke only one constructor at a time during object creation
 */

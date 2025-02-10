package constructors;

class Cons11 {
    int i, j, k;
    public Cons11() {
        i = 10;
        j = 20;
    }

    public Cons11(int k) {
        this();
        this.k = k;
    }

    public void add() {
        System.out.println(i+j+k);
    }
}

public class Constructor11 {
    public static void main(String[] args) {
        //Case 4
        Cons11 c = new Cons11(30);
        /*As here we are invoking the default constructor, from the default constructor
        we are invoking the parametrized constructor so first i value will be updated to
        10 then j will be updated to 20 and k will be updated to 30
         */
        c.add();//10+20+30 = 60

    }
}
package constructors;

class Cons1 {

    //Virtually present
//    public Cons1() {
//
//    }

    public int add(int i, int j) {
        return i+j;
    }
}

public class Constructor1 {
    public static void main(String[] args) {
        Cons1 c = new Cons1();
        int sum = c.add(10, 40);
        System.out.println(sum);
    }
}

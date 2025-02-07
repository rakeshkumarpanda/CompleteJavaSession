package constructors;

class Cons2 {

    public Cons2() {
        System.out.println("Cons2 class default constructor");
    }

    public int add(int i, int j) {
        return i+j;
    }
}

public class Constructor2 {
    public static void main(String[] args) {
        Cons2 c = new Cons2();
        int sum = c.add(10, 40);
        System.out.println(sum);
    }
}

package constructors;

class Cons3 {
    int x, y;
    public Cons3(int i, int j) {
        x=i;
        y=j;
    }

    public void add() {
        System.out.println(x+y);
    }
}

public class Constructor3 {
    public static void main(String[] args) {
        Cons3 c = new Cons3(30, 20);
        c.add();
    }
}

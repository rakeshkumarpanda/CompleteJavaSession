package constructors;

class Add7 {
    int i, j;
    public Add7() {
        i=10;
        j=50;
    }
    public void printSum() {
        System.out.println(i+j);
    }
}

public class Addition7 {
    public static void main(String[] args) {
        Add7 a = new Add7();
        a.printSum();
    }
}

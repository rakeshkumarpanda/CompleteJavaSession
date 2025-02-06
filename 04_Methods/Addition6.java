package methods;

class Add6 {
    public int add(int i, int j) {
        return i+j;
    }
}

public class Addition6 {
    public static void main(String[] args) {
        Add6 a = new Add6();
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}

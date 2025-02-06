package methods;

class Add5 {
    public void add(int i, int j) {
        System.out.println("=== Add method started ===");
        System.out.println(i+j);
        System.out.println("=== Add method ended ===");
    }
}

public class Addition5 {
    public static void main(String[] args) {
        Add5 a = new Add5();
        a.add(10, 20);
    }
}

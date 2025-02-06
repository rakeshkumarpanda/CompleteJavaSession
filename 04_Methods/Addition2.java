package methods;

public class Addition2 {
    int i=10, j=20;
    public static void main(String[] args) {
        Addition2 a = new Addition2();
        a.add();
    }

    public void add() {
        System.out.println("=== Add method started ===");
        System.out.println(i+j);
        System.out.println("=== Add method ended ===");
    }
}

package methods;

public class Addition1 {
    static int i=10, j=20;
    public static void main(String[] args) {
        add();
        add();
        add();
    }

    public static void add() {
        System.out.println("=== Add method started ===");
        System.out.println(i+j);
        System.out.println("=== Add method ended ===");
    }
}

package methods;

public class Addition3 {
    static int i=10, j=20;
    public static void main(String[] args) {
        add(); //Direct invocation - When add method belongs to the same class
        Addition3.add();//Recommended - When the add method either belongs to same or different class
        Addition3 a = new Addition3();
        a.add();//Not Recommended but still we can invoke the static members using the object reference
    }

    public static void add() {
        System.out.println("=== Add method started ===");
        System.out.println(i+j);
        System.out.println("=== Add method ended ===");
    }
}

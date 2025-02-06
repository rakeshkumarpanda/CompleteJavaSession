package methods;

class Add {
    static int i=10, j=20;

    public static void add() {
        System.out.println("=== Add method started ===");
        System.out.println(i+j);
        System.out.println("=== Add method ended ===");
    }
}

public class Addition4 {

    public static void main(String[] args) {
        Add.add();//Recommended - When the add method either belongs to same or different class
        Add a = new Add();
        a.add();//Not Recommended but still we can invoke the static members using the object reference
    }
}

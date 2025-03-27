package oops_concept;

class Add {
    public void sum(long a, long b) {
        System.out.println("long arguments");
    }
    public void sum(int a, int b) {
        System.out.println("int arguments");
    }

}

public class MethodOverloading {
    public static void main(String[] args) {
        byte b1=10, b2=20;
        new Add().sum(b1, b2);
    }
}

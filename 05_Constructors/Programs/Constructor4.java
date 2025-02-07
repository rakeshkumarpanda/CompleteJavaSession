package constructors;

import java.util.Scanner;

class Cons4 {
    int x, y;
    public Cons4(int i, int j) {
        x=i;
        y=j;
    }

    public void add() {
        System.out.println(x+y);
    }
}

public class Constructor4 {
    public static void main(String[] args) {
        //Taking user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scan.nextInt();
        System.out.println("Enter the second number:");
        int b = scan.nextInt();

        Cons4 c = new Cons4(a, b);
        c.add();
    }
}

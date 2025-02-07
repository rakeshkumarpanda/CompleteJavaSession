package constructors;

import java.util.Scanner;

class Cons5 {
    int x, y;
    public Cons5(int i, int j) {
        x=i;
        y=j;
    }

    public void add() {
        System.out.println(x+y);
    }
}

public class Constructor5 {
    public static void main(String[] args) {
        //Taking user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int i = scan.nextInt();
        System.out.println("Enter the second number:");
        int j = scan.nextInt();

        Cons5 c = new Cons5(i, j);
        c.add();
    }
}

package constructors;

import java.util.Scanner;

class Cons7 {
    int i, j;
    public Cons7(int i, int j) {
        this.i=i;//"this" is the keyword represents to the current class instance
        this.j=j;
        this.add();
    }

    public void add() {
        System.out.println(i+j);
    }
}

public class Constructor7 {
    public static void main(String[] args) {
        //Taking user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int i = scan.nextInt();
        System.out.println("Enter the second number:");
        int j = scan.nextInt();

        Cons7 c = new Cons7(i, j);
        c.add();
    }
}

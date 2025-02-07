package constructors;

import java.util.Scanner;

class Cons6 {
    int i, j;
    public Cons6(int i, int j) {
        i=i;
        j=j;
    }

    public void add() {
        System.out.println(i+j);
    }
}

public class Constructor6 {
    public static void main(String[] args) {
        //Taking user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int i = scan.nextInt();
        System.out.println("Enter the second number:");
        int j = scan.nextInt();

        Cons6 c = new Cons6(i, j);
        c.add();
    }
}

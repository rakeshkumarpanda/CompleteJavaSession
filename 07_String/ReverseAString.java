package string;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        //Taking user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String value = scan.nextLine();

        String revString="";

        for (int i=value.length()-1 ; i>=0; i--)
            revString+=value.charAt(i);

        System.out.println(revString);
    }
}

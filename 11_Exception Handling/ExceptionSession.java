package exceptionHandling;

import java.util.Scanner;

public class ExceptionSession {
    public static void main(String[] args) {
        try {
            System.out.println("try block started");
            int a = 15, b = 0;
            int div = a/b;
            System.out.println(div);
            System.out.println("try block completed");
        }catch (ArithmeticException e) {//When the exception type is known
            System.out.println("Denominator is zero");
        }
    }
}
/*
Notes:
1.
try - it's a block which is used to handle the risky or danger statements
catch - it's block to mitigate the problem arises due to the risky statement
finally - It's a block to tear down the above process
2. for a single try block we must have either a catch block or the finally block or both
i.e. we can't use the try block alone
3. We can have multiple catch blocks for a single try block
 */
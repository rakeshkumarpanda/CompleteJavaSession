package exceptionHandling;

public class ExceptionSession2 {
    public static void main(String[] args) {
        try {
            System.out.println("try block started");
            int a = 15, b = 0;
            int div = a/b;
            System.out.println(div);
            System.out.println("try block completed");
        }catch (Exception e) {//When the exception type is not sure
            System.out.println("Denominator is zero");
        }
    }
}
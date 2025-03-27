package exceptionHandling;

public class ExceptionSession3 {
    public static void main(String[] args) {
        try {
            System.out.println("try block started");
            int a = 15, b = 0;
            int div = a/b;
            System.out.println(div);
            System.out.println("try block completed");
        }catch (ArithmeticException e) {
            System.out.println("Arithmetic exception block");
        } catch (Exception e) {
            System.out.println("Exception block");
        }
    }
}
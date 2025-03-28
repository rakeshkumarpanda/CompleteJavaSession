package exceptionHandling;

public class ExceptionSession4 {
    public static void main(String[] args) {
        try {
            System.out.println("try block started");
            int a = 15, b = 5;
            int div = a/b;
            System.out.println(div);
            String s = null;
            String lowerData = s.toLowerCase();
            System.out.println(lowerData);
            System.out.println("try block completed");
        }catch (ArithmeticException e) {
            System.out.println("Arithmetic exception block");
        } catch (Exception e) {
            System.out.println("Exception block");
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
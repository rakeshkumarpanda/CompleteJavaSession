package oops_concept.inheritance;

class Mobile2 {
    public void call() {
        System.out.println("Mobile call");
    }
    public void message(){
        System.out.println("Mobile message");
    }
    public void os(){
        System.out.println("Mobile OS");
    }
}
class Iphone2 extends Mobile2 {
    public void os(){
        System.out.println("iOS");
    }
}
class Samsung2 extends Mobile2 {
    public void os(){
        System.out.println("Android");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Mobile2 m1 = new Mobile2();
        m1.call();
        m1.message();
        m1.os();
        System.out.println("========");
        Iphone2 i1 = new Iphone2();
        i1.call();
        i1.message();
        i1.os();
        System.out.println("==========");
        Samsung2 s1 = new Samsung2();
        s1.call();
        s1.message();
        s1.os();
    }
}
/*
Method Overriding:
-> Same method name, same list of arguments but different implementation
-> This concept is also called as Run-time polymorphism
 */

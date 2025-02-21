package oops_concept.inheritance;

class Mobile3 {
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
class Iphone3 extends Mobile3 {
    public void os(){
        System.out.println("iOS");
    }
    public void processor(){
        System.out.println("Bionic Chip");
    }
}
class Samsung3 extends Mobile3 {
    public void os(){
        System.out.println("Android");
    }
    public void processor(){
        System.out.println("Exynos");
    }
}

public class UpCasting {
    public static void main(String[] args) {
        Mobile3 m1 = new Mobile3();
        m1.call();
        m1.message();
        m1.os();
        System.out.println("========");
        Iphone3 i1 = new Iphone3();
        i1.call();
        i1.message();
        i1.os();
        i1.processor();
        System.out.println("========");
        Mobile3 m2 = new Iphone3();//Storing the child class object in parent class reference
        m2.call();
        m2.os();
        m2.message();
        System.out.println("========");
        Mobile3 m3 = new Samsung3();//Storing the child class object in parent class reference
        m3.call();
        m3.os();
        m3.message();
    }
}
/*
Up casting:
-> Storing the child class object in parent class reference
-> This is implicit in nature i.e. we need not to explicitly convert the type
-> In this case only the common members can be invoked
 */

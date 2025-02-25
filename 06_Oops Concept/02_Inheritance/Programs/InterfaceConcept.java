package oops_concept.inheritance;

interface Mobile6 {
    int i=10;
    public abstract void isSmart();
    abstract void os();
    public void processor();
    void camera();
    default void test(){
        System.out.println("This is the default method");
    }
    static void test1(){
        System.out.println("This is the static methods");
    }
}

class Pixel implements Mobile6 {

    @Override
    public void isSmart() {
        System.out.println(true);
    }

    @Override
    public void os() {
        System.out.println("Android");
    }

    @Override
    public void processor() {
        System.out.println("Tensor G4");
    }

    @Override
    public void camera() {
        System.out.println("50MP");
    }
}


public class InterfaceConcept {
    public static void main(String[] args) {
//        Mobile6 m1 = new Mobile6();//We can't create an object of an interface
        System.out.println(Mobile6.i);
        Mobile6.test1();
        Mobile6 m2 = new Pixel();
        m2.isSmart();
        m2.camera();
        m2.os();
        m2.processor();
        m2.test();
    }
}
/*
Interface:
-> Similar to the class concept
-> It can have only the abstract methods
-> All methods are by default public, abstract
-> From JDK 8 onwards, we can also have the default/package level methods and also static methods
-> All the variables are public static & final
 */

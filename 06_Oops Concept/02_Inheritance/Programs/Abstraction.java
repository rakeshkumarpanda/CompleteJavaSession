package oops_concept.inheritance;

abstract class Mobile4 {
    public void call() {
        System.out.println("Mobile call");
    }
    public void message(){
        System.out.println("Mobile message");
    }
    public abstract void os();
}
class Iphone4 extends Mobile4 {
    @Override
    public void os() {
        System.out.println("iOS");
    }
}

public class Abstraction {
    public static void main(String[] args) {
//        Mobile4 m1 = new Mobile4();//We can't create any object for abstract class
        //Accessing the abstract class members
        //1. Create the child class object directly and access
        Iphone4 i = new Iphone4();
        i.call();
        i.message();
        i.os();
        System.out.println("===============");
        //2. Create the object of the child class and keep in parent class reference - Upcasting
        Mobile4 m2 = new Iphone4();
        m2.call();
        m2.message();
        m2.os();


    }
}
/*
Note:
-> If a class contains at least one abstract method the class is called abstract class
-> If a method only have the signature but no body then the method is called abstract method
-> We can't create any object of an abstract class
 */

package oops_concept.inheritance;

class Mobile5 {
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
class Iphone5 extends Mobile5 {
    public void os(){
        System.out.println("iOS");
    }
    public void processor(){
        System.out.println("Bionic Chip");
    }
}
class Samsung5 extends Mobile5 {
    public void os(){
        System.out.println("Android");
    }
    public void processor(){
        System.out.println("Exynos");
    }
}

public class DownCasting {
    public static void main(String[] args) {
        Iphone5 i = (Iphone5) new Mobile5();//Down casting
        i.os();
        i.processor();
    }
}
/*
Down casting:
-> Storing the parent class object in child class reference
-> This is explicit in nature i.e. we need to explicitly convert the type
 */

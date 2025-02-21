package oops_concept.inheritance;

class Mobile1 {
    public void call() {
        System.out.println("Mobile Call");
    }
    public void message() {
        System.out.println("Mobile Message");
    }
}

class OnePlus extends Mobile1 {

}

class Oppo extends Mobile1 {

}

public class Hierarchial {
    public static void main(String[] args) {
        Mobile1 m = new Mobile1();
        m.call();
        m.message();
        System.out.println("===========");
        OnePlus o = new OnePlus();
        o.call();
        o.message();
        System.out.println("=============");
        Oppo op = new Oppo();
        op.call();
        op.message();
    }
}

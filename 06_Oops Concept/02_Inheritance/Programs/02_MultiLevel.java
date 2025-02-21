package oops_concept.inheritance;

class Mobile {
    public void call() {
        System.out.println("Mobile call");
    }
    public void message() {
        System.out.println("Mobile message");
    }
}

class SmartMobile extends Mobile {
    public void type() {
        System.out.println("Touch phone");
    }
}

class IPhone extends SmartMobile {
    public void processor() {
        System.out.println("Bionic chip");
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.call();
        m.message();
        System.out.println("==============");
        SmartMobile sm = new SmartMobile();
        sm.type();
        sm.call();
        sm.message();
        System.out.println("===============");
        IPhone i = new IPhone();
        i.processor();
        i.call();
        i.type();
        i.message();
    }
}

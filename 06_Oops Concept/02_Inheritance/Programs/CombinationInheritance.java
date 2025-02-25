package oops_concept.inheritance;
abstract class AC1 {
    public abstract void m1();
}
interface I3 {
    void m2();
}
class C2 extends AC1 implements I3 {

    @Override
    public void m1() {
        System.out.println("M1 method");
    }

    @Override
    public void m2() {
        System.out.println("M2 method");
    }
}

public class CombinationInheritance {
    public static void main(String[] args) {
        AC1 ac1 = new C2();
        ac1.m1();

        I3 i3 = new C2();
        i3.m2();
    }
}

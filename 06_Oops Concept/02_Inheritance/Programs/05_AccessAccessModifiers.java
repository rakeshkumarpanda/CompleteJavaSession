package oops_concept.inheritance;

class P3 {
    public void m1() {
        System.out.println("m1 from P3");
    }
    protected void m2() {
        System.out.println("m1 from P3");
    }
    void m3() {
        System.out.println("m1 from P3");
    }
    private void m4() {
        System.out.println("m1 from P3");
    }
}
class C3 extends P3 {

}

public class AccessAccessModifiers {
    public static void main(String[] args) {
        P3 p3 = new P3();
        p3.m1();
        p3.m2();
        p3.m3();
        System.out.println("=============");
        C3 c3 = new C3();
        c3.m1();
        c3.m2();
        c3.m3();
    }
}

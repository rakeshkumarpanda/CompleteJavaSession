package oops_concept;

class FindArea{
    public void area(int l, int b) {
        System.out.println("Area of the rectangle: " + l*b);
    }
    public void area(int r) {
        System.out.println("Area of the circle: " + (3.14*r*r));
    }
}

public class MethodOverloading {
    public static void main(String[] args) {

    }
}
/*
So here in the FindArea class we have 2 methods with name area are overloaded. That's why this is called as
Method Overloading. Method Overloading is also called as Compile time polymorphism.
Polymorphism - Poly means many and morphisms comes from Morphings i.e. different forms
 */
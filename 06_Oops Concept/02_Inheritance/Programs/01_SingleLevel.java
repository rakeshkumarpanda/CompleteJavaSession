package oops_concept.inheritance;

class Animal {
    public void food() {
        System.out.println("Animal Food");
    }
    public void move(){
        System.out.println("Animal Move");
    }
}

class Tiger extends Animal {

}

public class SingleLevel {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.food();
        a.move();
        System.out.println("===============");
        Tiger t = new Tiger();
        t.food();
        t.move();
    }
}

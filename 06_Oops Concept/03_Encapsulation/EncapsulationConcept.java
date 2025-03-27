package oops_concept.encapsulation;

public class EncapsulationConcept {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getName());
        System.out.println(s.getAge());

        //Setting up the values
        s.setName("Lion");
        s.setAge(10);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}

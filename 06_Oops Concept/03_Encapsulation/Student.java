package oops_concept.encapsulation;

public class Student {
    private String name = "Default Name";
    private int age = 0;


    //Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}

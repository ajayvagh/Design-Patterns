package Prototype_Registry;

public class Student {

    private int age;
    public String name;
    public String university;

    public Student(int age, String name, String university) {
        this.age = age;
        this.name = name;
        this.university = university;
    }

    public Student (Student original) {
        this.age = original.age;
        this.name = original.name;
        this.university = original.university;
    }

    public Student clone() {
        return new Student(this);
    }
}

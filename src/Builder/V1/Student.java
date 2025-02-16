package Builder.V1;

public class Student {
    String name;    // check needed
    String email;   // check needed
    int age;    // check needed
    String university;
    int yearOfGraduation;

    public Student(Builder builder) {
        if (builder.age < 18){
            throw new RuntimeException("Age can not be less than 18");
        }

        if(!(builder.name != null && builder.email != null)){
            throw new RuntimeException("Name and email are both null");
        }
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.university = builder.university;
        this.yearOfGraduation = builder.yearOfGraduation;

    }
}

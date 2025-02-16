package Builder.V3;



public class Main {

    public static void main(String[] args) throws Exception {

        Student sb = Student.getBuilder()
                .setAge(25)
                .setName("John")
                .setEmail("john@gmail.com")
                .setUniversity("University Of Computer Science")
                .setYearOfGraduation(2025)
                .build();
    }

//    Student s1 = new Student(new Student.Builder());
    // can make validations useless so
    // to force Client make Student Constructor Private
    // as soon as private added this will show error
}

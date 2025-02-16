package Builder.V1;

public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setAge(20);
        builder.setName("John");
        builder.setEmail("john@123");
        builder.setUniversity("ABC");
        builder.setYearOfGraduation(2024);

        Student student = new Student(builder);

    }
}

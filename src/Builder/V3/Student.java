package Builder.V3;

public class Student {
    String name;    // check needed
    String email;   // check needed
    int age;    // check needed
    String university;
    int yearOfGraduation;

    public static Builder getBuilder() {
        return new Builder();
    }

    // constructor to get Build
    private Student (Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.university = builder.university;
        this.yearOfGraduation = builder.yearOfGraduation;
    }

    static class Builder{
        String name;    // check needed
        String email;   // check needed
        int age;    // check needed
        String university;
        int yearOfGraduation;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getUniversity() {
            return university;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public int getYearOfGraduation() {
            return yearOfGraduation;
        }

        public Builder setYearOfGraduation(int yearOfGraduation) {
            this.yearOfGraduation = yearOfGraduation;
            return this;
        }

        public Student build() {
            // validations
            if(age < 18){
                throw new IllegalArgumentException("Age must be at least 18");
            }
            if(!(name != null && email != null)){
                throw new IllegalArgumentException("Name and email are required");
            }

            return new Student(this);
        }
    }
}

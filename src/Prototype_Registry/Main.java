package Prototype_Registry;

import Prototype_Registry.Registry.StudentRegistry;

public class Main {

    public static final String STUDENT_PROTO_KEY = "STUDENT_PROTOTYPE";
    public static final String INTELLIGENT_STUDENT_PROTO_KEY = "INT_STUDENT_PROTOTYPE";

    public static void main(String[] args) {
        setupRegistry();

        Student copy = StudentRegistry.getInstance().get(STUDENT_PROTO_KEY).clone();
        Student intStudentCopy = StudentRegistry.getInstance().get(INTELLIGENT_STUDENT_PROTO_KEY).clone();


    }
    public static void setupRegistry(){
        StudentRegistry registry = StudentRegistry.getInstance();
        Student prototypeStudent = new Student(20, "ABC", "XYZ");
        Student ist = new IntelligentStudent(20, "ABCD", "WXYSZ", 180);

        registry.register(STUDENT_PROTO_KEY, prototypeStudent);
        registry.register(INTELLIGENT_STUDENT_PROTO_KEY, ist);
    }
}

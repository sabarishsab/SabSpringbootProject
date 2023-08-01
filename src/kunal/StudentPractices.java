package kunal;

public class StudentPractices {

    public static void main(String[] args) {

        Student student = new Student();
        System.out.println(student);
        System.out.println(student.getClass());
        System.out.println(student.getClass().getName());
        System.out.println(student.rollNo);
        System.out.println(student.name);
        System.out.println(student.marks);
        student.rollNo = 12;
        student.name = "sabarish s";
        student.marks = 85.5f;
        System.out.println(student.rollNo);
        System.out.println(student.name);
        System.out.println(student.marks);

    }
}


package Man_Student;

public class Student_Main {
    public static void main(String[] args) {
        Student student=new Student();
        student.setYearOfStudy(5);

        System.out.println(student.getYearOfStudy());

        student.upYearOfStudy();
    }
}

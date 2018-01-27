package student;

public class StudMain {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName("lol");
        st1.setAge(2);
        Student st2 = new Student();
        st2.setName("lol");

        System.out.println(st1.equals(st2));
    }
}

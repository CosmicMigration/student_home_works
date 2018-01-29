package Man_Student;

public class Student extends Man {
    private int yearOfStudy;

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void upYearOfStudy(){
        yearOfStudy=yearOfStudy+yearOfStudy;
        System.out.println("Увеличил год на"+yearOfStudy);
    }
}

package hw_26_01_18.task_10;

public class Student extends Man {
    private int year;

    public Student(int year){
        this.year = this.year + year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

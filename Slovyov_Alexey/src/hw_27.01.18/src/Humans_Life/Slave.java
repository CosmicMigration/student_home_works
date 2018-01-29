package Humans_Life;

public class Slave extends Worker {
    private int salary;
    private int numbersOfWeekends;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getNumbersOfWeekends() {
        return numbersOfWeekends;
    }

    public void setNumbersOfWeekends(int numbersOfWeekends) {
        this.numbersOfWeekends = numbersOfWeekends;
    }
}

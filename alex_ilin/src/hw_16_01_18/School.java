package hw_16_01_18;

public class School {


    private int schoolNumber;
    private String schoolAdress;
    private int schoolPhone;
    private int classCount = 4;
    private ClassRoom[] arrayOfClasses;
    private int countOfStudnets;
    private String classChar;






    public ClassRoom[] getArrayOfClasses() {
        return arrayOfClasses;
    }

    public void setArrayOfClasses(ClassRoom[] arrayOfClasses) {
        this.arrayOfClasses = arrayOfClasses;
    }

    public int getCountOfStudnets() {
        return countOfStudnets;
    }

    public void setCountOfStudnets(int countOfStudnets) {
        this.countOfStudnets = countOfStudnets;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public String getSchoolAdress() {
        return schoolAdress;
    }

    public void setSchoolAdress(String schoolAdress) {
        this.schoolAdress = schoolAdress;
    }

    public int getSchoolPhone() {
        return schoolPhone;
    }

    public void setSchoolPhone(int schoolPhone) {
        this.schoolPhone = schoolPhone;
    }

    public int getClassCount() {
        return classCount;
    }

    public void setClassCount(int classCount) {
        this.classCount = classCount;
    }

    public String getClassChar() {
        return classChar;
    }

    public void setClassChar(String classChar) {
        this.classChar = classChar;
    }


}

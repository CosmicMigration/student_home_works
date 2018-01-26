public class ClassRoom {
    private String classWord;
    private int classLimit;
    private Student [] studArr;
    private int studCount;
    private String lang;

    public ClassRoom(String classWord, int classLimit, String lang) {
        this.classWord = classWord;
        this.classLimit = classLimit;
        this.lang = lang;
        this.studArr = new Student[classLimit];
    }

    public ClassRoom(String classWord, String lang) {
        this.classWord = classWord;
        this.lang = lang;
    }

    public Student[] getStudArr() {
        return studArr;
    }

    public String getClassWord() {
        return classWord;
    }

    public int getClassLimit() {
        return classLimit;
    }

    public String getLang() {
        return lang;
    }

    public void addStudentToClass(Student student) {
        if (studCount < studArr.length) {
            for (int i = 0; i < studArr.length; i++) {
                if (studArr[i] == null) {
                    studArr[i] = student;
                    studCount++;
                    break;
                }
            }
        }
    }

    public int getStudentsAmount() {
        int studentsAmount = 0;

        for (int i = 0; i < studArr.length; i++) {
            if ( studArr[i] != null ) {
                studentsAmount = i;
            }
        }
        studentsAmount += 1;
        return studentsAmount;
    }

    public void getStudNamesAges() {
        for (int i = 0; i < studArr.length; i++) {
            if ( studArr[i] != null ) {
                System.out.println(classWord + " student's name is " + studArr[i].getName() + "; age - " + studArr[i].getAge() + " years old");
            }
        }
    }

    public void findStudentByName(String name) {
        for (Student student : studArr) {
            String studName = student.getName();
            if ( studName.equals(name) ) {
                System.out.println(studName + " " + student.getAge() + " years old is in " + classWord);
            } else {
                System.out.println("This student isn't in " + classWord);
            }
        }
    }

}

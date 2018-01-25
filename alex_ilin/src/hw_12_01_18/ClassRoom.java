package hw_12_01_18;

public class ClassRoom {

    private String classWord;
    private int classLimit;
    Student[] studMass;
    private int countOfStudents = 0;
    private int missedStudents = 0;
    Student[] updateStudMass;

    public ClassRoom() {
    }

    public ClassRoom(String classWord, int classLimit) {
        this.classWord = classWord;
        this.classLimit = classLimit;
        this.studMass = new Student[classLimit];
    }

    public String getClassWord() {
        return classWord;
    }

    public void setClassWord(String classWord) {
        this.classWord = classWord;
    }

    public int getClassLimit() {
        return classLimit;
    }

    public void setClassLimit(int classLimit) {
        this.classLimit = classLimit;
    }

    public int getMissedStudents() {//можно глянуть сколько студентов, подходящих по возрасту не попало в класс
        return missedStudents;
    }


    public void addStudentToClass(Student student) {// запись конкретного студента в класс
        int temp = 0;
        if (countOfStudents < studMass.length) {
            for (int i = countOfStudents; i < studMass.length; i++) {
                if (studMass[i] == null) {
                    studMass[i] = student;
                    countOfStudents++;
                    break;
                }

            }
        } else {

            missedStudents++;
            System.out.println(student.getAge() + " имя " + student.getName());

        }


    }

    public void showAllStudents() {// показать всех студентов
        System.out.println("Класс " + classWord);
        for (Student student : studMass) {
            if (student == null) {
                Student st = new Student();
                st.setName("Свободное место для студента");
                student = st;
            }
            System.out.println("Имя несчастного: " + student.getName() + ". Его возраст - " + student.getAge());
        }
    }

    public void showAllStudentsByName() {// показать всех студентов по имени
        System.out.println("Класс " + classWord);
        for (Student student : studMass) {
            if (student == null) {
                Student st = new Student();
                st.setName("Свободное место для студента");
                student = st;
            }
            System.out.println("Имя несчастного: " + student.getName());
        }
    }

    public void sortByAge() {//сортировка по возрасту в прямом порядке
        for (int i = studMass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (studMass[j].getAge() > studMass[j + 1].getAge()) {
                    Student tmp;
                    tmp = studMass[j];
                    studMass[j] = studMass[j + 1];
                    studMass[j + 1] = tmp;
                }

            }


            System.out.println(studMass[i].getAge() + " Имя " + studMass[i].getName());
        }
    }

    public void sortRevByAge() {//сортировка по возрасту в обратном порядке
        for (int i = studMass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (studMass[j].getAge() < studMass[j + 1].getAge()) {
                    Student tmp;
                    tmp = studMass[j];
                    studMass[j] = studMass[j + 1];
                    studMass[j + 1] = tmp;
                }

            }
            System.out.println(studMass[i].getAge() + " Имя " + studMass[i].getName());
        }
    }

    public void sortByName() {//сортировка по имени в прямом порядке
        for (int i = studMass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (studMass[j] != null) {
                    if (studMass[j].getName().compareTo(studMass[j + 1].getName()) < 0) {
                        Student tmp;
                        tmp = studMass[j];
                        studMass[j] = studMass[j + 1];
                        studMass[j + 1] = tmp;
                    }
                    else if (studMass[j] == null) {
                        Student st = new Student();
                        st.setName("Тут мог бы быть студент");
                        studMass[j] = st;
                    }
                }
            }
            System.out.println(studMass[i].getAge() + " Имя " + studMass[i].getName());

        }
    }

    public void sortRevByName() {//сортировка по имени в реверсном порядке
        for (int i = studMass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (studMass[j] != null) {
                    if (studMass[j].getName().compareTo(studMass[j + 1].getName()) > 0) {
                        Student tmp;
                        tmp = studMass[j];
                        studMass[j] = studMass[j + 1];
                        studMass[j + 1] = tmp;
                    }
                    else if (studMass[j] == null) {
                        Student st = new Student();
                        st.setName("Тут мог бы быть студент");
                        studMass[j] = st;
                    }
                }
            }

            System.out.println(studMass[i].getAge() + " Имя " + studMass[i].getName());
        }
    }

    private int countCalledStudents = 0;

    public void callStudentByNameInClass(Student s) {//ищем студента по имени внутри класса
        s.generateName();
        System.out.println("Ищем студента по имени: " + s.getName());
        for (int i = 0; i < studMass.length; i++) {
            if (s.getName().equals(studMass[i].getName())) {
                System.out.println(studMass[i].getName() + " ему(ей) " + studMass[i].getAge() + " лет");
                countCalledStudents++;
            }

        }
        if (countCalledStudents == 0) {
            System.out.println("\nНикого тут нет\n");
        }

    }
}

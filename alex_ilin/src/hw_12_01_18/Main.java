package hw_12_01_18;

import java.util.concurrent.ThreadLocalRandom;

public class Main {


    public static void main(String[] args) {
        programm();

    }

    public static void programm() {//отработка программы
        ClassRoom classA = new ClassRoom("A", 12);
        ClassRoom classB = new ClassRoom("Б", 15);
        addStudentsToClasses(classA, classB);


        Student student = new Student();
        student.generateName();

        classA.showAllStudents();
        classB.showAllStudents();

        System.out.println("\nТолько имена\n");

        classA.showAllStudentsByName();
        classB.showAllStudentsByName();

        System.out.println("\nСортировки\n");

        classA.sortByName();
        System.out.println("\nКлассы соответственно\n");
        classB.sortByName();

        System.out.println("\nПо возрасту\n");

        classA.sortByAge();
        System.out.println("\nКлассы соответственно\n");
        classB.sortByAge();

        System.out.println("\nСортировки в реверсном порядке\n");

        classA.sortRevByName();
        System.out.println("\nКлассы соответственно\n");
        classB.sortRevByName();

        System.out.println("\nПо возрасту\n");

        classA.sortRevByAge();
        System.out.println("\nКлассы соответственно\n");
        classB.sortRevByAge();

        System.out.println("\nПоиск студентов по имени внутри конкретного класса\n");
        Student student1 = new Student();

        classA.callStudentByNameInClass(student1);
        classB.callStudentByNameInClass(student1);

        System.out.println("\nПоиск студентов в обоих классах по имени\n");

        callStudentByNameFromAnyClass(student, classA, classB);

    }

    public static Student[] initStudents() {      //инициализация студентов
        Student[] allStudents = new Student[27];
        System.out.println("Все студенты\n");
        for (int i = 0; i < allStudents.length; i++) {
            Student student = new Student();
            student.generateName();
            student.setAge(ThreadLocalRandom.current().nextInt(7, 16 + 1));
            allStudents[i] = student;
            System.out.println(student.getName() + " " + student.getAge());
        }
        System.out.println("\nСтуденты не попали:\n");
        return allStudents;
    }

    public static void addStudentsToClasses(ClassRoom classA, ClassRoom classB) {     //запись студентов в класс
        for (Student student : initStudents()) {
            if (student.getAge() < 12) {
                classA.addStudentToClass(student);
            } else if(student.getAge()>11){
                classB.addStudentToClass(student);
            }
        }
        System.out.println("\nКол-во студентов, которые не попали в:\n" + "Класс А\n" + classA.getMissedStudents() + "\nКласс Б\n" + classB.getMissedStudents());
    }

    public static void callStudentByNameFromAnyClass(Student s, ClassRoom classA, ClassRoom classB) {//ищем студента по имени в обоих классах
        int countCalledStudents = 0;
        System.out.println("Ищем студента по имени во обоих классах: " + s.getName());
        System.out.println("В классе А:\n");
        for (int i = 0; i < classA.studMass.length; i++) {
            if (s.getName().equals(classA.studMass[i].getName())) {
                System.out.println(classA.studMass[i].getName() + " ему(ей) " + classA.studMass[i].getAge() + " лет");
                countCalledStudents++;
            }

        }
        if (countCalledStudents == 0) {
            System.out.println("\nНикого тут нет\n");
        }
        countCalledStudents = 0;
        System.out.println("В классе Б:\n");
        for (int i = 0; i < classB.studMass.length; i++) {
            if (s.getName().equals(classB.studMass[i].getName())) {
                System.out.println(classB.studMass[i].getName() + " ему(ей) " + classB.studMass[i].getAge() + " лет");
                countCalledStudents++;
            }
        }
        if (countCalledStudents == 0) {
            System.out.println("\nНикого тут нет\n");
        }
    }
}

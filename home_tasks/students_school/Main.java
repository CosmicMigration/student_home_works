import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    private static int allStudCount = 10;
    private static ClassRoom[] classRoomArr;

    public static void main(String[] args) {
      init();
    }

    private static void init() {
        Student [] studentsArr = getAllStudents();

        ClassRoom classA = new ClassRoom("Class A", 12, "ukr");
        ClassRoom classB = new ClassRoom("Class B", 15, "eng");
        addStudentsToClasses(studentsArr, classA, classB);

        Address schoolAddress = new Address("Dnipropetrovsk", "Dnipro", "Topol", 103, 49040);

        School lyceum = new School(99, 7657845, schoolAddress, 2);
        lyceum.addClassToSchool(classA);
        lyceum.addClassToSchool(classB);

        //lyceum.showClasses();
        //lyceum.showClassByLang();
        //lyceum.showCountStudsInEachClass();
        //lyceum.showCountStudsAtSchool();
        //lyceum.showAgeRange();

        School gymnasia = new School();
        addStudsToSchool(gymnasia);
    }


    private static void addStudentsToClasses(Student [] allStudents, ClassRoom classA, ClassRoom classB) {

        for (Student student : allStudents) {
            int studentAge = student.getAge();

            if ( studentAge < 12 ) {
                classA.addStudentToClass(student);
            } else {
                classB.addStudentToClass(student);
            }

        }
    }

    private static Student [] getAllStudents() {
        Student [] studentsArr = new Student[allStudCount];

        for ( int i = 0; i < studentsArr.length; i++ ) {
            Student student = new Student();
            studentsArr[i] = student;
        }

        return studentsArr;
    }


    //add 30 students to school according to language; max amount of students in classes is 15
    private static void addStudsToSchool(School school) {
        Student [] studArr = getMoreSrudents();

        for (int i = 0; i < studArr.length; i++) {
            for (int j = 0; j < school.getClassList().length; j++) {

                ClassRoom classRoom = school.getClassList()[j];
                String classRoomLang = classRoom.getLang();
                String studentLang = studArr[i].getLang();
                boolean isClassRoomEmpty = classRoom.getStudArr() == null;
                boolean isMaxStudsInClass15 = classRoom.getStudArr().length < 15;

                if (classRoomLang == studentLang && (isClassRoomEmpty || isMaxStudsInClass15)) {
                    classRoom.addStudentToClass(studArr[i]);
                    break;
                }
            }
        }
    }
    private static Student [] getMoreSrudents() {
        Student [] studentsArr = new Student[30];

        for ( int i = 0; i < studentsArr.length; i++ ) {
            if (i < studentsArr.length / 2) {
                Student stud = new Student("eng");
                studentsArr[i] = stud;
            } else {
                Student stud = new Student("ukr");
                studentsArr[i] = stud;
            }
        }
        return studentsArr;
    }

    /* private static Student[] getTwoClassesArr(ClassRoom classA, ClassRoom classB) {
        Student [] classAArr = classA.getStudArr();
        Student [] classABrr = classB.getStudArr();
        int classACount = classA.getStudentsAmount();
        int classBCount = classB.getStudentsAmount();

        Student [] commomArr = new Student[classBCount + classACount];
        int index = classBCount;

        for (int i = 0; i < classBCount; i++) {
            commomArr[i] = classABrr[i];
        }
        for (int i = 0; i < classACount; i++) {
            commomArr[i + index] = classAArr[i];
        }

        return commomArr;
    }*/

}

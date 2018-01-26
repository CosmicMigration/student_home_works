public class School {
    private int number;
    private int phone;
    private Address address;
    private ClassRoom [] classList;


    public School() {
        classList = new ClassRoom[4];
        classList[0] = new ClassRoom("A", "ukr");
        classList[1] = new ClassRoom("B", "ukr");
        classList[2] = new ClassRoom("C", "eng");
        classList[3] = new ClassRoom("D", "eng");
    }

    public School(int number, int phone, Address address, int countClasses) {
        this.number = number;
        this.phone = phone;
        this.address = address;
        this.classList = new ClassRoom[countClasses];
    }

    public ClassRoom[] getClassList() {
        return classList;
    }

    public void addClassToSchool(ClassRoom classRoom) {
        for (int i = 0; i < classList.length; i++) {
            if (classList[i] == null) {
                classList[i] = classRoom;
                break;
            }
        }
    }

    //how many classes at school + what classes at school
    public void showClasses() {
        System.out.println("There are " + classList.length + " classes in school.");
        for (ClassRoom classRoom : classList) {
            System.out.println("Class " + classRoom.getClassWord() + " with limit " + classRoom.getClassLimit() + " and language " + classRoom.getLang());
        }
    }

    //count of Ukrainian and English classes
    public void showClassByLang() {
        int engCount = 0;
        int ukrCount = 0;
        for (ClassRoom classR : classList) {
            if (classR.getLang() == "eng") {
                engCount++;
            } else if (classR.getLang() == "ukr") {
                ukrCount++;
            }
        }
        System.out.println("There are " + engCount + " english classes and " + ukrCount + " ukrainian.");
    }

    //how many students are there in each class
    public void showCountStudsInEachClass() {
        for (ClassRoom classRoom : classList) {
            System.out.println("Class " + classRoom.getClassWord() + " has " + classRoom.getStudentsAmount());
        }
    }

    //count students at school
    public void showCountStudsAtSchool() {
        int count = 0;
        for (ClassRoom classRoom : classList) {
            count += classRoom.getStudentsAmount();
        }
        System.out.println("School " + number + " has " + count + " students.");
    }

    //min and max age oof students at school
    public void showAgeRange() {
        for (ClassRoom classRoom : classList) {
            if (classRoom.getStudArr() != null) {
                showAgeRangeForClass(classRoom);
            }
        }
    }
    private static void showAgeRangeForClass(ClassRoom classRoom) {
        int min = classRoom.getStudArr()[0].getAge();
        int max = classRoom.getStudArr()[0].getAge();
        for (Student student : classRoom.getStudArr()) {
            if (student != null) {
                if (student.getAge() > max) {
                    max = student.getAge();
                }
                if (student.getAge() < min) {
                    min = student.getAge();
                }
            }
        }
        System.out.println("Class " + classRoom.getClassWord() + " has min age " + min + " and max age " + max);
    }


}

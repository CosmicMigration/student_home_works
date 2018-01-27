package robotics.bugs;

public class Robot {

    private int cpu;

    private String name;
    private int serialNumber;

    public void thinking(){
        if(checkOnSerialNumber()) {
            if (cpu > 2) {
                System.out.println("Я думаю хорошо");
            } else {
                System.out.println("Я тупой робот");
            }
        }
        System.out.println("robot must exist with serial number");
    }

    private boolean checkOnSerialNumber(){
        return serialNumber != 0;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public String getName() {
        System.out.println("Robot GetName from super");
        return name;
    }

    public void setName(String name) {
        System.out.println("robot setName");
        this.name = name;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
}

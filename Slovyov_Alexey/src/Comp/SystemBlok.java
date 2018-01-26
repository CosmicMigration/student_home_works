public class SystemBlok {
    private CPU cpu;
    private HDD hdd;
    private KeyBoard kyeboard;
    private Monitor monitor;
    private Mouse mouse;

    public SystemBlok() {
    }

    public SystemBlok(CPU cpu, HDD hdd, KeyBoard kyeboard, Monitor monitor, Mouse mouse) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.kyeboard = kyeboard;
        this.monitor = monitor;
        this.mouse = mouse;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public KeyBoard getKyeboard() {
        return kyeboard;
    }

    public void setKyeboard(KeyBoard kyeboard) {
        this.kyeboard = kyeboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void mySuperMachina(){
        System.out.println("Мой суперкомп собран из");
        System.out.println("Процессор марки"+cpu.getBrendCPU()+" C процессором мощностью"+cpu.getSizeCPU());
        System.out.println("Жостким диском фирмы"+hdd.getBrendH()+" и обьемом памяти"+hdd.getSizeH());
        System.out.println("Клавиатура марки"+kyeboard.getBrendK()+" "+kyeboard.getColour()+"цвета");
        System.out.println("Монитор компании"+monitor.getBrend()+" "+"с размером диагонали"+monitor.getSizeM()+"дюймов");
        System.out.println("Марка мыши"+mouse.getBrendM());
        if (mouse.isWireless() == true) {
            System.out.println("Мышь с проводом старая");
        } else {
            System.out.println("Мышь без провода новая");
        }

    }

}

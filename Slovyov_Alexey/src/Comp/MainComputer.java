public class MainComputer {
    public static void main(String[] args) {
        CPU cpu=new CPU("Intel",3);
        HDD hdd=new HDD("Sumsung",500);
        KeyBoard keyboard=new KeyBoard("BTC","White");
        Monitor monitor=new Monitor(17,"LG");
        Mouse mouse=new Mouse("Logitech",true);
        SystemBlok systemBlok=new SystemBlok(cpu,hdd,keyboard,monitor,mouse);

        systemBlok.mySuperMachina();

    }
}

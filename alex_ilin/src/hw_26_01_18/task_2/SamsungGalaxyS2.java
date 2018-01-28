package hw_26_01_18.task_2;

public class SamsungGalaxyS2 extends AppleIPhone {
   private boolean portForHeadPhones;

    public boolean isPortForHeadPhones() {
        return portForHeadPhones;
    }

    public void setPortForHeadPhones(boolean portForHeadPhones) {
        this.portForHeadPhones = portForHeadPhones;
    }

    @Override
    public String toString() {
        return "SamsungGalaxyS2{" +
                "portForHeadPhones=" + portForHeadPhones +
                ", developer='" + getDeveloper() + '\'' +
                ", company='" + getCompany() + '\'' +
                ", cost=" + getCost() +
                '}';
    }
}

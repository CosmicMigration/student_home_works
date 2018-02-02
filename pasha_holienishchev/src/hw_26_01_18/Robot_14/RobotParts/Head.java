package hw_26_01_18.Robot_14.RobotParts;

/**
 * Created by java on 26.01.2018.
 */
public class Head {
    private static boolean headAbility = false;

    public static boolean checkHead() {
        if (headAbility == true) {
            System.out.println("Я головастик");
            return true;
        } else {
            System.out.println("У меня нет головы");
            return false;
        }
    }

    public Head() {
    }

    public Head(boolean headAbility) {
        this.headAbility = headAbility;
    }

    public static boolean isHeadAbility() {
        return headAbility;
    }

    public static void setHeadAbility(boolean headAbility) {
        Head.headAbility = headAbility;
    }
}

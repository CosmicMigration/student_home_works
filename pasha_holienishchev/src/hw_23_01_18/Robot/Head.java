package Homeworks.HomeWork_23_01.Robot;

/**
 * Created by java on 26.01.2018.
 */
public class Head {
    private static boolean headAbility = false;

    public static boolean checkHead(boolean headAbility) {
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

    public static boolean isHeadAbility() {
        return headAbility;
    }

    public static void setHeadAbility(boolean headAbility) {
        Head.headAbility = headAbility;
    }
}

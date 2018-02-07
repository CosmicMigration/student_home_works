package hw_26_01_18.Robot_14.RobotParts;

/**
 * Created by java on 26.01.2018.
 */
public class Arm {
    private static boolean armAbility = false;
    private static int armCount = 2;

    public static boolean checkArms() {
        if (armAbility == true && armCount == 2) {
            System.out.println("Я могу писать");
            return true;
        } else if (armAbility == false || armCount < 2) {
            System.out.println("Не хватает рук");
        } else if (armCount > 2) {
            System.out.println("Слишком много рук!");
        }
        return false;
    }

    public Arm(boolean armAbility, int armCount) {
        this.armAbility = armAbility;
        this.armCount = armCount;
    }

    public Arm() {
    }

    public static boolean isArmAbility() {
        return armAbility;
    }

    public static void setArmAbility(boolean armAbility) {
        Arm.armAbility = armAbility;
    }
}

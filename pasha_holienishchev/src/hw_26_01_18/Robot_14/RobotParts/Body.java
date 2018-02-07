package hw_26_01_18.Robot_14.RobotParts;

/**
 * Created by java on 26.01.2018.
 */
public class Body {
    private static boolean bodyAbility = false;

    public static boolean checkBody() {
        if (bodyAbility == true) {
            System.out.println("Тело функционирует");
            return true;
        } else {
            System.out.println("Нет тела");
            return false;
        }
    }

    public Body(boolean bodyAbility) {
        this.bodyAbility = bodyAbility;
    }

    public static boolean isBodyAbility() {
        return bodyAbility;
    }

    public static void setBodyAbility(boolean bodyAbility) {
        Body.bodyAbility = bodyAbility;
    }
}


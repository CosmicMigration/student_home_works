package Homeworks.HomeWork_23_01.Robot;

/**
 * Created by java on 26.01.2018.
 */
public class Body {
    private static boolean bodyAbility = false;

    public static boolean checkBody(boolean bodyAbility) {
        if (bodyAbility == true) {
            System.out.println("Тело функционирует");
            return true;
        } else {
            System.out.println("Нет тела");
            return false;
        }
    }

    public Body() {
    }

    public static boolean isBodyAbility() {
        return bodyAbility;
    }

    public static void setBodyAbility(boolean bodyAbility) {
        Body.bodyAbility = bodyAbility;
    }
}


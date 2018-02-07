package Homeworks.HomeWork_23_01.Robot;

/**
 * Created by java on 26.01.2018.
 */
public class Leg {
    private static boolean legAbility = false;
    private static int legCount = 2;


    public static boolean checkLeg(boolean legAbility, int legCount) {
        if (legAbility == true && legCount == 2) {
            System.out.println("Я могу ходить");
            return true;
        } else if (legAbility == false || legCount < 2) {
            System.out.println("Не хватает ног");
        } else if (legCount > 2) {
            System.out.println("Слишком много ног!");
        }
        return false;
    }

    public Leg() {
    }

    public static boolean isLegAbilityAbility() {
        return legAbility;
    }

    public static void setLegAbilityAbility(boolean bodyAbility) {
        Leg.legAbility = legAbility;
    }
}

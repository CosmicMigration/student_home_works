package hw_26_01_18;

import hw_26_01_18.task_1.Adam;
import hw_26_01_18.task_1.Eva;
import hw_26_01_18.task_2.AppleIPhone;
import hw_26_01_18.task_2.SamsungGalaxyS2;


public class Main {
    public static void main(String[] args) {
//        Adam adam = new Adam();
//        Eva eva = new Eva();
//
//        adam.setName("Adam");
//        adam.setAge(25);
//
//        eva.setDress(true);
//        eva.setAge(23);
//        eva.setName("Eva");
//
//        System.out.println(adam.toString());
//        System.out.println(eva.toString());

        AppleIPhone iPhone = new AppleIPhone();
        SamsungGalaxyS2 sumsungGalaxy = new SamsungGalaxyS2();

        iPhone.setCompany("Apple Inc.");
        iPhone.setCost(23000);
        iPhone.setDeveloper("USA");

        sumsungGalaxy.setPortForHeadPhones(true);
        sumsungGalaxy.setCompany("Samnung");
        sumsungGalaxy.setCost(12000);
        sumsungGalaxy.setDeveloper("Korea");

        System.out.println(iPhone.toString());
        System.out.println(sumsungGalaxy.toString());
    }


}

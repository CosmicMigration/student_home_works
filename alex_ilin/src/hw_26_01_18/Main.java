package hw_26_01_18;

import hw_26_01_18.task_1.Adam;
import hw_26_01_18.task_1.Eva;



public class Main {
    public static void main(String[] args) {
        Adam adam = new Adam();
        Eva eva = new Eva();

        adam.setName("Adam");
        adam.setAge(25);

        eva.setDress(true);
        eva.setAge(23);
        eva.setName("Eva");

        System.out.println(adam.toString());
        System.out.println(eva.toString());

    }


}
